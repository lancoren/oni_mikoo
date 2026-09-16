/*     */ package oni_miko.entity;
/*     */ import net.minecraft.core.particles.ParticleOptions;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.network.protocol.game.ClientGamePacketListener;
/*     */ import net.minecraft.network.syncher.EntityDataAccessor;
/*     */ import net.minecraft.network.syncher.EntityDataSerializers;
/*     */ import net.minecraft.network.syncher.SynchedEntityData;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.projectile.AbstractArrow;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.phys.EntityHitResult;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ import oni_miko.ModEntities;
/*     */ import oni_miko.ModParticleTypes;
/*     */ 
/*     */ public class T1Entity extends AbstractArrow {
/*  29 */   private static final EntityDataAccessor<Integer> findTargetTime = SynchedEntityData.m_135353_(T1Entity.class, EntityDataSerializers.f_135028_);
/*  30 */   public static final EntityDataAccessor<Integer> targetID = SynchedEntityData.m_135353_(T1Entity.class, EntityDataSerializers.f_135028_);
/*     */   
/*  32 */   public static final EntityDataAccessor<Boolean> god = SynchedEntityData.m_135353_(T1Entity.class, EntityDataSerializers.f_135035_);
/*     */   
/*     */   public T1Entity(PlayMessages.SpawnEntity packet, Level world) {
/*  35 */     super((EntityType)ModEntities.T_1.get(), world);
/*     */   }
/*     */   
/*     */   public T1Entity(EntityType<? extends T1Entity> type, Level world) {
/*  39 */     super(type, world);
/*     */   }
/*     */   
/*     */   public T1Entity(EntityType<? extends T1Entity> type, double x, double y, double z, Level world) {
/*  43 */     super(type, x, y, z, world);
/*     */   }
/*     */   
/*     */   public T1Entity(EntityType<? extends T1Entity> type, LivingEntity entity, Level world) {
/*  47 */     super(type, entity, world);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8097_() {
/*  52 */     super.m_8097_();
/*  53 */     m_20088_().m_135372_(findTargetTime, Integer.valueOf(10));
/*  54 */     m_20088_().m_135372_(targetID, Integer.valueOf(-1));
/*  55 */     m_20088_().m_135372_(god, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<ClientGamePacketListener> m_5654_() {
/*  60 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_5790_(EntityHitResult p_36757_) {
/*  65 */     if (p_36757_.m_82443_() instanceof OnimikoEntity) {
/*     */       
/*  67 */       m_146870_();
/*     */       return;
/*     */     } 
/*  70 */     super.m_5790_(p_36757_);
/*     */     
/*  72 */     m_9236_().m_7106_((ParticleOptions)ModParticleTypes.P_3.get(), p_36757_.m_82443_().m_20185_(), p_36757_.m_82443_().m_20188_(), p_36757_.m_82443_().m_20189_(), 0.0D, 0.0D, 0.0D);
/*     */     
/*  74 */     if (((Boolean)m_20088_().m_135370_(god)).booleanValue()) {
/*     */       
/*  76 */       Entity entity = p_36757_.m_82443_(); if (entity instanceof LivingEntity) { LivingEntity liv = (LivingEntity)entity; liv.m_21153_(liv.m_21223_() - 50.0F); }
/*  77 */        p_36757_.m_82443_().m_6469_(m_269291_().m_269425_(), 20.0F);
/*  78 */       m_9236_().m_254849_(m_19749_(), m_20185_(), m_20186_(), m_20189_(), 10.0F, Level.ExplosionInteraction.TNT);
/*     */     }
/*     */     else {
/*     */       
/*  82 */       p_36757_.m_82443_().m_6469_(m_269291_().m_269341_(), 8.0F);
/*     */     } 
/*     */     
/*  85 */     m_146870_();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_7761_(LivingEntity entity) {
/*  90 */     super.m_7761_(entity);
/*  91 */     entity.m_21317_(entity.m_21234_() - 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_20068_() {
/*  96 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_8119_() {
/* 101 */     super.m_8119_();
/*     */     
/* 103 */     if (((Boolean)m_20088_().m_135370_(god)).booleanValue()) m_9236_().m_7106_((ParticleOptions)ModParticleTypes.P_2.get(), m_20185_(), m_20188_(), m_20189_(), 0.0D, 0.0D, 0.0D);
/*     */     
/* 105 */     if (!(m_9236_()).f_46443_)
/*     */     {
/* 107 */       if (((Integer)m_20088_().m_135370_(findTargetTime)).intValue() > 0) {
/*     */         
/* 109 */         m_20088_().m_135381_(findTargetTime, Integer.valueOf(((Integer)m_20088_().m_135370_(findTargetTime)).intValue() - 1));
/*     */       }
/*     */       else {
/*     */         
/* 113 */         if (((Integer)m_20088_().m_135370_(targetID)).intValue() != -1) {
/*     */           
/* 115 */           Entity target = m_9236_().m_6815_(((Integer)m_20088_().m_135370_(targetID)).intValue());
/* 116 */           if (target != null && target.m_6084_())
/*     */           
/* 118 */           { if (target.m_20191_().m_82381_(m_20191_())) m_9236_().m_7106_((ParticleOptions)ModParticleTypes.P_3.get(), m_20185_(), m_20188_(), m_20189_(), 0.0D, 0.0D, 0.0D);
/*     */             
/* 120 */             double dx = target.m_20185_() - m_20185_();
/* 121 */             double dy = target.m_20186_() + target.m_20192_() - m_20186_();
/* 122 */             double dz = target.m_20189_() - m_20189_();
/* 123 */             if (((Integer)m_20088_().m_135370_(findTargetTime)).intValue() == 0 || ((Boolean)m_20088_().m_135370_(god)).booleanValue()) m_6686_(dx, dy, dz, 2.0F, 14.0F);  }
/* 124 */           else { m_146870_(); }
/*     */         
/* 126 */         }  m_20088_().m_135381_(findTargetTime, Integer.valueOf(-1));
/*     */       } 
/*     */     }
/*     */     
/* 130 */     if (this.f_36703_) {
/*     */       
/* 132 */       m_146870_();
/* 133 */       if (((Boolean)m_20088_().m_135370_(god)).booleanValue())
/*     */       {
/* 135 */         m_9236_().m_254849_(m_19749_(), m_20185_(), m_20186_(), m_20189_(), 10.0F, Level.ExplosionInteraction.TNT);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public static T1Entity shoot(Level world, LivingEntity entity, RandomSource source) {
/* 141 */     return shoot(world, entity, source, 1.0F, 5.0D, 5);
/*     */   }
/*     */   
/*     */   public static T1Entity shoot(Level world, LivingEntity entity, RandomSource source, float pullingPower) {
/* 145 */     return shoot(world, entity, source, pullingPower * 1.0F, 5.0D, 5);
/*     */   }
/*     */   
/*     */   public static T1Entity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
/* 149 */     T1Entity entityarrow = new T1Entity((EntityType<? extends T1Entity>)ModEntities.T_1.get(), entity, world);
/* 150 */     entityarrow.m_6686_((entity.m_20252_(1.0F)).f_82479_, (entity.m_20252_(1.0F)).f_82480_, (entity.m_20252_(1.0F)).f_82481_, power * 2.0F, 0.0F);
/* 151 */     entityarrow.m_20225_(true);
/* 152 */     entityarrow.m_36762_(false);
/* 153 */     entityarrow.m_36781_(damage);
/* 154 */     entityarrow.m_36735_(knockback);
/* 155 */     world.m_7967_((Entity)entityarrow);
/* 156 */     world.m_6263_(null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1.0F, 1.0F / (random.m_188501_() * 0.5F + 1.0F) + power / 2.0F);
/* 157 */     return entityarrow;
/*     */   }
/*     */   
/*     */   public static T1Entity shoot(LivingEntity entity, Vec3 targetAngle) {
/* 161 */     T1Entity entityarrow = new T1Entity((EntityType<? extends T1Entity>)ModEntities.T_1.get(), entity, entity.m_9236_());
/*     */     
/* 163 */     entityarrow.m_20334_(targetAngle.f_82479_ / 3.0D, targetAngle.f_82480_ / 3.0D, targetAngle.f_82481_ / 3.0D);
/* 164 */     entityarrow.m_20225_(true);
/* 165 */     entityarrow.m_36781_(5.0D);
/* 166 */     entityarrow.m_36735_(5);
/* 167 */     entityarrow.m_36762_(false);
/* 168 */     entity.m_9236_().m_7967_((Entity)entityarrow);
/* 169 */     entity.m_9236_().m_6263_(null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1.0F, 1.0F / (RandomSource.m_216327_().m_188501_() * 0.5F + 1.0F));
/* 170 */     return entityarrow;
/*     */   }
/*     */   
/*     */   public static T1Entity shoot(LivingEntity entity, LivingEntity target) {
/* 174 */     T1Entity entityarrow = new T1Entity((EntityType<? extends T1Entity>)ModEntities.T_1.get(), entity, entity.m_9236_());
/* 175 */     double dx = target.m_20185_() - entity.m_20185_();
/* 176 */     double dy = target.m_20186_() + target.m_20192_() - 1.1D;
/* 177 */     double dz = target.m_20189_() - entity.m_20189_();
/* 178 */     entityarrow.m_6686_(dx, dy - entityarrow.m_20186_() + Math.hypot(dx, dz) * 0.20000000298023224D, dz, 2.0F, 12.0F);
/* 179 */     entityarrow.m_20225_(true);
/* 180 */     entityarrow.m_36781_(5.0D);
/* 181 */     entityarrow.m_36735_(5);
/* 182 */     entityarrow.m_36762_(false);
/* 183 */     entity.m_9236_().m_7967_((Entity)entityarrow);
/* 184 */     entity.m_9236_().m_6263_(null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1.0F, 1.0F / (RandomSource.m_216327_().m_188501_() * 0.5F + 1.0F));
/* 185 */     return entityarrow;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ItemStack m_7941_() {
/* 190 */     return new ItemStack((ItemLike)Items.f_41852_);
/*     */   }
/*     */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\entity\T1Entity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */