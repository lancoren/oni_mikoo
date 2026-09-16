/*    */ package oni_miko.misite;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import net.minecraft.nbt.CompoundTag;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.entity.EntityInLevelCallback;
/*    */ import net.minecraftforge.event.entity.EntityJoinLevelEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ import oni_miko.event.TickLateEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class ForceAttack
/*    */ {
/*    */   public static List<Entity> getAllEntity(ServerLevel level) {
/* 23 */     List<Entity> list = new ArrayList<>();
/* 24 */     level.m_142646_().m_142273_().forEach(entity -> list.add(entity));
/* 25 */     return list;
/*    */   }
/*    */ 
/*    */   
/*    */   public static void remove1(ServerLevel level, List<Entity> noRemoveList) {
/* 30 */     List<Entity> list = getAllEntity(level);
/* 31 */     for (Entity entity : list) {
/*    */       
/* 33 */       if (!noRemoveList.contains(entity))
/*    */       {
/* 35 */         if (entity instanceof LivingEntity) { LivingEntity liv = (LivingEntity)entity;
/*    */           
/* 37 */           liv.m_21153_(0.0F); }
/*    */       
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public static void remove2(ServerLevel level, List<Entity> noRemoveList) {
/* 45 */     List<Entity> list = getAllEntity(level);
/* 46 */     for (Entity entity : list) {
/*    */       
/* 48 */       if (!noRemoveList.contains(entity))
/*    */       {
/* 50 */         removeEntity(entity);
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public static void removeEntity(Entity entity) {
/* 57 */     if (entity instanceof Player) { Player player = (Player)entity;
/*    */       
/* 59 */       player.m_21153_(0.0F); }
/*    */     
/* 61 */     entity.m_20258_(new CompoundTag());
/* 62 */     entity.canUpdate(false);
/* 63 */     entity.onRemovedFromWorld();
/* 64 */     entity.m_142467_(Entity.RemovalReason.DISCARDED);
/* 65 */     entity.m_141960_(EntityInLevelCallback.f_156799_);
/* 66 */     new TickLateEvent((entity.m_9236_()).f_46443_, tick -> {
/*    */           if (tick == 1) {
/*    */             entity.m_20234_(-1);
/*    */             return true;
/*    */           } 
/*    */           return false;
/*    */         });
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void onEntityJoinWorld(EntityJoinLevelEvent event) {}
/*    */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\misite\ForceAttack.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */