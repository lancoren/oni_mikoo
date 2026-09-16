/*     */ package oni_miko.entity;
/*     */ 
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraftforge.network.PacketDistributor;
/*     */ import oni_miko.entity.skill.ISkill;
/*     */ import oni_miko.message.IFMessage;
/*     */ import oni_miko.message.MessageAddParticle6;
/*     */ import oni_miko.message.MessageCreater;
/*     */ import oni_miko.message.MessageLoader;
/*     */ import tzdxxy.math.FastMath;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 326 */     return (t.f_19797_ % 20 == 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void skillMain(OnimikoEntity t) {
/* 331 */     t.getPersistentData().m_128379_("SWINGMAINHANDGANJIANG", !t.getPersistentData().m_128471_("SWINGMAINHANDGANJIANG"));
/*     */     
/* 333 */     t.m_9236_().m_45933_((Entity)t, new AABB(t.m_20185_() - 5.0D, t.m_20186_() - 2.0D, t.m_20189_() - 5.0D, t.m_20185_() + 5.0D, t.m_20186_() + 3.0D, t.m_20189_() + 5.0D)).forEach(ent -> {
/*     */           if (t != ent) {
/*     */             if (ent instanceof LivingEntity) {
/*     */               LivingEntity liv = (LivingEntity)ent;
/*     */               
/*     */               liv.m_21153_(liv.m_21223_() - 15.0F);
/*     */               
/*     */               liv.m_6469_(t.m_269291_().m_287172_(), 15.0F);
/*     */             } 
/*     */           }
/*     */         });
/* 344 */     if (t.getPersistentData().m_128471_("SWINGMAINHANDGANJIANG")) {
/*     */       
/* 346 */       for (int i = -60; i < 180; i += 5)
/*     */       {
/* 348 */         float x = 1.0F;
/* 349 */         float z = 0.0F;
/* 350 */         float y = 0.0F;
/*     */         
/* 352 */         float[] pos = FastMath.rotate(x, y, z, i, 30);
/*     */         
/* 354 */         x = -pos[0];
/* 355 */         y = pos[1];
/* 356 */         z = -pos[2];
/*     */         
/* 358 */         pos = FastMath.rotate(x, y, z, (int)-t.m_146909_() + 90, (int)t.m_146908_());
/*     */         
/* 360 */         x = pos[0];
/* 361 */         y = pos[1];
/* 362 */         z = pos[2];
/*     */         
/* 364 */         x *= 5.0F;
/* 365 */         y *= 5.0F;
/* 366 */         z *= 5.0F;
/*     */         
/* 368 */         (MessageLoader.getLoader()).instance.send(PacketDistributor.ALL.noArg(), new MessageCreater((IFMessage)new MessageAddParticle6(x + t.m_20185_(), y + t.m_20186_() + t.m_20192_(), z + t.m_20189_(), 0.0D, 0.0D, 0.0D)));
/*     */       }
/*     */     
/*     */     }
/*     */     else {
/*     */       
/* 374 */       for (int i = -60; i < 180; i += 5) {
/* 375 */         float x = 1.0F;
/* 376 */         float z = 0.0F;
/* 377 */         float y = 0.0F;
/*     */         
/* 379 */         float[] pos = FastMath.rotate(x, y, z, i, 30);
/*     */         
/* 381 */         x = pos[0];
/* 382 */         y = pos[1];
/* 383 */         z = pos[2];
/*     */         
/* 385 */         pos = FastMath.rotate(x, y, z, (int)-t.m_146909_() + 90, (int)t.m_146908_());
/*     */         
/* 387 */         x = pos[0];
/* 388 */         y = pos[1];
/* 389 */         z = pos[2];
/*     */         
/* 391 */         x *= 5.0F;
/* 392 */         y *= 5.0F;
/* 393 */         z *= 5.0F;
/*     */         
/* 395 */         (MessageLoader.getLoader()).instance.send(PacketDistributor.ALL.noArg(), new MessageCreater((IFMessage)new MessageAddParticle6(x + t.m_20185_(), y + t.m_20186_() + t.m_20192_(), z + t.m_20189_(), 0.0D, 0.0D, 0.0D)));
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String id() {
/* 403 */     return "";
/*     */   }
/*     */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\entity\OnimikoEntity$6.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */