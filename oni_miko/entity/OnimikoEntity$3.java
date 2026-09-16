/*     */ package oni_miko.entity;
/*     */ 
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import oni_miko.ModEntities;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 175 */     t.getPersistentData().m_128405_("coolenTime_" + id(), t.getPersistentData().m_128451_("coolenTime_" + id()) - 1);
/* 176 */     return (OnimikoEntity.random.nextInt(500) < 25 && t.getPersistentData().m_128451_("coolenTime_" + id()) < 0 && t.m_5448_() != null);
/*     */   }
/*     */ 
/*     */   
/*     */   public void skillMain(OnimikoEntity t) {
/* 181 */     if (t.getPersistentData().m_128451_("coolenTime_" + id()) < 0) {
/*     */ 
/*     */       
/* 184 */       int size = OnimikoEntity.random.nextInt(20) + 30;
/*     */       
/* 186 */       for (int i = 0; i < size; i++) {
/* 187 */         T1Entity t1 = new T1Entity((EntityType<? extends T1Entity>)ModEntities.T_1.get(), t.m_20185_() - OnimikoEntity.random.nextInt(10) - 5.0D, t.m_20186_() + OnimikoEntity.random.nextInt(10), t.m_20189_() - OnimikoEntity.random.nextInt(10) - 5.0D, t.m_9236_());
/* 188 */         t1.m_20088_().m_135381_(T1Entity.god, Boolean.valueOf(true));
/* 189 */         t1.m_20088_().m_135381_(T1Entity.targetID, Integer.valueOf(t.m_5448_().m_19879_()));
/* 190 */         t1.m_5602_((Entity)t);
/* 191 */         t.m_9236_().m_7967_((Entity)t1);
/*     */       } 
/*     */       
/* 194 */       ModEvent.sendMessageToAll("saisen_bako.message.52");
/*     */       
/* 196 */       if (OnimikoEntity.random.nextBoolean()) {
/*     */         
/* 198 */         ModSounds.playSound((LevelAccessor)t.m_9236_(), (SoundEvent)ModSounds.XIAOSHENG2.get());
/*     */       }
/*     */       else {
/*     */         
/* 202 */         ModSounds.playSound((LevelAccessor)t.m_9236_(), (SoundEvent)ModSounds.XIAOSHENG3.get());
/*     */       } 
/*     */     } 
/* 205 */     t.getPersistentData().m_128405_("coolenTime_" + id(), 200);
/*     */   }
/*     */ 
/*     */   
/*     */   public String id() {
/* 210 */     return "shenfa.guishenyu";
/*     */   }
/*     */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\entity\OnimikoEntity$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */