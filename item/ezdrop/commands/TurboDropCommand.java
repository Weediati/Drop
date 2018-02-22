/*     */ package item.ezdrop.commands;
/*     */ 
/*     */ import item.dragondrop.data.Config;
/*     */ import item.ezdrop.Main;
/*     */ import item.ezdrop.utils.TurboDropUtil;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.Server;
/*     */ import org.bukkit.command.Command;
/*     */ import org.bukkit.command.CommandExecutor;
/*     */ import org.bukkit.command.CommandSender;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.scheduler.BukkitScheduler;
/*     */ 
/*     */ public class TurboDropCommand
/*     */   implements CommandExecutor
/*     */ {
/*     */   private static int i;
/*     */   private static int taskID;
/*     */   
/*     */   public boolean onCommand(CommandSender sender, Command cmd, String l, String[] args)
/*     */   {
/*  22 */     if (cmd.getName().equalsIgnoreCase("turbodrop")) {
/*  23 */       if (!(sender instanceof Player)) {
/*  24 */         return false;
/*     */       }
/*  26 */       Player p = (Player)sender;
/*  27 */       if (!p.hasPermission("turbodrop.admin")) {
/*  28 */         p.sendMessage("Brak uprawnien");
/*     */       }
/*     */       else {
/*  31 */         if (args.length == 0) {
/*  32 */           p.sendMessage("Â§8Â» Â§7Poprawne uzycie /Â§dÂ§lTurboÂ§bÂ§lDropÂ§7 Give <nick/all> <czas>");
/*  33 */           return false; }
/*  34 */         if (args[0].equalsIgnoreCase("give")) {
/*  35 */           if (args.length <= 1) {
/*  36 */             p.sendMessage("Â§4Blad: Â§cPodaj nick gracza, ktoremu chcesz dac turbodrop");
/*  37 */             return false;
/*     */           }
/*  39 */           if (args.length <= 2) {
/*  40 */             p.sendMessage("Â§4Blad: Â§cPodaj czas, na ktory chcesz dac turbodrop (w sekundach)");
/*  41 */             return false;
/*     */           }
/*  43 */           if (!args[2].matches("[0-9]+")) {
/*  44 */             p.sendMessage("Â§4Blad: Â§cCzas na ktory chcesz dac turbodrop, musi sie skladac tylko z cyfr.");
/*  45 */             return false;
/*     */           }
/*     */           
/*  48 */           if (args[1].equalsIgnoreCase("all"))
/*     */           {
/*  50 */             if (!Main.getInst().isTurbodropAll) {
/*  51 */               final Config cfg = Config.getInst();
/*     */               
/*  53 */               Main.getInst().isTurbodropAll = true;
/*     */               
/*  55 */               cfg.dropCoal += cfg.TurboaddToDrop;
/*  56 */               cfg.dropDiamond += cfg.TurboaddToDrop;
/*  57 */               cfg.dropEmerald += cfg.TurboaddToDrop;
/*  58 */               cfg.dropIron += cfg.TurboaddToDrop;
/*  59 */               cfg.dropRedstone += cfg.TurboaddToDrop;
/*  60 */               cfg.dropPearl += cfg.TurboaddToDrop;
/*  61 */               cfg.dropObs += cfg.TurboaddToDrop;
/*  62 */               cfg.dropTnT += cfg.TurboaddToDrop;
/*  63 */               cfg.dropApple += cfg.TurboaddToDrop;
/*  64 */               cfg.dropSlimeBall += cfg.TurboaddToDrop;
/*  65 */               cfg.dropBooks += cfg.TurboaddToDrop;
/*     */               
/*  67 */               Bukkit.broadcastMessage("Â§8Â» Â§dÂ§lTurboÂ§bÂ§lDropÂ§7 dla wszstkich graczy zostal Wlaczony.");
/*  68 */               i = Integer.valueOf(args[2]).intValue();
/*  69 */               taskID = Bukkit.getScheduler().scheduleAsyncRepeatingTask(Main.getInst(), new Runnable() {
/*     */                 public void run() {
/*  71 */                   if (TurboDropCommand.i > -1) {
/*  72 */                     if (TurboDropCommand.i == 0) {
/*  73 */                       cfg.load();
/*  74 */                       Bukkit.broadcastMessage("Â§8Â» Â§dÂ§lTurboÂ§bÂ§lDropÂ§7 dla wszystkich graczy sie Zakonczyl!");
/*  75 */                       Main.getInst().isTurbodropAll = false;
/*  76 */                       Bukkit.getScheduler().cancelTask(TurboDropCommand.taskID);
/*     */                     } else {
/*  78 */                       TurboDropCommand.i -= 1;
/*     */                     }
/*     */                   }
/*     */                 }
/*  82 */               }, 0L, 20L);
/*     */               
/*  84 */               return false;
/*     */             }
/*  86 */             p.sendMessage("Â§4Blad: Â§cTurbodrop dla wszytskich graczy jest aktualnie wlaczony!");
/*  87 */             return false;
/*     */           }
/*     */           
/*  90 */           if (Bukkit.getServer().getPlayerExact(args[1].toString()) == null) {
/*  91 */             p.sendMessage("Â§4Blad: Â§cPodany gracz jest offline");
/*  92 */             return false;
/*     */           }
/*  94 */           TurboDropUtil.createTurboDrop(Bukkit.getServer().getPlayer(args[1].toString()), Integer.valueOf(args[2]).intValue(), p);
/*  95 */           return false;
/*     */         }
/*  97 */         p.sendMessage("Â§4Blad: Â§cNieznany argument.");
/*  98 */         return false;
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 103 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Patryk\Desktop\EZDROP.jar!\item\ezdrop\commands\TurboDropCommand.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */