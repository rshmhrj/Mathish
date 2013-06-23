package AlgoClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import math.Maths;

public class Array
{

   public static int[] populate(String problem, String filename)
         throws IOException
   {
      BufferedReader in = new BufferedReader(new FileReader(
            "D://EclipseWorkspaces//public//Mathish//src//AlgoClass//Questions//"
                  + problem + "//" + filename + ".txt"));
      int[] temp = new int[100000];
      int n = 0;
      while (in.ready())
      {
         String line = in.readLine();
         line = line.replace(" ", "");
         temp[n] = Integer.parseInt(line);
         n++;
      }
      in.close();
      int[] IntegerArray = new int[n];
      System.arraycopy(temp, 0, IntegerArray, 0, n);
      // System.out.println(Arrays.toString(IntegerArray));
      return IntegerArray;
   }


   public static int[] populate(String problem, String filename, int arraySize)
         throws IOException
   {
      BufferedReader in = new BufferedReader(new FileReader(
            "D://EclipseWorkspaces//public//Mathish//src//AlgoClass//Questions//"
                  + problem + "//" + filename + ".txt"));
      int[] IntegerArray = new int[arraySize];
      int n = 0;
      while (in.ready() && n < arraySize)
      {
         String line = in.readLine();
         line = line.replace(" ", "");
         IntegerArray[n] = Integer.parseInt(line);
         n++;
      }
      in.close();
      // System.out.println(Arrays.toString(IntegerArray));
      return IntegerArray;
   }


   public static void swap(int[] A, int x, int y)
   {
      int temp = A[x];
      A[x] = A[y];
      A[y] = temp;
   }


   public static void vecswap(int x[], int a, int b, int n)
   {
      for (int i = 0; i < n; i++, a++, b++)
         swap(x, a, b);
   }


   public static int[] createRandomArray(int n)
   {
      int[] temp = new int[n];
      for (int i = 0; i < n; i++)
      {
         temp[i] = (int) (Math.random() * 1000);
      }
      return temp;
   }


   public static void printAdjacencyListArray(int[][] array)
   {
      for (int i = 0; i < array.length; i++)
      {
         System.out.print("[ ");
         for (int j = 0; j < array[i].length; j++)
         {
            System.out.print(array[i][j] + " ");
         }
         System.out.println("]");
      }
   }


   public static int[] remove(int value, int[] array)
   {
      int[] temp = new int[array.length - 1];
      int counter = 0;
      for (int item : array)
      {
         if (array[counter] != value)
         {
            temp[counter] = array[counter];
         }
         counter++;
      }
      return temp;
   }


   public static boolean alreadyExists(int value, int[] array,
         int currentPosition)
   {
      boolean foundFlag = false;
      for (int i = 0; i < array.length; i++)
      {
         if (array[i] == value && i < currentPosition)
         {
            foundFlag = true;
         }
      }
      return foundFlag;
   }


   public static int[] chooseTwoRandomElements(int[] array)
   {
      int[] result = new int[2];
      int[] randoms = Maths.twoRandoms(0, array.length - 1);
      result[0] = array[randoms[0]];
      result[1] = array[randoms[1]];
      return result;
   }


   public static int[] extractLeadingValues(int[][] array)
   {
      int[] result = new int[array.length];
      for (int i = 0; i < array.length; i++)
      {
         result[i] = array[i][0];
      }
      return result;
   }


   public static int[] extractLeadingValues(long[][] array)
   {
      int[] result = new int[array.length];
      for (int i = 0; i < array.length; i++)
      {
         result[i] = (int) array[i][0];
      }
      return result;
   }


   public static void printAdjacencyListArray(long[][] array)
   {
      for (int i = 0; i < array.length; i++)
      {
         System.out.print("[ ");
         for (int j = 0; j < array[i].length; j++)
         {
            System.out.print(array[i][j] + " ");
         }
         System.out.println("]");
      }
   }


   public static void toString(int[] A)
   {
      System.out.print("[ ");
      for (int i = 0; i < A.length - 1; i++)
      {
         System.out.print(A[i] + ", ");
      }
      System.out.print(A[A.length - 1]);
      System.out.print(" ]");
   }
}
