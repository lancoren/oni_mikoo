/*     */ package oni_miko.entity;
/*     */ 
/*     */ import java.util.Arrays;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import oni_miko.ModEvent;
/*     */ import oni_miko.ModSounds;
/*     */ import oni_miko.entity.skill.ISkill;
/*     */ import oni_miko.event.TickLateEvent;
/*     */ import oni_miko.misite.ForceAttack;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class null
/*     */   implements ISkill<OnimikoEntity>
/*     */ {
/*     */   public boolean run(OnimikoEntity t) {
/* 520 */     t.getPersistentData().m_128405_("coolenTime_" + id(), t.getPersistentData().m_128451_("coolenTime_" + id()) - 1);
/* 521 */     return (OnimikoEntity.random.nextInt(500) < 15 && t.getPersistentData().m_128451_("coolenTime_" + id()) < 0 && !t.m_9236_().m_46859_((new BlockPos((int)t.m_20185_(), (int)t.m_20186_(), (int)t.m_20189_())).m_7495_()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void skillMain(OnimikoEntity t) {
/* 528 */     BlockPos pos = (new BlockPos((int)t.m_20185_(), (int)t.m_20186_(), (int)t.m_20189_())).m_7495_();
/*     */     
/* 530 */     int max = Math.min(t.m_9236_().m_151558_(), pos.m_123342_() + 6);
/* 531 */     int min = Math.max(t.m_9236_().m_141937_(), pos.m_123342_() - 6);
/*     */     
/* 533 */     new TickLateEvent(false, tick -> {
/*     */           for (int i = 0; i <= tick; i++) {
/*     */             for (int y = max - 1; y >= min; y--) {
/*     */               BlockPos[] poses = { new BlockPos(pos.m_123341_() - i, y, pos.m_123343_() + tick), new BlockPos(pos.m_123341_() + i, y, pos.m_123343_() + tick), new BlockPos(pos.m_123341_() + tick, y, pos.m_123343_() + i), new BlockPos(pos.m_123341_() + tick, y, pos.m_123343_() - i), new BlockPos(pos.m_123341_() - i, y, pos.m_123343_() - tick), new BlockPos(pos.m_123341_() + i, y, pos.m_123343_() - tick), new BlockPos(pos.m_123341_() - tick, y, pos.m_123343_() + i), new BlockPos(pos.m_123341_() - tick, y, pos.m_123343_() - i) };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*     */               for (int j = 0; j < poses.length; j++) {
/*     */                 BlockPos blockPos = poses[j];
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/*     */                 if (!t.m_9236_().m_46859_(blockPos)) {
/*     */                   BlockState state = t.m_9236_().m_8055_(blockPos);
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/*     */                   if (state.m_60713_(Blocks.f_49990_) || state.m_60713_(Blocks.f_50126_) || state.m_60713_(Blocks.f_50568_) || state.m_60713_(Blocks.f_50449_) || state.m_60713_(Blocks.f_50354_)) {
/*     */                     t.m_9236_().m_7731_(blockPos, Blocks.f_50016_.m_49966_(), 1);
/*     */ 
/*     */ 
/*     */ 
/*     */                     
/*     */                     new TickLateEvent(false, ());
/*     */                   } else if (state.m_60713_(Blocks.f_152476_)) {
/*     */                     t.m_9236_().m_7731_(blockPos, Blocks.f_152477_.m_49966_(), 1);
/*     */                   } else {
/*     */                     t.m_9236_().m_7731_(blockPos, Blocks.f_50134_.m_49966_(), 1);
/*     */ 
/*     */ 
/*     */ 
/*     */                     
/*     */                     if (OnimikoEntity.random.nextInt(10) <= 1) {
/*     */                       if (t.m_9236_().m_46859_(blockPos.m_7494_())) {
/*     */                         t.m_9236_().m_7731_(blockPos.m_7494_(), Blocks.f_50083_.m_49966_(), 1);
/*     */                       }
/*     */                     }
/*     */                   } 
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           if (tick > 6) {
/*     */             ForceAttack.remove1((ServerLevel)t.m_9236_(), Arrays.asList(new Entity[] { (Entity)t }));
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             return true;
/*     */           } 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           return false;
/*     */         });
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 601 */     ModEvent.sendMessageToAll("saisen_bako.message.53");
/* 602 */     if (OnimikoEntity.random.nextBoolean()) {
/*     */       
/* 604 */       ModSounds.playSound((LevelAccessor)t.m_9236_(), (SoundEvent)ModSounds.XIAOSHENG2.get());
/*     */     }
/*     */     else {
/*     */       
/* 608 */       ModSounds.playSound((LevelAccessor)t.m_9236_(), (SoundEvent)ModSounds.XIAOSHENG3.get());
/*     */     } 
/*     */     
/* 611 */     t.getPersistentData().m_128405_("coolenTime_" + id(), -1474836480);
/*     */   }
/*     */ 
/*     */   
/*     */   public String id() {
/* 616 */     return "fentian";
/*     */   }
/*     */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\entity\OnimikoEntity$10.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */