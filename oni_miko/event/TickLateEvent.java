/*    */ package oni_miko.event;
/*    */ 
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ import net.minecraftforge.event.TickEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TickLateEvent
/*    */ {
/*    */   public final boolean isClient;
/*    */   private int tick;
/*    */   private TickTask task;
/*    */   
/*    */   public TickLateEvent(boolean isClient, TickTask task) {
/* 18 */     this.isClient = isClient;
/* 19 */     this.task = task;
/* 20 */     MinecraftForge.EVENT_BUS.register(this);
/*    */   }
/*    */   
/*    */   public void run() {
/* 24 */     if (this.task.run(this.tick++)) {
/* 25 */       MinecraftForge.EVENT_BUS.unregister(this);
/*    */     }
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public void tickEvent(TickEvent evt) {
/* 31 */     if (evt.phase == TickEvent.Phase.START)
/* 32 */       if (this.isClient)
/* 33 */       { if (evt instanceof TickEvent.ClientTickEvent) run();
/*    */          }
/* 35 */       else if (evt instanceof TickEvent.ServerTickEvent) { run(); }
/*    */        
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\event\TickLateEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */