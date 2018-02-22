/*    */ package item.ezdrop.objects;
/*    */ 
/*    */ import item.ezdrop.Main;
/*    */ 
/*    */ public class TurboDrop
/*    */ {
/*    */   private String name;
/*    */   private int time;
/*    */   
/*    */   public TurboDrop(String name, int time)
/*    */   {
/* 12 */     this.name = name;
/* 13 */     this.time = time;
/* 14 */     Main.getInst().tb.add(this);
/*    */   }
/*    */   
/*    */   public String getName()
/*    */   {
/* 19 */     return this.name;
/*    */   }
/*    */   
/*    */   public int getTime()
/*    */   {
/* 24 */     return this.time;
/*    */   }
/*    */   
/*    */   public void setTime(int time)
/*    */   {
/* 29 */     this.time = time;
/*    */   }
/*    */   
/*    */   public void delete()
/*    */   {
/* 34 */     this.name = null;
/* 35 */     this.time = 0;
/* 36 */     Main.getInst().tb.remove(this);
/*    */   }
/*    */   
/*    */   public static TurboDrop get(String user)
/*    */   {
/* 41 */     for (TurboDrop u : Main.getInst().tb) {
/* 42 */       if (u.getName().equalsIgnoreCase(user)) {
/* 43 */         return u;
/*    */       }
/*    */     }
/* 46 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\Patryk\Desktop\EZDROP.jar!\item\ezdrop\objects\TurboDrop.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */