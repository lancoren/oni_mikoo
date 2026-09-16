/*    */ package oni_miko.client.particle;
/*    */ 
/*    */ import net.minecraft.client.multiplayer.ClientLevel;
/*    */ import net.minecraft.client.particle.Particle;
/*    */ import net.minecraft.client.particle.ParticleProvider;
/*    */ import net.minecraft.client.particle.ParticleRenderType;
/*    */ import net.minecraft.client.particle.SpriteSet;
/*    */ import net.minecraft.client.particle.TextureSheetParticle;
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.core.particles.SimpleParticleType;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.api.distmarker.OnlyIn;
/*    */ 
/*    */ @OnlyIn(Dist.CLIENT)
/*    */ public class P3Particle
/*    */   extends TextureSheetParticle {
/*    */   public static P3ParticleProvider provider(SpriteSet spriteSet) {
/* 18 */     return new P3ParticleProvider(spriteSet);
/*    */   }
/*    */   private final SpriteSet spriteSet;
/*    */   
/*    */   public static class P3ParticleProvider implements ParticleProvider<SimpleParticleType> { private final SpriteSet spriteSet;
/*    */     
/*    */     public P3ParticleProvider(SpriteSet spriteSet) {
/* 25 */       this.spriteSet = spriteSet;
/*    */     }
/*    */     
/*    */     public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
/* 29 */       return (Particle)new P3Particle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
/*    */     } }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected P3Particle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
/* 36 */     super(world, x, y, z);
/* 37 */     this.spriteSet = spriteSet;
/* 38 */     m_107250_(0.8F, 0.8F);
/* 39 */     this.f_107225_ = 18;
/* 40 */     this.f_107226_ = 0.0F;
/* 41 */     this.f_107219_ = true;
/* 42 */     this.f_107215_ = vx * 1.0D;
/* 43 */     this.f_107216_ = vy * 1.0D;
/* 44 */     this.f_107217_ = vz * 1.0D;
/* 45 */     m_108339_(spriteSet);
/*    */     
/* 47 */     m_6569_(15.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public ParticleRenderType m_7556_() {
/* 52 */     return ParticleRenderType.f_107430_;
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_5989_() {
/* 57 */     super.m_5989_();
/* 58 */     if (!this.f_107220_)
/* 59 */       m_108337_(this.spriteSet.m_5819_(this.f_107224_ / 2 % 9 + 1, 9)); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\client\particle\P3Particle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */