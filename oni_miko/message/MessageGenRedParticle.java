/*    */ package oni_miko.message;
/*    */ 
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraftforge.network.NetworkEvent;
/*    */ import oni_miko.client.ClientEvent;
/*    */ 
/*    */ public class MessageGenRedParticle
/*    */   implements IFMessage {
/*    */   public int x;
/*    */   public int y;
/*    */   public int z;
/*    */   
/*    */   public MessageGenRedParticle() {}
/*    */   
/*    */   public MessageGenRedParticle(int x, int y, int z) {
/* 16 */     this.x = x;
/* 17 */     this.y = y;
/* 18 */     this.z = z;
/*    */   }
/*    */ 
/*    */   
/*    */   public void fromBytes(FriendlyByteBuf buf) {
/* 23 */     this.x = buf.readInt();
/* 24 */     this.y = buf.readInt();
/* 25 */     this.z = buf.readInt();
/*    */   }
/*    */ 
/*    */   
/*    */   public void toBytes(FriendlyByteBuf buf) {
/* 30 */     buf.writeInt(this.x);
/* 31 */     buf.writeInt(this.y);
/* 32 */     buf.writeInt(this.z);
/*    */   }
/*    */ 
/*    */   
/*    */   public void run(NetworkEvent.Context ctx) {
/* 37 */     ClientEvent.centerX = this.x;
/* 38 */     ClientEvent.centerY = this.y;
/* 39 */     ClientEvent.centerZ = this.z;
/* 40 */     ClientEvent.genRedParticle = true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\message\MessageGenRedParticle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */