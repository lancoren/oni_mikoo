/*    */ package oni_miko.message;
/*    */ 
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraftforge.network.NetworkEvent;
/*    */ 
/*    */ public class MessageSyncTarget implements IFMessage {
/*    */   private int id1;
/*    */   private int id2;
/*    */   
/*    */   public MessageSyncTarget() {}
/*    */   
/*    */   public MessageSyncTarget(int id1, int id2) {
/* 17 */     this.id1 = id1;
/* 18 */     this.id2 = id2;
/*    */   }
/*    */ 
/*    */   
/*    */   public void fromBytes(FriendlyByteBuf buf) {
/* 23 */     this.id1 = buf.readInt();
/* 24 */     this.id2 = buf.readInt();
/*    */   }
/*    */ 
/*    */   
/*    */   public void toBytes(FriendlyByteBuf buf) {
/* 29 */     buf.writeInt(this.id1);
/* 30 */     buf.writeInt(this.id2);
/*    */   }
/*    */ 
/*    */   
/*    */   public void run(NetworkEvent.Context ctx) {
/* 35 */     Minecraft mc = Minecraft.m_91087_();
/* 36 */     if (mc.f_91073_ != null) {
/* 37 */       Entity entity = mc.f_91073_.m_6815_(this.id1);
/* 38 */       Entity target = mc.f_91073_.m_6815_(this.id2);
/* 39 */       if (entity != null && entity instanceof Mob) { Mob mob = (Mob)entity;
/* 40 */         if (target instanceof LivingEntity) { LivingEntity tar = (LivingEntity)target;
/* 41 */           mob.m_6710_(tar); }
/*    */         else
/* 43 */         { mob.m_6710_(null); }
/*    */          }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\message\MessageSyncTarget.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */