package item.ezdrop.listeners;
 
import item.ezdrop.data.Config;
import item.ezdrop.objects.User;
import item.ezdrop.utils.randomizeAmount;
import item.ezdrop.utils.recalculatePickaxe;
import java.util.HashMap;
import java.util.Map;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

 public class onBreakListener implements org.bukkit.event.Listener
 {
   private int amount = 1;
/*     */   
/*     */   @org.bukkit.event.EventHandler(priority=EventPriority.MONITOR)
/*     */   public void onBreak(BlockBreakEvent e)
/*     */   {
/*  28 */     User u = User.get(e.getPlayer().getName());
/*  29 */     Player p = e.getPlayer();
/*  30 */     if (!(p instanceof Player)) {
/*  31 */       return;
/*     */     }
/*  33 */     if (e.getBlock().getType() == Material.STONE)
/*     */     {
/*  35 */       if (e.isCancelled())
/*     */       {
/*  37 */         e.setCancelled(true);
/*  38 */         return;
/*     */       }
/*  40 */       if (p.getGameMode() == GameMode.SURVIVAL)
/*     */       {
/*     */ 
/*  43 */         e.getPlayer().getItemInHand().setDurability(e.getPlayer().getItemInHand().getDurability());
/*  44 */         recalculatePickaxe.recalculateDurability(e.getPlayer(), e.getPlayer().getItemInHand());
/*  45 */         e.getBlock().setType(Material.AIR);
/*  46 */         if (u.getCobble())
/*     */         {
/*  48 */           ItemStack is = new ItemStack(Material.COBBLESTONE);
/*  49 */           HashMap<Integer, ItemStack> not = p.getInventory().addItem(new ItemStack[] { is });
/*  50 */           if (!not.isEmpty()) {
/*  51 */             e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), is);
/*     */           }
/*     */         }
/*  54 */         if ((p.getItemInHand().getType() == Material.DIAMOND_PICKAXE) || (p.getItemInHand().getType() == Material.GOLD_PICKAXE) || (p.getItemInHand().getType() == Material.IRON_PICKAXE) || (p.getItemInHand().getType() == Material.STONE_PICKAXE) || (p.getItemInHand().getType() == Material.WOOD_PICKAXE))
/*     */         {
/*     */ 
/*  57 */           Config cfg = Config.getInst();
/*     */           
/*  59 */           Map<Enchantment, Integer> enchant = p.getItemInHand().getEnchantments();
/*  60 */           if (enchant.containsKey(Enchantment.LOOT_BONUS_BLOCKS))
/*     */           {
/*  62 */             if (p.getItemInHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 1) {
/*  63 */               this.amount = randomizeAmount.randomAmount(Config.getInst().fortuneDrop1);
/*  64 */               e.getPlayer().giveExp(Config.getInst().dropEXP);
/*     */             }
/*  66 */             if (p.getItemInHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 2) {
/*  67 */               this.amount = randomizeAmount.randomAmount(Config.getInst().fortuneDrop2);
/*  68 */               e.getPlayer().giveExp(Config.getInst().dropEXP);
/*     */             }
/*  70 */             if (p.getItemInHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 3) {
/*  71 */               this.amount = randomizeAmount.randomAmount(Config.getInst().fortuneDrop3);
/*  72 */               e.getPlayer().giveExp(Config.getInst().dropEXP);
/*     */             }
/*  74 */             e.getPlayer().giveExp(Config.getInst().dropEXP);
/*  75 */             if (getChance.getChance(cfg.dropRedstone + cfg.TurboaddToDrop))
/*     */             {
/*  77 */               e.getPlayer().getItemInHand().setDurability(e.getPlayer().getItemInHand().getDurability());
/*  78 */               recalculatePickaxe.recalculateDurability(e.getPlayer(), e.getPlayer().getItemInHand());
/*  79 */               e.getBlock().setType(Material.AIR);
/*  80 */               if (u.eRedstone())
/*     */               {
/*  82 */                 ItemStack is = new ItemStack(Material.REDSTONE);
/*  83 */                 is.setAmount(this.amount);
/*  84 */                 HashMap<Integer, ItemStack> not = p.getInventory().addItem(new ItemStack[] { is });
/*  85 */                 if (!not.isEmpty()) {
/*  86 */                   e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), is);
/*     */                 }
/*     */               }
/*     */             }
/*  90 */             if (getChance.getChance(cfg.dropCoal + cfg.TurboaddToDrop))
/*     */             {
/*  92 */               e.getPlayer().getItemInHand().setDurability(e.getPlayer().getItemInHand().getDurability());
/*  93 */               recalculatePickaxe.recalculateDurability(e.getPlayer(), e.getPlayer().getItemInHand());
/*  94 */               e.getBlock().setType(Material.AIR);
/*  95 */               if (u.eCoal())
/*     */               {
/*  97 */                 ItemStack is = new ItemStack(Material.COAL);
/*  98 */                 is.setAmount(this.amount);
/*  99 */                 HashMap<Integer, ItemStack> not = p.getInventory().addItem(new ItemStack[] { is });
/* 100 */                 if (!not.isEmpty()) {
/* 101 */                   e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), is);
/*     */                 }
/*     */               }
/*     */             }
/* 105 */             if (getChance.getChance(cfg.dropGold + cfg.TurboaddToDrop))
/*     */             {
/* 107 */               e.getPlayer().getItemInHand().setDurability(e.getPlayer().getItemInHand().getDurability());
/* 108 */               recalculatePickaxe.recalculateDurability(e.getPlayer(), e.getPlayer().getItemInHand());
/* 109 */               e.getBlock().setType(Material.AIR);
/* 110 */               if (u.eGold())
/*     */               {
/* 112 */                 ItemStack is = new ItemStack(Material.GOLD_INGOT);
/* 113 */                 is.setAmount(this.amount);
/* 114 */                 HashMap<Integer, ItemStack> not = p.getInventory().addItem(new ItemStack[] { is });
/* 115 */                 if (!not.isEmpty()) {
/* 116 */                   e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), is);
/*     */                 }
/*     */               }
/*     */             }
/* 120 */             if (getChance.getChance(cfg.dropSlimeBall + cfg.TurboaddToDrop))
/*     */             {
/* 122 */               e.getPlayer().getItemInHand().setDurability(e.getPlayer().getItemInHand().getDurability());
/* 123 */               recalculatePickaxe.recalculateDurability(e.getPlayer(), e.getPlayer().getItemInHand());
/* 124 */               e.getBlock().setType(Material.AIR);
/* 125 */               if (u.eSlime())
/*     */               {
/* 127 */                 ItemStack is = new ItemStack(Material.SLIME_BALL);
/* 128 */                 is.setAmount(this.amount);
/* 129 */                 HashMap<Integer, ItemStack> not = p.getInventory().addItem(new ItemStack[] { is });
/* 130 */                 if (!not.isEmpty()) {
/* 131 */                   e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), is);
/*     */                 }
/*     */               }
/*     */             }
/* 135 */             if (getChance.getChance(cfg.dropIron + cfg.TurboaddToDrop))
/*     */             {
/* 137 */               e.getPlayer().getItemInHand().setDurability(e.getPlayer().getItemInHand().getDurability());
/* 138 */               recalculatePickaxe.recalculateDurability(e.getPlayer(), e.getPlayer().getItemInHand());
/* 139 */               e.getBlock().setType(Material.AIR);
/* 140 */               if (u.eIron())
/*     */               {
/* 142 */                 ItemStack is = new ItemStack(Material.IRON_INGOT);
/* 143 */                 is.setAmount(this.amount);
/* 144 */                 HashMap<Integer, ItemStack> not = p.getInventory().addItem(new ItemStack[] { is });
/* 145 */                 if (!not.isEmpty()) {
/* 146 */                   e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), is);
/*     */                 }
/*     */               }
/*     */             }
/* 150 */             if (getChance.getChance(cfg.dropEmerald + cfg.TurboaddToDrop))
/*     */             {
/* 152 */               e.getPlayer().getItemInHand().setDurability(e.getPlayer().getItemInHand().getDurability());
/* 153 */               recalculatePickaxe.recalculateDurability(e.getPlayer(), e.getPlayer().getItemInHand());
/* 154 */               e.getBlock().setType(Material.AIR);
/* 155 */               if (u.eEmerald())
/*     */               {
/* 157 */                 ItemStack is = new ItemStack(Material.EMERALD);
/* 158 */                 is.setAmount(this.amount);
/* 159 */                 HashMap<Integer, ItemStack> not = p.getInventory().addItem(new ItemStack[] { is });
/* 160 */                 if (!not.isEmpty()) {
/* 161 */                   e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), is);
/*     */                 }
/*     */               }
/*     */             }
/* 165 */             if (getChance.getChance(cfg.dropDiamond + cfg.TurboaddToDrop))
/*     */             {
/* 167 */               e.getPlayer().getItemInHand().setDurability(e.getPlayer().getItemInHand().getDurability());
/* 168 */               recalculatePickaxe.recalculateDurability(e.getPlayer(), e.getPlayer().getItemInHand());
/* 169 */               e.getBlock().setType(Material.AIR);
/* 170 */               if (u.eDiamond())
/*     */               {
/* 172 */                 ItemStack is = new ItemStack(Material.DIAMOND);
/* 173 */                 is.setAmount(this.amount);
/* 174 */                 HashMap<Integer, ItemStack> not = p.getInventory().addItem(new ItemStack[] { is });
/* 175 */                 if (!not.isEmpty()) {
/* 176 */                   e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), is);
/*     */                 }
/*     */               }
/*     */             }
/* 180 */             if (getChance.getChance(cfg.dropObs + cfg.TurboaddToDrop))
/*     */             {
/* 182 */               e.getPlayer().getItemInHand().setDurability(e.getPlayer().getItemInHand().getDurability());
/* 183 */               recalculatePickaxe.recalculateDurability(e.getPlayer(), e.getPlayer().getItemInHand());
/* 184 */               e.getBlock().setType(Material.AIR);
/* 185 */               if (u.eObs())
/*     */               {
/* 187 */                 ItemStack is = new ItemStack(Material.OBSIDIAN);
/* 188 */                 is.setAmount(this.amount);
/* 189 */                 HashMap<Integer, ItemStack> not = p.getInventory().addItem(new ItemStack[] { is });
/* 190 */                 if (!not.isEmpty()) {
/* 191 */                   e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), is);
/*     */                 }
/*     */               }
/*     */             }
/* 195 */             if (getChance.getChance(cfg.dropApple + cfg.TurboaddToDrop))
/*     */             {
/* 197 */               e.getPlayer().getItemInHand().setDurability(e.getPlayer().getItemInHand().getDurability());
/* 198 */               recalculatePickaxe.recalculateDurability(e.getPlayer(), e.getPlayer().getItemInHand());
/* 199 */               e.getBlock().setType(Material.AIR);
/* 200 */               if (u.eApple())
/*     */               {
/* 202 */                 ItemStack is = new ItemStack(Material.APPLE);
/* 203 */                 is.setAmount(this.amount);
/* 204 */                 HashMap<Integer, ItemStack> not = p.getInventory().addItem(new ItemStack[] { is });
/* 205 */                 if (!not.isEmpty()) {
/* 206 */                   e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), is);
/*     */                 }
/*     */               }
/*     */             }
/* 210 */             if (getChance.getChance(cfg.dropPearl + cfg.TurboaddToDrop))
/*     */             {
/* 212 */               e.getPlayer().getItemInHand().setDurability(e.getPlayer().getItemInHand().getDurability());
/* 213 */               recalculatePickaxe.recalculateDurability(e.getPlayer(), e.getPlayer().getItemInHand());
/* 214 */               e.getBlock().setType(Material.AIR);
/* 215 */               if (u.ePerla())
/*     */               {
/* 217 */                 ItemStack is = new ItemStack(Material.ENDER_PEARL);
/* 218 */                 is.setAmount(this.amount);
/* 219 */                 HashMap<Integer, ItemStack> not = p.getInventory().addItem(new ItemStack[] { is });
/* 220 */                 if (!not.isEmpty()) {
/* 221 */                   e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), is);
/*     */                 }
/*     */               }
/*     */             }
/* 225 */             if (getChance.getChance(cfg.dropBooks + cfg.TurboaddToDrop))
/*     */             {
/* 227 */               e.getPlayer().getItemInHand().setDurability(e.getPlayer().getItemInHand().getDurability());
/* 228 */               recalculatePickaxe.recalculateDurability(e.getPlayer(), e.getPlayer().getItemInHand());
/* 229 */               e.getBlock().setType(Material.AIR);
/* 230 */               if (u.eBooks())
/*     */               {
/* 232 */                 ItemStack is = new ItemStack(Material.BOOKSHELF);
/* 233 */                 is.setAmount(this.amount);
/* 234 */                 HashMap<Integer, ItemStack> not = p.getInventory().addItem(new ItemStack[] { is });
/* 235 */                 if (!not.isEmpty()) {
/* 236 */                   e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), is);
/*     */                 }
/*     */               }
/*     */             }
/* 240 */             if (getChance.getChance(cfg.dropTnT + cfg.TurboaddToDrop))
/*     */             {
/* 242 */               e.getPlayer().getItemInHand().setDurability(e.getPlayer().getItemInHand().getDurability());
/* 243 */               recalculatePickaxe.recalculateDurability(e.getPlayer(), e.getPlayer().getItemInHand());
/* 244 */               e.getBlock().setType(Material.AIR);
/* 245 */               if (u.eTnt())
/*     */               {
/* 247 */                 ItemStack is = new ItemStack(Material.TNT);
/* 248 */                 is.setAmount(this.amount);
/* 249 */                 HashMap<Integer, ItemStack> not = p.getInventory().addItem(new ItemStack[] { is });
/* 250 */                 if (!not.isEmpty()) {
/* 251 */                   e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), is);
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */           else
/*     */           {
/* 258 */             e.getPlayer().giveExp(Config.getInst().dropEXP);
/* 259 */             if (getChance.getChance(cfg.dropRedstone))
/*     */             {
/* 261 */               e.getPlayer().getItemInHand().setDurability(e.getPlayer().getItemInHand().getDurability());
/* 262 */               recalculatePickaxe.recalculateDurability(e.getPlayer(), e.getPlayer().getItemInHand());
/* 263 */               e.getBlock().setType(Material.AIR);
/* 264 */               if (u.eRedstone())
/*     */               {
/*     */ 
/* 267 */                 ItemStack is = new ItemStack(Material.REDSTONE);
/* 268 */                 is.setAmount(this.amount);
/* 269 */                 HashMap<Integer, ItemStack> not = p.getInventory().addItem(new ItemStack[] { is });
/* 270 */                 if (!not.isEmpty()) {
/* 271 */                   e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), is);
/*     */                 }
/*     */               }
/*     */             }
/* 275 */             if (getChance.getChance(cfg.dropCoal))
/*     */             {
/* 277 */               e.getPlayer().getItemInHand().setDurability(e.getPlayer().getItemInHand().getDurability());
/* 278 */               recalculatePickaxe.recalculateDurability(e.getPlayer(), e.getPlayer().getItemInHand());
/* 279 */               e.getBlock().setType(Material.AIR);
/* 280 */               if (u.eCoal())
/*     */               {
/* 282 */                 ItemStack is = new ItemStack(Material.COAL);
/* 283 */                 is.setAmount(this.amount);
/* 284 */                 HashMap<Integer, ItemStack> not = p.getInventory().addItem(new ItemStack[] { is });
/* 285 */                 if (!not.isEmpty()) {
/* 286 */                   e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), is);
/*     */                 }
/*     */               }
/*     */             }
/* 290 */             if (getChance.getChance(cfg.dropGold))
/*     */             {
/* 292 */               e.getPlayer().getItemInHand().setDurability(e.getPlayer().getItemInHand().getDurability());
/* 293 */               recalculatePickaxe.recalculateDurability(e.getPlayer(), e.getPlayer().getItemInHand());
/* 294 */               e.getBlock().setType(Material.AIR);
/* 295 */               if (u.eGold())
/*     */               {
/* 297 */                 ItemStack is = new ItemStack(Material.GOLD_INGOT);
/* 298 */                 is.setAmount(this.amount);
/* 299 */                 HashMap<Integer, ItemStack> not = p.getInventory().addItem(new ItemStack[] { is });
/* 300 */                 if (!not.isEmpty()) {
/* 301 */                   e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), is);
/*     */                 }
/*     */               }
/*     */             }
/* 305 */             if (getChance.getChance(cfg.dropSlimeBall))
/*     */             {
/* 307 */               e.getPlayer().getItemInHand().setDurability(e.getPlayer().getItemInHand().getDurability());
/* 308 */               recalculatePickaxe.recalculateDurability(e.getPlayer(), e.getPlayer().getItemInHand());
/* 309 */               e.getBlock().setType(Material.AIR);
/* 310 */               if (u.eSlime())
/*     */               {
/* 312 */                 ItemStack is = new ItemStack(Material.SLIME_BALL);
/* 313 */                 is.setAmount(this.amount);
/* 314 */                 HashMap<Integer, ItemStack> not = p.getInventory().addItem(new ItemStack[] { is });
/* 315 */                 if (!not.isEmpty()) {
/* 316 */                   e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), is);
/*     */                 }
/*     */               }
/*     */             }
/* 320 */             if (getChance.getChance(cfg.dropIron))
/*     */             {
/* 322 */               e.getPlayer().getItemInHand().setDurability(e.getPlayer().getItemInHand().getDurability());
/* 323 */               recalculatePickaxe.recalculateDurability(e.getPlayer(), e.getPlayer().getItemInHand());
/* 324 */               e.getBlock().setType(Material.AIR);
/* 325 */               if (u.eIron())
/*     */               {
/* 327 */                 ItemStack is = new ItemStack(Material.IRON_INGOT);
/* 328 */                 is.setAmount(this.amount);
/* 329 */                 HashMap<Integer, ItemStack> not = p.getInventory().addItem(new ItemStack[] { is });
/* 330 */                 if (!not.isEmpty()) {
/* 331 */                   e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), is);
/*     */                 }
/*     */               }
/*     */             }
/* 335 */             if (getChance.getChance(cfg.dropEmerald))
/*     */             {
/* 337 */               e.getPlayer().getItemInHand().setDurability(e.getPlayer().getItemInHand().getDurability());
/* 338 */               recalculatePickaxe.recalculateDurability(e.getPlayer(), e.getPlayer().getItemInHand());
/* 339 */               e.getBlock().setType(Material.AIR);
/* 340 */               if (u.eEmerald())
/*     */               {
/* 342 */                 ItemStack is = new ItemStack(Material.EMERALD);
/* 343 */                 is.setAmount(this.amount);
/* 344 */                 HashMap<Integer, ItemStack> not = p.getInventory().addItem(new ItemStack[] { is });
/* 345 */                 if (!not.isEmpty()) {
/* 346 */                   e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), is);
/*     */                 }
/*     */               }
/*     */             }
/* 350 */             if (getChance.getChance(cfg.dropDiamond))
/*     */             {
/* 352 */               e.getPlayer().getItemInHand().setDurability(e.getPlayer().getItemInHand().getDurability());
/* 353 */               recalculatePickaxe.recalculateDurability(e.getPlayer(), e.getPlayer().getItemInHand());
/* 354 */               e.getBlock().setType(Material.AIR);
/* 355 */               if (u.eDiamond())
/*     */               {
/* 357 */                 ItemStack is = new ItemStack(Material.DIAMOND);
/* 358 */                 is.setAmount(this.amount);
/* 359 */                 HashMap<Integer, ItemStack> not = p.getInventory().addItem(new ItemStack[] { is });
/* 360 */                 if (!not.isEmpty()) {
/* 361 */                   e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), is);
/*     */                 }
/*     */               }
/*     */             }
/* 365 */             if (getChance.getChance(cfg.dropObs))
/*     */             {
/* 367 */               e.getPlayer().getItemInHand().setDurability(e.getPlayer().getItemInHand().getDurability());
/* 368 */               recalculatePickaxe.recalculateDurability(e.getPlayer(), e.getPlayer().getItemInHand());
/* 369 */               e.getBlock().setType(Material.AIR);
/* 370 */               if (u.eObs())
/*     */               {
/* 372 */                 ItemStack is = new ItemStack(Material.OBSIDIAN);
/* 373 */                 is.setAmount(this.amount);
/* 374 */                 HashMap<Integer, ItemStack> not = p.getInventory().addItem(new ItemStack[] { is });
/* 375 */                 if (!not.isEmpty()) {
/* 376 */                   e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), is);
/*     */                 }
/*     */               }
/*     */             }
/* 380 */             if (getChance.getChance(cfg.dropApple))
/*     */             {
/* 382 */               e.getPlayer().getItemInHand().setDurability(e.getPlayer().getItemInHand().getDurability());
/* 383 */               recalculatePickaxe.recalculateDurability(e.getPlayer(), e.getPlayer().getItemInHand());
/* 384 */               e.getBlock().setType(Material.AIR);
/* 385 */               if (u.eApple())
/*     */               {
/* 387 */                 ItemStack is = new ItemStack(Material.APPLE);
/* 388 */                 is.setAmount(this.amount);
/* 389 */                 HashMap<Integer, ItemStack> not = p.getInventory().addItem(new ItemStack[] { is });
/* 390 */                 if (!not.isEmpty()) {
/* 391 */                   e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), is);
/*     */                 }
/*     */               }
/*     */             }
/* 395 */             if (getChance.getChance(cfg.dropPearl))
/*     */             {
/* 397 */               e.getPlayer().getItemInHand().setDurability(e.getPlayer().getItemInHand().getDurability());
/* 398 */               recalculatePickaxe.recalculateDurability(e.getPlayer(), e.getPlayer().getItemInHand());
/* 399 */               e.getBlock().setType(Material.AIR);
/* 400 */               if (u.ePerla())
/*     */               {
/* 402 */                 ItemStack is = new ItemStack(Material.ENDER_PEARL);
/* 403 */                 is.setAmount(this.amount);
/* 404 */                 HashMap<Integer, ItemStack> not = p.getInventory().addItem(new ItemStack[] { is });
/* 405 */                 if (!not.isEmpty()) {
/* 406 */                   e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), is);
/*     */                 }
/*     */               }
/*     */             }
/* 410 */             if (getChance.getChance(cfg.dropBooks))
/*     */             {
/* 412 */               e.getPlayer().getItemInHand().setDurability(e.getPlayer().getItemInHand().getDurability());
/* 413 */               recalculatePickaxe.recalculateDurability(e.getPlayer(), e.getPlayer().getItemInHand());
/* 414 */               e.getBlock().setType(Material.AIR);
/* 415 */               if (u.eBooks())
/*     */               {
/* 417 */                 ItemStack is = new ItemStack(Material.BOOKSHELF);
/* 418 */                 is.setAmount(this.amount);
/* 419 */                 HashMap<Integer, ItemStack> not = p.getInventory().addItem(new ItemStack[] { is });
/* 420 */                 if (!not.isEmpty()) {
/* 421 */                   e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), is);
/*     */                 }
/*     */               }
/*     */             }
/* 425 */             if (getChance.getChance(cfg.dropTnT))
/*     */             {
/* 427 */               e.getPlayer().getItemInHand().setDurability(e.getPlayer().getItemInHand().getDurability());
/* 428 */               recalculatePickaxe.recalculateDurability(e.getPlayer(), e.getPlayer().getItemInHand());
/* 429 */               e.getBlock().setType(Material.AIR);
/* 430 */               if (u.eTnt())
/*     */               {
/* 432 */                 ItemStack is = new ItemStack(Material.TNT);
/* 433 */                 is.setAmount(this.amount);
/* 434 */                 HashMap<Integer, ItemStack> not = p.getInventory().addItem(new ItemStack[] { is });
/* 435 */                 if (!not.isEmpty()) {
/* 436 */                   e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), is);
/*     */                 }
/*     */                 
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 445 */     else if (e.getBlock().getType() == Material.OBSIDIAN)
/*     */     {
/* 447 */       e.getPlayer().giveExp(Config.getInst().dropOEXP);
/*     */ 
/*     */     }
/* 450 */     else if (e.getBlock().getType() == Material.DIAMOND_ORE)
/*     */     {
/* 452 */       e.getBlock().setType(Material.AIR);
/*     */     }
/* 454 */     else if (e.getBlock().getType() == Material.IRON_ORE)
/*     */     {
/* 456 */       e.getBlock().setType(Material.AIR);
/*     */     }
/* 458 */     else if (e.getBlock().getType() == Material.GOLD_ORE)
/*     */     {
/* 460 */       e.getBlock().setType(Material.AIR);
/*     */     }
/* 462 */     else if (e.getBlock().getType() == Material.REDSTONE_ORE) {
/* 463 */       e.getBlock().setType(Material.AIR);
/*     */     }
/* 465 */     else if (e.getBlock().getType() == Material.COAL_ORE) {
/* 466 */       e.getBlock().setType(Material.AIR);
/*     */     }
/* 468 */     else if (e.getBlock().getType() == Material.EMERALD_ORE)
/*     */     {
/* 470 */       e.getBlock().setType(Material.AIR);
/*     */     }
/* 472 */     p.updateInventory();
/*     */   }
/*     */ }


/* Location:              C:\Users\Patryk\Desktop\ParDragonDropPL.jar!\item\dragondrop\listeners\onBreakListener.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */