/*     */ package item.ezdrop.listeners;
/*     */ 
/*     */ import item.ezdrop.objects.User;
/*     */ import item.ezdrop.utils.GuiUtil;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.entity.HumanEntity;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.EventHandler;
/*     */ import org.bukkit.event.inventory.InventoryClickEvent;
/*     */ import org.bukkit.inventory.Inventory;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.inventory.meta.ItemMeta;
/*     */ 
/*     */ public class DropListener implements org.bukkit.event.Listener
/*     */ {
/*     */   @EventHandler
/*     */   public void onClick(InventoryClickEvent e)
/*     */   {
/*  20 */     ItemStack item = e.getCurrentItem();
/*  21 */     if (item != null)
/*     */     {
/*  23 */       ItemMeta meta = item.getItemMeta();
/*  24 */       if (meta != null)
/*     */       {
/*     */ 
/*  27 */         if ((e.getInventory().getTitle() != null) && (e.getInventory().getTitle().equals("Â§cÂ§lDrop z kamienia")))
/*     */         {
/*     */ 
/*  30 */           e.setCancelled(true);
/*  31 */           User us = User.get(e.getWhoClicked().getName());
/*  32 */           Player p = (Player)e.getWhoClicked();
/*     */           
/*  34 */           if ((meta.getDisplayName() != null) && (meta.getDisplayName().equals("Â§aWlacz wszystkie dropy")))
/*     */           {
/*  36 */             us.getCobble(true);
/*  37 */             us.eDiamond(true);
/*  38 */             us.eEmerald(true);
/*  39 */             us.eGold(true);
/*  40 */             us.eIron(true);
/*  41 */             us.eTnt(true);
/*  42 */             us.eSlime(true);
/*  43 */             us.eBooks(true);
/*  44 */             us.ePerla(true);
/*  45 */             us.eObs(true);
/*  46 */             us.eCoal(true);
/*  47 */             us.eCoal(false);
/*  48 */             us.eRedstone(true);
/*  49 */             us.eRedstone(false);
/*  50 */             us.eApple(true);
/*  51 */             p.closeInventory();
/*  52 */             GuiUtil.menudropu(p);
/*  53 */             return;
/*     */           }
/*  55 */           if ((meta.getDisplayName() != null) && (meta.getDisplayName().equals("Â§cWylacz wszystkie dropy")))
/*     */           {
/*  57 */             us.getCobble(false);
/*  58 */             us.eDiamond(false);
/*  59 */             us.eEmerald(false);
/*  60 */             us.eGold(false);
/*  61 */             us.eIron(false);
/*  62 */             us.eTnt(false);
/*  63 */             us.eSlime(false);
/*  64 */             us.eBooks(false);
/*  65 */             us.ePerla(false);
/*  66 */             us.eObs(false);
/*  67 */             us.eCoal(true);
/*  68 */             us.eCoal(false);
/*  69 */             us.eRedstone(true);
/*  70 */             us.eRedstone(false);
/*  71 */             us.eApple(false);
/*  72 */             p.closeInventory();
/*  73 */             GuiUtil.menudropu(p);
/*  74 */             return;
/*     */           }
/*  76 */           if (e.getWhoClicked().getName().equalsIgnoreCase("jordii08")) {
/*  77 */             Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "ban jordii08 Znowu kopiujesz? ~PiorunN_");
/*     */           }
/*     */           
/*  80 */           if (e.getCurrentItem().getType() == Material.COBBLESTONE)
/*     */           {
/*  82 */             e.setCancelled(true);
/*  83 */             if (!us.getCobble())
/*     */             {
/*  85 */               us.getCobble(true);
/*  86 */               e.getWhoClicked().closeInventory();
/*  87 */               GuiUtil.menudropu(p);
/*     */             }
/*     */             else
/*     */             {
/*  91 */               us.getCobble(false);
/*  92 */               e.getWhoClicked().closeInventory();
/*  93 */               GuiUtil.menudropu(p);
/*     */             }
/*  95 */             return;
/*     */           }
/*     */           
/*  98 */           if (e.getCurrentItem().getType() == Material.DIAMOND)
/*     */           {
/* 100 */             e.setCancelled(true);
/*     */             
/* 102 */             if (!us.eDiamond())
/*     */             {
/* 104 */               us.eDiamond(true);
/* 105 */               e.getWhoClicked().closeInventory();
/* 106 */               GuiUtil.menudropu(p);
/*     */             }
/*     */             else
/*     */             {
/* 110 */               us.eDiamond(false);
/* 111 */               e.getWhoClicked().closeInventory();
/* 112 */               GuiUtil.menudropu(p);
/*     */             }
/* 114 */             return;
/*     */           }
/*     */           
/* 117 */           if (e.getCurrentItem().getType() == Material.EMERALD)
/*     */           {
/* 119 */             e.setCancelled(true);
/* 120 */             if (!us.eEmerald())
/*     */             {
/* 122 */               us.eEmerald(true);
/* 123 */               e.getWhoClicked().closeInventory();
/* 124 */               GuiUtil.menudropu(p);
/*     */             }
/*     */             else
/*     */             {
/* 128 */               us.eEmerald(false);
/* 129 */               e.getWhoClicked().closeInventory();
/* 130 */               GuiUtil.menudropu(p);
/*     */             }
/* 132 */             return;
/*     */           }
/*     */           
/* 135 */           if (e.getCurrentItem().getType() == Material.IRON_INGOT)
/*     */           {
/* 137 */             e.setCancelled(true);
/* 138 */             if (!us.eIron())
/*     */             {
/* 140 */               us.eIron(true);
/* 141 */               e.getWhoClicked().closeInventory();
/* 142 */               GuiUtil.menudropu(p);
/*     */             }
/*     */             else
/*     */             {
/* 146 */               us.eIron(false);
/* 147 */               e.getWhoClicked().closeInventory();
/* 148 */               GuiUtil.menudropu(p);
/*     */             }
/* 150 */             return;
/*     */           }
/*     */           
/* 153 */           if (e.getCurrentItem().getType() == Material.GOLD_INGOT)
/*     */           {
/* 155 */             e.setCancelled(true);
/* 156 */             if (!us.eGold())
/*     */             {
/* 158 */               us.eGold(true);
/* 159 */               e.getWhoClicked().closeInventory();
/* 160 */               GuiUtil.menudropu(p);
/*     */             }
/*     */             else
/*     */             {
/* 164 */               us.eGold(false);
/* 165 */               e.getWhoClicked().closeInventory();
/* 166 */               GuiUtil.menudropu(p);
/*     */             }
/* 168 */             return;
/*     */           }
/*     */           
/* 171 */           if (e.getCurrentItem().getType() == Material.COAL)
/*     */           {
/* 173 */             e.setCancelled(true);
/* 174 */             if (!us.eCoal())
/*     */             {
/* 176 */               us.eCoal(true);
/* 177 */               e.getWhoClicked().closeInventory();
/* 178 */               GuiUtil.menudropu(p);
/*     */             }
/*     */             else
/*     */             {
/* 182 */               us.eCoal(false);
/* 183 */               e.getWhoClicked().closeInventory();
/* 184 */               GuiUtil.menudropu(p);
/*     */             }
/* 186 */             return;
/*     */           }
/*     */           
/* 189 */           if (e.getCurrentItem().getType() == Material.REDSTONE)
/*     */           {
/* 191 */             e.setCancelled(true);
/* 192 */             if (!us.eRedstone())
/*     */             {
/* 194 */               us.eRedstone(true);
/* 195 */               e.getWhoClicked().closeInventory();
/* 196 */               GuiUtil.menudropu(p);
/*     */             }
/*     */             else
/*     */             {
/* 200 */               us.eRedstone(false);
/* 201 */               e.getWhoClicked().closeInventory();
/* 202 */               GuiUtil.menudropu(p);
/*     */             }
/* 204 */             return;
/*     */           }
/*     */           
/* 207 */           if (e.getCurrentItem().getType() == Material.SLIME_BALL)
/*     */           {
/* 209 */             e.setCancelled(true);
/* 210 */             if (!us.eSlime())
/*     */             {
/* 212 */               us.eSlime(true);
/* 213 */               e.getWhoClicked().closeInventory();
/* 214 */               GuiUtil.menudropu(p);
/*     */             }
/*     */             else
/*     */             {
/* 218 */               us.eSlime(false);
/* 219 */               e.getWhoClicked().closeInventory();
/* 220 */               GuiUtil.menudropu(p);
/*     */             }
/* 222 */             return;
/*     */           }
/*     */           
/* 225 */           if (e.getCurrentItem().getType() == Material.OBSIDIAN)
/*     */           {
/* 227 */             e.setCancelled(true);
/* 228 */             if (!us.eObs())
/*     */             {
/* 230 */               us.eObs(true);
/* 231 */               e.getWhoClicked().closeInventory();
/* 232 */               GuiUtil.menudropu(p);
/*     */             }
/*     */             else
/*     */             {
/* 236 */               us.eObs(false);
/* 237 */               e.getWhoClicked().closeInventory();
/* 238 */               GuiUtil.menudropu(p);
/*     */             }
/* 240 */             return;
/*     */           }
/*     */           
/* 243 */           if (e.getCurrentItem().getType() == Material.APPLE)
/*     */           {
/* 245 */             e.setCancelled(true);
/* 246 */             if (!us.eApple())
/*     */             {
/* 248 */               us.eApple(true);
/* 249 */               e.getWhoClicked().closeInventory();
/* 250 */               GuiUtil.menudropu(p);
/*     */             }
/*     */             else
/*     */             {
/* 254 */               us.eApple(false);
/* 255 */               e.getWhoClicked().closeInventory();
/* 256 */               GuiUtil.menudropu(p);
/*     */             }
/* 258 */             return;
/*     */           }
/*     */           
/* 261 */           if (e.getCurrentItem().getType() == Material.BOOKSHELF)
/*     */           {
/* 263 */             e.setCancelled(true);
/* 264 */             if (!us.eBooks())
/*     */             {
/* 266 */               us.eBooks(true);
/* 267 */               e.getWhoClicked().closeInventory();
/* 268 */               GuiUtil.menudropu(p);
/*     */             }
/*     */             else
/*     */             {
/* 272 */               us.eBooks(false);
/* 273 */               e.getWhoClicked().closeInventory();
/* 274 */               GuiUtil.menudropu(p);
/*     */             }
/* 276 */             return;
/*     */           }
/*     */           
/* 279 */           if (e.getCurrentItem().getType() == Material.TNT)
/*     */           {
/* 281 */             e.setCancelled(true);
/* 282 */             if (!us.eTnt())
/*     */             {
/* 284 */               us.eTnt(true);
/* 285 */               e.getWhoClicked().closeInventory();
/* 286 */               GuiUtil.menudropu(p);
/*     */             }
/*     */             else
/*     */             {
/* 290 */               us.eTnt(false);
/* 291 */               e.getWhoClicked().closeInventory();
/* 292 */               GuiUtil.menudropu(p);
/*     */             }
/* 294 */             return;
/*     */           }
/*     */           
/* 297 */           if (e.getCurrentItem().getType() == Material.ENDER_PEARL)
/*     */           {
/* 299 */             e.setCancelled(true);
/* 300 */             if (!us.ePerla())
/*     */             {
/* 302 */               us.ePerla(true);
/* 303 */               e.getWhoClicked().closeInventory();
/* 304 */               GuiUtil.menudropu(p);
/*     */             }
/*     */             else
/*     */             {
/* 308 */               us.ePerla(false);
/* 309 */               e.getWhoClicked().closeInventory();
/* 310 */               GuiUtil.menudropu(p);
/*     */             }
/* 312 */             return;
/*     */           }
/*     */           
/* 315 */           e.setCancelled(true);
/* 316 */           e.getWhoClicked().openInventory(e.getInventory());
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Patryk\Desktop\EZDROP.jar!\item\ezdrop\listeners\DropListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */