package AlgoClass.Questions.P5;

import java.io.IOException;
import java.util.Arrays;

import AlgoClass.Array;
import AlgoClass.MergeSort;

public class TwoSumUsingSearch
{

   /**
    * @param args
    */
   public static void main(String[] args) throws IOException
   {
      // TODO Auto-generated method stub
      System.out.println("This program will solve the 2-sum problem.");
      body();
      System.out.println("End of program.");
   }


   public static void body() throws IOException
   {
      int[] targetSums =
         { 231552, 234756, 596873, 648219, 726312, 981237, 988331, 1277361,
               1283379 };
      // int[] targetSums = {10,12,56,21,34,62,16,17,20};
      boolean[] result = new boolean[9];
      int n = 100000;
      // int t1 = 231552;
      // int t2 = 234756;
      // int t3 = 596873;
      // int t4 = 648219;
      // int t5 = 726312;
      // int t6 = 981237;
      // int t7 = 988331;
      // int t8 = 1277361;
      // int t9 = 1283379;
      System.out.println("Target sums = " + Arrays.toString(targetSums));
      long myStartTime = System.currentTimeMillis();
      int[] X = Array.populate("P5", "HashInt", n);
      int[] A = MergeSort.sortArray(X, X.length);
      long myEndTime = System.currentTimeMillis();
      System.out.println("Time for population & sorting = "
            + Long.toString(myEndTime - myStartTime));

      long loopStartTime = System.currentTimeMillis();
      for (int i = 0; i < 9; i++)
      {
         long myLoopStartTime = System.currentTimeMillis();
         for (int j = 0; j < n; j++)
         {
            for (int k = 0; k < n; k++)
            {
               if (j != k)
               {
                  if (targetSums[i] - A[k] == A[j])
                  {
                     result[i] = true;
                     System.out.println("Found sum for "
                           + Integer.toString(targetSums[i]) + " = " + A[j]
                           + " + " + A[k]);
                     break;
                  }
               }
            }
            if (result[i] == true)
            {
               // System.out.println("Finished with" +
               // Integer.toString(targetSums[i]));
               break;
            }
         }
         long myLoopEndTime = System.currentTimeMillis();
         // System.out.println("Time for loop["+i+"] = " +
         // Long.toString(myLoopEndTime - myLoopStartTime));

      }
      long loopEndTime = System.currentTimeMillis();

      System.out.println("Result = " + toString(result));
      System.out.println("Total time taken = "
            + Long.toString(loopEndTime - loopStartTime));

   }


   public static String toString(boolean[] result)
   {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < result.length; i++)
      {
         if (result[i] == true)
         {
            sb.append(1);
         }
         else
         {
            sb.append(0);
         }
      }
      return sb.toString();
   }

}
