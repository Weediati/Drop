/*    */ package item.ezdrop.listeners;
/*    */ 
/*    */ import item.ezdrop.objects.User;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.player.PlayerJoinEvent;
/*    */ 
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
/* 21 */     Player p = e.getPlayer();
/* 22 */     User u = User.get(p.getName());
/* 23 */     if (u == null) {
/* 24 */       new User(p.getPlayer().getName(), true, true, true, true, true, true, true, true, true, true, true, true, true);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Patryk\Desktop\EZDROP.jar!\item\ezdrop\listeners\JoinPlayerListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */