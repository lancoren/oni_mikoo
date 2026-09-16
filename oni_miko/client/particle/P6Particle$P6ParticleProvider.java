/*    */ package oni_miko.client.particle;
/*    */ 
/*    */ import net.minecraft.client.multiplayer.ClientLevel;
/*    */ import net.minecraft.client.particle.Particle;
/*    */ import net.minecraft.client.particle.ParticleProvider;
/*    */ import net.minecraft.client.particle.SpriteSet;
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.core.particles.SimpleParticleType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class P6ParticleProvider
/*    */   implements ParticleProvider<SimpleParticleType>
/*    */ {
/*    */   private final SpriteSet spriteSet;
/*    */   
/*    */   public P6ParticleProvider(SpriteSet spriteSet) {
/* 25 */     this.spriteSet = spriteSet;
/*    */   }
/*    */   
/*    */   public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
/* 29 */     return (Particle)new P6Particle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\client\particle\P6Particle$P6ParticleProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */