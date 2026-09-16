/*     */ package oni_miko.entity;
/*     */ 
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraftforge.network.PacketDistributor;
/*     */ import oni_miko.ModEvent;
/*     */ import oni_miko.ModSounds;
/*     */ import oni_miko.entity.skill.ISkill;
/*     */ import oni_miko.message.IFMessage;
/*     */ import oni_miko.message.MessageAddParticle1;
/*     */ import oni_miko.message.MessageCreater;
/*     */ import oni_miko.message.MessageLoader;
/*     */ import oni_miko.message.MessageStopMove;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 218 */     t.getPersistentData().m_128405_("coolenTime_" + id(), t.getPersistentData().m_128451_("coolenTime_" + id()) - 1);
/* 219 */     return ((OnimikoEntity.random.nextInt(500) < 35 && t.getPersistentData().m_128451_("coolenTime_" + id()) < 0 && t.m_5448_() != null) || t.getPersistentData().m_128451_("useingTime_" + id()) > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void skillMain(OnimikoEntity t) {
/* 224 */     if (t.getPersistentData().m_128451_("useingTime_" + id()) > 0) {
/*     */ 
/*     */       
/* 227 */       LivingEntity liv = t.m_5448_();
/* 228 */       if (liv != null && !(liv instanceof net.minecraft.world.entity.player.Player)) {
/*     */         
/* 230 */         liv.m_20334_(0.0D, 0.0D, 0.0D);
/*     */         
/* 232 */         float r = (t.getPersistentData().m_128451_("useingTime_" + id()) * 6) * 0.017453292F;
/* 233 */         double x = Mth.m_14089_(r) * Math.sqrt(liv.m_20191_().m_82362_() * liv.m_20191_().m_82362_() + liv.m_20191_().m_82376_() * liv.m_20191_().m_82376_());
/* 234 */         double z = Mth.m_14031_(r) * Math.sqrt(liv.m_20191_().m_82362_() * liv.m_20191_().m_82362_() + liv.m_20191_().m_82376_() * liv.m_20191_().m_82376_());
/*     */         
/* 236 */         (MessageLoader.getLoader()).instance.send(PacketDistributor.ALL.noArg(), new MessageCreater((IFMessage)new MessageAddParticle1(liv.m_20185_() + x, liv.m_20188_(), liv.m_20189_() + z, 0.0D, 0.0D, 0.0D)));
/*     */       } 
/* 238 */       t.getPersistentData().m_128405_("useingTime_" + id(), t.getPersistentData().m_128451_("useingTime_" + id()) - 1);
/*     */     } 
/*     */     
/* 241 */     if (t.getPersistentData().m_128451_("coolenTime_" + id()) < 0) {
/*     */       
/* 243 */       t.getPersistentData().m_128405_("useingTime_" + id(), 60);
/*     */       
/* 245 */       LivingEntity livingEntity = t.m_5448_(); if (livingEntity instanceof ServerPlayer) { ServerPlayer player = (ServerPlayer)livingEntity;
/*     */         
/* 247 */         (MessageLoader.getLoader()).instance.send(PacketDistributor.PLAYER.with(() -> player), new MessageCreater((IFMessage)new MessageStopMove())); }
/*     */ 
/*     */       
/* 250 */       ModEvent.sendMessageToAll("saisen_bako.message.39");
/*     */       
/* 252 */       if (OnimikoEntity.random.nextBoolean()) {
/*     */         
/* 254 */         ModSounds.playSound((LevelAccessor)t.m_9236_(), (SoundEvent)ModSounds.XIAOSHENG2.get());
/*     */       }
/*     */       else {
/*     */         
/* 258 */         ModSounds.playSound((LevelAccessor)t.m_9236_(), (SoundEvent)ModSounds.XIAOSHENG3.get());
/*     */       } 
/*     */     } 
/* 261 */     t.getPersistentData().m_128405_("coolenTime_" + id(), 200);
/*     */   }
/*     */ 
/*     */   
/*     */   public String id() {
/* 266 */     return "guimei.bafangguishuzhen";
/*     */   }
/*     */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\entity\OnimikoEntity$4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */