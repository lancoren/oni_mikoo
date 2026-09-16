/*    */ package oni_miko;
/*    */ 
/*    */ import java.util.function.Supplier;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraftforge.common.ForgeSpawnEggItem;
/*    */ import net.minecraftforge.registries.DeferredRegister;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ import net.minecraftforge.registries.RegistryObject;
/*    */ 
/*    */ public class ModItems {
/* 11 */   public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, "oni_miko");
/* 12 */   public static final RegistryObject<Item> ONIMIKO_SPAWN_EGG = REGISTRY.register("onimiko_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)ModEntities.ONIMIKO, -1, -1, new Item.Properties()));
/*    */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\ModItems.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */