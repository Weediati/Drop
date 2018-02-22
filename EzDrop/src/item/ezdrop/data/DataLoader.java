/*    */ package item.ezdrop.data;
/*    */ 
/*    */ /*    */ import item.ezdrop.data.Config;
import item.ezdrop.Main;
import item.ezdrop.objects.User;

/*    */ import java.io.File;
/*    */ import java.io.IOException;
import org.bukkit.configuration.file.YamlConfiguration;
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
/* 19 */     int j = (arrayOfFile = Config.getUsersFolder().listFiles()).length;
/* 20 */     for (int i = 0; i < j; i++)
/*    */     {
/* 22 */       File f = arrayOfFile[i];
/* 23 */       YamlConfiguration yml = YamlConfiguration.loadConfiguration(f);
/* 24 */       String name = yml.getString("name");
/* 25 */       boolean cobble = yml.getBoolean("cobble");
/* 26 */       boolean ediamond = yml.getBoolean("ediamond");
/* 27 */       boolean eszmaragd = yml.getBoolean("eemerald");
/* 28 */       boolean eiron = yml.getBoolean("eiron");
/* 29 */       boolean ecoal = yml.getBoolean("ecoal");
/* 30 */       boolean egold = yml.getBoolean("egold");
/* 31 */       boolean epearl = yml.getBoolean("epearl");
/* 32 */       boolean eredstone = yml.getBoolean("eredstone");
/* 33 */       boolean eslime = yml.getBoolean("eslime");
/* 34 */       boolean ebooks = yml.getBoolean("ebooks");
/* 35 */       boolean eapple = yml.getBoolean("eapple");
/* 36 */       boolean eobs = yml.getBoolean("eobs");
/* 37 */       boolean etnt = yml.getBoolean("etnt");
/* 38 */       new User(name, cobble, ediamond, eszmaragd, eiron, ecoal, egold, epearl, eapple, eredstone, ebooks, eslime, eobs, etnt);
/*    */     }
/*    */   }
/*    */   
/*    */   public static void saveUsers()
/*    */   {
/* 44 */     for (User u : Main.getInst().users)
/*    */     {
/* 46 */       File f = new File(Config.getUsersFolder(), u.getName() + ".yml");
/* 47 */       if (!f.exists()) {
/*    */         try
/*    */         {
/* 50 */           f.createNewFile();
/*    */         }
/*    */         catch (IOException e)
/*    */         {
/* 54 */           e.printStackTrace();
/*    */         }
/*    */       }
/* 57 */       YamlConfiguration yml = YamlConfiguration.loadConfiguration(f);
/* 58 */       yml.set("name", u.getName());
/* 59 */       yml.set("cobble", Boolean.valueOf(u.getCobble()));
/* 60 */       yml.set("ediamond", Boolean.valueOf(u.eDiamond()));
/* 61 */       yml.set("eemerald", Boolean.valueOf(u.eEmerald()));
/* 62 */       yml.set("eiron", Boolean.valueOf(u.eIron()));
/* 63 */       yml.set("ecoal", Boolean.valueOf(u.eCoal()));
/* 64 */       yml.set("egold", Boolean.valueOf(u.eGold()));
/* 65 */       yml.set("epearl", Boolean.valueOf(u.ePerla()));
/* 66 */       yml.set("eobs", Boolean.valueOf(u.eObs()));
/* 67 */       yml.set("eredstone", Boolean.valueOf(u.eRedstone()));
/* 68 */       yml.set("eslime", Boolean.valueOf(u.eSlime()));
/* 69 */       yml.set("eapple", Boolean.valueOf(u.eApple()));
/* 70 */       yml.set("ebooks", Boolean.valueOf(u.eBooks()));
/* 71 */       yml.set("etnt", Boolean.valueOf(u.eTnt()));
/*    */       try
/*    */       {
/* 74 */         yml.save(f);
/*    */       }
/*    */       catch (IOException e)
/*    */       {
/* 78 */         e.printStackTrace();
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Patryk\Desktop\ParDragonDropPL.jar!\item\dragondrop\data\DataLoader.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */