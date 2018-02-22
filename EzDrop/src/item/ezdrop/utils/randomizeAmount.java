/*    */ package item.ezdrop.utils;
/*    */ 
/*    */ import java.util.Random;
/*    */ 
/*    */ public class randomizeAmount
/*    */ {
/*    */   public static int randomAmount(int max)
/*    */   {
/*  9 */     Random rand = new Random();
/* 10 */     int number = rand.nextInt(max) + 1;
/* 11 */     return number;
/*    */   }
/*    */ }