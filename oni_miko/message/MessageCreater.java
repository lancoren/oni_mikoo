/*    */ package oni_miko.message;
/*    */ 
/*    */ import java.util.function.Supplier;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraftforge.network.NetworkEvent;
/*    */ 
/*    */ 
/*    */ public class MessageCreater
/*    */ {
/*    */   final IFMessage message;
/*    */   
/*    */   public MessageCreater(IFMessage message) {
/* 13 */     this.message = message;
/*    */   }
/*    */   
/*    */   public static void toBuf(MessageCreater creater, FriendlyByteBuf buf) {
/* 17 */     String path = creater.message.getClass().getName();
/* 18 */     byte[] bytes = path.getBytes();
/* 19 */     buf.writeInt(bytes.length);
/* 20 */     for (int i = 0; i < bytes.length; i++) {
/* 21 */       byte b = bytes[i];
/* 22 */       buf.writeByte(b);
/*    */     } 
/* 24 */     creater.message.toBytes(buf);
/*    */   }
/*    */   
/*    */   public static MessageCreater fromBuf(FriendlyByteBuf buf) {
/*    */     IFMessage message;
/* 29 */     byte[] bytes = new byte[buf.readInt()];
/* 30 */     for (int i = 0; i < bytes.length; i++) {
/* 31 */       bytes[i] = buf.readByte();
/*    */     }
/* 33 */     String path = new String(bytes);
/*    */     
/*    */     try {
/* 36 */       message = Class.forName(path).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
/* 37 */     } catch (Throwable e) {
/* 38 */       throw new RuntimeException(e);
/*    */     } 
/* 40 */     message.fromBytes(buf);
/*    */     
/* 42 */     return new MessageCreater(message);
/*    */   }
/*    */   
/*    */   public static void run(MessageCreater creater, Supplier<NetworkEvent.Context> ctx) {
/* 46 */     NetworkEvent.Context ct = ctx.get();
/* 47 */     ct.enqueueWork(() -> creater.message.run(ct));
/*    */ 
/*    */ 
/*    */     
/* 51 */     ct.setPacketHandled(true);
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\message\MessageCreater.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */