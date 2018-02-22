/*     */ package item.ezdrop.objects;
/*     */ 
/*     */ import item.ezdrop.Main;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class User
/*     */ {
/*  13 */   public static List<User> users = new ArrayList();
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
/*  31 */     this.name = name;
/*  32 */     this.enableDiamond = ediamond;
/*  33 */     this.enableSzmaragd = eszmaragd;
/*  34 */     this.enableIron = eiron;
/*  35 */     this.enableCoal = ecoal;
/*  36 */     this.enableRedStone = eredstone;
/*  37 */     this.enableSlime = eslime;
/*  38 */     this.enablePerla = eperla;
/*  39 */     this.enableGold = egold;
/*  40 */     this.enableTnT = etnt;
/*  41 */     this.enableBookShelf = ebooks;
/*  42 */     this.enableObs = eobs;
/*  43 */     this.enableApple = eapple;
/*  44 */     this.enableCobble = cobble;
/*  45 */     users.add(this);
/*  46 */     Main.getInst().users.add(this);
/*     */   }
/*     */   
/*     */   public String getName() {
/*  50 */     return this.name;
/*     */   }
/*     */   
/*     */   public boolean getCobble() {
/*  54 */     return this.enableCobble;
/*     */   }
/*     */   
/*  57 */   public void getCobble(boolean cobble) { this.enableCobble = cobble; }
/*     */   
/*     */   public boolean eDiamond()
/*     */   {
/*  61 */     return this.enableDiamond;
/*     */   }
/*     */   
/*  64 */   public void eDiamond(boolean ediamond) { this.enableDiamond = ediamond; }
/*     */   
/*     */   public boolean eEmerald()
/*     */   {
/*  68 */     return this.enableSzmaragd;
/*     */   }
/*     */   
/*  71 */   public void eEmerald(boolean eszmaragd) { this.enableSzmaragd = eszmaragd; }
/*     */   
/*     */   public boolean eIron()
/*     */   {
/*  75 */     return this.enableIron;
/*     */   }
/*     */   
/*  78 */   public void eIron(boolean eiron) { this.enableIron = eiron; }
/*     */   
/*     */   public boolean eGold()
/*     */   {
/*  82 */     return this.enableGold;
/*     */   }
/*     */   
/*  85 */   public void eGold(boolean egold) { this.enableGold = egold; }
/*     */   
/*     */   public boolean eCoal()
/*     */   {
/*  89 */     return this.enableCoal;
/*     */   }
/*     */   
/*  92 */   public void eCoal(boolean ecoal) { this.enableCoal = ecoal; }
/*     */   
/*     */   public boolean eRedstone()
/*     */   {
/*  96 */     return this.enableRedStone;
/*     */   }
/*     */   
/*  99 */   public void eRedstone(boolean eredstone) { this.enableRedStone = eredstone; }
/*     */   
/*     */   public boolean eTnt()
/*     */   {
/* 103 */     return this.enableTnT;
/*     */   }
/*     */   
/* 106 */   public void eTnt(boolean etnt) { this.enableTnT = etnt; }
/*     */   
/*     */ 
/*     */   public boolean eObs()
/*     */   {
/* 111 */     return this.enableObs;
/*     */   }
/*     */   
/*     */   public void eObs(boolean eobs) {
/* 115 */     this.enableObs = eobs;
/*     */   }
/*     */   
/*     */   public boolean ePerla()
/*     */   {
/* 120 */     return this.enablePerla;
/*     */   }
/*     */   
/*     */   public void ePerla(boolean eperla) {
/* 124 */     this.enablePerla = eperla;
/*     */   }
/*     */   
/*     */   public boolean eSlime()
/*     */   {
/* 129 */     return this.enableSlime;
/*     */   }
/*     */   
/*     */   public void eSlime(boolean esand) {
/* 133 */     this.enableSlime = esand;
/*     */   }
/*     */   
/*     */   public boolean eApple()
/*     */   {
/* 138 */     return this.enableApple;
/*     */   }
/*     */   
/*     */   public void eApple(boolean eapple) {
/* 142 */     this.enableApple = eapple;
/*     */   }
/*     */   
/*     */   public boolean eBooks()
/*     */   {
/* 147 */     return this.enableBookShelf;
/*     */   }
/*     */   
/*     */   public void eBooks(boolean ebooks) {
/* 151 */     this.enableBookShelf = ebooks;
/*     */   }
/*     */   
/*     */   public static User get(String user)
/*     */   {
/* 156 */     for (User u : Main.getInst().users) {
/* 157 */       if (u.getName().equalsIgnoreCase(user)) {
/* 158 */         return u;
/*     */       }
/*     */     }
/* 161 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\Patryk\Desktop\EZDROP.jar!\item\ezdrop\objects\User.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */