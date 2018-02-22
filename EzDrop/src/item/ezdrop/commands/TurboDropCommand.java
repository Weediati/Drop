/*     */ package item.ezdrop.commands;
/*     */ 
/*     */ /*     */ import item.ezdrop.data.Config;
import item.ezdrop.Main;

/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.Server;
/*     */ import org.bukkit.command.Command;
/*     */ import org.bukkit.command.CommandExecutor;
/*     */ import org.bukkit.command.CommandSender;
/*     */ import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitScheduler;
/*     */ 
/*     */ public class TurboDropCommand implements CommandExecutor
/*     */ {
/*     */   private static int i;
/*     */   private static int taskID;
/*     */   
/*     */   @SuppressWarnings("deprecation")
public boolean onCommand(CommandSender sender, Command cmd, String l, String[] args)
/*     */   {
/*  20 */     if (cmd.getName().equalsIgnoreCase("turbodrop")) {
/*  21 */       if (!(sender instanceof Player)) {
/*  22 */         return false;
/*     */       }
/*  24 */       Player p = (Player)sender;
/*  25 */       if (!p.hasPermission("turbodrop.admin")) {
/*  26 */         p.sendMessage("Brak uprawnien");
/*     */       }
/*     */       else {
/*  29 */         if (args.length == 0) {
/*  30 */           p.sendMessage("§8» §7Poprawne uzycie /§d§lTurbo§b§lDrop§7 Give <nick/all> <czas>");
/*  31 */           return false; }
/*  32 */         if (args[0].equalsIgnoreCase("give")) {
/*  33 */           if (args.length <= 1) {
/*  34 */             p.sendMessage("§4Blad: §cPodaj nick gracza, ktoremu chcesz dac turbodrop");
/*  35 */             return false;
/*     */           }
/*  37 */           if (args.length <= 2) {
/*  38 */             p.sendMessage("§4Blad: §cPodaj czas, na ktory chcesz dac turbodrop (w sekundach)");
/*  39 */             return false;
/*     */           }
/*  41 */           if (!args[2].matches("[0-9]+")) {
/*  42 */             p.sendMessage("§4Blad: §cCzas na ktory chcesz dac turbodrop, musi sie skladac tylko z cyfr.");
/*  43 */             return false;
/*     */           }
/*     */           
/*  46 */           if (args[1].equalsIgnoreCase("all"))
/*     */           {
/*  48 */             if (!Main.getInst().isTurbodropAll) {
/*  49 */               final Config cfg = Config.getInst();
/*     */               
/*  51 */               Main.getInst().isTurbodropAll = true;
/*     */               
/*  53 */               cfg.dropCoal += cfg.TurboaddToDrop;
/*  54 */               cfg.dropDiamond += cfg.TurboaddToDrop;
/*  55 */               cfg.dropEmerald += cfg.TurboaddToDrop;
/*  56 */               cfg.dropIron += cfg.TurboaddToDrop;
/*  57 */               cfg.dropRedstone += cfg.TurboaddToDrop;
/*  58 */               cfg.dropPearl += cfg.TurboaddToDrop;
/*  59 */               cfg.dropObs += cfg.TurboaddToDrop;
/*  60 */               cfg.dropTnT += cfg.TurboaddToDrop;
/*  61 */               cfg.dropApple += cfg.TurboaddToDrop;
/*  62 */               cfg.dropSlimeBall += cfg.TurboaddToDrop;
/*  63 */               cfg.dropBooks += cfg.TurboaddToDrop;
/*     */               
/*  65 */               Bukkit.broadcastMessage("§8» §d§lTurbo§b§lDrop§7 dla wszstkich graczy zostal Wlaczony.");
/*  66 */               i = Integer.valueOf(args[2]).intValue();
/*  67 */               taskID = Bukkit.getScheduler().scheduleAsyncRepeatingTask(Main.getInst(), new Runnable() {
/*     */                 public void run() {
/*  69 */                   if (TurboDropCommand.i > -1) {
/*  70 */                     if (TurboDropCommand.i == 0) {
/*  71 */                       cfg.load();
/*  72 */                       Bukkit.broadcastMessage("§8» §d§lTurbo§b§lDrop§7 dla wszystkich graczy sie Zakonczyl!");
/*  73 */                       Main.getInst().isTurbodropAll = false;
/*  74 */                       Bukkit.getScheduler().cancelTask(TurboDropCommand.taskID);
/*     */                     } else {
/*  76 */                       TurboDropCommand.i -= 1;
/*     */                     }
/*     */                   }
/*     */                 }
/*  80 */               }, 0L, 20L);
/*     */               
/*  82 */               return false;
/*     */             }
/*  84 */             p.sendMessage("§4Blad: §cTurbodrop dla wszytskich graczy jest aktualnie wlaczony!");
/*  85 */             return false;
/*     */           }
/*     */           
/*  88 */           if (Bukkit.getServer().getPlayerExact(args[1].toString()) == null) {
/*  89 */             p.sendMessage("§4Blad: §cPodany gracz jest offline");
/*  90 */             return false;
/*     */           }
/*  92 */           item.ezdrop.utils.TurboDropUtil.createTurboDrop(Bukkit.getServer().getPlayer(args[1].toString()), Integer.valueOf(args[2]).intValue(), p);
/*  93 */           return false;
/*     */         }
/*  95 */         p.sendMessage("§4Blad: §cNieznany argument.");
/*  96 */         return false;
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 101 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Patryk\Desktop\ParDragonDropPL.jar!\item\dragondrop\commands\TurboDropCommand.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */