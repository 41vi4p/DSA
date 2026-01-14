
import java.util.Scanner;

public class move_zero_end {
   public move_zero_end() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter size of arr:");
      int var2 = var1.nextInt();
      int[] var3 = new int[var2];
      System.out.println("Enter arr elements:");

      for(int var4 = 0; var4 < var3.length; ++var4) {
         var3[var4] = var1.nextInt();
      }

      var1.close();
      moveZerosToEnd(var3);
      printarr(var3);
   }

   static void moveZerosToEnd(int[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         for(int var2 = var1 + 1; var2 < var0.length && var0[var1] == 0; ++var2) {
            int var3 = var0[var1];
            var0[var1] = var0[var2];
            var0[var2] = var3;
         }
      }

   }

   static void printarr(int[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         System.out.print(var0[var1] + " ");
      }

      System.out.println();
   }
}
