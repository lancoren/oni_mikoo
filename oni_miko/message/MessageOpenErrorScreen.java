/*    */ package oni_miko.message;
/*    */ 
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.network.NetworkEvent;
/*    */ import oni_miko.ModSounds;
/*    */ import oni_miko.client.ingame.IngameGuiRender;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MessageOpenErrorScreen
/*    */   implements IFMessage
/*    */ {
/*    */   public void fromBytes(FriendlyByteBuf buf) {}
/*    */   
/*    */   public void toBytes(FriendlyByteBuf buf) {}
/*    */   
/*    */   public void run(NetworkEvent.Context ctx) {
/* 23 */     Minecraft mc = Minecraft.m_91087_();
/* 24 */     mc.m_6367_(() -> {
/*    */           IngameGuiRender.renderErrorScreen = true;
/*    */           ModSounds.playSound((LevelAccessor)mc.f_91073_, mc.f_91074_.m_20185_(), mc.f_91074_.m_20186_(), mc.f_91074_.m_20189_(), (SoundEvent)ModSounds.XUEHUAPINGSHENG.get());
/*    */           (new Thread(())).start();
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\message\MessageOpenErrorScreen.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */