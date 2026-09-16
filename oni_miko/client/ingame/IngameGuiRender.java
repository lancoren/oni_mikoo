/*     */ package oni_miko.client.ingame;
/*     */ 
/*     */ import com.mojang.blaze3d.platform.GlStateManager;
/*     */ import com.mojang.blaze3d.platform.NativeImage;
/*     */ import com.mojang.blaze3d.platform.Window;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.awt.Color;
/*     */ import java.util.Random;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.gui.GuiGraphics;
/*     */ import net.minecraft.client.renderer.GameRenderer;
/*     */ import net.minecraft.client.renderer.texture.AbstractTexture;
/*     */ import net.minecraft.client.renderer.texture.DynamicTexture;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.client.event.RenderGuiEvent;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*     */ 
/*     */ 
/*     */ 
/*     */ @EventBusSubscriber({Dist.CLIENT})
/*     */ public class IngameGuiRender
/*     */ {
/*  25 */   public static final Minecraft mc = Minecraft.m_91087_();
/*     */   
/*  27 */   public static final Random random = new Random();
/*     */   
/*     */   public static boolean renderErrorScreen = false;
/*     */   private static int index;
/*     */   
/*     */   public static ResourceLocation getScreen(int w, int h) {
/*  33 */     NativeImage image = new NativeImage(w, h, false);
/*     */     
/*  35 */     for (int x = 0; x < w; x++) {
/*  36 */       for (int y = 0; y < h; y++) {
/*  37 */         image.m_84988_(x, y, random.nextInt());
/*     */       }
/*     */     } 
/*     */     
/*  41 */     DynamicTexture texture = new DynamicTexture(image);
/*  42 */     ResourceLocation screen = new ResourceLocation("oni_miko", "dynamic_texture" + index++);
/*  43 */     Minecraft.m_91087_().m_91097_().m_118495_(screen, (AbstractTexture)texture);
/*  44 */     image.close();
/*  45 */     return screen;
/*     */   }
/*     */   
/*     */   public static boolean renderRedScreen = false;
/*  49 */   public static int redScreenTime = 0;
/*     */ 
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onRenderGuiEvent(RenderGuiEvent.Post event) {
/*  54 */     Window window = event.getWindow();
/*  55 */     GuiGraphics guiGraphics = event.getGuiGraphics();
/*     */     
/*  57 */     if (renderRedScreen) {
/*     */       
/*  59 */       RenderSystem.disableDepthTest();
/*  60 */       RenderSystem.depthMask(false);
/*  61 */       RenderSystem.enableBlend();
/*  62 */       RenderSystem.setShader(GameRenderer::m_172817_);
/*  63 */       RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
/*  64 */       RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
/*     */       
/*  66 */       guiGraphics.m_280509_(0, 0, guiGraphics.m_280182_(), guiGraphics.m_280206_(), (new Color(255, 0, 0, 100)).getRGB());
/*     */       
/*  68 */       RenderSystem.depthMask(true);
/*  69 */       RenderSystem.defaultBlendFunc();
/*  70 */       RenderSystem.enableDepthTest();
/*  71 */       RenderSystem.disableBlend();
/*  72 */       RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
/*     */       
/*  74 */       redScreenTime++;
/*  75 */       if (redScreenTime > 1200) {
/*     */         
/*  77 */         redScreenTime = 0;
/*  78 */         renderRedScreen = false;
/*     */       } 
/*     */     } 
/*     */     
/*  82 */     if (renderErrorScreen) {
/*     */       
/*  84 */       RenderSystem.disableDepthTest();
/*  85 */       RenderSystem.depthMask(false);
/*  86 */       RenderSystem.enableBlend();
/*  87 */       RenderSystem.setShader(GameRenderer::m_172817_);
/*  88 */       RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
/*  89 */       RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
/*     */       
/*  91 */       int width = window.m_85443_();
/*  92 */       int height = window.m_85444_();
/*     */       
/*  94 */       guiGraphics.m_280163_(getScreen(width, height), 0, 0, 0.0F, 0.0F, width, height, width, height);
/*     */       
/*  96 */       RenderSystem.depthMask(true);
/*  97 */       RenderSystem.defaultBlendFunc();
/*  98 */       RenderSystem.enableDepthTest();
/*  99 */       RenderSystem.disableBlend();
/* 100 */       RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\client\ingame\IngameGuiRender.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */