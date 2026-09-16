/*     */ package oni_miko.entity;
/*     */ 
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.phys.Vec3;
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
/*     */ class null
/*     */   implements ISkill<OnimikoEntity>
/*     */ {
/*     */   public boolean run(OnimikoEntity t) {
/*  88 */     return (t.f_19797_ % 5 == 0 && t.m_5448_() != null);
/*     */   }
/*     */ 
/*     */   
/*     */   public void skillMain(OnimikoEntity t) {
/*  93 */     LivingEntity target = t.m_5448_();
/*  94 */     Level level = t.m_9236_();
/*  95 */     if (!level.f_46443_) {
/*     */       
/*  97 */       float rx = (float)((-t.m_146909_() - 90.0F) * 0.017453292519943295D);
/*  98 */       double sin = Mth.m_14031_(rx);
/*  99 */       double cos = Mth.m_14089_(rx);
/*     */       
/* 101 */       double r2 = OnimikoEntity.random.nextInt(360) * 0.017453292519943295D;
/* 102 */       double size = Math.cos(r2) * 1.25D + OnimikoEntity.random.nextGaussian();
/*     */       
/* 104 */       double x = sin * size;
/* 105 */       double y = Math.sin(r2) * 1.25D;
/* 106 */       double z = cos * size;
/*     */       
/* 108 */       T1Entity t1 = T1Entity.shoot((LivingEntity)t, new Vec3(x, y, z));
/* 109 */       t1.m_20088_().m_135381_(T1Entity.targetID, Integer.valueOf(target.m_19879_()));
/* 110 */       t1.m_146884_(t.m_20154_().m_82542_(-1.0D, -1.0D, -1.0D).m_82520_(t.m_20185_(), t.m_20188_(), t.m_20189_()));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public String id() {
/* 116 */     return "";
/*     */   }
/*     */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\entity\OnimikoEntity$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */