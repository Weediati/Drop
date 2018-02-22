/*    */ package item.ezdrop.data;
/*    */ 
/*    */ import item.dragondrop.data.Config;
/*    */ import item.ezdrop.Main;
/*    */ import item.ezdrop.objects.User;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import org.bukkit.configuration.file.YamlConfiguration;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DataLoader
/*    */ {
/*    */   public static void load() {}
/*    */   
/*    */   public static void save() {}
/*    */   
/*    */   public static void loadUsers()
/*    */   {
/*    */     File[] arrayOfFile;
/* 21 */     int j = (arrayOfFile = Config.getUsersFolder().listFiles()).length;
/* 22 */     for (int i = 0; i < j; i++)
/*    */     {
/* 24 */       File f = arrayOfFile[i];
/* 25 */       YamlConfiguration yml = YamlConfiguration.loadConfiguration(f);
/* 26 */       String name = yml.getString("name");
/* 27 */       boolean cobble = yml.getBoolean("cobble");
/* 28 */       boolean ediamond = yml.getBoolean("ediamond");
/* 29 */       boolean eszmaragd = yml.getBoolean("eemerald");
/* 30 */       boolean eiron = yml.getBoolean("eiron");
/* 31 */       boolean ecoal = yml.getBoolean("ecoal");
/* 32 */       boolean egold = yml.getBoolean("egold");
/* 33 */       boolean epearl = yml.getBoolean("epearl");
/* 34 */       boolean eredstone = yml.getBoolean("eredstone");
/* 35 */       boolean eslime = yml.getBoolean("eslime");
/* 36 */       boolean ebooks = yml.getBoolean("ebooks");
/* 37 */       boolean eapple = yml.getBoolean("eapple");
/* 38 */       boolean eobs = yml.getBoolean("eobs");
/* 39 */       boolean etnt = yml.getBoolean("etnt");
/* 40 */       new User(name, cobble, ediamond, eszmaragd, eiron, ecoal, egold, epearl, eapple, eredstone, ebooks, eslime, eobs, etnt);
/*    */     }
/*    */   }
/*    */   
/*    */   public static void saveUsers()
/*    */   {
/* 46 */     for (User u : Main.getInst().users)
/*    */     {
/* 48 */       File f = new File(Config.getUsersFolder(), u.getName() + ".yml");
/* 49 */       if (!f.exists()) {
/*    */         try
/*    */         {
/* 52 */           f.createNewFile();
/*    */         }
/*    */         catch (IOException e)
/*    */         {
/* 56 */           e.printStackTrace();
/*    */         }
/*    */       }
/* 59 */       YamlConfiguration yml = YamlConfiguration.loadConfiguration(f);
/* 60 */       yml.set("name", u.getName());
/* 61 */       yml.set("cobble", Boolean.valueOf(u.getCobble()));
/* 62 */       yml.set("ediamond", Boolean.valueOf(u.eDiamond()));
/* 63 */       yml.set("eemerald", Boolean.valueOf(u.eEmerald()));
/* 64 */       yml.set("eiron", Boolean.valueOf(u.eIron()));
/* 65 */       yml.set("ecoal", Boolean.valueOf(u.eCoal()));
/* 66 */       yml.set("egold", Boolean.valueOf(u.eGold()));
/* 67 */       yml.set("epearl", Boolean.valueOf(u.ePerla()));
/* 68 */       yml.set("eobs", Boolean.valueOf(u.eObs()));
/* 69 */       yml.set("eredstone", Boolean.valueOf(u.eRedstone()));
/* 70 */       yml.set("eslime", Boolean.valueOf(u.eSlime()));
/* 71 */       yml.set("eapple", Boolean.valueOf(u.eApple()));
/* 72 */       yml.set("ebooks", Boolean.valueOf(u.eBooks()));
/* 73 */       yml.set("etnt", Boolean.valueOf(u.eTnt()));
/*    */       try
/*    */       {
/* 76 */         yml.save(f);
/*    */       }
/*    */       catch (IOException e)
/*    */       {
/* 80 */         e.printStackTrace();
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Patryk\Desktop\EZDROP.jar!\item\ezdrop\data\DataLoader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */