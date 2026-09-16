/*    */ package oni_miko.client;
/*    */ import net.minecraft.core.particles.ParticleType;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import oni_miko.ModParticleTypes;
/*    */ import oni_miko.client.particle.P1Particle;
/*    */ import oni_miko.client.particle.P2Particle;
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/*    */ public class ModParticles {
/*    */   @SubscribeEvent
/*    */   public static void registerParticles(RegisterParticleProvidersEvent event) {
/* 14 */     event.registerSpriteSet((ParticleType)ModParticleTypes.P_1.get(), P1Particle::provider);
/* 15 */     event.registerSpriteSet((ParticleType)ModParticleTypes.P_2.get(), P2Particle::provider);
/* 16 */     event.registerSpriteSet((ParticleType)ModParticleTypes.P_3.get(), P3Particle::provider);
/* 17 */     event.registerSpriteSet((ParticleType)ModParticleTypes.P_4.get(), P4Particle::provider);
/* 18 */     event.registerSpriteSet((ParticleType)ModParticleTypes.P_5.get(), P5Particle::provider);
/* 19 */     event.registerSpriteSet((ParticleType)ModParticleTypes.P_6.get(), P6Particle::provider);
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\client\ModParticles.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */