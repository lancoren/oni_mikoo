/*    */ package oni_miko.client.model;
/*    */ 
/*    */ import com.mojang.blaze3d.vertex.PoseStack;
/*    */ import com.mojang.blaze3d.vertex.VertexConsumer;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.model.geom.ModelLayerLocation;
/*    */ import net.minecraft.client.model.geom.ModelPart;
/*    */ import net.minecraft.client.model.geom.PartPose;
/*    */ import net.minecraft.client.model.geom.builders.CubeDeformation;
/*    */ import net.minecraft.client.model.geom.builders.CubeListBuilder;
/*    */ import net.minecraft.client.model.geom.builders.LayerDefinition;
/*    */ import net.minecraft.client.model.geom.builders.MeshDefinition;
/*    */ import net.minecraft.client.model.geom.builders.PartDefinition;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import oni_miko.entity.T1Entity;
/*    */ 
/*    */ 
/*    */ public class T1Model
/*    */   extends EntityModel<T1Entity>
/*    */ {
/* 22 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("oni_miko", "model"), "main");
/*    */   private final ModelPart bone;
/*    */   
/*    */   public T1Model(ModelPart root) {
/* 26 */     this.bone = root.m_171324_("bone");
/*    */   }
/*    */   
/*    */   public static LayerDefinition createBodyLayer() {
/* 30 */     MeshDefinition meshdefinition = new MeshDefinition();
/* 31 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*    */     
/* 33 */     PartDefinition bone = partdefinition.m_171599_("bone", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.0F, 0.0F, -2.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 24.0F, 0.0F));
/*    */     
/* 35 */     return LayerDefinition.m_171565_(meshdefinition, 32, 32);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setupAnim(T1Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}
/*    */ 
/*    */ 
/*    */   
/*    */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 45 */     this.bone.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\client\model\T1Model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */