/*    */ package item.ezdrop.utils;
/*    */ 
/*    */ import java.util.Random;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ 
/*    */ public class recalculatePickaxe
/*    */ {
/* 11 */   private static final Random rand = new Random();
/*    */   
/*    */   public static void recalculateDurability(Player player, ItemStack item)
/*    */   {
/* 15 */     if (item.getType().getMaxDurability() == 0) {
/* 16 */       return;
/*    */     }
/* 18 */     int enchantLevel = item.getEnchantmentLevel(org.bukkit.enchantments.Enchantment.DURABILITY);
/* 19 */     short d = item.getDurability();
/* 20 */     if (enchantLevel > 0)
/*    */     {
/* 22 */       if (100 / (enchantLevel + 1) > getRandInt(0, 100)) {
/* 23 */         if (d == item.getType().getMaxDurability()) {
/* 24 */           player.getInventory().clear(player.getInventory().getHeldItemSlot());
/*    */         } else {
/* 26 */           item.setDurability((short)(d + 1));
/*    */         }
/*    */       }
/*    */     }
/* 30 */     else if (d == item.getType().getMaxDurability()) {
/* 31 */       player.getInventory().clear(player.getInventory().getHeldItemSlot());
/*    */     } else {
/* 33 */       item.setDurability((short)(d + 1));
/*    */     }
/*    */   }
/*    */   
/*    */   public static int getRandInt(int min, int max)
/*    */     throws IllegalArgumentException
/*    */   {
/* 40 */     org.apache.commons.lang.Validate.isTrue(max > min, "Max can't be smaller than min!");
/* 41 */     return rand.nextInt(max - min + 1) + min;
/*    */   }
/*    */ }