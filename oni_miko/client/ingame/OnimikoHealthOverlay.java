/*    */ package oni_miko.client.ingame;
/*    */ 
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.gui.GuiGraphics;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.network.chat.FormattedText;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.client.event.CustomizeGuiOverlayEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ @EventBusSubscriber({Dist.CLIENT})
/*    */ public class OnimikoHealthOverlay
/*    */ {
/* 16 */   public static final Minecraft mc = Minecraft.m_91087_();
/*    */   
/* 18 */   private static final ResourceLocation GUI_BARS_LOCATION1 = new ResourceLocation("oni_miko", "textures/gui/bar1.png");
/* 19 */   private static final ResourceLocation GUI_BARS_LOCATION2 = new ResourceLocation("oni_miko", "textures/gui/bar2.png");
/*    */   
/*    */   private static final int BAR1_WIDTH = 256;
/*    */   
/*    */   private static final int BAR1_HEIGHT = 46;
/*    */   private static final int BAR2_WIDTH = 212;
/*    */   private static final int BAR2_HEIGHT = 12;
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void onBossProgressRenderGuiEvent(CustomizeGuiOverlayEvent.BossEventProgress event) {
/* 29 */     GuiGraphics guiGraphics = event.getGuiGraphics();
/*    */     
/* 31 */     if (!event.getBossEvent().m_18861_().equals(Component.m_237115_("entity.onimiko.name")))
/*    */       return; 
/* 33 */     drawBar(guiGraphics, guiGraphics.m_280182_() / 2 - 128, event.getY(), (int)(212.0F * event.getBossEvent().m_142717_()));
/*    */     
/* 35 */     Component component = event.getBossEvent().m_18861_();
/* 36 */     int l = mc.f_91062_.m_92852_((FormattedText)component);
/* 37 */     int i1 = guiGraphics.m_280182_() / 2 - l / 2;
/* 38 */     int j1 = event.getY() - 9;
/* 39 */     guiGraphics.m_280430_(mc.f_91062_, component, i1, j1, 16711680);
/*    */     
/* 41 */     event.setIncrement(46);
/* 42 */     event.setCanceled(true);
/*    */   }
/*    */ 
/*    */   
/*    */   private static void drawBar(GuiGraphics graphics, int x, int y, int i) {
/* 47 */     graphics.m_280218_(GUI_BARS_LOCATION2, x + 22, y + 18, 0, 0, i, 12);
/* 48 */     graphics.m_280218_(GUI_BARS_LOCATION1, x, y, 0, 0, 256, 46);
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\client\ingame\OnimikoHealthOverlay.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */