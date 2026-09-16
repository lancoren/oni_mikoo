/*    */ package oni_miko.client;
/*    */ import net.minecraft.client.model.geom.builders.LayerDefinition;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.client.event.EntityRenderersEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import oni_miko.client.model.Model_oni_miko;
/*    */ import oni_miko.client.model.Model_oni_miko_kishintai;
/*    */ import oni_miko.client.model.T1Model;
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/*    */ public class ModModels {
/*    */   @SubscribeEvent
/*    */   public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
/* 15 */     event.registerLayerDefinition(Model_oni_miko_kishintai.LAYER_LOCATION, () -> Model_oni_miko_kishintai.createbodyLayer());
/* 16 */     event.registerLayerDefinition(Model_oni_miko.LAYER_LOCATION, () -> Model_oni_miko.createbodyLayer());
/* 17 */     event.registerLayerDefinition(T1Model.LAYER_LOCATION, () -> T1Model.createBodyLayer());
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\client\ModModels.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */