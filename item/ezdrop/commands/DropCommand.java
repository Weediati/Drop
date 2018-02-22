/*    */ package item.ezdrop.commands;
/*    */ 
/*    */ import item.ezdrop.utils.GuiUtil;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DropCommand
/*    */   implements CommandExecutor
/*    */ {
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String l, String[] args)
/*    */   {
/* 16 */     Player p = (Player)sender;
/*    */     
/* 18 */     if (!(sender instanceof Player)) {
/* 19 */       sender.sendMessage("Â§4Blad: Â§cNie mozesz wykonac tego z consoli!");
/* 20 */       return true;
/*    */     }
/*    */     
/* 23 */     GuiUtil.menudropu(p);
/* 24 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Patryk\Desktop\EZDROP.jar!\item\ezdrop\commands\DropCommand.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */