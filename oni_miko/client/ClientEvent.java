/*     */ package oni_miko.client;
/*     */ 
/*     */ import java.util.Random;
/*     */ import net.minecraft.client.KeyMapping;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.particle.Particle;
/*     */ import net.minecraft.client.player.LocalPlayer;
/*     */ import net.minecraft.core.particles.ParticleOptions;
/*     */ import net.minecraft.core.particles.ParticleTypes;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.event.TickEvent;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*     */ import oni_miko.ModParticleTypes;
/*     */ import tzdxxy.math.FastMath;
/*     */ 
/*     */ 
/*     */ @EventBusSubscriber({Dist.CLIENT})
/*     */ public class ClientEvent
/*     */ {
/*  22 */   public static final Minecraft mc = Minecraft.m_91087_();
/*     */   
/*     */   public static boolean init = false;
/*     */   
/*     */   public static boolean genRedParticle = false;
/*  27 */   public static int genTicks = 0;
/*     */   
/*  29 */   public static Particle cantMoveParticle = null;
/*     */   public static boolean cantMove = false;
/*  31 */   public static int cantMoveTicks = 0;
/*     */   
/*  33 */   public static double centerX = 0.0D;
/*  34 */   public static double centerY = 0.0D;
/*  35 */   public static double centerZ = 0.0D;
/*     */ 
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onClientTick(TickEvent.ClientTickEvent event) {
/*  40 */     if (event.phase == TickEvent.Phase.END)
/*     */       return; 
/*  42 */     if (cantMove) {
/*     */       
/*  44 */       if (cantMoveTicks > 60 || mc.f_91073_ == null) { cantMove = false; }
/*     */       else
/*     */       
/*  47 */       { LocalPlayer localPlayer = mc.f_91074_;
/*  48 */         float r = (cantMoveTicks * 6) * 0.017453292F;
/*  49 */         double x = Mth.m_14089_(r) * Math.sqrt(localPlayer.m_20191_().m_82362_() * localPlayer.m_20191_().m_82362_() + localPlayer.m_20191_().m_82376_() * localPlayer.m_20191_().m_82376_());
/*  50 */         double z = Mth.m_14031_(r) * Math.sqrt(localPlayer.m_20191_().m_82362_() * localPlayer.m_20191_().m_82362_() + localPlayer.m_20191_().m_82376_() * localPlayer.m_20191_().m_82376_());
/*     */         
/*  52 */         if (cantMoveParticle == null)
/*     */         {
/*  54 */           cantMoveParticle = mc.f_91061_.m_107370_((ParticleOptions)ModParticleTypes.P_1.get(), localPlayer.m_20185_() + x, localPlayer.m_20188_(), localPlayer.m_20189_() + z, 0.0D, 0.0D, 0.0D);
/*     */         }
/*     */         
/*  57 */         if (cantMoveParticle != null) cantMoveParticle.m_107264_(localPlayer.m_20185_() + x, localPlayer.m_20188_(), localPlayer.m_20189_() + z);
/*     */         
/*  59 */         mc.f_91067_.m_91602_();
/*  60 */         KeyMapping.m_90847_(); }
/*     */       
/*  62 */       cantMoveTicks++;
/*     */     } else {
/*     */       
/*  65 */       cantMoveTicks = 0;
/*  66 */       cantMoveParticle = null;
/*     */     } 
/*     */     
/*  69 */     if (genRedParticle) {
/*     */ 
/*     */       
/*  72 */       if (mc.f_91073_ == null) { genRedParticle = false; }
/*     */       
/*     */       else
/*     */       
/*  76 */       { Random random = new Random();
/*     */         
/*  78 */         if (genTicks > 80) {
/*     */           
/*  80 */           Particle particle = mc.f_91061_.m_107370_((ParticleOptions)ModParticleTypes.P_4.get(), centerX, centerY, centerZ, 0.0D, 0.0D, 0.0D);
/*  81 */           if (particle != null) {
/*  82 */             particle.m_107253_(1.0F, 0.0F, 0.0F);
/*  83 */             particle.m_6569_(15.0F);
/*     */           } 
/*     */           
/*  86 */           genRedParticle = false;
/*     */         } else {
/*  88 */           for (float f = 1.0F; f < 41.0F; f++) {
/*     */ 
/*     */             
/*  91 */             int r = random.nextInt(360);
/*     */             
/*  93 */             float x = FastMath.cos(r) * (f * 5.0F + random.nextInt(5));
/*  94 */             float z = FastMath.sin(r) * (f * 5.0F + random.nextInt(5));
/*     */             
/*  96 */             if (genTicks > 40) {
/*     */               
/*  98 */               double xMove = ((random.nextInt(2) - 1) / 3.0F);
/*  99 */               double yMove = 0.7D + 0.3D * random.nextGaussian();
/* 100 */               double zMove = ((random.nextInt(2) - 1) / 3.0F);
/* 101 */               Particle particle = mc.f_91061_.m_107370_((ParticleOptions)ParticleTypes.f_123810_, centerX + x + xMove * 8.0D, centerY + yMove * 8.0D, centerZ + z + zMove * 8.0D, (-x / 5.0F) - xMove, -yMove, (-z / 5.0F) - zMove);
/* 102 */               if (particle != null) {
/* 103 */                 particle.m_107253_(1.0F, 0.0F, 0.0F);
/* 104 */                 particle.m_6569_(3.0F);
/*     */               }
/*     */             
/*     */             } else {
/*     */               
/* 109 */               Particle particle = mc.f_91061_.m_107370_((ParticleOptions)ParticleTypes.f_123810_, centerX + x, centerY, centerZ + z, ((random.nextInt(2) - 1) / 3.0F), 0.7D + 0.3D * random.nextGaussian(), ((random.nextInt(2) - 1) / 3.0F));
/* 110 */               if (particle != null) {
/* 111 */                 particle.m_107253_(1.0F, 0.0F, 0.0F);
/* 112 */                 particle.m_107257_(40 - genTicks);
/* 113 */                 particle.m_6569_(3.0F);
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/* 118 */         genTicks++; }
/*     */ 
/*     */     
/*     */     } else {
/*     */       
/* 123 */       genTicks = 0;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\client\ClientEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */