/*    */ package oni_miko.message;
/*    */ 
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraftforge.network.NetworkEvent;
/*    */ import oni_miko.client.ClientEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MessageStopMove
/*    */   implements IFMessage
/*    */ {
/*    */   public void fromBytes(FriendlyByteBuf buf) {}
/*    */   
/*    */   public void toBytes(FriendlyByteBuf buf) {}
/*    */   
/*    */   public void run(NetworkEvent.Context ctx) {
/* 23 */     ClientEvent.cantMove = true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\message\MessageStopMove.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */