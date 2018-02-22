/*     */ package item.ezdrop.objects;
/*     */ 
/*     */ import item.ezdrop.Main;

/*     */ import java.util.ArrayList;
import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class User
/*     */ {
/*  12 */   public static List<User> users = new ArrayList<User>();
/*     */   private String name;
/*     */   private boolean enableCobble;
/*     */   private boolean enableDiamond;
/*     */   private boolean enableSzmaragd;
/*     */   private boolean enableGold;
/*     */   private boolean enableIron;
/*     */   private boolean enableTnT;
/*     */   private boolean enablePerla;
/*     */   private boolean enableSlime;
/*     */   private boolean enableRedStone;
/*     */   private boolean enableCoal;
/*     */   private boolean enableBookShelf;
/*     */   private boolean enableApple;
/*     */   private boolean enableObs;
/*     */   
/*     */   public User(String name, boolean cobble, boolean ediamond, boolean eszmaragd, boolean egold, boolean eiron, boolean etnt, boolean eslime, boolean eredstone, boolean ebooks, boolean eapple, boolean eobs, boolean ecoal, boolean eperla)
/*     */   {
/*  30 */     this.name = name;
/*  31 */     this.enableDiamond = ediamond;
/*  32 */     this.enableSzmaragd = eszmaragd;
/*  33 */     this.enableIron = eiron;
/*  34 */     this.enableCoal = ecoal;
/*  35 */     this.enableRedStone = eredstone;
/*  36 */     this.enableSlime = eslime;
/*  37 */     this.enablePerla = eperla;
/*  38 */     this.enableGold = egold;
/*  39 */     this.enableTnT = etnt;
/*  40 */     this.enableBookShelf = ebooks;
/*  41 */     this.enableObs = eobs;
/*  42 */     this.enableApple = eapple;
/*  43 */     this.enableCobble = cobble;
/*  44 */     users.add(this);
/*  45 */     Main.getInst().users.add(this);
/*     */   }
/*     */   
/*     */   public String getName() {
/*  49 */     return this.name;
/*     */   }
/*     */   
/*     */   public boolean getCobble() {
/*  53 */     return this.enableCobble;
/*     */   }
/*     */   
/*  56 */   public void getCobble(boolean cobble) { this.enableCobble = cobble; }
/*     */   
/*     */   public boolean eDiamond()
/*     */   {
/*  60 */     return this.enableDiamond;
/*     */   }
/*     */   
/*  63 */   public void eDiamond(boolean ediamond) { this.enableDiamond = ediamond; }
/*     */   
/*     */   public boolean eEmerald()
/*     */   {
/*  67 */     return this.enableSzmaragd;
/*     */   }
/*     */   
/*  70 */   public void eEmerald(boolean eszmaragd) { this.enableSzmaragd = eszmaragd; }
/*     */   
/*     */   public boolean eIron()
/*     */   {
/*  74 */     return this.enableIron;
/*     */   }
/*     */   
/*  77 */   public void eIron(boolean eiron) { this.enableIron = eiron; }
/*     */   
/*     */   public boolean eGold()
/*     */   {
/*  81 */     return this.enableGold;
/*     */   }
/*     */   
/*  84 */   public void eGold(boolean egold) { this.enableGold = egold; }
/*     */   
/*     */   public boolean eCoal()
/*     */   {
/*  88 */     return this.enableCoal;
/*     */   }
/*     */   
/*  91 */   public void eCoal(boolean ecoal) { this.enableCoal = ecoal; }
/*     */   
/*     */   public boolean eRedstone()
/*     */   {
/*  95 */     return this.enableRedStone;
/*     */   }
/*     */   
/*  98 */   public void eRedstone(boolean eredstone) { this.enableRedStone = eredstone; }
/*     */   
/*     */   public boolean eTnt()
/*     */   {
/* 102 */     return this.enableTnT;
/*     */   }
/*     */   
/* 105 */   public void eTnt(boolean etnt) { this.enableTnT = etnt; }
/*     */   
/*     */ 
/*     */   public boolean eObs()
/*     */   {
/* 110 */     return this.enableObs;
/*     */   }
/*     */   
/*     */   public void eObs(boolean eobs) {
/* 114 */     this.enableObs = eobs;
/*     */   }
/*     */   
/*     */   public boolean ePerla()
/*     */   {
/* 119 */     return this.enablePerla;
/*     */   }
/*     */   
/*     */   public void ePerla(boolean eperla) {
/* 123 */     this.enablePerla = eperla;
/*     */   }
/*     */   
/*     */   public boolean eSlime()
/*     */   {
/* 128 */     return this.enableSlime;
/*     */   }
/*     */   
/*     */   public void eSlime(boolean esand) {
/* 132 */     this.enableSlime = esand;
/*     */   }
/*     */   
/*     */   public boolean eApple()
/*     */   {
/* 137 */     return this.enableApple;
/*     */   }
/*     */   
/*     */   public void eApple(boolean eapple) {
/* 141 */     this.enableApple = eapple;
/*     */   }
/*     */   
/*     */   public boolean eBooks()
/*     */   {
/* 146 */     return this.enableBookShelf;
/*     */   }
/*     */   
/*     */   public void eBooks(boolean ebooks) {
/* 150 */     this.enableBookShelf = ebooks;
/*     */   }
/*     */   
/*     */   public static User get(String user)
/*     */   {
/* 155 */     for (User u : Main.getInst().users) {
/* 156 */       if (u.getName().equalsIgnoreCase(user)) {
/* 157 */         return u;
/*     */       }
/*     */     }
/* 160 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\Patryk\Desktop\ParDragonDropPL.jar!\item\dragondrop\objects\User.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */