/*    */ package oni_miko.client.renderer;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import oni_miko.client.model.Model_oni_miko_kishintai;
/*    */ import oni_miko.entity.OnimikoEntity;
/*    */ 
/*    */ public class OnimikoRenderer2 extends MobRenderer<OnimikoEntity, Model_oni_miko_kishintai<OnimikoEntity>> {
/*    */   public OnimikoRenderer2(EntityRendererProvider.Context context) {
/* 12 */     super(context, (EntityModel)new Model_oni_miko_kishintai(context.m_174023_(Model_oni_miko_kishintai.LAYER_LOCATION)), 0.5F);
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(OnimikoEntity entity) {
/* 17 */     return new ResourceLocation("oni_miko:textures/entities/lmx.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\client\renderer\OnimikoRenderer2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */