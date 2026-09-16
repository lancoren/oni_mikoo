/*    */ package oni_miko.client.renderer;
/*    */ 
/*    */ import com.mojang.blaze3d.vertex.PoseStack;
/*    */ import java.util.Random;
/*    */ import net.minecraft.client.renderer.MultiBufferSource;
/*    */ import net.minecraft.client.renderer.entity.EntityRenderer;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import oni_miko.entity.OnimikoEntity;
/*    */ 
/*    */ public class OnimikoRenderer
/*    */   extends EntityRenderer<OnimikoEntity>
/*    */ {
/*    */   public final OnimikoRenderer1 onimikoRenderer1;
/*    */   public final OnimikoRenderer2 onimikoRenderer2;
/* 19 */   public final Random random = new Random();
/*    */   
/*    */   public OnimikoRenderer(EntityRendererProvider.Context p_174008_) {
/* 22 */     super(p_174008_);
/* 23 */     this.onimikoRenderer1 = new OnimikoRenderer1(p_174008_);
/* 24 */     this.onimikoRenderer2 = new OnimikoRenderer2(p_174008_);
/*    */   }
/*    */ 
/*    */   
/*    */   public void render(OnimikoEntity p_114485_, float p_114486_, float p_114487_, PoseStack p_114488_, MultiBufferSource p_114489_, int p_114490_) {
/*    */     MobRenderer renderer;
/* 30 */     if (p_114485_.m_21223_() > 600.0F) { renderer = this.onimikoRenderer1; }
/* 31 */     else { renderer = this.onimikoRenderer2; }
/*    */     
/* 33 */     p_114488_.m_85836_();
/*    */     
/* 35 */     p_114488_.m_85837_((this.random.nextInt(20) - 10) / 15.0D, 0.0D, (this.random.nextInt(20) - 10) / 15.0D);
/*    */     
/* 37 */     renderer.m_7392_((Mob)p_114485_, p_114486_, p_114487_, p_114488_, p_114489_, p_114490_);
/*    */     
/* 39 */     p_114488_.m_85849_();
/*    */     
/*    */     double r;
/* 42 */     if ((r = Math.sqrt((p_114485_.f_19790_ - p_114485_
/* 43 */         .m_20185_()) * (p_114485_.f_19790_ - p_114485_.m_20185_()) + (p_114485_.f_19791_ - p_114485_
/* 44 */         .m_20186_()) * (p_114485_.f_19791_ - p_114485_.m_20186_()) + (p_114485_.f_19792_ - p_114485_
/* 45 */         .m_20189_()) * (p_114485_.f_19792_ - p_114485_.m_20189_()))) > 0.4D) {
/*    */ 
/*    */ 
/*    */       
/* 49 */       double xm = (p_114485_.f_19790_ - p_114485_.m_20185_()) / r;
/* 50 */       double ym = (p_114485_.f_19791_ - p_114485_.m_20186_()) / r;
/* 51 */       double zm = (p_114485_.f_19792_ - p_114485_.m_20189_()) / r; double i;
/* 52 */       for (i = 0.0D; i < r; i += 0.5D) {
/*    */         
/* 54 */         p_114488_.m_85836_();
/*    */         
/* 56 */         p_114488_.m_85837_(xm * i, ym * i, zm * i);
/*    */         
/* 58 */         renderer.m_7392_((Mob)p_114485_, p_114486_, p_114487_, p_114488_, p_114489_, p_114490_);
/*    */         
/* 60 */         p_114488_.m_85849_();
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(OnimikoEntity p_114482_) {
/* 68 */     return (p_114482_.m_21223_() > 600.0F) ? this.onimikoRenderer1.getTextureLocation(p_114482_) : this.onimikoRenderer2.getTextureLocation(p_114482_);
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\client\renderer\OnimikoRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */