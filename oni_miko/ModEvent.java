/*     */ package oni_miko;
/*     */ import java.util.Random;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.effect.MobEffectInstance;
/*     */ import net.minecraft.world.effect.MobEffects;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.level.block.entity.BlockEntity;
/*     */ import net.minecraft.world.level.block.entity.ChestBlockEntity;
/*     */ import net.minecraft.world.level.chunk.ChunkAccess;
/*     */ import net.minecraft.world.level.storage.ServerLevelData;
/*     */ import net.minecraftforge.event.TickEvent;
/*     */ import net.minecraftforge.event.entity.living.LivingHealEvent;
/*     */ import net.minecraftforge.event.entity.player.PlayerInteractEvent;
/*     */ import net.minecraftforge.event.level.BlockEvent;
/*     */ import net.minecraftforge.event.level.LevelEvent;
/*     */ import net.minecraftforge.event.server.ServerStartingEvent;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.network.PacketDistributor;
/*     */ import oni_miko.entity.OnimikoEntity;
/*     */ import oni_miko.message.IFMessage;
/*     */ import oni_miko.message.MessageCreater;
/*     */ import oni_miko.message.MessageGenRedParticle;
/*     */ import oni_miko.message.MessageLoader;
/*     */ import oni_miko.message.MessageOpenErrorScreen;
/*     */ 
/*     */ @EventBusSubscriber
/*     */ public class ModEvent {
/*  40 */   public static MinecraftServer server = null;
/*     */   
/*     */   public static boolean needInit = false;
/*     */   
/*     */   public static void sendMessageToAll(String str) {
/*  45 */     server.m_6846_().m_11314_().forEach(player -> player.m_213846_((Component)Component.m_237115_(str)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onServerStarting(ServerStartingEvent event) {
/*  56 */     server = event.getServer();
/*     */   }
/*     */ 
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onCreateSpawnPosition(LevelEvent.CreateSpawnPosition event) {
/*  62 */     needInit = true;
/*     */   }
/*     */ 
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onHealEvent(LivingHealEvent event) {
/*  68 */     if (event.getEntity() != null && event.getEntity().getPersistentData().m_128471_("_antiheal")) {
/*     */       
/*  70 */       event.getEntity().m_21153_(-event.getAmount());
/*  71 */       event.setAmount(0.0F);
/*  72 */       event.setCanceled(true);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onServerTickEvent(TickEvent.ServerTickEvent event) {
/*  79 */     if (event.phase == TickEvent.Phase.END)
/*  80 */       return;  ServerLevel level = server.m_129783_();
/*  81 */     ServerLevelData data = server.m_129910_().m_5996_();
/*     */ 
/*     */     
/*  84 */     if (needInit) {
/*     */       
/*  86 */       needInit = false;
/*  87 */       initWorld(data, (LevelAccessor)level);
/*     */     } 
/*     */     
/*  90 */     BlockPos spawnPos = new BlockPos(data.m_6789_(), data.m_6527_(), data.m_6526_());
/*  91 */     ChunkAccess chunk = level.m_46865_(spawnPos);
/*     */     
/*  93 */     for (int y = level.m_141937_(); y < level.m_151558_(); y++) {
/*     */ 
/*     */       
/*  96 */       for (int x = 0; x < 16; x++) {
/*     */ 
/*     */         
/*  99 */         for (int z = 0; z < 16; z++) {
/*     */ 
/*     */           
/* 102 */           BlockPos targetPos = new BlockPos((chunk.m_7697_()).f_45578_ * 16 + x, y, (chunk.m_7697_()).f_45579_ * 16 + z);
/*     */           
/* 104 */           if (!level.m_46859_(targetPos)) {
/*     */ 
/*     */             
/* 107 */             BlockEntity entity = level.m_7702_(targetPos);
/* 108 */             if (entity != null && entity instanceof ChestBlockEntity) {
/*     */               
/* 110 */               ChestBlockEntity chestEntity = (ChestBlockEntity)entity;
/* 111 */               if (chestEntity.getPersistentData().m_128471_("saisen_bako")) {
/*     */                 
/* 113 */                 int size = chestEntity.m_18947_(Items.f_42415_);
/*     */                 
/* 115 */                 if (chestEntity.getPersistentData().m_128471_("willRemove")) {
/*     */                   
/* 117 */                   int tick = chestEntity.getPersistentData().m_128451_("willRemoveTick");
/*     */                   
/* 119 */                   if (tick < 58 && tick % 2 == 0)
/*     */                   {
/* 121 */                     server.m_6846_().m_11314_().forEach(player -> player.m_213846_((Component)Component.m_237115_("saisen_bako.message." + 7 + MessageRandom.messageId[tick / 2])));
/*     */                   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/* 129 */                   if (tick == 58) {
/*     */                     
/* 131 */                     (MessageLoader.getLoader()).instance.send(PacketDistributor.ALL.noArg(), new MessageCreater((IFMessage)new MessageOpenErrorScreen()));
/* 132 */                     (MessageLoader.getLoader()).instance.send(PacketDistributor.ALL.noArg(), new MessageCreater((IFMessage)new MessageGenRedParticle(targetPos.m_123341_(), targetPos.m_123342_(), targetPos.m_123343_())));
/*     */                   } 
/*     */                   
/* 135 */                   if (tick == 80)
/*     */                   {
/* 137 */                     server.m_6846_().m_11314_().forEach(player -> player.m_213846_((Component)Component.m_237115_("saisen_bako.message.37")));
/*     */                   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/* 145 */                   if (tick == 100)
/*     */                   {
/* 147 */                     server.m_6846_().m_11314_().forEach(player -> {
/*     */                           player.m_213846_((Component)Component.m_237115_("saisen_bako.message.38"));
/*     */ 
/*     */                           
/*     */                           ModSounds.playSound((LevelAccessor)player.m_9236_(), player.m_20185_(), player.m_20186_(), player.m_20189_(), (SoundEvent)ModSounds.GANGQINZHONGYIN.get());
/*     */ 
/*     */                           
/*     */                           ModSounds.playSound((LevelAccessor)player.m_9236_(), player.m_20185_(), player.m_20186_(), player.m_20189_(), (SoundEvent)ModSounds.XIAOSHENG2.get());
/*     */                         });
/*     */                   }
/*     */                   
/* 158 */                   if (tick == 120) {
/*     */                     
/* 160 */                     OnimikoEntity onimiko = new OnimikoEntity((EntityType)ModEntities.ONIMIKO.get(), (Level)level);
/* 161 */                     onimiko.m_6034_(targetPos.m_123341_(), targetPos.m_123342_(), targetPos.m_123343_());
/* 162 */                     level.m_7967_((Entity)onimiko);
/* 163 */                     level.m_255391_((Entity)onimiko, targetPos.m_123341_(), targetPos.m_123342_(), targetPos.m_123343_(), 20.0F, false, Level.ExplosionInteraction.TNT);
/*     */                   } 
/*     */                   
/* 166 */                   chestEntity.getPersistentData().m_128405_("willRemoveTick", tick + 1);
/*     */                 } 
/*     */                 
/* 169 */                 if (chestEntity.getPersistentData().m_128451_("hasDIAMOND") > size)
/*     */                 {
/* 171 */                   chestEntity.getPersistentData().m_128379_("willRemove", true);
/*     */                 }
/*     */                 
/* 174 */                 chestEntity.getPersistentData().m_128405_("hasDIAMOND", size);
/*     */                 
/* 176 */                 if (size == 10) {
/*     */                   
/* 178 */                   server.m_6846_().m_11314_().forEach(player -> player.m_7292_(new MobEffectInstance(MobEffects.f_19590_, 3, 3)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/*     */                 }
/* 185 */                 else if (size == 25) {
/*     */                   
/* 187 */                   server.m_6846_().m_11314_().forEach(player -> player.m_7292_(new MobEffectInstance(MobEffects.f_19621_, 3, 3)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/*     */                 }
/* 194 */                 else if (size == 45) {
/*     */                   
/* 196 */                   server.m_6846_().m_11314_().forEach(player -> player.m_7292_(new MobEffectInstance(MobEffects.f_19621_, 4, 4)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/*     */                 }
/* 203 */                 else if (size == 85) {
/*     */                   
/* 205 */                   server.m_6846_().m_11314_().forEach(player -> player.m_7292_(new MobEffectInstance(MobEffects.f_19621_, 5, 5)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/*     */                 }
/* 212 */                 else if (size == 95) {
/*     */                   
/* 214 */                   server.m_6846_().m_11314_().forEach(player -> {
/*     */                         player.m_7292_(new MobEffectInstance(MobEffects.f_19607_, 5, 5));
/*     */                         player.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 4, 4));
/*     */                         player.m_7292_(new MobEffectInstance(MobEffects.f_19598_, 5, 5));
/*     */                       });
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
/* 238 */     Level level = event.getLevel();
/* 239 */     BlockPos pos = event.getPos();
/* 240 */     Player player = event.getEntity();
/*     */     
/* 242 */     BlockEntity entity = level.m_7702_(pos);
/* 243 */     if (entity != null && entity instanceof ChestBlockEntity) {
/*     */       
/* 245 */       ChestBlockEntity chestEntity = (ChestBlockEntity)entity;
/* 246 */       if (chestEntity.getPersistentData().m_128471_("saisen_bako")) {
/*     */         
/* 248 */         int size = chestEntity.m_18947_(Items.f_42415_);
/*     */         
/* 250 */         if (size == 5) {
/*     */           
/* 252 */           if (!player.getPersistentData().m_128471_("openedTheBox"))
/*     */           {
/* 254 */             if (!level.m_5776_())
/*     */             {
/* 256 */               player.m_213846_((Component)Component.m_237115_("saisen_bako.message.1"));
/*     */             }
/* 258 */             player.getPersistentData().m_128379_("openedTheBox", true);
/*     */           }
/*     */         
/* 261 */         } else if (size == 10) {
/*     */           
/* 263 */           player.m_213846_((Component)Component.m_237115_("saisen_bako.message.2"));
/*     */         }
/* 265 */         else if (size == 25) {
/*     */           
/* 267 */           player.m_213846_((Component)Component.m_237115_("saisen_bako.message.3"));
/*     */         }
/* 269 */         else if (size == 45) {
/*     */           
/* 271 */           player.m_213846_((Component)Component.m_237115_("saisen_bako.message.4"));
/*     */         }
/* 273 */         else if (size == 85) {
/*     */           
/* 275 */           player.m_213846_((Component)Component.m_237115_("saisen_bako.message.5"));
/*     */         }
/* 277 */         else if (size == 95) {
/*     */           
/* 279 */           player.m_213846_((Component)Component.m_237115_("saisen_bako.message.6"));
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onBreakEvent(BlockEvent.BreakEvent event) {
/* 288 */     LevelAccessor level = event.getLevel();
/* 289 */     BlockPos pos = event.getPos();
/*     */     
/* 291 */     BlockEntity entity = level.m_7702_(pos);
/*     */     
/* 293 */     if (entity != null && entity instanceof ChestBlockEntity) {
/*     */       
/* 295 */       ChestBlockEntity chestEntity = (ChestBlockEntity)entity;
/* 296 */       if (chestEntity.getPersistentData().m_128471_("saisen_bako")) {
/*     */         
/* 298 */         chestEntity.getPersistentData().m_128379_("willRemove", true);
/*     */         
/* 300 */         if (chestEntity.getPersistentData().m_128451_("willRemoveTick") < 110) event.setCanceled(true);
/*     */       
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void initWorld(ServerLevelData data, LevelAccessor level) {
/* 307 */     int x = data.m_6789_();
/* 308 */     int y = data.m_6527_();
/* 309 */     int z = data.m_6526_();
/* 310 */     BlockPos spawnPos = new BlockPos(x, y, z);
/* 311 */     ChunkAccess chunk = level.m_46865_(spawnPos);
/*     */     
/* 313 */     Random random = new Random();
/*     */     
/* 315 */     int randomMoveX = random.nextInt(16);
/* 316 */     int randomMoveZ = random.nextInt(16);
/*     */     
/* 318 */     BlockPos targetPos = new BlockPos((chunk.m_7697_()).f_45578_ * 16 + randomMoveX, level.m_151558_(), (chunk.m_7697_()).f_45579_ * 16 + randomMoveZ);
/*     */     
/* 320 */     boolean isBelow = false;
/* 321 */     while (targetPos.m_123342_() > level.m_141937_() && level.m_46859_(targetPos)) {
/*     */       
/* 323 */       targetPos = targetPos.m_7495_();
/* 324 */       isBelow = true;
/*     */     } 
/*     */     
/* 327 */     if (isBelow)
/*     */     {
/* 329 */       targetPos = targetPos.m_7494_();
/*     */     }
/*     */     
/* 332 */     if (targetPos.m_123342_() < level.m_141937_() - 1) targetPos = targetPos.m_7494_();
/*     */     
/* 334 */     level.m_7731_(targetPos, Blocks.f_50087_.m_49966_(), 0);
/*     */     
/* 336 */     System.err.print("" + targetPos + "\n");
/*     */     
/* 338 */     ChestBlockEntity entity = (ChestBlockEntity)level.m_7702_(targetPos);
/*     */     
/* 340 */     entity.m_6836_(0, new ItemStack((ItemLike)Items.f_42415_, 5));
/*     */     
/* 342 */     entity.getPersistentData().m_128379_("saisen_bako", true);
/*     */     
/* 344 */     entity.m_58638_((Component)Component.m_237115_("oni_miko.saisen_bako"));
/*     */     
/* 346 */     entity.m_6596_();
/*     */   }
/*     */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\ModEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */