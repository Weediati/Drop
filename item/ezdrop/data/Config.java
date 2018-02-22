/*    */ package item.ezdrop.data;
/*    */ 
/*    */ import item.ezdrop.Main;
/*    */ import java.io.File;
/*    */ import org.bukkit.configuration.file.FileConfiguration;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Config
/*    */ {
/*    */   private static Config inst;
/* 12 */   private FileConfiguration cfg = Main.getInst().getConfig();
/* 13 */   private static File mainDir = Main.getInst().getDataFolder();
/* 14 */   private static File cfgFile = new File(mainDir, "config.yml");
/* 15 */   private static File users = new File(mainDir, "users");
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
/* 39 */     inst = this;
/*    */   }
/*    */   
/*    */   public void load() {
/* 43 */     this.dropDiamond = this.cfg.getDouble("config.drop.diamond");
/* 44 */     this.dropEmerald = this.cfg.getDouble("config.drop.emerald");
/* 45 */     this.dropIron = this.cfg.getDouble("config.drop.iron");
/* 46 */     this.dropCoal = this.cfg.getDouble("config.drop.coal");
/* 47 */     this.dropRedstone = this.cfg.getDouble("config.drop.redstone");
/* 48 */     this.dropGold = this.cfg.getDouble("config.drop.gold");
/* 49 */     this.dropPearl = this.cfg.getDouble("config.drop.pearl");
/* 50 */     this.dropObs = this.cfg.getDouble("config.drop.obs");
/* 51 */     this.dropSlimeBall = this.cfg.getDouble("config.drop.slime");
/* 52 */     this.dropBooks = this.cfg.getDouble("config.drop.books");
/* 53 */     this.dropApple = this.cfg.getDouble("config.drop.apple");
/* 54 */     this.dropTnT = this.cfg.getDouble("config.drop.tnt");
/* 55 */     this.dropEXP = this.cfg.getInt("config.drop.exp");
/* 56 */     this.dropOEXP = this.cfg.getInt("config.drop.oexp");
/*    */     
/* 58 */     this.fortuneDrop1 = this.cfg.getInt("config.drop.addToDrop1");
/* 59 */     this.fortuneDrop2 = this.cfg.getInt("config.drop.addToDrop2");
/* 60 */     this.fortuneDrop3 = this.cfg.getInt("config.drop.addToDrop3");
/*    */     
/* 62 */     this.linkTurboBuy = this.cfg.getString("config.drop.linkbuy");
/* 63 */     this.TurboaddToDrop = this.cfg.getInt("config.drop.turboaddToDrop");
/*    */   }
/*    */   
/*    */   public static Config getInst() {
/* 67 */     if (inst == null) return new Config();
/* 68 */     return inst;
/*    */   }
/*    */   
/*    */   public static void check() {
/* 72 */     if (!mainDir.exists()) {
/* 73 */       mainDir.mkdir();
/*    */     }
/* 75 */     if (!users.exists()) {
/* 76 */       users.mkdir();
/*    */     }
/* 78 */     if (!cfgFile.exists()) {
/* 79 */       Main.getInst().saveDefaultConfig();
/*    */     }
/*    */   }
/*    */   
/*    */   public static File getUsersFolder()
/*    */   {
/* 85 */     return users;
/*    */   }
/*    */ }


/* Location:              C:\Users\Patryk\Desktop\EZDROP.jar!\item\ezdrop\data\Config.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */