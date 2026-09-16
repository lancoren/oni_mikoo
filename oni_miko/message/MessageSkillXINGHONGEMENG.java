/*    */ package oni_miko.message;
/*    */ 
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraftforge.network.NetworkEvent;
/*    */ import oni_miko.client.ingame.IngameGuiRender;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MessageSkillXINGHONGEMENG
/*    */   implements IFMessage
/*    */ {
/*    */   public void fromBytes(FriendlyByteBuf buf) {}
/*    */   
/*    */   public void toBytes(FriendlyByteBuf buf) {}
/*    */   
/*    */   public void run(NetworkEvent.Context ctx) {
/* 21 */     IngameGuiRender.renderRedScreen = true;
/* 22 */     IngameGuiRender.redScreenTime = 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\message\MessageSkillXINGHONGEMENG.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */