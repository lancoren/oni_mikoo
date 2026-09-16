/*    */ package oni_miko.client.renderer;
/*    */ 
/*    */ import com.mojang.blaze3d.vertex.PoseStack;
/*    */ import com.mojang.math.Axis;
/*    */ import net.minecraft.client.renderer.MultiBufferSource;
/*    */ import net.minecraft.client.renderer.entity.EntityRenderer;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.texture.OverlayTexture;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import oni_miko.client.model.T1Model;
/*    */ import oni_miko.entity.T1Entity;
/*    */ 
/*    */ public class T1Renderer
/*    */   extends EntityRenderer<T1Entity> {
/*    */   public final T1Model model;
/*    */   private final float scale;
/*    */   private final boolean fullBright;
/*    */   
/*    */   public T1Renderer(EntityRendererProvider.Context p_174416_, float p_174417_, boolean p_174418_) {
/* 22 */     super(p_174416_);
/* 23 */     this.model = new T1Model(p_174416_.m_174023_(T1Model.LAYER_LOCATION));
/* 24 */     this.scale = p_174417_;
/* 25 */     this.fullBright = p_174418_;
/*    */   }
/*    */   
/*    */   public T1Renderer(EntityRendererProvider.Context p_174414_) {
/* 29 */     this(p_174414_, 1.0F, false);
/*    */   }
/*    */   
/*    */   protected int getBlockLightLevel(T1Entity p_116092_, BlockPos p_116093_) {
/* 33 */     return this.fullBright ? 15 : super.m_6086_((Entity)p_116092_, p_116093_);
/*    */   }
/*    */   
/*    */   public void render(T1Entity p_116085_, float p_116086_, float p_116087_, PoseStack p_116088_, MultiBufferSource p_116089_, int p_116090_) {
/* 37 */     if (((Boolean)p_116085_.m_20088_().m_135370_(T1Entity.god)).booleanValue())
/* 38 */       return;  if (p_116085_.f_19797_ >= 2 || this.f_114476_.f_114358_.m_90592_().m_20280_((Entity)p_116085_) >= 12.25D) {
/* 39 */       p_116088_.m_85836_();
/* 40 */       p_116088_.m_85841_(this.scale, this.scale, this.scale);
/* 41 */       p_116088_.m_252781_(Axis.f_252529_.m_252977_(p_116085_.m_146909_()));
/* 42 */       p_116088_.m_252781_(Axis.f_252436_.m_252977_(p_116085_.m_146908_()));
/* 43 */       this.model.m_7695_(p_116088_, p_116089_.m_6299_(this.model.m_103119_(getTextureLocation(p_116085_))), p_116090_, OverlayTexture.f_118083_, 1.0F, 1.0F, 1.0F, 1.0F);
/* 44 */       p_116088_.m_85849_();
/* 45 */       super.m_7392_((Entity)p_116085_, p_116086_, p_116087_, p_116088_, p_116089_, p_116090_);
/*    */     } 
/*    */   }
/*    */   
/*    */   public ResourceLocation getTextureLocation(T1Entity p_116083_) {
/* 50 */     return new ResourceLocation("oni_miko:textures/entities/t1.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\client\renderer\T1Renderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */