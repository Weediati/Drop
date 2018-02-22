/*    */ package item.ezdrop.utils;
/*    */ 
/*    */ import item.ezdrop.data.Config;
import item.ezdrop.objects.TurboDrop;

/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.Location;
/*    */ import org.bukkit.Sound;
/*    */ import org.bukkit.World;
/*    */ import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitScheduler;
/*    */ 
/*    */ public class TurboDropUtil
/*    */ {
/*    */   private static int i;
/*    */   private static int taskID;
/*    */   
/*    */   public static void createTurboDrop(Player p, int time, Player gived)
/*    */   {
/* 19 */     p.sendMessage("§aOtrzymales §8§l[§d§lTurbo§b§ldrop§8§l] §7na: §3" + time + "sec");
/* 20 */     new TurboDrop(p.getName(), time);
/* 21 */     Bukkit.broadcastMessage("§8##############################");
/* 22 */     Bukkit.broadcastMessage("");
/* 23 */     Bukkit.broadcastMessage("§a" + p.getName() + " §7zakupil§8§l: §5§lT§a§lU§d§lR§2§lB§5§lO§9§lD§1§lR§3§lO§b§lP§7!");
/* 24 */     Bukkit.broadcastMessage("§7Przez strone§8§l: §b§l" + Config.getInst().linkTurboBuy);
/* 25 */     Bukkit.broadcastMessage("§6Dziekujemy za wsparcie serwera!");
/* 26 */     Bukkit.broadcastMessage("");
/* 27 */     Bukkit.broadcastMessage("§8##############################");
/*    */     
/* 29 */     i = time;
/* 30 */     taskID = Bukkit.getScheduler().scheduleAsyncRepeatingTask(item.ezdrop.Main.getInst(), new Runnable() {
/*    */       public void run() {
/* 32 */         TurboDrop u = TurboDrop.get(TurboDropUtil.this.getName());
/* 33 */         if (TurboDropUtil.i > -1) {
/* 34 */           if (TurboDropUtil.i == 0) {
/* 35 */             TurboDropUtil.this.sendMessage("§8» §d§lTurbo§b§ldrop§c§l sie Skonczyl!");
/* 36 */             for (World w : Bukkit.getWorlds())
/*    */             {
/* 38 */               Location l = new Location(w, 0.0D, 70.0D, 0.0D);
/* 39 */               w.playSound(l, Sound.ENDERDRAGON_HIT, 10000.0F, 1.0F);
/*    */             }
/* 41 */             TurboDropUtil.i -= 1;
/* 42 */             Bukkit.getScheduler().cancelTask(TurboDropUtil.taskID);
/* 43 */             u.delete();
/*    */           } else {
/* 45 */             TurboDropUtil.i -= 1;
/* 46 */             u.setTime(u.getTime() - 1);
/*    */           }
/*    */         }
/*    */       }
/* 50 */     }, 0L, 20L);
/*    */   }
/*    */ }


/* Location:              C:\Users\Patryk\Desktop\ParDragonDropPL.jar!\item\dragondrop\utils\TurboDropUtil.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */