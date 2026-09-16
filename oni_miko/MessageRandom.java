/*    */ package oni_miko;
/*    */ 
/*    */ import java.util.Random;
/*    */ 
/*    */ public class MessageRandom
/*    */ {
/*  7 */   public static final int[] messageId = new int[29];
/*    */   
/*    */   static {
/* 10 */     Random random = new Random(); int i;
/* 11 */     for (i = 0; i < messageId.length; i++) {
/* 12 */       messageId[i] = i;
/*    */     }
/* 14 */     for (i = 0; i < messageId.length; i++) {
/* 15 */       int index = random.nextInt(messageId.length);
/* 16 */       int get = messageId[index];
/* 17 */       messageId[index] = messageId[i];
/* 18 */       messageId[i] = get;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\MessageRandom.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */