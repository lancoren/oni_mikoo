/*    */ package oni_miko;
/*    */ 
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ import net.minecraftforge.eventbus.api.IEventBus;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
/*    */ import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
/*    */ import oni_miko.message.MessageLoader;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mod("oni_miko")
/*    */ public class OniMiko
/*    */ {
/*    */   public static final String modid = "oni_miko";
/*    */   
/*    */   public OniMiko() {
/* 18 */     FMLJavaModLoadingContext context = FMLJavaModLoadingContext.get();
/* 19 */     IEventBus bus = context.getModEventBus();
/*    */     
/* 21 */     bus.addListener(this::commonSetup);
/*    */     
/* 23 */     MinecraftForge.EVENT_BUS.register(this);
/*    */     
/* 25 */     MessageLoader.getLoader().load();
/*    */     
/* 27 */     ModSounds.REGISTRY.register(bus);
/* 28 */     ModParticleTypes.REGISTRY.register(bus);
/* 29 */     ModEntities.REGISTRY.register(bus);
/* 30 */     ModItems.REGISTRY.register(bus);
/*    */   }
/*    */   
/*    */   private void commonSetup(FMLCommonSetupEvent event) {}
/*    */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\OniMiko.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */