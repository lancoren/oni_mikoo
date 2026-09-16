/*    */ package oni_miko;
/*    */ 
/*    */ import java.util.function.BiFunction;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobCategory;
/*    */ import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
/*    */ import net.minecraftforge.registries.DeferredRegister;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ import net.minecraftforge.registries.RegistryObject;
/*    */ import oni_miko.entity.OnimikoEntity;
/*    */ import oni_miko.entity.T1Entity;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*    */ public class ModEntities
/*    */ {
/* 23 */   public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, "oni_miko");
/* 24 */   public static final RegistryObject<EntityType<OnimikoEntity>> ONIMIKO = register("onimiko", 
/* 25 */       EntityType.Builder.m_20704_(OnimikoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OnimikoEntity::new)
/*    */       
/* 27 */       .m_20699_(0.6F, 1.8F));
/* 28 */   public static final RegistryObject<EntityType<T1Entity>> T_1 = register("t_1", 
/* 29 */       EntityType.Builder.m_20704_(T1Entity::new, MobCategory.MISC).setCustomClientFactory(T1Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5F, 0.5F));
/*    */   
/*    */   private static <T extends net.minecraft.world.entity.Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
/* 32 */     return REGISTRY.register(registryname, () -> entityTypeBuilder.m_20712_(registryname));
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void init(FMLCommonSetupEvent event) {
/* 37 */     event.enqueueWork(() -> OnimikoEntity.init());
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void registerAttributes(EntityAttributeCreationEvent event) {
/* 44 */     event.put((EntityType)ONIMIKO.get(), OnimikoEntity.createAttributes().m_22265_());
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\ModEntities.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */