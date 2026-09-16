/*    */ package oni_miko.message;
/*    */ 
/*    */ import java.util.function.BiConsumer;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Supplier;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraftforge.network.NetworkEvent;
/*    */ import net.minecraftforge.network.NetworkRegistry;
/*    */ import net.minecraftforge.network.simple.SimpleChannel;
/*    */ 
/*    */ public class MessageLoader
/*    */ {
/*    */   private static MessageLoader loader;
/*    */   public final SimpleChannel instance;
/*    */   private static final String PROTOCOL_VERSION = "1";
/*    */   
/*    */   public static MessageLoader getLoader() {
/* 19 */     if (loader == null) loader = new MessageLoader("oni_miko"); 
/* 20 */     return loader;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 26 */   public int id = 0;
/*    */   
/*    */   private MessageLoader(String modid) {
/* 29 */     this.instance = NetworkRegistry.newSimpleChannel(new ResourceLocation(modid, "main"), () -> "1", "1"::equals, "1"::equals);
/*    */   }
/*    */   
/*    */   public void load() {
/* 33 */     registerMessage(MessageCreater.class, (creater, buf) -> MessageCreater.toBuf(creater, buf), buf -> MessageCreater.fromBuf(buf), (creater, ctx) -> MessageCreater.run(creater, ctx));
/*    */   }
/*    */   
/*    */   private <MSG> void registerMessage(Class<MSG> messageType, BiConsumer<MSG, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, MSG> decoder, BiConsumer<MSG, Supplier<NetworkEvent.Context>> messageConsumer) {
/* 37 */     this.instance.registerMessage(this.id++, messageType, encoder, decoder, messageConsumer);
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\message\MessageLoader.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */