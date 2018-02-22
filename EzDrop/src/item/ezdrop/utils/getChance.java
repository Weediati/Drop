/*    */ package item.ezdrop.utils;
/*    */ 
/*    */ import java.util.Random;
/*    */ 
/*    */ public class getChance
/*    */ {
/*    */   public static boolean getChance(double chance)
/*    */   {
/*  9 */     Random random = new Random();
/* 10 */     double random1 = random.nextDouble() * 100.0D;
/* 11 */     if (random1 <= chance) {
/* 12 */       return true;
/*    */     }
/* 14 */     return false;
/*    */   }
/*    */ }