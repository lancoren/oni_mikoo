/*    */ package oni_miko.message;
/*    */ 
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraftforge.network.NetworkEvent;
/*    */ import oni_miko.ModParticleTypes;
/*    */ 
/*    */ public class MessageAddParticle5 implements IFMessage {
/*    */   public double x;
/*    */   public double y;
/*    */   public double z;
/*    */   public double xm;
/*    */   public double ym;
/*    */   public double zm;
/*    */   
/*    */   public MessageAddParticle5() {}
/*    */   
/*    */   public MessageAddParticle5(double x, double y, double z, double xm, double ym, double zm) {
/* 20 */     this.x = x;
/* 21 */     this.y = y;
/* 22 */     this.z = z;
/*    */     
/* 24 */     this.xm = xm;
/* 25 */     this.ym = ym;
/* 26 */     this.zm = zm;
/*    */   }
/*    */ 
/*    */   
/*    */   public void fromBytes(FriendlyByteBuf buf) {
/* 31 */     this.x = buf.readDouble();
/* 32 */     this.y = buf.readDouble();
/* 33 */     this.z = buf.readDouble();
/*    */     
/* 35 */     this.xm = buf.readDouble();
/* 36 */     this.ym = buf.readDouble();
/* 37 */     this.zm = buf.readDouble();
/*    */   }
/*    */ 
/*    */   
/*    */   public void toBytes(FriendlyByteBuf buf) {
/* 42 */     buf.writeDouble(this.x);
/* 43 */     buf.writeDouble(this.y);
/* 44 */     buf.writeDouble(this.z);
/*    */     
/* 46 */     buf.writeDouble(this.xm);
/* 47 */     buf.writeDouble(this.ym);
/* 48 */     buf.writeDouble(this.zm);
/*    */   }
/*    */ 
/*    */   
/*    */   public void run(NetworkEvent.Context ctx) {
/* 53 */     Minecraft mc = Minecraft.m_91087_();
/* 54 */     if (mc.f_91073_ != null) mc.f_91061_.m_107370_((ParticleOptions)ModParticleTypes.P_5.get(), this.x, this.y, this.z, this.xm, this.ym, this.zm); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\message\MessageAddParticle5.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */