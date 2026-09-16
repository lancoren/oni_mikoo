/*    */ package oni_miko.client;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.client.event.EntityRenderersEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ import oni_miko.ModEntities;
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/*    */ public class ModEntityRenderers {
/*    */   @SubscribeEvent
/*    */   public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
/* 15 */     event.registerEntityRenderer((EntityType)ModEntities.ONIMIKO.get(), oni_miko.client.renderer.OnimikoRenderer::new);
/* 16 */     event.registerEntityRenderer((EntityType)ModEntities.T_1.get(), oni_miko.client.renderer.T1Renderer::new);
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\client\ModEntityRenderers.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */