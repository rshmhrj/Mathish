package AlgoClass.Questions.P1;

import java.io.IOException;
//import java.util.Arrays;

import AlgoClass.Array;

public class countInversions
{

   static long left = 0;
   static long right = 0;
   static long split = 0;
   static long invCount = 0;


   public static void main(String[] args) throws IOException
   {
      System.out
            .println("This program will sort an array and count the number of inversions.");
      body();
      System.out.println("End of Program.");
   }


   public static void body() throws IOException
   {
      int[] A = Array.populate("P1", "IntegerArray");
      // int[] mySort = sortAndCount(A, 100000);
      sortAndCount(A, 100000);
      // int[] A =
      // {1,3,5,7,2,4,6,8,1};
      // int[] mySort = sortAndCount(A, A.length);
      // System.out.println("Original Array: " + Arrays.toString(A));
      // System.out.println("Sorted   Array: " + Arrays.toString(mySort));
      System.out.println("Number of Inversions (my code)    = " + invCount);
      long count = countInversionsMethod(A);
      System.out.println("Number of Inversions (other code) = " + count);
   }


   public static int[] sortAndCount(int[] X, int A_length)
   {
      switch (A_length)
      {
         case 1:
            return X;
         default:
         {
            int B_length = A_length / 2;
            int C_length = A_length - B_length;

            int[] A = new int[A_length];
            int[] B = new int[B_length];
            int[] C = new int[C_length];
            System.arraycopy(X, 0, B, 0, B_length);
            System.arraycopy(X, B_length, C, 0, C_length);
            B = sortAndCount(B, B_length);
            C = sortAndCount(C, C_length);
            A = mergeAndCountSplitInv(A_length, B, B_length, C, C_length);
            return A;
         }
      }
   }


   public static int[] mergeAndCountSplitInv(int A_length, int[] B,
         int B_length, int[] C, int C_length)
   {
      int[] D = new int[A_length];
      int i = 0;
      int j = 0;
      for (int k = 0; k < A_length; k++)
      {
         if (i < B_length && j < C_length)
         {
            if (B[i] <= C[j])
            {
               D[k] = B[i];
               i++;
            }
            else
            {
               int count = B_length - i;
               D[k] = C[j];
               j++;
               invCount += count;
            }
         }
         else if (j >= C_length && i < B_length)
         {
            D[k] = B[i];
            i++;
         }
         else if (i >= B_length && j < C_length)
         {
            D[k] = C[j];
            j++;
         }
      }
      return D;
   }


   // http://www.csc.liv.ac.uk/~martin/teaching/comp202/Java/Inversions-code.html
   public static long countInversionsMethod(int nums[])
   /*
    * This function will count the number of inversions in an array of numbers.
    * (Recall that an inversion is a pair of numbers that appear out of
    * numerical order in the list.
    * 
    * We use a modified version of the MergeSort algorithm to do this, so it's a
    * recursive function. We split the list into two (almost) equal parts,
    * recursively count the number of inversions in each part, and then count
    * inversions caused by one element from each part of the list.
    * 
    * The merging is done is a separate procedure given below, in order to
    * simplify the presentation of the algorithm here.
    * 
    * Note: I am assuming that the integers are distinct, but they need *not* be
    * integers { 1, 2, ..., n} for some n.
    */
   {
      int mid = nums.length / 2, k;
      long countLeft, countRight, countMerge;

      /* If the list is small, there's nothing to do. */
      if (nums.length <= 1) return 0;

      /*
       * Otherwise, we create new arrays and split the list into two (almost)
       * equal parts.
       */
      int left[] = new int[mid];
      int right[] = new int[nums.length - mid];

      for (k = 0; k < mid; k++)
         left[k] = nums[k];
      for (k = 0; k < nums.length - mid; k++)
         right[k] = nums[mid + k];

      /*
       * Recursively count the inversions in each part.
       */
      countLeft = countInversionsMethod(left);
      countRight = countInversionsMethod(right);

      /*
       * Now merge the two sublists together, and count the inversions caused by
       * pairs of elements, one from each half of the original list.
       */
      int result[] = new int[nums.length];
      countMerge = mergeAndCount(left, right, result);

      /*
       * Finally, put the resulting list back into the original one. This is
       * necessary for the recursive calls to work correctly.
       */
      for (k = 0; k < nums.length; k++)
         nums[k] = result[k];

      /*
       * Return the sum of the values computed to get the total number of
       * inversions for the list.
       */
      return (countLeft + countRight + countMerge);

   } /* end of "countInversions" procedure */


   public static long mergeAndCount(int left[], int right[], int result[])
   /*
    * This procudure will merge the two lists, and count the number of
    * inversions caused by the elements in the "right" list that are less than
    * elements in the "left" list.
    */
   {
      int a = 0, b = 0, i, k = 0;
      long count = 0;
      while ((a < left.length) && (b < right.length))
      {
         if (left[a] <= right[b]) result[k] = left[a++];
         else
         /* You have found (a number of) inversions here. */
         {
            result[k] = right[b++];
            count += left.length - a;
         }
         k++;
      }

      if (a == left.length) for (i = b; i < right.length; i++)
         result[k++] = right[i];
      else for (i = a; i < left.length; i++)
         result[k++] = left[i];

      return count;
   }

}
