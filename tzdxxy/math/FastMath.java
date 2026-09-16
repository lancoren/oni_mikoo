/*    */ package tzdxxy.math;
/*    */ 
/*    */ public class FastMath
/*    */ {
/*    */   public static final float PI = 3.1415927F;
/*    */   public static final float rad = 0.017453292F;
/*  7 */   public static final float[] cos = new float[360];
/*  8 */   public static final float[] sin = new float[360];
/*    */   
/*    */   static {
/* 11 */     for (int i = 0; i < 360; i++) {
/* 12 */       float r = i * 0.017453292F;
/* 13 */       sin[i] = (float)Math.sin(r);
/* 14 */       cos[i] = (float)Math.cos(r);
/*    */     } 
/*    */   }
/*    */   
/*    */   public static float sin(int r) {
/* 19 */     r %= 360;
/* 20 */     if (r < 0) r += 360 * (-(r / 360) + 1); 
/* 21 */     return sin[r];
/*    */   }
/*    */   
/*    */   public static float cos(int r) {
/* 25 */     r %= 360;
/* 26 */     if (r < 0) r += 360 * (-(r / 360) + 1); 
/* 27 */     return cos[r];
/*    */   }
/*    */   
/*    */   public static float min(float a, float b) {
/* 31 */     return (a <= b) ? a : b;
/*    */   }
/*    */   
/*    */   public static float max(float a, float b) {
/* 35 */     return (a <= b) ? b : a;
/*    */   }
/*    */   
/*    */   public static float[] rotate(float x, float y, int r) {
/* 39 */     return new float[] { x * cos(r) - y * sin(r), y * cos(r) + x * sin(r) };
/*    */   }
/*    */ 
/*    */   
/*    */   public static float[] rotate(float x, float y, float z, int yaw, int pitch) {
/* 44 */     double xAfterYaw = (x * cos(yaw) + z * sin(yaw)), yAfterYaw = y, zAfterYaw = (-x * sin(yaw) + z * cos(yaw));
/* 45 */     double xAfterPitch = xAfterYaw, yAfterPitch = yAfterYaw * cos(pitch) - zAfterYaw * sin(pitch), zAfterPitch = yAfterYaw * sin(pitch) + zAfterYaw * cos(pitch);
/*    */     
/* 47 */     return new float[] { (float)xAfterPitch, (float)yAfterPitch, (float)zAfterPitch };
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\tzdxxy\math\FastMath.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */