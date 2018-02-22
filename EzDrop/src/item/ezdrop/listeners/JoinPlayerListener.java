/*    */ package item.ezdrop.listeners;
/*    */ 
/*    */ import item.ezdrop.objects.User;

/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class JoinPlayerListener
/*    */   implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void onJoin(PlayerJoinEvent e)
/*    */   {
/* 20 */     Player p = e.getPlayer();
/* 21 */     User u = User.get(p.getName());
/* 22 */     if (u == null) {
/* 23 */       new User(p.getPlayer().getName(), true, true, true, true, true, true, true, true, true, true, true, true, true);
/*    */     }
/*    */   }
/*    */ }