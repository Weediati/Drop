/*     */ package item.ezdrop.utils;
/*     */ 
/*     */ import item.ezdrop.data.Config;
import item.ezdrop.objects.User;

/*     */ import java.util.ArrayList;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.inventory.Inventory;
/*     */ import org.bukkit.inventory.InventoryView;
/*     */ import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
/*     */ 
/*     */ public class GuiUtil
/*     */ {
/*     */   public static InventoryView menudropu(Player p)
/*     */   {
/*  18 */     Config cfg = Config.getInst();
/*  19 */     User u = User.get(p.getName());
/*  20 */     Inventory inv = Bukkit.createInventory(null, 36, "§c§lDrop z kamienia");
/*     */     
/*  22 */     ItemStack is3 = new ItemStack(Material.ACACIA_STAIRS);
/*     */     
/*  24 */     ItemStack is4 = new ItemStack(Material.PAPER);
/*  25 */     ItemMeta im4 = is4.getItemMeta();
/*  26 */     im4.setDisplayName("§6Informacja:");
/*     */     
/*  28 */     ArrayList<String> info = new ArrayList<String>();
/*  29 */     info.add("§d§lTurbo§b§lDrop§7 mozna zakupic");
/*  30 */     info.add("§7W naszym sklepie na stronie serwera §c§l" + Config.getInst().linkTurboBuy);
/*  31 */     info.add("§d§lTurbo§b§lDrop§7 zwieksza szanse dropu o §3100%");
              info.add("§7Plugin wykonany przez §aWeediati §7dla §cEZSV.PL ");
/*  32 */     im4.setLore(info);
/*  33 */     is4.setItemMeta(im4);
/*  34 */     inv.setItem(34, is4);
/*     */     
/*  36 */     ItemStack on = new ItemStack(Material.WOOL, 1, (short)13);
/*  37 */     ItemMeta onn = on.getItemMeta();
/*  38 */     onn.setDisplayName("§aWlacz wszystkie dropy");
/*  39 */     on.setItemMeta(onn);
/*  40 */     inv.setItem(27, on);
/*     */     
/*  42 */     ItemStack off = new ItemStack(Material.WOOL, 1, (short)14);
/*  43 */     ItemMeta offf = off.getItemMeta();
/*  44 */     offf.setDisplayName("§cWylacz wszystkie dropy");
/*  45 */     off.setItemMeta(offf);
/*  46 */     inv.setItem(28, off);
/*     */     
/*  48 */     ItemStack disableDiamond = new ItemStack(Material.DIAMOND);
/*  49 */     ItemMeta disablediamond = is3.getItemMeta();
/*     */     
/*  51 */     ArrayList<String> lore = new ArrayList();
/*  52 */     lore.add("§4Nacisnij aby przelaczyc drop!");
/*  53 */     lore.add("§7Procent§8: §c" + cfg.dropDiamond + "%");
/*  54 */     lore.add("§7Fortuna I: §a+§7" + cfg.fortuneDrop1);
/*  55 */     lore.add("§7Fortuna II: §a+§7" + cfg.fortuneDrop2);
/*  56 */     lore.add("§7Fortuna III: §a+§7" + cfg.fortuneDrop3);
/*  57 */     lore.add("§7Drop§8:§c§l wylaczony");
/*  58 */     disablediamond.setLore(lore);
/*  59 */     disableDiamond.setItemMeta(disablediamond);
/*     */     
/*  61 */     ItemStack enableDiamond = new ItemStack(Material.DIAMOND);
/*  62 */     ItemMeta enablediamond = is3.getItemMeta();
/*     */     
/*  64 */     ArrayList<String> loree = new ArrayList();
/*  65 */     loree.add("§4Nacisnij aby przelaczyc drop!");
/*  66 */     loree.add("§7Procent§8: §c" + cfg.dropDiamond + "%");
/*  67 */     loree.add("§7Fortuna I: §a+§7" + cfg.fortuneDrop1);
/*  68 */     loree.add("§7Fortuna II: §a+§7" + cfg.fortuneDrop2);
/*  69 */     loree.add("§7Fortuna III: §a+§7" + cfg.fortuneDrop3);
/*  70 */     loree.add("§7Drop§8:§a§l wlaczony");
/*  71 */     enablediamond.setLore(loree);
/*  72 */     enableDiamond.setItemMeta(enablediamond);
/*  73 */     if (u.eDiamond()) {
/*  74 */       inv.setItem(0, enableDiamond);
/*     */     } else {
/*  76 */       inv.setItem(0, disableDiamond);
/*     */     }
/*     */     
/*  79 */     ItemStack disableEmerald = new ItemStack(Material.EMERALD);
/*  80 */     ItemMeta disableemerald = is3.getItemMeta();
/*     */     
/*  82 */     ArrayList<String> lore1 = new ArrayList();
/*  83 */     lore1.add("§4Nacisnij aby przelaczyc drop!");
/*  84 */     lore1.add("§7Procent§8: §c" + cfg.dropEmerald + "%");
/*  85 */     lore1.add("§7Fortuna I: §a+§7" + cfg.fortuneDrop1);
/*  86 */     lore1.add("§7Fortuna II: §a+§7" + cfg.fortuneDrop2);
/*  87 */     lore1.add("§7Fortuna III: §a+§7" + cfg.fortuneDrop3);
/*  88 */     lore1.add("§7Drop§8:§c§l wylaczony");
/*  89 */     disableemerald.setLore(lore1);
/*  90 */     disableEmerald.setItemMeta(disableemerald);
/*     */     
/*  92 */     ItemStack enableEmerald = new ItemStack(Material.EMERALD);
/*  93 */     ItemMeta enableemerald = is3.getItemMeta();
/*     */     
/*  95 */     ArrayList<String> loreee = new ArrayList();
/*  96 */     loreee.add("§4Nacisnij aby przelaczyc drop!");
/*  97 */     loreee.add("§7Procent§8: §c" + cfg.dropEmerald + "%");
/*  98 */     loreee.add("§7Fortuna I: §a+§7" + cfg.fortuneDrop1);
/*  99 */     loreee.add("§7Fortuna II: §a+§7" + cfg.fortuneDrop2);
/* 100 */     loreee.add("§7Fortuna III: §a+§7" + cfg.fortuneDrop3);
/* 101 */     loreee.add("§7Drop§8:§a§l wlaczony");
/* 102 */     enableemerald.setLore(loreee);
/* 103 */     enableEmerald.setItemMeta(enableemerald);
/* 104 */     if (u.eEmerald()) {
/* 105 */       inv.setItem(1, enableEmerald);
/*     */     } else {
/* 107 */       inv.setItem(1, disableEmerald);
/*     */     }
/*     */     
/* 110 */     ItemStack disableIron = new ItemStack(Material.IRON_INGOT);
/* 111 */     ItemMeta disableiron = is3.getItemMeta();
/*     */     
/* 113 */     ArrayList<String> lore2 = new ArrayList();
/* 114 */     lore2.add("§4Nacisnij aby przelaczyc drop!");
/* 115 */     lore2.add("§7Procent§8: §c" + cfg.dropIron + "%");
/* 116 */     lore2.add("§7Fortuna I: §a+§7" + cfg.fortuneDrop1);
/* 117 */     lore2.add("§7Fortuna II: §a+§7" + cfg.fortuneDrop2);
/* 118 */     lore2.add("§7Fortuna III: §a+§7" + cfg.fortuneDrop3);
/* 119 */     lore2.add("§7Drop§8:§c§l wylaczony");
/* 120 */     disableiron.setLore(lore2);
/* 121 */     disableIron.setItemMeta(disableiron);
/*     */     
/* 123 */     ItemStack enableIron = new ItemStack(Material.IRON_INGOT);
/* 124 */     ItemMeta enableiron = is3.getItemMeta();
/*     */     
/* 126 */     ArrayList<String> lore3 = new ArrayList();
/* 127 */     lore3.add("§4Nacisnij aby przelaczyc drop!");
/* 128 */     lore3.add("§7Procent§8: §c" + cfg.dropIron + "%");
/* 129 */     lore3.add("§7Fortuna I: §a+§7" + cfg.fortuneDrop1);
/* 130 */     lore3.add("§7Fortuna II: §a+§7" + cfg.fortuneDrop2);
/* 131 */     lore3.add("§7Fortuna III: §a+§7" + cfg.fortuneDrop3);
/* 132 */     lore3.add("§7Drop§8:§a§l wlaczony");
/* 133 */     enableiron.setLore(lore3);
/* 134 */     enableIron.setItemMeta(enableiron);
/* 135 */     if (u.eIron()) {
/* 136 */       inv.setItem(3, enableIron);
/*     */     } else {
/* 138 */       inv.setItem(3, disableIron);
/*     */     }
/*     */     
/* 141 */     ItemStack disableGold = new ItemStack(Material.GOLD_INGOT);
/* 142 */     ItemMeta disablegold = is3.getItemMeta();
/*     */     
/* 144 */     ArrayList<String> zloto = new ArrayList();
/* 145 */     zloto.add("§4Nacisnij aby przelaczyc drop!");
/* 146 */     zloto.add("§7Procent§8: §c" + cfg.dropGold + "%");
/* 147 */     zloto.add("§7Fortuna I: §a+§7" + cfg.fortuneDrop1);
/* 148 */     zloto.add("§7Fortuna II: §a+§7" + cfg.fortuneDrop2);
/* 149 */     zloto.add("§7Fortuna III: §a+§7" + cfg.fortuneDrop3);
/* 150 */     zloto.add("§7Drop§8:§c§l wylaczony");
/* 151 */     disablegold.setLore(zloto);
/* 152 */     disableGold.setItemMeta(disablegold);
/*     */     
/* 154 */     ItemStack enableGold = new ItemStack(Material.GOLD_INGOT);
/* 155 */     ItemMeta enablegold = is3.getItemMeta();
/*     */     
/* 157 */     ArrayList<String> zloto1 = new ArrayList();
/* 158 */     zloto1.add("§4Nacisnij aby przelaczyc drop!");
/* 159 */     zloto1.add("§7Procent§8: §c" + cfg.dropDiamond + "%");
/* 160 */     zloto1.add("§7Fortuna I: §a+§7" + cfg.fortuneDrop1);
/* 161 */     zloto1.add("§7Fortuna II: §a+§7" + cfg.fortuneDrop2);
/* 162 */     zloto1.add("§7Fortuna III: §a+§7" + cfg.fortuneDrop3);
/* 163 */     zloto1.add("§7Drop§8:§a§l wlaczony");
/* 164 */     enablegold.setLore(zloto1);
/* 165 */     enableGold.setItemMeta(enablegold);
/* 166 */     if (u.eGold()) {
/* 167 */       inv.setItem(2, enableGold);
/*     */     } else {
/* 169 */       inv.setItem(2, disableGold);
/*     */     }
/*     */     
/* 172 */     ItemStack disableTNT = new ItemStack(Material.TNT);
/* 173 */     ItemMeta disabletnt = is3.getItemMeta();
/*     */     
/* 175 */     ArrayList<String> lore8 = new ArrayList();
/* 176 */     lore8.add("§4Nacisnij aby przelaczyc drop!");
/* 177 */     lore8.add("§7Procent§8: §c" + cfg.dropTnT + "%");
/* 178 */     lore8.add("§7Fortuna I: §a+§7" + cfg.fortuneDrop1);
/* 179 */     lore8.add("§7Fortuna II: §a+§7" + cfg.fortuneDrop2);
/* 180 */     lore8.add("§7Fortuna III: §a+§7" + cfg.fortuneDrop3);
/* 181 */     lore8.add("§7Drop§8:§c§l wylaczony");
/* 182 */     disabletnt.setLore(lore8);
/* 183 */     disableTNT.setItemMeta(disabletnt);
/*     */     
/* 185 */     ItemStack enableGun = new ItemStack(Material.TNT);
/* 186 */     ItemMeta enablegun = is3.getItemMeta();
/*     */     
/* 188 */     ArrayList<String> lore9 = new ArrayList();
/* 189 */     lore9.add("§4Nacisnij aby przelaczyc drop!");
/* 190 */     lore9.add("§7Procent§8: §c" + cfg.dropTnT + "%");
/* 191 */     lore9.add("§7Fortuna I: §a+§7" + cfg.fortuneDrop1);
/* 192 */     lore9.add("§7Fortuna II: §a+§7" + cfg.fortuneDrop2);
/* 193 */     lore9.add("§7Fortuna III: §a+§7" + cfg.fortuneDrop3);
/* 194 */     lore9.add("§7Drop§8:§a§l wlaczony");
/* 195 */     enablegun.setLore(lore9);
/* 196 */     enableGun.setItemMeta(enablegun);
/* 197 */     if (u.eTnt()) {
/* 198 */       inv.setItem(4, enableGun);
/*     */     } else {
/* 200 */       inv.setItem(4, disableTNT);
/*     */     }
/*     */     
/* 203 */     ItemStack disableKwa = new ItemStack(Material.ENDER_PEARL);
/* 204 */     ItemMeta disablekwa = is3.getItemMeta();
/*     */     
/* 206 */     ArrayList<String> lore14 = new ArrayList();
/* 207 */     lore14.add("§4Nacisnij aby przelaczyc drop!");
/* 208 */     lore14.add("§7Procent§8: §c" + cfg.dropPearl + "%");
/* 209 */     lore14.add("§7Fortuna I: §a+§7" + cfg.fortuneDrop1);
/* 210 */     lore14.add("§7Fortuna II: §a+§7" + cfg.fortuneDrop2);
/* 211 */     lore14.add("§7Fortuna III: §a+§7" + cfg.fortuneDrop3);
/* 212 */     lore14.add("§7Drop§8:§c§l wylaczony");
/* 213 */     disablekwa.setLore(lore14);
/* 214 */     disableKwa.setItemMeta(disablekwa);
/*     */     
/* 216 */     ItemStack enableKwa = new ItemStack(Material.ENDER_PEARL);
/* 217 */     ItemMeta enablekwa = is3.getItemMeta();
/*     */     
/* 219 */     ArrayList<String> lore15 = new ArrayList();
/* 220 */     lore15.add("§4Nacisnij aby przelaczyc drop!");
/* 221 */     lore15.add("§7Procent§8: §c" + cfg.dropPearl + "%");
/* 222 */     lore15.add("§7Fortuna I: §a+§7" + cfg.fortuneDrop1);
/* 223 */     lore15.add("§7Fortuna II: §a+§7" + cfg.fortuneDrop2);
/* 224 */     lore15.add("§7Fortuna III: §a+§7" + cfg.fortuneDrop3);
/* 225 */     lore15.add("§7Drop§8:§a§l wlaczony");
/* 226 */     enablekwa.setLore(lore15);
/* 227 */     enableKwa.setItemMeta(enablekwa);
/* 228 */     if (u.ePerla()) {
/* 229 */       inv.setItem(5, enableKwa);
/*     */     } else {
/* 231 */       inv.setItem(5, disableKwa);
/*     */     }
/*     */     
/* 234 */     ItemStack disableCoal = new ItemStack(Material.COAL);
/* 235 */     ItemMeta disablecoal = is3.getItemMeta();
/*     */     
/* 237 */     ArrayList<String> lore4 = new ArrayList();
/* 238 */     lore4.add("§4Nacisnij aby przelaczyc drop!");
/* 239 */     lore4.add("§7Procent§8: §c" + cfg.dropCoal + "%");
/* 240 */     lore4.add("§7Fortuna I: §a+§7" + cfg.fortuneDrop1);
/* 241 */     lore4.add("§7Fortuna II: §a+§7" + cfg.fortuneDrop2);
/* 242 */     lore4.add("§7Fortuna III: §a+§7" + cfg.fortuneDrop3);
/* 243 */     lore4.add("§7Drop§8:§a§l wlaczony");
/* 244 */     disablecoal.setLore(lore4);
/* 245 */     disableCoal.setItemMeta(disablecoal);
/*     */     
/* 247 */     ItemStack enableCoal = new ItemStack(Material.COAL);
/* 248 */     ItemMeta enablecoal = is3.getItemMeta();
/*     */     
/* 250 */     ArrayList<String> lore5 = new ArrayList();
/* 251 */     lore5.add("§4Nacisnij aby przelaczyc drop!");
/* 252 */     lore5.add("§7Procent§8: §c" + cfg.dropCoal + "%");
/* 253 */     lore5.add("§7Fortuna I: §a+§7" + cfg.fortuneDrop1);
/* 254 */     lore5.add("§7Fortuna II: §a+§7" + cfg.fortuneDrop2);
/* 255 */     lore5.add("§7Fortuna III: §a+§7" + cfg.fortuneDrop3);
/* 256 */     lore5.add("§7Drop§8:§c§l wylaczony");
/* 257 */     enablecoal.setLore(lore5);
/* 258 */     enableCoal.setItemMeta(enablecoal);
/* 259 */     if (u.eCoal()) {
/* 260 */       inv.setItem(8, enableCoal);
/*     */     } else {
/* 262 */       inv.setItem(8, disableCoal);
/*     */     }
/*     */     
/* 265 */     ItemStack disableRedStone = new ItemStack(Material.REDSTONE);
/* 266 */     ItemMeta disableredstone = is3.getItemMeta();
/*     */     
/* 268 */     ArrayList<String> lore6 = new ArrayList();
/* 269 */     lore6.add("§4Nacisnij aby przelaczyc drop!");
/* 270 */     lore6.add("§7Procent§8: §c" + cfg.dropRedstone + "%");
/* 271 */     lore6.add("§7Fortuna I: §a+§7" + cfg.fortuneDrop1);
/* 272 */     lore6.add("§7Fortuna II: §a+§7" + cfg.fortuneDrop2);
/* 273 */     lore6.add("§7Fortuna III: §a+§7" + cfg.fortuneDrop3);
/* 274 */     lore6.add("§7Drop§8:§a§l wlaczony");
/* 275 */     disableredstone.setLore(lore6);
/* 276 */     disableRedStone.setItemMeta(disableredstone);
/*     */     
/* 278 */     ItemStack enableRedStone = new ItemStack(Material.REDSTONE);
/* 279 */     ItemMeta enableredstone = is3.getItemMeta();
/*     */     
/* 281 */     ArrayList<String> lore7 = new ArrayList();
/* 282 */     lore7.add("§4Nacisnij aby przelaczyc drop!");
/* 283 */     lore7.add("§7Procent§8: §c" + cfg.dropRedstone + "%");
/* 284 */     lore7.add("§7Fortuna I: §a+§7" + cfg.fortuneDrop1);
/* 285 */     lore7.add("§7Fortuna II: §a+§7" + cfg.fortuneDrop2);
/* 286 */     lore7.add("§7Fortuna III: §a+§7" + cfg.fortuneDrop3);
/* 287 */     lore7.add("§7Drop§8:§c§l wylaczony");
/* 288 */     enableredstone.setLore(lore7);
/* 289 */     enableRedStone.setItemMeta(enableredstone);
/* 290 */     if (u.eRedstone()) {
/* 291 */       inv.setItem(7, enableRedStone);
/*     */     } else {
/* 293 */       inv.setItem(7, disableRedStone);
/*     */     }
/*     */     
/* 296 */     ItemStack disablePer = new ItemStack(Material.OBSIDIAN);
/* 297 */     ItemMeta disableper = is3.getItemMeta();
/*     */     
/* 299 */     ArrayList<String> lore12 = new ArrayList();
/* 300 */     lore12.add("§4Nacisnij aby przelaczyc drop!");
/* 301 */     lore12.add("§7Procent§8: §c" + cfg.dropObs + "%");
/* 302 */     lore12.add("§7Fortuna I: §a+§7" + cfg.fortuneDrop1);
/* 303 */     lore12.add("§7Fortuna II: §a+§7" + cfg.fortuneDrop2);
/* 304 */     lore12.add("§7Fortuna III: §a+§7" + cfg.fortuneDrop3);
/* 305 */     lore12.add("§7Drop§8:§c§l wylaczony");
/* 306 */     disableper.setLore(lore12);
/* 307 */     disablePer.setItemMeta(disableper);
/*     */     
/* 309 */     ItemStack enablePer = new ItemStack(Material.OBSIDIAN);
/* 310 */     ItemMeta enableper = is3.getItemMeta();
/*     */     
/* 312 */     ArrayList<String> lore13 = new ArrayList();
/* 313 */     lore13.add("§4Nacisnij aby przelaczyc drop!");
/* 314 */     lore13.add("§7Procent§8: §c" + cfg.dropRedstone + "%");
/* 315 */     lore13.add("§7Fortuna I: §a+§7" + cfg.fortuneDrop1);
/* 316 */     lore13.add("§7Fortuna II: §a+§7" + cfg.fortuneDrop2);
/* 317 */     lore13.add("§7Fortuna III: §a+§7" + cfg.fortuneDrop3);
/* 318 */     lore13.add("§7Drop§8:§a§l wlaczony");
/* 319 */     enableper.setLore(lore13);
/* 320 */     enablePer.setItemMeta(enableper);
/* 321 */     if (u.eObs()) {
/* 322 */       inv.setItem(11, enablePer);
/*     */     } else {
/* 324 */       inv.setItem(11, disablePer);
/*     */     }
/*     */     
/* 327 */     ItemStack disableBook = new ItemStack(Material.BOOKSHELF);
/* 328 */     ItemMeta disablebook = is3.getItemMeta();
/*     */     
/* 330 */     ArrayList<String> lore16 = new ArrayList();
/* 331 */     lore16.add("§4Nacisnij aby przelaczyc drop!");
/* 332 */     lore16.add("§7Procent§8: §c" + cfg.dropBooks + "%");
/* 333 */     lore16.add("§7Fortuna I: §a+§7" + cfg.fortuneDrop1);
/* 334 */     lore16.add("§7Fortuna II: §a+§7" + cfg.fortuneDrop2);
/* 335 */     lore16.add("§7Fortuna III: §a+§7" + cfg.fortuneDrop3);
/* 336 */     lore16.add("§7Drop§8:§c§l wylaczony");
/* 337 */     disablebook.setLore(lore16);
/* 338 */     disableBook.setItemMeta(disablebook);
/*     */     
/* 340 */     ItemStack enableBook = new ItemStack(Material.BOOKSHELF);
/* 341 */     ItemMeta enablebook = is3.getItemMeta();
/*     */     
/* 343 */     ArrayList<String> lore17 = new ArrayList();
/* 344 */     lore17.add("§4Nacisnij aby przelaczyc drop!");
/* 345 */     lore17.add("§7Procent§8: §c" + cfg.dropBooks + "%");
/* 346 */     lore17.add("§7Fortuna I: §a+§7" + cfg.fortuneDrop1);
/* 347 */     lore17.add("§7Fortuna II: §a+§7" + cfg.fortuneDrop2);
/* 348 */     lore17.add("§7Fortuna III: §a+§7" + cfg.fortuneDrop3);
/* 349 */     lore17.add("§7Drop§8:§a§l wlaczony");
/* 350 */     enablebook.setLore(lore17);
/* 351 */     enableBook.setItemMeta(enablebook);
/* 352 */     if (u.eBooks()) {
/* 353 */       inv.setItem(9, enableBook);
/*     */     } else {
/* 355 */       inv.setItem(9, disableBook);
/*     */     }
/*     */     
/* 358 */     ItemStack disableApple = new ItemStack(Material.APPLE);
/* 359 */     ItemMeta disableapple = is3.getItemMeta();
/*     */     
/* 361 */     ArrayList<String> lore18 = new ArrayList();
/* 362 */     lore18.add("§4Nacisnij aby przelaczyc drop!");
/* 363 */     lore18.add("§7Procent§8: §c" + cfg.dropApple + "%");
/* 364 */     lore18.add("§7Fortuna I: §a+§7" + cfg.fortuneDrop1);
/* 365 */     lore18.add("§7Fortuna II: §a+§7" + cfg.fortuneDrop2);
/* 366 */     lore18.add("§7Fortuna III: §a+§7" + cfg.fortuneDrop3);
/* 367 */     lore18.add("§7Drop§8:§c§l wylaczony");
/* 368 */     disableapple.setLore(lore18);
/* 369 */     disableApple.setItemMeta(disableapple);
/*     */     
/* 371 */     ItemStack enableApple = new ItemStack(Material.APPLE);
/* 372 */     ItemMeta enableapple = is3.getItemMeta();
/*     */     
/* 374 */     ArrayList<String> lore19 = new ArrayList();
/* 375 */     lore19.add("§4Nacisnij aby przelaczyc drop!");
/* 376 */     lore19.add("§7Procent§8: §c" + cfg.dropApple + "%");
/* 377 */     lore19.add("§7Fortuna I: §a+§7" + cfg.fortuneDrop1);
/* 378 */     lore19.add("§7Fortuna II: §a+§7" + cfg.fortuneDrop2);
/* 379 */     lore19.add("§7Fortuna III: §a+§7" + cfg.fortuneDrop3);
/* 380 */     lore19.add("§7Drop§8:§a§l wlaczony");
/* 381 */     enableapple.setLore(lore19);
/* 382 */     enableApple.setItemMeta(enableapple);
/* 383 */     if (u.eApple()) {
/* 384 */       inv.setItem(10, enableApple);
/*     */     } else {
/* 386 */       inv.setItem(10, disableApple);
/*     */     }
/*     */     
/* 389 */     ItemStack disableSand = new ItemStack(Material.SLIME_BALL);
/* 390 */     ItemMeta disablesand = is3.getItemMeta();
/*     */     
/* 392 */     ArrayList<String> lore20 = new ArrayList();
/* 393 */     lore20.add("§4Nacisnij aby przelaczyc drop!");
/* 394 */     lore20.add("§7Procent§8: §c" + cfg.dropSlimeBall + "%");
/* 395 */     lore20.add("§7Fortuna I: §a+§7" + cfg.fortuneDrop1);
/* 396 */     lore20.add("§7Fortuna II: §a+§7" + cfg.fortuneDrop2);
/* 397 */     lore20.add("§7Fortuna III: §a+§7" + cfg.fortuneDrop3);
/* 398 */     lore20.add("§7Drop§8:§c§l wylaczony");
/* 399 */     disablesand.setLore(lore20);
/* 400 */     disableSand.setItemMeta(disablesand);
/*     */     
/* 402 */     ItemStack enableSand = new ItemStack(Material.SLIME_BALL);
/* 403 */     ItemMeta enablesand = is3.getItemMeta();
/*     */     
/* 405 */     ArrayList<String> lore21 = new ArrayList();
/* 406 */     lore21.add("§4Nacisnij aby przelaczyc drop!");
/* 407 */     lore21.add("§7Procent§8: §c" + cfg.dropSlimeBall + "%");
/* 408 */     lore21.add("§7Fortuna I: §a+§7" + cfg.fortuneDrop1);
/* 409 */     lore21.add("§7Fortuna II: §a+§7" + cfg.fortuneDrop2);
/* 410 */     lore21.add("§7Fortuna III: §a+§7" + cfg.fortuneDrop3);
/* 411 */     lore21.add("§7Drop§8:§a§l wlaczony");
/* 412 */     enablesand.setLore(lore21);
/* 413 */     enableSand.setItemMeta(enablesand);
/* 414 */     if (u.eSlime()) {
/* 415 */       inv.setItem(6, enableSand);
/*     */     } else {
/* 417 */       inv.setItem(6, disableSand);
/*     */     }
/*     */     
/* 420 */     ItemStack disableCobble = new ItemStack(Material.COBBLESTONE);
/* 421 */     ItemMeta dc = disableCobble.getItemMeta();
/* 422 */     dc.setDisplayName("§7Bruk");
/*     */     
/* 424 */     ArrayList<String> dcc = new ArrayList();
/* 425 */     dcc.add("§7Status: §aWlaczony");
/* 426 */     dcc.add("§2Nacisnij aby przelaczyc!");
/* 427 */     dc.setLore(dcc);
/* 428 */     disableCobble.setItemMeta(dc);
/*     */     
/* 430 */     ItemStack enableCobble = new ItemStack(Material.COBBLESTONE);
/* 431 */     ItemMeta dccc = enableCobble.getItemMeta();
/* 432 */     dccc.setDisplayName("§7Bruk");
/*     */     
/* 434 */     ArrayList<String> dcccc = new ArrayList();
/* 435 */     dcccc.add("§7Status: §cWylaczony");
/* 436 */     dcccc.add("§2Nacisnij aby przelaczyc!");
/* 437 */     dccc.setLore(dcccc);
/* 438 */     enableCobble.setItemMeta(dccc);
/* 439 */     if (u.getCobble()) {
/* 440 */       inv.setItem(35, disableCobble);
/*     */     } else {
/* 442 */       inv.setItem(35, enableCobble);
/*     */     }
/*     */     
/* 445 */     return p.openInventory(inv);
/*     */   }
/*     */ }