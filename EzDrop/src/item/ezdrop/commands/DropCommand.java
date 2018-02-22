/*    */ package item.ezdrop.commands;
/*    */ 
/*    */ import item.ezdrop.utils.GuiUtil;

/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
/*    */ 
/*    */ 
/*    */ public class DropCommand
/*    */   implements CommandExecutor
/*    */ {
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String l, String[] args)
/*    */   {
/* 15 */     Player p = (Player)sender;
/*    */     
/* 17 */     if (!(sender instanceof Player)) {
/* 18 */       sender.sendMessage("§4Blad: §cNie mozesz wykonac tego z consoli!");
/* 19 */       return true;
/*    */     }
/*    */     
/* 22 */     GuiUtil.menudropu(p);
/* 23 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Patryk\Desktop\ParDragonDropPL.jar!\item\dragondrop\commands\DropCommand.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */