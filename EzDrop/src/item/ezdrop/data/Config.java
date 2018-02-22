/*    */ package item.ezdrop.data;
/*    */ 
/*    */ import item.ezdrop.Main;

/*    */ import java.io.File;
import org.bukkit.configuration.file.FileConfiguration;
/*    */ 
/*    */ 
/*    */ public class Config
/*    */ {
/*    */   private static Config inst;
/* 11 */   private FileConfiguration cfg = Main.getInst().getConfig();
/* 12 */   private static File mainDir = Main.getInst().getDataFolder();
/* 13 */   private static File cfgFile = new File(mainDir, "config.yml");
/* 14 */   private static File users = new File(mainDir, "users");
/*    */   public double dropDiamond;
/*    */   public double dropEmerald;
/*    */   public double dropIron;
/*    */   public double dropCoal;
/*    */   public double dropGold;
/*    */   public double dropRedstone;
/*    */   public double dropPearl;
/*    */   public double dropObs;
/*    */   public double dropSlimeBall;
/*    */   public double dropBooks;
/*    */   public double dropApple;
/*    */   public double dropTnT;
/*    */   public int fortuneDrop1;
/*    */   public int fortuneDrop2;
/*    */   public int fortuneDrop3;
/*    */   public String linkTurboBuy;
/*    */   public double TurboaddToDrop;
/*    */   public double EventaddToDrop;
/*    */   public int dropEXP;
/*    */   public int dropOEXP;
/*    */   
/*    */   private Config()
/*    */   {
/* 38 */     inst = this;
/*    */   }
/*    */   
/*    */   public void load() {
/* 42 */     this.dropDiamond = this.cfg.getDouble("config.drop.diamond");
/* 43 */     this.dropEmerald = this.cfg.getDouble("config.drop.emerald");
/* 44 */     this.dropIron = this.cfg.getDouble("config.drop.iron");
/* 45 */     this.dropCoal = this.cfg.getDouble("config.drop.coal");
/* 46 */     this.dropRedstone = this.cfg.getDouble("config.drop.redstone");
/* 47 */     this.dropGold = this.cfg.getDouble("config.drop.gold");
/* 48 */     this.dropPearl = this.cfg.getDouble("config.drop.pearl");
/* 49 */     this.dropObs = this.cfg.getDouble("config.drop.obs");
/* 50 */     this.dropSlimeBall = this.cfg.getDouble("config.drop.slime");
/* 51 */     this.dropBooks = this.cfg.getDouble("config.drop.books");
/* 52 */     this.dropApple = this.cfg.getDouble("config.drop.apple");
/* 53 */     this.dropTnT = this.cfg.getDouble("config.drop.tnt");
/* 54 */     this.dropEXP = this.cfg.getInt("config.drop.exp");
/* 55 */     this.dropOEXP = this.cfg.getInt("config.drop.oexp");
/*    */     
/* 57 */     this.fortuneDrop1 = this.cfg.getInt("config.drop.addToDrop1");
/* 58 */     this.fortuneDrop2 = this.cfg.getInt("config.drop.addToDrop2");
/* 59 */     this.fortuneDrop3 = this.cfg.getInt("config.drop.addToDrop3");
/*    */     
/* 61 */     this.linkTurboBuy = this.cfg.getString("config.drop.linkbuy");
/* 62 */     this.TurboaddToDrop = this.cfg.getInt("config.drop.turboaddToDrop");
/*    */   }
/*    */   
/*    */   public static Config getInst() {
/* 66 */     if (inst == null) return new Config();
/* 67 */     return inst;
/*    */   }
/*    */   
/*    */   public static void check() {
/* 71 */     if (!mainDir.exists()) {
/* 72 */       mainDir.mkdir();
/*    */     }
/* 74 */     if (!users.exists()) {
/* 75 */       users.mkdir();
/*    */     }
/* 77 */     if (!cfgFile.exists()) {
/* 78 */       Main.getInst().saveDefaultConfig();
/*    */     }
/*    */   }
/*    */   
/*    */   public static File getUsersFolder()
/*    */   {
/* 84 */     return users;
/*    */   }
/*    */ }