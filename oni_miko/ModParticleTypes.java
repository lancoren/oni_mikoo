/*    */ package oni_miko;
/*    */ 
/*    */ import net.minecraft.core.particles.ParticleType;
/*    */ import net.minecraft.core.particles.SimpleParticleType;
/*    */ import net.minecraftforge.registries.DeferredRegister;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ import net.minecraftforge.registries.RegistryObject;
/*    */ 
/*    */ public class ModParticleTypes
/*    */ {
/* 11 */   public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, "oni_miko");
/* 12 */   public static final RegistryObject<SimpleParticleType> P_1 = REGISTRY.register("p_1", () -> new SimpleParticleType(false));
/* 13 */   public static final RegistryObject<SimpleParticleType> P_2 = REGISTRY.register("p_2", () -> new SimpleParticleType(false));
/* 14 */   public static final RegistryObject<SimpleParticleType> P_3 = REGISTRY.register("p_3", () -> new SimpleParticleType(false));
/* 15 */   public static final RegistryObject<SimpleParticleType> P_4 = REGISTRY.register("p_4", () -> new SimpleParticleType(false));
/* 16 */   public static final RegistryObject<SimpleParticleType> P_5 = REGISTRY.register("p_5", () -> new SimpleParticleType(false));
/* 17 */   public static final RegistryObject<SimpleParticleType> P_6 = REGISTRY.register("p_6", () -> new SimpleParticleType(false));
/*    */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\ModParticleTypes.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */