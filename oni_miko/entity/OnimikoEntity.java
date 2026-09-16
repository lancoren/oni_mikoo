/*      */ package oni_miko.entity;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Arrays;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import java.util.Set;
/*      */ import net.minecraft.core.BlockPos;
/*      */ import net.minecraft.nbt.CompoundTag;
/*      */ import net.minecraft.network.chat.Component;
/*      */ import net.minecraft.network.protocol.Packet;
/*      */ import net.minecraft.network.protocol.game.ClientGamePacketListener;
/*      */ import net.minecraft.network.syncher.EntityDataAccessor;
/*      */ import net.minecraft.network.syncher.EntityDataSerializers;
/*      */ import net.minecraft.network.syncher.SynchedEntityData;
/*      */ import net.minecraft.resources.ResourceLocation;
/*      */ import net.minecraft.server.level.ServerBossEvent;
/*      */ import net.minecraft.server.level.ServerLevel;
/*      */ import net.minecraft.server.level.ServerPlayer;
/*      */ import net.minecraft.sounds.SoundEvent;
/*      */ import net.minecraft.util.Mth;
/*      */ import net.minecraft.util.RandomSource;
/*      */ import net.minecraft.world.BossEvent;
/*      */ import net.minecraft.world.Difficulty;
/*      */ import net.minecraft.world.damagesource.DamageSource;
/*      */ import net.minecraft.world.effect.MobEffectInstance;
/*      */ import net.minecraft.world.entity.Entity;
/*      */ import net.minecraft.world.entity.EntityType;
/*      */ import net.minecraft.world.entity.LivingEntity;
/*      */ import net.minecraft.world.entity.Mob;
/*      */ import net.minecraft.world.entity.MobSpawnType;
/*      */ import net.minecraft.world.entity.MobType;
/*      */ import net.minecraft.world.entity.PathfinderMob;
/*      */ import net.minecraft.world.entity.RelativeMovement;
/*      */ import net.minecraft.world.entity.SpawnPlacements;
/*      */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*      */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*      */ import net.minecraft.world.entity.ai.goal.Goal;
/*      */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*      */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*      */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*      */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*      */ import net.minecraft.world.entity.monster.Monster;
/*      */ import net.minecraft.world.item.ItemStack;
/*      */ import net.minecraft.world.level.Level;
/*      */ import net.minecraft.world.level.LevelAccessor;
/*      */ import net.minecraft.world.level.ServerLevelAccessor;
/*      */ import net.minecraft.world.level.block.Blocks;
/*      */ import net.minecraft.world.level.block.state.BlockState;
/*      */ import net.minecraft.world.level.levelgen.Heightmap;
/*      */ import net.minecraft.world.phys.AABB;
/*      */ import net.minecraft.world.phys.Vec3;
/*      */ import net.minecraftforge.network.PacketDistributor;
/*      */ import net.minecraftforge.network.PlayMessages;
/*      */ import net.minecraftforge.registries.ForgeRegistries;
/*      */ import oni_miko.ModEntities;
/*      */ import oni_miko.ModEvent;
/*      */ import oni_miko.ModSounds;
/*      */ import oni_miko.entity.skill.ISkill;
/*      */ import oni_miko.event.TickLateEvent;
/*      */ import oni_miko.message.IFMessage;
/*      */ import oni_miko.message.MessageAddParticle1;
/*      */ import oni_miko.message.MessageAddParticle3;
/*      */ import oni_miko.message.MessageAddParticle4;
/*      */ import oni_miko.message.MessageAddParticle5;
/*      */ import oni_miko.message.MessageAddParticle6;
/*      */ import oni_miko.message.MessageCreater;
/*      */ import oni_miko.message.MessageLoader;
/*      */ import oni_miko.message.MessageSkillXINGHONGEMENG;
/*      */ import oni_miko.message.MessageStopMove;
/*      */ import oni_miko.misite.ForceAttack;
/*      */ import tzdxxy.math.FastMath;
/*      */ 
/*      */ public class OnimikoEntity extends Monster {
/*   74 */   private static final EntityDataAccessor<Float> health = SynchedEntityData.m_135353_(OnimikoEntity.class, EntityDataSerializers.f_135029_);
/*   75 */   private static final EntityDataAccessor<Boolean> falseMode = SynchedEntityData.m_135353_(OnimikoEntity.class, EntityDataSerializers.f_135035_);
/*      */   
/*   77 */   private static final Random random = new Random();
/*      */   
/*      */   public static final String entityname = "onimiko";
/*      */   
/*   81 */   private static final ISkill[] skills1 = new ISkill[] { new ISkill<OnimikoEntity>()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public boolean run(OnimikoEntity t)
/*      */         {
/*   88 */           return (t.f_19797_ % 5 == 0 && t.m_5448_() != null);
/*      */         }
/*      */ 
/*      */         
/*      */         public void skillMain(OnimikoEntity t) {
/*   93 */           LivingEntity target = t.m_5448_();
/*   94 */           Level level = t.m_9236_();
/*   95 */           if (!level.f_46443_) {
/*      */             
/*   97 */             float rx = (float)((-t.m_146909_() - 90.0F) * 0.017453292519943295D);
/*   98 */             double sin = Mth.m_14031_(rx);
/*   99 */             double cos = Mth.m_14089_(rx);
/*      */             
/*  101 */             double r2 = OnimikoEntity.random.nextInt(360) * 0.017453292519943295D;
/*  102 */             double size = Math.cos(r2) * 1.25D + OnimikoEntity.random.nextGaussian();
/*      */             
/*  104 */             double x = sin * size;
/*  105 */             double y = Math.sin(r2) * 1.25D;
/*  106 */             double z = cos * size;
/*      */             
/*  108 */             T1Entity t1 = T1Entity.shoot((LivingEntity)t, new Vec3(x, y, z));
/*  109 */             t1.m_20088_().m_135381_(T1Entity.targetID, Integer.valueOf(target.m_19879_()));
/*  110 */             t1.m_146884_(t.m_20154_().m_82542_(-1.0D, -1.0D, -1.0D).m_82520_(t.m_20185_(), t.m_20188_(), t.m_20189_()));
/*      */           } 
/*      */         }
/*      */ 
/*      */         
/*      */         public String id() {
/*  116 */           return "";
/*      */         }
/*      */       }, new ISkill<OnimikoEntity>()
/*      */       {
/*      */ 
/*      */         
/*      */         public boolean run(OnimikoEntity t)
/*      */         {
/*  124 */           t.getPersistentData().m_128405_("coolenTime_" + id(), t.getPersistentData().m_128451_("coolenTime_" + id()) - 1);
/*  125 */           return ((OnimikoEntity.random.nextInt(500) < 4 && t.getPersistentData().m_128451_("coolenTime_" + id()) < 0 && t.m_5448_() != null) || t.getPersistentData().m_128451_("useingTime_" + id()) > 0);
/*      */         }
/*      */ 
/*      */         
/*      */         public void skillMain(OnimikoEntity t) {
/*  130 */           if (t.getPersistentData().m_128451_("useingTime_" + id()) > 0) {
/*      */             
/*  132 */             t.getPersistentData().m_128405_("useingTime_" + id(), t.getPersistentData().m_128451_("useingTime_" + id()) - 1);
/*      */             
/*  134 */             ServerLevel level = (ServerLevel)t.m_9236_();
/*      */             
/*  136 */             level.m_8583_().forEach(ent -> {
/*      */                   if (ent instanceof LivingEntity) {
/*      */                     LivingEntity liv = (LivingEntity)ent;
/*      */                     
/*      */                     if (liv != t) {
/*      */                       liv.f_20916_ = 0;
/*      */                       liv.m_6469_(liv.m_269291_().m_269333_((LivingEntity)t), 20.0F);
/*      */                     } 
/*      */                   } 
/*      */                 });
/*      */           } 
/*  147 */           if (t.getPersistentData().m_128451_("coolenTime_" + id()) < 0) {
/*      */             
/*  149 */             t.getPersistentData().m_128405_("useingTime_" + id(), 40);
/*      */             
/*  151 */             ModEvent.sendMessageToAll("saisen_bako.message.51");
/*      */             
/*  153 */             if (OnimikoEntity.random.nextBoolean()) {
/*      */               
/*  155 */               ModSounds.playSound((LevelAccessor)t.m_9236_(), (SoundEvent)ModSounds.XIAOSHENG2.get());
/*      */             }
/*      */             else {
/*      */               
/*  159 */               ModSounds.playSound((LevelAccessor)t.m_9236_(), (SoundEvent)ModSounds.XIAOSHENG3.get());
/*      */             } 
/*      */           } 
/*  162 */           t.getPersistentData().m_128405_("coolenTime_" + id(), 200);
/*      */         }
/*      */ 
/*      */         
/*      */         public String id() {
/*  167 */           return "moshen.sikuang";
/*      */         }
/*      */       }, new ISkill<OnimikoEntity>()
/*      */       {
/*      */ 
/*      */         
/*      */         public boolean run(OnimikoEntity t)
/*      */         {
/*  175 */           t.getPersistentData().m_128405_("coolenTime_" + id(), t.getPersistentData().m_128451_("coolenTime_" + id()) - 1);
/*  176 */           return (OnimikoEntity.random.nextInt(500) < 25 && t.getPersistentData().m_128451_("coolenTime_" + id()) < 0 && t.m_5448_() != null);
/*      */         }
/*      */ 
/*      */         
/*      */         public void skillMain(OnimikoEntity t) {
/*  181 */           if (t.getPersistentData().m_128451_("coolenTime_" + id()) < 0) {
/*      */ 
/*      */             
/*  184 */             int size = OnimikoEntity.random.nextInt(20) + 30;
/*      */             
/*  186 */             for (int i = 0; i < size; i++) {
/*  187 */               T1Entity t1 = new T1Entity((EntityType<? extends T1Entity>)ModEntities.T_1.get(), t.m_20185_() - OnimikoEntity.random.nextInt(10) - 5.0D, t.m_20186_() + OnimikoEntity.random.nextInt(10), t.m_20189_() - OnimikoEntity.random.nextInt(10) - 5.0D, t.m_9236_());
/*  188 */               t1.m_20088_().m_135381_(T1Entity.god, Boolean.valueOf(true));
/*  189 */               t1.m_20088_().m_135381_(T1Entity.targetID, Integer.valueOf(t.m_5448_().m_19879_()));
/*  190 */               t1.m_5602_((Entity)t);
/*  191 */               t.m_9236_().m_7967_((Entity)t1);
/*      */             } 
/*      */             
/*  194 */             ModEvent.sendMessageToAll("saisen_bako.message.52");
/*      */             
/*  196 */             if (OnimikoEntity.random.nextBoolean()) {
/*      */               
/*  198 */               ModSounds.playSound((LevelAccessor)t.m_9236_(), (SoundEvent)ModSounds.XIAOSHENG2.get());
/*      */             }
/*      */             else {
/*      */               
/*  202 */               ModSounds.playSound((LevelAccessor)t.m_9236_(), (SoundEvent)ModSounds.XIAOSHENG3.get());
/*      */             } 
/*      */           } 
/*  205 */           t.getPersistentData().m_128405_("coolenTime_" + id(), 200);
/*      */         }
/*      */ 
/*      */         
/*      */         public String id() {
/*  210 */           return "shenfa.guishenyu";
/*      */         }
/*      */       }, new ISkill<OnimikoEntity>()
/*      */       {
/*      */ 
/*      */         
/*      */         public boolean run(OnimikoEntity t)
/*      */         {
/*  218 */           t.getPersistentData().m_128405_("coolenTime_" + id(), t.getPersistentData().m_128451_("coolenTime_" + id()) - 1);
/*  219 */           return ((OnimikoEntity.random.nextInt(500) < 35 && t.getPersistentData().m_128451_("coolenTime_" + id()) < 0 && t.m_5448_() != null) || t.getPersistentData().m_128451_("useingTime_" + id()) > 0);
/*      */         }
/*      */ 
/*      */         
/*      */         public void skillMain(OnimikoEntity t) {
/*  224 */           if (t.getPersistentData().m_128451_("useingTime_" + id()) > 0) {
/*      */ 
/*      */             
/*  227 */             LivingEntity liv = t.m_5448_();
/*  228 */             if (liv != null && !(liv instanceof net.minecraft.world.entity.player.Player)) {
/*      */               
/*  230 */               liv.m_20334_(0.0D, 0.0D, 0.0D);
/*      */               
/*  232 */               float r = (t.getPersistentData().m_128451_("useingTime_" + id()) * 6) * 0.017453292F;
/*  233 */               double x = Mth.m_14089_(r) * Math.sqrt(liv.m_20191_().m_82362_() * liv.m_20191_().m_82362_() + liv.m_20191_().m_82376_() * liv.m_20191_().m_82376_());
/*  234 */               double z = Mth.m_14031_(r) * Math.sqrt(liv.m_20191_().m_82362_() * liv.m_20191_().m_82362_() + liv.m_20191_().m_82376_() * liv.m_20191_().m_82376_());
/*      */               
/*  236 */               (MessageLoader.getLoader()).instance.send(PacketDistributor.ALL.noArg(), new MessageCreater((IFMessage)new MessageAddParticle1(liv.m_20185_() + x, liv.m_20188_(), liv.m_20189_() + z, 0.0D, 0.0D, 0.0D)));
/*      */             } 
/*  238 */             t.getPersistentData().m_128405_("useingTime_" + id(), t.getPersistentData().m_128451_("useingTime_" + id()) - 1);
/*      */           } 
/*      */           
/*  241 */           if (t.getPersistentData().m_128451_("coolenTime_" + id()) < 0) {
/*      */             
/*  243 */             t.getPersistentData().m_128405_("useingTime_" + id(), 60);
/*      */             
/*  245 */             LivingEntity livingEntity = t.m_5448_(); if (livingEntity instanceof ServerPlayer) { ServerPlayer player = (ServerPlayer)livingEntity;
/*      */               
/*  247 */               (MessageLoader.getLoader()).instance.send(PacketDistributor.PLAYER.with(() -> player), new MessageCreater((IFMessage)new MessageStopMove())); }
/*      */ 
/*      */             
/*  250 */             ModEvent.sendMessageToAll("saisen_bako.message.39");
/*      */             
/*  252 */             if (OnimikoEntity.random.nextBoolean()) {
/*      */               
/*  254 */               ModSounds.playSound((LevelAccessor)t.m_9236_(), (SoundEvent)ModSounds.XIAOSHENG2.get());
/*      */             }
/*      */             else {
/*      */               
/*  258 */               ModSounds.playSound((LevelAccessor)t.m_9236_(), (SoundEvent)ModSounds.XIAOSHENG3.get());
/*      */             } 
/*      */           } 
/*  261 */           t.getPersistentData().m_128405_("coolenTime_" + id(), 200);
/*      */         }
/*      */ 
/*      */         
/*      */         public String id() {
/*  266 */           return "guimei.bafangguishuzhen";
/*      */         }
/*      */       }, new ISkill<OnimikoEntity>()
/*      */       {
/*      */ 
/*      */         
/*      */         public boolean run(OnimikoEntity t)
/*      */         {
/*  274 */           t.getPersistentData().m_128405_("coolenTime_" + id(), t.getPersistentData().m_128451_("coolenTime_" + id()) - 1);
/*  275 */           return (OnimikoEntity.random.nextInt(500) < 15 && t.getPersistentData().m_128451_("coolenTime_" + id()) < 0 && t.m_5448_() != null);
/*      */         }
/*      */ 
/*      */         
/*      */         public void skillMain(OnimikoEntity t) {
/*  280 */           if (t.getPersistentData().m_128451_("coolenTime_" + id()) < 0) {
/*      */ 
/*      */             
/*  283 */             LivingEntity ent = t.m_5448_();
/*  284 */             List<ItemStack> stacks = new ArrayList<>();
/*  285 */             ent.m_6168_().forEach(stack -> {
/*      */                   if (!stack.m_41619_()) {
/*      */                     stacks.add(stack);
/*      */                   }
/*      */                 });
/*      */ 
/*      */ 
/*      */             
/*  293 */             ent.m_6167_().forEach(stack -> {
/*      */                   if (!stack.m_41619_()) {
/*      */                     stacks.add(stack);
/*      */                   }
/*      */                 });
/*      */ 
/*      */ 
/*      */             
/*  301 */             if (!stacks.isEmpty()) {
/*      */               
/*  303 */               ItemStack stack = stacks.get(OnimikoEntity.random.nextInt(stacks.size()));
/*  304 */               stack.m_41774_(stack.m_41613_());
/*  305 */               ModEvent.sendMessageToAll("saisen_bako.message.40");
/*  306 */               ModSounds.playSound((LevelAccessor)t.m_9236_(), t.m_20185_(), t.m_20186_(), t.m_20189_(), (SoundEvent)ModSounds.POSUI.get());
/*  307 */               t.getPersistentData().m_128405_("coolenTime_" + id(), 2000000000);
/*      */             } 
/*      */           } 
/*      */         }
/*      */ 
/*      */         
/*      */         public String id() {
/*  314 */           return "hundun.mengxiangfengyin";
/*      */         }
/*      */       } };
/*      */ 
/*      */ 
/*      */   
/*  320 */   private static final ISkill[] skills2 = new ISkill[] { new ISkill<OnimikoEntity>()
/*      */       {
/*      */ 
/*      */         
/*      */         public boolean run(OnimikoEntity t)
/*      */         {
/*  326 */           return (t.f_19797_ % 20 == 0);
/*      */         }
/*      */ 
/*      */         
/*      */         public void skillMain(OnimikoEntity t) {
/*  331 */           t.getPersistentData().m_128379_("SWINGMAINHANDGANJIANG", !t.getPersistentData().m_128471_("SWINGMAINHANDGANJIANG"));
/*      */           
/*  333 */           t.m_9236_().m_45933_((Entity)t, new AABB(t.m_20185_() - 5.0D, t.m_20186_() - 2.0D, t.m_20189_() - 5.0D, t.m_20185_() + 5.0D, t.m_20186_() + 3.0D, t.m_20189_() + 5.0D)).forEach(ent -> {
/*      */                 if (t != ent) {
/*      */                   if (ent instanceof LivingEntity) {
/*      */                     LivingEntity liv = (LivingEntity)ent;
/*      */                     
/*      */                     liv.m_21153_(liv.m_21223_() - 15.0F);
/*      */                     
/*      */                     liv.m_6469_(t.m_269291_().m_287172_(), 15.0F);
/*      */                   } 
/*      */                 }
/*      */               });
/*  344 */           if (t.getPersistentData().m_128471_("SWINGMAINHANDGANJIANG")) {
/*      */             
/*  346 */             for (int i = -60; i < 180; i += 5)
/*      */             {
/*  348 */               float x = 1.0F;
/*  349 */               float z = 0.0F;
/*  350 */               float y = 0.0F;
/*      */               
/*  352 */               float[] pos = FastMath.rotate(x, y, z, i, 30);
/*      */               
/*  354 */               x = -pos[0];
/*  355 */               y = pos[1];
/*  356 */               z = -pos[2];
/*      */               
/*  358 */               pos = FastMath.rotate(x, y, z, (int)-t.m_146909_() + 90, (int)t.m_146908_());
/*      */               
/*  360 */               x = pos[0];
/*  361 */               y = pos[1];
/*  362 */               z = pos[2];
/*      */               
/*  364 */               x *= 5.0F;
/*  365 */               y *= 5.0F;
/*  366 */               z *= 5.0F;
/*      */               
/*  368 */               (MessageLoader.getLoader()).instance.send(PacketDistributor.ALL.noArg(), new MessageCreater((IFMessage)new MessageAddParticle6(x + t.m_20185_(), y + t.m_20186_() + t.m_20192_(), z + t.m_20189_(), 0.0D, 0.0D, 0.0D)));
/*      */             }
/*      */           
/*      */           }
/*      */           else {
/*      */             
/*  374 */             for (int i = -60; i < 180; i += 5) {
/*  375 */               float x = 1.0F;
/*  376 */               float z = 0.0F;
/*  377 */               float y = 0.0F;
/*      */               
/*  379 */               float[] pos = FastMath.rotate(x, y, z, i, 30);
/*      */               
/*  381 */               x = pos[0];
/*  382 */               y = pos[1];
/*  383 */               z = pos[2];
/*      */               
/*  385 */               pos = FastMath.rotate(x, y, z, (int)-t.m_146909_() + 90, (int)t.m_146908_());
/*      */               
/*  387 */               x = pos[0];
/*  388 */               y = pos[1];
/*  389 */               z = pos[2];
/*      */               
/*  391 */               x *= 5.0F;
/*  392 */               y *= 5.0F;
/*  393 */               z *= 5.0F;
/*      */               
/*  395 */               (MessageLoader.getLoader()).instance.send(PacketDistributor.ALL.noArg(), new MessageCreater((IFMessage)new MessageAddParticle6(x + t.m_20185_(), y + t.m_20186_() + t.m_20192_(), z + t.m_20189_(), 0.0D, 0.0D, 0.0D)));
/*      */             } 
/*      */           } 
/*      */         }
/*      */ 
/*      */ 
/*      */         
/*      */         public String id() {
/*  403 */           return "";
/*      */         }
/*      */       }, new ISkill<OnimikoEntity>()
/*      */       {
/*      */ 
/*      */         
/*      */         public boolean run(OnimikoEntity t)
/*      */         {
/*  411 */           t.getPersistentData().m_128405_("coolenTime_" + id(), t.getPersistentData().m_128451_("coolenTime_" + id()) - 1);
/*  412 */           return (OnimikoEntity.random.nextInt(500) < 15 && t.getPersistentData().m_128451_("coolenTime_" + id()) < 0 && t.m_5448_() != null);
/*      */         }
/*      */ 
/*      */         
/*      */         public void skillMain(OnimikoEntity t) {
/*  417 */           if (t.getPersistentData().m_128451_("coolenTime_" + id()) < 0) {
/*      */             
/*  419 */             t.m_5448_().m_21153_(t.m_21223_() - t.m_21233_() * 0.15F);
/*  420 */             ModEvent.sendMessageToAll("saisen_bako.message.43");
/*  421 */             ModSounds.playSound((LevelAccessor)t.m_9236_(), t.m_20185_(), t.m_20186_(), t.m_20189_(), (SoundEvent)ModSounds.XINTIAO.get());
/*      */           } 
/*  423 */           t.getPersistentData().m_128405_("coolenTime_" + id(), 2000000000);
/*      */         }
/*      */ 
/*      */         
/*      */         public String id() {
/*  428 */           return "xinzang";
/*      */         }
/*      */       }, new ISkill<OnimikoEntity>()
/*      */       {
/*      */ 
/*      */         
/*      */         public boolean run(OnimikoEntity t)
/*      */         {
/*  436 */           t.getPersistentData().m_128405_("coolenTime_" + id(), t.getPersistentData().m_128451_("coolenTime_" + id()) - 1);
/*  437 */           return (OnimikoEntity.random.nextInt(500) < 15 && t.getPersistentData().m_128451_("coolenTime_" + id()) < 0);
/*      */         }
/*      */ 
/*      */         
/*      */         public void skillMain(OnimikoEntity t) {
/*  442 */           if (t.getPersistentData().m_128451_("coolenTime_" + id()) < 0) {
/*      */ 
/*      */             
/*  445 */             for (int in = 0; in < 10; in++) {
/*      */               
/*  447 */               OnimikoEntity entity = new OnimikoEntity((EntityType<OnimikoEntity>)ModEntities.ONIMIKO.get(), t.m_9236_());
/*  448 */               boolean tp = false;
/*      */               
/*  450 */               for (int i = 0; i < 300; i++) {
/*      */                 
/*  452 */                 float r = OnimikoEntity.random.nextInt(360) * 0.017453292F;
/*  453 */                 double d = OnimikoEntity.random.nextInt(10);
/*      */                 
/*  455 */                 BlockPos pos = new BlockPos((int)(t.m_20185_() + Mth.m_14089_(r) * d), (int)t.m_20186_(), (int)(t.m_20189_() + Mth.m_14031_(r) * d));
/*      */                 
/*  457 */                 if (t.m_9236_().m_46859_(pos) && t.m_9236_().m_46859_(pos.m_7494_())) {
/*      */                   
/*  459 */                   entity.m_6034_(pos.m_123341_(), pos.m_123342_(), pos.m_123343_());
/*  460 */                   tp = true;
/*      */                 } 
/*      */               } 
/*      */               
/*  464 */               if (!tp) entity.m_146884_(t.m_20182_());
/*      */               
/*  466 */               entity.m_20088_().m_135381_(OnimikoEntity.falseMode, Boolean.valueOf(true));
/*  467 */               entity.m_21153_(1.0F);
/*  468 */               t.m_9236_().m_7967_((Entity)entity);
/*      */             } 
/*      */ 
/*      */             
/*  472 */             ModEvent.sendMessageToAll("saisen_bako.message.43");
/*  473 */             ModSounds.playSound((LevelAccessor)t.m_9236_(), t.m_20185_(), t.m_20186_(), t.m_20189_(), (SoundEvent)ModSounds.ZAIKUAIXIE.get());
/*      */           } 
/*  475 */           t.getPersistentData().m_128405_("coolenTime_" + id(), 1200);
/*      */         }
/*      */ 
/*      */         
/*      */         public String id() {
/*  480 */           return "luanwu";
/*      */         }
/*      */       }, new ISkill<OnimikoEntity>()
/*      */       {
/*      */ 
/*      */         
/*      */         public boolean run(OnimikoEntity t)
/*      */         {
/*  488 */           t.getPersistentData().m_128405_("coolenTime_" + id(), t.getPersistentData().m_128451_("coolenTime_" + id()) - 1);
/*  489 */           return (OnimikoEntity.random.nextInt(500) < 15 && t.getPersistentData().m_128451_("coolenTime_" + id()) < 0 && t.m_5448_() != null);
/*      */         }
/*      */ 
/*      */         
/*      */         public void skillMain(OnimikoEntity t) {
/*  494 */           if (t.getPersistentData().m_128451_("coolenTime_" + id()) < 0) {
/*      */             
/*  496 */             (MessageLoader.getLoader()).instance.send(PacketDistributor.ALL.noArg(), new MessageCreater((IFMessage)new MessageSkillXINGHONGEMENG()));
/*  497 */             ModEvent.sendMessageToAll("saisen_bako.message.45");
/*  498 */             if (OnimikoEntity.random.nextBoolean()) {
/*      */               
/*  500 */               ModSounds.playSound((LevelAccessor)t.m_9236_(), (SoundEvent)ModSounds.XIAOSHENG2.get());
/*      */             }
/*      */             else {
/*      */               
/*  504 */               ModSounds.playSound((LevelAccessor)t.m_9236_(), (SoundEvent)ModSounds.XIAOSHENG3.get());
/*      */             } 
/*      */           } 
/*  507 */           t.getPersistentData().m_128405_("coolenTime_" + id(), 2000000000);
/*      */         }
/*      */ 
/*      */         
/*      */         public String id() {
/*  512 */           return "jimie.xinghongemeng";
/*      */         }
/*      */       }, new ISkill<OnimikoEntity>()
/*      */       {
/*      */ 
/*      */         
/*      */         public boolean run(OnimikoEntity t)
/*      */         {
/*  520 */           t.getPersistentData().m_128405_("coolenTime_" + id(), t.getPersistentData().m_128451_("coolenTime_" + id()) - 1);
/*  521 */           return (OnimikoEntity.random.nextInt(500) < 15 && t.getPersistentData().m_128451_("coolenTime_" + id()) < 0 && !t.m_9236_().m_46859_((new BlockPos((int)t.m_20185_(), (int)t.m_20186_(), (int)t.m_20189_())).m_7495_()));
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         public void skillMain(OnimikoEntity t) {
/*  528 */           BlockPos pos = (new BlockPos((int)t.m_20185_(), (int)t.m_20186_(), (int)t.m_20189_())).m_7495_();
/*      */           
/*  530 */           int max = Math.min(t.m_9236_().m_151558_(), pos.m_123342_() + 6);
/*  531 */           int min = Math.max(t.m_9236_().m_141937_(), pos.m_123342_() - 6);
/*      */           
/*  533 */           new TickLateEvent(false, tick -> {
/*      */                 for (int i = 0; i <= tick; i++) {
/*      */                   for (int y = max - 1; y >= min; y--) {
/*      */                     BlockPos[] poses = { new BlockPos(pos.m_123341_() - i, y, pos.m_123343_() + tick), new BlockPos(pos.m_123341_() + i, y, pos.m_123343_() + tick), new BlockPos(pos.m_123341_() + tick, y, pos.m_123343_() + i), new BlockPos(pos.m_123341_() + tick, y, pos.m_123343_() - i), new BlockPos(pos.m_123341_() - i, y, pos.m_123343_() - tick), new BlockPos(pos.m_123341_() + i, y, pos.m_123343_() - tick), new BlockPos(pos.m_123341_() - tick, y, pos.m_123343_() + i), new BlockPos(pos.m_123341_() - tick, y, pos.m_123343_() - i) };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                     
/*      */                     for (int j = 0; j < poses.length; j++) {
/*      */                       BlockPos blockPos = poses[j];
/*      */ 
/*      */ 
/*      */ 
/*      */                       
/*      */                       if (!t.m_9236_().m_46859_(blockPos)) {
/*      */                         BlockState state = t.m_9236_().m_8055_(blockPos);
/*      */ 
/*      */ 
/*      */ 
/*      */                         
/*      */                         if (state.m_60713_(Blocks.f_49990_) || state.m_60713_(Blocks.f_50126_) || state.m_60713_(Blocks.f_50568_) || state.m_60713_(Blocks.f_50449_) || state.m_60713_(Blocks.f_50354_)) {
/*      */                           t.m_9236_().m_7731_(blockPos, Blocks.f_50016_.m_49966_(), 1);
/*      */ 
/*      */ 
/*      */ 
/*      */                           
/*      */                           new TickLateEvent(false, ());
/*      */                         } else if (state.m_60713_(Blocks.f_152476_)) {
/*      */                           t.m_9236_().m_7731_(blockPos, Blocks.f_152477_.m_49966_(), 1);
/*      */                         } else {
/*      */                           t.m_9236_().m_7731_(blockPos, Blocks.f_50134_.m_49966_(), 1);
/*      */ 
/*      */ 
/*      */ 
/*      */                           
/*      */                           if (OnimikoEntity.random.nextInt(10) <= 1) {
/*      */                             if (t.m_9236_().m_46859_(blockPos.m_7494_())) {
/*      */                               t.m_9236_().m_7731_(blockPos.m_7494_(), Blocks.f_50083_.m_49966_(), 1);
/*      */                             }
/*      */                           }
/*      */                         } 
/*      */                       } 
/*      */                     } 
/*      */                   } 
/*      */                 } 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/*      */                 if (tick > 6) {
/*      */                   ForceAttack.remove1((ServerLevel)t.m_9236_(), Arrays.asList(new Entity[] { (Entity)t }));
/*      */ 
/*      */ 
/*      */ 
/*      */                   
/*      */                   return true;
/*      */                 } 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/*      */                 return false;
/*      */               });
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  601 */           ModEvent.sendMessageToAll("saisen_bako.message.53");
/*  602 */           if (OnimikoEntity.random.nextBoolean()) {
/*      */             
/*  604 */             ModSounds.playSound((LevelAccessor)t.m_9236_(), (SoundEvent)ModSounds.XIAOSHENG2.get());
/*      */           }
/*      */           else {
/*      */             
/*  608 */             ModSounds.playSound((LevelAccessor)t.m_9236_(), (SoundEvent)ModSounds.XIAOSHENG3.get());
/*      */           } 
/*      */           
/*  611 */           t.getPersistentData().m_128405_("coolenTime_" + id(), -1474836480);
/*      */         }
/*      */ 
/*      */         
/*      */         public String id() {
/*  616 */           return "fentian";
/*      */         }
/*      */       } };
/*      */ 
/*      */ 
/*      */   
/*  622 */   private final ServerBossEvent bossEvent = new ServerBossEvent(m_5446_(), BossEvent.BossBarColor.PURPLE, BossEvent.BossBarOverlay.PROGRESS);
/*      */   public double lastX; public double lastY; public double lastZ;
/*      */   
/*  625 */   public OnimikoEntity(PlayMessages.SpawnEntity packet, Level world) { this((EntityType<OnimikoEntity>)ModEntities.ONIMIKO.get(), world); }
/*      */   public Packet<ClientGamePacketListener> m_5654_() { return NetworkHooks.getEntitySpawningPacket((Entity)this); }
/*      */   public void m_142687_(Entity.RemovalReason p_276115_) { if (p_276115_ == Entity.RemovalReason.UNLOADED_TO_CHUNK || p_276115_ == Entity.RemovalReason.CHANGED_DIMENSION || p_276115_ == Entity.RemovalReason.UNLOADED_WITH_PLAYER) super.m_142687_(p_276115_);  if (p_276115_ == Entity.RemovalReason.KILLED && !m_6084_()) super.m_142687_(p_276115_);  } public float getTrueMaxHealth() { if (((Boolean)m_20088_().m_135370_(falseMode)).booleanValue()) return 1.0F;  return 1200.0F; } protected void m_8099_() { super.m_8099_(); this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false) {
/*      */           protected double m_6639_(LivingEntity entity) { return (this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_()); }
/*  629 */         }); this.f_21345_.m_25352_(2, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D)); this.f_21346_.m_25352_(3, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0])); this.f_21345_.m_25352_(4, (Goal)new RandomLookAroundGoal((Mob)this)); this.f_21345_.m_25352_(5, (Goal)new FloatGoal((Mob)this)); } protected void m_8097_() { super.m_8097_(); m_20088_().m_135372_(falseMode, Boolean.valueOf(false)); m_20088_().m_135372_(health, Float.valueOf(getTrueMaxHealth())); } public OnimikoEntity(EntityType<OnimikoEntity> type, Level world) { super(type, world);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  822 */     this.lastX = Double.NaN;
/*  823 */     this.lastY = Double.NaN;
/*  824 */     this.lastZ = Double.NaN; m_274367_(0.6F); this.f_21364_ = 0; if (!world.f_46443_) new TickLateEvent(false, tick -> { if (ModEvent.server != world.m_7654_()) return true;  if (m_213877_()) { Entity.RemovalReason removalReason = m_146911_(); if (removalReason == Entity.RemovalReason.KILLED && m_21223_() > 0.0F) { CompoundTag tag = new CompoundTag(); OnimikoEntity entity = new OnimikoEntity(type, world); entity.m_20240_(tag); tag.m_128473_("UUID"); entity.m_20258_(tag); entity.m_20088_().m_135381_(health, Float.valueOf(entity.m_21223_())); ModEvent.sendMessageToAll("Tell to me,Can you kill a god?"); entity.m_146884_(m_20182_()); m_9236_().m_7967_((Entity)entity); }  return true; }  return false; });  }
/*      */   public CompoundTag getPersistentData() { return super.getPersistentData(); }
/*      */   public void m_21557_(boolean p_21558_) { super.m_21557_(false); }
/*      */   public boolean m_21525_() { return false; }
/*  828 */   public void m_21153_(float health) { if (Math.abs(health - m_21223_()) > ((m_21223_() > 600.0F) ? 20 : 10)) return;  if (health > getTrueMaxHealth()) health = getTrueMaxHealth();  if (health < 0.0F) health = 0.0F;  m_20088_().m_135381_(OnimikoEntity.health, Float.valueOf(health)); } public float m_21223_() { return ((Float)m_20088_().m_135370_(health)).floatValue(); } public void m_6034_(double p_20210_, double p_20211_, double p_20212_) { if (this.lastX != Double.NaN && this.lastY != Double.NaN && this.lastZ != Double.NaN)
/*      */     {
/*  830 */       if (Math.sqrt((this.lastX - p_20210_) * (this.lastX - p_20210_) + (this.lastY - p_20211_) * (this.lastY - p_20211_) + (this.lastZ - p_20212_) * (this.lastZ - p_20212_)) > 10.0D) {
/*      */         return;
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  839 */     super.m_6034_(p_20210_, p_20211_, p_20212_); } public MobType m_6336_() { return MobType.f_21640_; } protected void m_142540_(MobEffectInstance p_147190_, Entity p_147191_) {} public boolean m_7301_(MobEffectInstance p_21197_) { return false; } public boolean m_6469_(DamageSource p_21016_, float p_21017_) { if (p_21016_.m_7639_() != null) { Entity entity = p_21016_.m_7639_(); if (entity instanceof LivingEntity) { LivingEntity ent = (LivingEntity)entity; ent.m_21153_(ent.m_21223_() - p_21017_); ent.m_6469_(m_269291_().m_269425_(), 1.0F); }  }  if (p_21017_ > ((m_21223_() > 600.0F) ? 20 : 10)) p_21017_ = ((m_21223_() > 600.0F) ? 20 : 10);  if (m_21223_() < 600.0F) { if (!(m_9236_()).f_46443_) if (random.nextInt(10) < 8) for (int i = 0; i < 300; i++) { float r = random.nextInt(360) * 0.017453292F; double d = random.nextInt(10); BlockPos pos = new BlockPos((int)(m_20185_() + Mth.m_14089_(r) * d), (int)m_20186_(), (int)(m_20189_() + Mth.m_14031_(r) * d)); if (m_9236_().m_46859_(pos) && m_9236_().m_46859_(pos.m_7494_())) { ModEvent.sendMessageToAll("saisen_bako.message.42"); m_6034_(pos.m_123341_(), pos.m_123342_(), pos.m_123343_()); }  }    p_21017_ = (float)(p_21017_ * 0.2D); }  return super.m_6469_(p_21016_, p_21017_); } public boolean canUpdate() { return true; } public boolean m_264318_(ServerLevel p_265257_, double p_265407_, double p_265727_, double p_265410_, Set<RelativeMovement> p_265083_, float p_265573_, float p_265094_) { return false; }
/*      */   public boolean m_20984_(double p_20985_, double p_20986_, double p_20987_, boolean p_20988_) { return false; }
/*      */   public void m_6021_(double p_19887_, double p_19888_, double p_19889_) {}
/*      */   public void m_246847_(double p_249341_, double p_252229_, double p_252038_) {}
/*      */   public void m_6074_() { if (!(m_9236_()).f_46443_) try { ModEvent.server.m_6846_().m_11314_().forEach(ent -> ent.m_21153_(0.0F)); } catch (Throwable e) { e.printStackTrace(); }   }
/*  844 */   public ISkill[] getSkill() { return (m_21223_() > 600.0F) ? skills1 : skills2; }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void m_8119_() {
/*  850 */     m_20095_();
/*      */     
/*  852 */     if (m_5448_() != null && !m_5448_().m_6084_()) m_6710_(null);
/*      */     
/*  854 */     if (this.lastX != Double.NaN && this.lastY != Double.NaN && this.lastZ != Double.NaN)
/*      */     {
/*  856 */       if (Math.sqrt((this.lastX - 
/*  857 */           m_20185_()) * (this.lastX - m_20185_()) + (this.lastY - 
/*  858 */           m_20186_()) * (this.lastY - m_20186_()) + (this.lastZ - 
/*  859 */           m_20189_()) * (this.lastZ - m_20189_())) > 10.0D)
/*      */       {
/*      */         
/*  862 */         m_6034_(this.lastX, this.lastY, this.lastZ);
/*      */       }
/*      */     }
/*      */     
/*  866 */     if (!(m_9236_()).f_46443_) {
/*      */ 
/*      */       
/*  869 */       if (getSkill()[0].run(this)) getSkill()[0].skillMain(this); 
/*  870 */       if (this.f_19797_ % 3 == 0)
/*      */       {
/*  872 */         for (int i = 1; i < (getSkill()).length; i++) {
/*  873 */           if (getSkill()[i].run(this)) getSkill()[i].skillMain(this);
/*      */         
/*      */         } 
/*      */       }
/*  877 */       if (((Boolean)m_20088_().m_135370_(falseMode)).booleanValue() && this.f_19797_ % 10 * 20 == 0) {
/*      */         
/*  879 */         super.m_142687_(Entity.RemovalReason.DISCARDED);
/*      */         
/*  881 */         (MessageLoader.getLoader()).instance.send(PacketDistributor.ALL.noArg(), new MessageCreater((IFMessage)new MessageAddParticle6(m_20185_(), m_20186_() + m_20192_(), m_20189_(), 0.0D, 0.0D, 0.0D)));
/*      */       } 
/*      */       
/*  884 */       if (!getPersistentData().m_128471_("kishintai2")) {
/*      */         
/*  886 */         if (m_21223_() < 600.0D)
/*      */         {
/*  888 */           getPersistentData().m_128379_("kishintai2", true);
/*  889 */           getPersistentData().m_128405_("kishintai2_time", 0);
/*      */         }
/*      */       
/*      */       } else {
/*      */         
/*  894 */         int kishintai2_time = getPersistentData().m_128451_("kishintai2_time");
/*      */         
/*  896 */         if (kishintai2_time == 0)
/*      */         {
/*  898 */           ModEvent.sendMessageToAll("saisen_bako.message.47");
/*      */         }
/*      */         
/*  901 */         if (kishintai2_time == 20)
/*      */         {
/*  903 */           ModEvent.sendMessageToAll("saisen_bako.message.48");
/*      */         }
/*      */         
/*  906 */         if (kishintai2_time == 40)
/*      */         {
/*  908 */           ModEvent.sendMessageToAll("saisen_bako.message.49");
/*      */         }
/*      */         
/*  911 */         if (kishintai2_time == 60) {
/*      */           
/*  913 */           ModEvent.sendMessageToAll("saisen_bako.message.50");
/*  914 */           getPersistentData().m_128379_("kishintai2", false);
/*      */           
/*  916 */           m_9236_().m_45933_((Entity)this, new AABB(m_20185_() - 50.0D, m_20186_() - 50.0D, m_20189_() - 50.0D, m_20185_() + 50.0D, m_20186_() + 50.0D, m_20189_() + 50.0D)).forEach(entity -> {
/*      */                 if (entity instanceof LivingEntity) {
/*      */                   LivingEntity liv = (LivingEntity)entity;
/*      */                   
/*      */                   liv.m_21153_(liv.m_21223_() - 1000.0F);
/*      */                   
/*      */                   liv.m_6469_(m_269291_().m_287172_(), 1000.0F);
/*      */                 } 
/*      */               });
/*      */           
/*  926 */           for (int i = 0; i < 10; i++) {
/*      */             
/*  928 */             (MessageLoader.getLoader()).instance.send(PacketDistributor.ALL.noArg(), new MessageCreater((IFMessage)new MessageAddParticle6(m_20185_() + (random.nextInt(100) - 50), m_20186_() + m_20192_() + (random.nextInt(100) - 20), m_20189_() + (random.nextInt(100) - 50), 0.0D, 0.0D, 0.0D)));
/*  929 */             (MessageLoader.getLoader()).instance.send(PacketDistributor.ALL.noArg(), new MessageCreater((IFMessage)new MessageAddParticle5(m_20185_() + (random.nextInt(100) - 50), m_20186_() + m_20192_() + (random.nextInt(100) - 20), m_20189_() + (random.nextInt(100) - 50), 0.0D, 0.0D, 0.0D)));
/*  930 */             (MessageLoader.getLoader()).instance.send(PacketDistributor.ALL.noArg(), new MessageCreater((IFMessage)new MessageAddParticle4(m_20185_() + (random.nextInt(100) - 50), m_20186_() + m_20192_() + (random.nextInt(100) - 20), m_20189_() + (random.nextInt(100) - 50), 0.0D, 0.0D, 0.0D)));
/*  931 */             (MessageLoader.getLoader()).instance.send(PacketDistributor.ALL.noArg(), new MessageCreater((IFMessage)new MessageAddParticle3(m_20185_() + (random.nextInt(100) - 50), m_20186_() + m_20192_() + (random.nextInt(100) - 20), m_20189_() + (random.nextInt(100) - 50), 0.0D, 0.0D, 0.0D)));
/*      */           } 
/*      */           
/*  934 */           ModSounds.playSound((LevelAccessor)m_9236_(), (SoundEvent)ModSounds.SOUND1.get());
/*  935 */           ModSounds.playSound((LevelAccessor)m_9236_(), (SoundEvent)ModSounds.XUEHUAPINGSHENG.get());
/*  936 */           ModSounds.playSound((LevelAccessor)m_9236_(), (SoundEvent)ModSounds.XIAOSHENG3.get());
/*      */         } 
/*      */         
/*  939 */         getPersistentData().m_128405_("kishintai2_time", kishintai2_time + 1);
/*      */       } 
/*      */       
/*  942 */       if (!getPersistentData().m_128471_("kishintai")) {
/*      */         
/*  944 */         if (m_21223_() < 600.0F)
/*      */         {
/*  946 */           getPersistentData().m_128379_("kishintai", true);
/*  947 */           ModSounds.playSound((LevelAccessor)m_9236_(), (SoundEvent)ModSounds.JINENGYINXIAO.get());
/*  948 */           ModEvent.sendMessageToAll("saisen_bako.message.41");
/*      */           
/*  950 */           m_21051_(Attributes.f_22279_).m_22100_(1.0D);
/*      */         }
/*      */       
/*      */       } else {
/*      */         
/*  955 */         if (this.f_19797_ % 20 * 5 == 0) m_5634_(10.0F);
/*      */         
/*  957 */         for (float f = 1.0F; f < 11.0F; f++) {
/*      */           
/*  959 */           int r = random.nextInt(360);
/*      */           
/*  961 */           float x = FastMath.cos(r) * (f * 5.0F + random.nextInt(5));
/*  962 */           float z = FastMath.sin(r) * (f * 5.0F + random.nextInt(5));
/*      */           
/*  964 */           (MessageLoader.getLoader()).instance.send(PacketDistributor.ALL.noArg(), new MessageCreater((IFMessage)new MessageAddParticle1(m_20185_() + x, m_20186_(), m_20189_() + z, ((random.nextInt(2) - 1) / 3.0F), 0.7D + 0.3D * random.nextGaussian(), ((random.nextInt(2) - 1) / 3.0F))));
/*      */         } 
/*      */       } 
/*      */       
/*  968 */       if (m_5448_() == null) {
/*      */         
/*  970 */         LivingEntity[] target = new LivingEntity[1];
/*  971 */         double[] d = { 50.0D };
/*  972 */         ServerLevel sl = (ServerLevel)m_9236_();
/*  973 */         sl.m_142646_().m_142273_().forEach(ent -> {
/*      */               if (ent.m_20270_((Entity)this) < d[0] && ent instanceof LivingEntity) {
/*      */                 LivingEntity ta = (LivingEntity)ent;
/*      */                 
/*      */                 if (ta != this) {
/*      */                   d[0] = ent.m_20270_((Entity)this);
/*      */                   target[0] = ta;
/*      */                 } 
/*      */               } 
/*      */             });
/*  983 */         m_6710_(target[0]);
/*      */       }
/*      */       else {
/*      */         
/*  987 */         int targetTime = m_5448_().getPersistentData().m_128451_("_targetTime");
/*      */         
/*  989 */         if (targetTime > 400) {
/*      */           
/*  991 */           m_146884_(m_5448_().m_20182_());
/*  992 */           m_5448_().m_20334_(0.0D, 0.0D, 0.0D);
/*  993 */           m_5448_().canUpdate(false);
/*      */           
/*  995 */           (m_5448_()).f_20919_++;
/*  996 */           (m_5448_()).f_20916_++;
/*      */           
/*  998 */           if ((m_5448_()).f_20919_ > 20 || targetTime > 430) {
/*      */             
/* 1000 */             ForceAttack.removeEntity((Entity)m_5448_());
/* 1001 */             ModEvent.sendMessageToAll("saisen_bako.message.finalKill");
/*      */           } 
/*      */         } 
/*      */         
/* 1005 */         m_5448_().getPersistentData().m_128405_("_targetTime", targetTime + 1);
/* 1006 */         m_5448_().getPersistentData().m_128379_("_antiheal", true);
/*      */       } 
/*      */       
/* 1009 */       if (this.f_19797_ % 40 == 0)
/*      */       {
/* 1011 */         if (m_5448_() != null)
/*      */         {
/* 1013 */           m_6034_(m_5448_().m_20185_() + random.nextInt(4) - 2.0D, m_5448_().m_20186_(), m_5448_().m_20189_() + random.nextInt(4) - 2.0D);
/*      */         }
/*      */       }
/*      */       
/* 1017 */       AABB box = m_20191_();
/* 1018 */       m_9236_().m_45933_((Entity)this, new AABB(new Vec3(box.f_82291_ + 3.0D, box.f_82292_ + 3.0D, box.f_82293_ + 3.0D), new Vec3(box.f_82288_ - 3.0D, box.f_82289_ - 3.0D, box.f_82290_ - 3.0D))).forEach(entity -> {
/*      */             if (entity instanceof net.minecraft.world.entity.projectile.Projectile && !(entity instanceof T1Entity)) {
/*      */               if (!entity.getPersistentData().m_128471_("reflected")) {
/*      */                 entity.getPersistentData().m_128379_("reflected", true);
/*      */ 
/*      */ 
/*      */                 
/*      */                 entity.m_20256_(entity.m_20184_().m_82542_(-1.0D, -1.0D, -1.0D));
/*      */               } 
/*      */             }
/*      */           });
/*      */     } 
/*      */ 
/*      */     
/* 1032 */     if (m_20186_() < m_9236_().m_141937_()) {
/* 1033 */       m_20334_((m_20184_()).f_82479_, 0.0D, (m_20184_()).f_82481_);
/* 1034 */       m_6034_(m_20185_(), m_9236_().m_141937_(), m_20189_());
/*      */     } 
/*      */     
/* 1037 */     this.lastX = m_20185_();
/* 1038 */     this.lastY = m_20186_();
/* 1039 */     this.lastZ = m_20189_();
/*      */     
/* 1041 */     this.bossEvent.m_142711_(m_21223_() / getTrueMaxHealth());
/* 1042 */     this.bossEvent.m_6456_((Component)Component.m_237115_("entity.onimiko.name"));
/*      */     
/* 1044 */     super.m_8119_();
/*      */   }
/*      */ 
/*      */   
/*      */   public void m_6457_(ServerPlayer p_31483_) {
/* 1049 */     super.m_6457_(p_31483_);
/* 1050 */     if (!((Boolean)m_20088_().m_135370_(falseMode)).booleanValue()) this.bossEvent.m_6543_(p_31483_);
/*      */   
/*      */   }
/*      */   
/*      */   public void m_6452_(ServerPlayer p_31488_) {
/* 1055 */     super.m_6452_(p_31488_);
/* 1056 */     if (!((Boolean)m_20088_().m_135370_(falseMode)).booleanValue()) this.bossEvent.m_6539_(p_31488_);
/*      */   
/*      */   }
/*      */   
/*      */   public SoundEvent m_7975_(DamageSource ds) {
/* 1061 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
/*      */   }
/*      */ 
/*      */   
/*      */   public SoundEvent m_5592_() {
/* 1066 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
/*      */   }
/*      */   
/*      */   public static void init() {
/* 1070 */     SpawnPlacements.m_21754_((EntityType)ModEntities.ONIMIKO.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> 
/* 1071 */         (world.m_46791_() != Difficulty.PEACEFUL && Monster.m_219009_(world, pos, random) && Mob.m_217057_(entityType, (LevelAccessor)world, reason, pos, random)));
/*      */   }
/*      */   
/*      */   public static AttributeSupplier.Builder createAttributes() {
/* 1075 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 1076 */     builder = builder.m_22268_(Attributes.f_22279_, 0.3D);
/* 1077 */     builder = builder.m_22268_(Attributes.f_22276_, 1024.0D);
/* 1078 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 1079 */     builder = builder.m_22268_(Attributes.f_22281_, 3.0D);
/* 1080 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 1081 */     return builder;
/*      */   }
/*      */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\entity\OnimikoEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */