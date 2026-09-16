/*     */ package oni_miko.entity;
/*     */ 
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import oni_miko.ModEvent;
/*     */ import oni_miko.ModSounds;
/*     */ import oni_miko.entity.skill.ISkill;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 124 */     t.getPersistentData().m_128405_("coolenTime_" + id(), t.getPersistentData().m_128451_("coolenTime_" + id()) - 1);
/* 125 */     return ((OnimikoEntity.random.nextInt(500) < 4 && t.getPersistentData().m_128451_("coolenTime_" + id()) < 0 && t.m_5448_() != null) || t.getPersistentData().m_128451_("useingTime_" + id()) > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void skillMain(OnimikoEntity t) {
/* 130 */     if (t.getPersistentData().m_128451_("useingTime_" + id()) > 0) {
/*     */       
/* 132 */       t.getPersistentData().m_128405_("useingTime_" + id(), t.getPersistentData().m_128451_("useingTime_" + id()) - 1);
/*     */       
/* 134 */       ServerLevel level = (ServerLevel)t.m_9236_();
/*     */       
/* 136 */       level.m_8583_().forEach(ent -> {
/*     */             if (ent instanceof LivingEntity) {
/*     */               LivingEntity liv = (LivingEntity)ent;
/*     */               
/*     */               if (liv != t) {
/*     */                 liv.f_20916_ = 0;
/*     */                 liv.m_6469_(liv.m_269291_().m_269333_((LivingEntity)t), 20.0F);
/*     */               } 
/*     */             } 
/*     */           });
/*     */     } 
/* 147 */     if (t.getPersistentData().m_128451_("coolenTime_" + id()) < 0) {
/*     */       
/* 149 */       t.getPersistentData().m_128405_("useingTime_" + id(), 40);
/*     */       
/* 151 */       ModEvent.sendMessageToAll("saisen_bako.message.51");
/*     */       
/* 153 */       if (OnimikoEntity.random.nextBoolean()) {
/*     */         
/* 155 */         ModSounds.playSound((LevelAccessor)t.m_9236_(), (SoundEvent)ModSounds.XIAOSHENG2.get());
/*     */       }
/*     */       else {
/*     */         
/* 159 */         ModSounds.playSound((LevelAccessor)t.m_9236_(), (SoundEvent)ModSounds.XIAOSHENG3.get());
/*     */       } 
/*     */     } 
/* 162 */     t.getPersistentData().m_128405_("coolenTime_" + id(), 200);
/*     */   }
/*     */ 
/*     */   
/*     */   public String id() {
/* 167 */     return "moshen.sikuang";
/*     */   }
/*     */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\entity\OnimikoEntity$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */