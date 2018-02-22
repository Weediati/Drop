/*    */ package item.ezdrop;
/*    */ 
/*    */ import item.ezdrop.data.Config;
import item.ezdrop.data.DataLoader;
import item.ezdrop.listeners.DropListener;
import item.ezdrop.listeners.JoinPlayerListener;
import item.ezdrop.listeners.onBreakListener;
import item.ezdrop.objects.TurboDrop;
import item.ezdrop.objects.User;

/*    */ import java.io.PrintStream;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.Server;
/*    */ import org.bukkit.command.PluginCommand;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
/*    */ 
/*    */ public class Main extends org.bukkit.plugin.java.JavaPlugin
/*    */ {
/* 22 */   public List<User> users = new ArrayList();
/*    */   private static Main inst;
/* 24 */   public List<TurboDrop> tb = new ArrayList();
/* 25 */   public boolean isTurbodropAll = false;
/* 26 */   public boolean isEventAll = false;
/*    */   public static boolean isOn;
/*    */   public static int taskID;
/*    */   
/*    */   public Main() {
/* 31 */     inst = this;
/*    */   }
/*    */   
/*    */   public static Main getInst() {
/* 35 */     if (inst == null) return new Main();
/* 36 */     return inst;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public void onEnable()
/*    */   {
/* 43 */     PluginDescriptionFile pdf = getDescription();
/* 44 */
/*    */     {
/* 46 */       System.out.println("EZDROP by Weediati >> TRWA PROCES WYLACZANIA. ZMIANY W PLUGIN.YML...");
/* 47 */       System.out.println("EZDROP by Weediati >> Plugin zostal wlaczony: Niepoprawnie!");
/* 48 */       Bukkit.getServer().getPluginManager().disablePlugin(this);
/*    */     }
/* 50 */     if (!pdf.getAuthors().contains("Weediati"))
/*    */     {
/* 52 */       System.out.println("EZDROP by Weediati >> TRWA PROCES WYLACZANIA. ZMIANY W PLUGIN.YML...");
/* 53 */       System.out.println("EZDROP by Weediati >> Plugin zostal wlaczony: Niepoprawnie!");
/* 54 */       Bukkit.getServer().getPluginManager().disablePlugin(this);
/*    */     }
/*    */     
/* 57 */     Bukkit.getServer().getPluginManager().registerEvents(new DropListener(), this);
/* 58 */     Bukkit.getServer().getPluginManager().registerEvents(new JoinPlayerListener(), this);
/* 59 */     Bukkit.getServer().getPluginManager().registerEvents(new onBreakListener(), this);
/*    */     
/* 61 */     getCommand("drop").setExecutor(new item.ezdrop.commands.DropCommand());
/* 62 */     getCommand("turbodrop").setExecutor(new item.ezdrop.commands.TurboDropCommand());
/* 63 */     Config.check();
/* 64 */     Config.getInst().load();
/*    */     
/*    */     Player[] arrayOfPlayer;
/* 67 */     int j = (arrayOfPlayer = Bukkit.getOnlinePlayers()).length;
/* 68 */     for (int i = 0; i < j; i++)
/*    */     {
/* 70 */       Player p = arrayOfPlayer[i];
/* 71 */       User u = User.get(p.getName());
/*    */       
/* 73 */       if (u == null) {
/* 74 */         new User(p.getPlayer().getName(), true, true, true, true, true, true, true, true, true, true, true, true, true);
/*    */       }
/*    */     }
/*    */     
/* 78 */     System.out.println("EZDROP by Weediati >> Plugin zostal wlaczony: Poprawnie!");
/*    */   }
/*    */   
/*    */   public void onDisable() {
/* 82 */     DataLoader.saveUsers();
/* 83 */     System.out.println("EZDROP by Weediati >> Wylaczono plugin.");
/*    */   }
/*    */   
/*    */   public static void setEnable(boolean enable) {
/* 87 */     if (enable) {
/* 88 */       isOn = enable;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Patryk\Desktop\ParDragonDropPL.jar!\item\dragondrop\Main.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */