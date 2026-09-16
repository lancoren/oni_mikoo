package oni_miko.message;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;

public interface IFMessage {
  void fromBytes(FriendlyByteBuf paramFriendlyByteBuf);
  
  void toBytes(FriendlyByteBuf paramFriendlyByteBuf);
  
  void run(NetworkEvent.Context paramContext);
}


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\message\IFMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */