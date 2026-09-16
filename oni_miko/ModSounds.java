/*    */ package oni_miko;
/*    */ 
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.registries.DeferredRegister;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ import net.minecraftforge.registries.RegistryObject;
/*    */ 
/*    */ public class ModSounds {
/* 16 */   public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, "oni_miko");
/* 17 */   public static final RegistryObject<SoundEvent> DAIMIANJU = REGISTRY.register("daimianju", () -> SoundEvent.m_262824_(new ResourceLocation("oni_miko", "daimianju")));
/* 18 */   public static final RegistryObject<SoundEvent> GANGQINZHONGYIN = REGISTRY.register("gangqinzhongyin", () -> SoundEvent.m_262824_(new ResourceLocation("oni_miko", "gangqinzhongyin")));
/* 19 */   public static final RegistryObject<SoundEvent> HEIGUAN = REGISTRY.register("heiguan", () -> SoundEvent.m_262824_(new ResourceLocation("oni_miko", "heiguan")));
/* 20 */   public static final RegistryObject<SoundEvent> JINENGYINXIAO = REGISTRY.register("jinengyinxiao", () -> SoundEvent.m_262824_(new ResourceLocation("oni_miko", "jinengyinxiao")));
/* 21 */   public static final RegistryObject<SoundEvent> POSUI = REGISTRY.register("posui", () -> SoundEvent.m_262824_(new ResourceLocation("oni_miko", "posui")));
/* 22 */   public static final RegistryObject<SoundEvent> SHUNSHEN = REGISTRY.register("shunshen", () -> SoundEvent.m_262824_(new ResourceLocation("oni_miko", "shunshen")));
/* 23 */   public static final RegistryObject<SoundEvent> XIAOSHENG1 = REGISTRY.register("xiaosheng1", () -> SoundEvent.m_262824_(new ResourceLocation("oni_miko", "xiaosheng1")));
/* 24 */   public static final RegistryObject<SoundEvent> XIAOSHENG2 = REGISTRY.register("xiaosheng2", () -> SoundEvent.m_262824_(new ResourceLocation("oni_miko", "xiaosheng2")));
/* 25 */   public static final RegistryObject<SoundEvent> XIAOSHENG3 = REGISTRY.register("xiaosheng3", () -> SoundEvent.m_262824_(new ResourceLocation("oni_miko", "xiaosheng3")));
/* 26 */   public static final RegistryObject<SoundEvent> XINTIAO = REGISTRY.register("xintiao", () -> SoundEvent.m_262824_(new ResourceLocation("oni_miko", "xintiao")));
/* 27 */   public static final RegistryObject<SoundEvent> XUEHUAPINGSHENG = REGISTRY.register("xuehuapingsheng", () -> SoundEvent.m_262824_(new ResourceLocation("oni_miko", "xuehuapingsheng")));
/* 28 */   public static final RegistryObject<SoundEvent> SOUND1 = REGISTRY.register("sound1", () -> SoundEvent.m_262824_(new ResourceLocation("oni_miko", "sound1")));
/* 29 */   public static final RegistryObject<SoundEvent> ZAIKUAIXIE = REGISTRY.register("zaikuaixie", () -> SoundEvent.m_262824_(new ResourceLocation("oni_miko", "zaikuaixie")));
/*    */   
/*    */   public static void playSound(LevelAccessor world, double x, double y, double z, SoundEvent sound) {
/* 32 */     if (world instanceof Level) { Level _level = (Level)world;
/* 33 */       if (!_level.m_5776_()) {
/* 34 */         _level.m_5594_(null, BlockPos.m_274561_(x, y, z), sound, SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */       } else {
/* 36 */         _level.m_7785_(x, y, z, sound, SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */       }  }
/*    */   
/*    */   }
/*    */   
/*    */   public static void playSound(LevelAccessor world, SoundEvent sound) {
/* 42 */     if (world instanceof Level) { Level _level = (Level)world;
/* 43 */       if (!_level.m_5776_()) {
/* 44 */         _level.m_7654_().m_6846_().m_11314_().forEach(player -> playSound((LevelAccessor)player.m_9236_(), player.m_20185_(), player.m_20186_(), player.m_20189_(), sound));
/*    */       }
/*    */       else {
/*    */         
/* 48 */         Minecraft mc = Minecraft.m_91087_();
/* 49 */         mc.f_91073_.m_7785_(mc.f_91074_.m_20185_(), mc.f_91074_.m_20186_(), mc.f_91074_.m_20189_(), sound, SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\ModSounds.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */