/*    */ package item.ezdrop;
/*    */ 
/*    */ import item.ezdrop.data.DataLoader;
/*    */ import item.ezdrop.objects.TurboDrop;
/*    */ import item.ezdrop.objects.User;
/*    */ import java.io.PrintStream;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import org.bukkit.plugin.java.JavaPlugin;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Main
/*    */   extends JavaPlugin
/*    */ {
/* 23 */   public List<User> users = new ArrayList();
/*    */   private static Main inst;
/* 25 */   public List<TurboDrop> tb = new ArrayList();
/* 26 */   public boolean isTurbodropAll = false;
/* 27 */   public boolean isEventAll = false;
/*    */   public static boolean isOn;
/*    */   public static int taskID;
/*    */   
/*    */   public Main() {
/* 32 */     inst = this;
/*    */   }
/*    */   
/*    */   public static Main getInst() {
/* 36 */     if (inst == null) return new Main();
/* 37 */     return inst;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void onEnable()
/*    */   {
/* 68 */     throw new Error("Unresolved compilation problem: \n\tType mismatch: cannot convert from Collection<capture#1-of ? extends Player> to Player[]\n");
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void onDisable()
/*    */   {
/* 83 */     DataLoader.saveUsers();
/* 84 */     System.out.println("ParDragonDropPL >> Wylaczono plugin.");
/*    */   }
/*    */   
/*    */   public static void setEnable(boolean enable) {
/* 88 */     if (enable) {
/* 89 */       isOn = enable;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Patryk\Desktop\EZDROP.jar!\item\ezdrop\Main.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */