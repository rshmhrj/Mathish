package AlgoClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DirectedGraph
{

   public static int[][][] generateArrays(String problem, String filename,
         int length) throws IOException
   {
      BufferedReader in = new BufferedReader(new FileReader(
            "D://EclipseWorkspaces//public//Mathish//src//AlgoClass//Questions//"
                  + problem + "//" + filename + ".txt"));
      int[][][] BigList = new int[2][length][2];
      // int[][] forward = new int[length][2];
      // int[][] reverse = new int[length][2];
      int n = 0;
      while (in.ready())
      {
         String line = in.readLine();
         String[] edge = line.split(" ");
         int first = Integer.parseInt(edge[0]);
         int second = Integer.parseInt(edge[1]);

         int[] fwd =
            { first, second };
         int[] rvs =
            { second, first };

         System.arraycopy(fwd, 0, BigList[0][n], 0, 2);
         System.arraycopy(rvs, 0, BigList[1][n], 0, 2);
         n++;
      }

      in.close();
      return BigList;
   }


   public static void print(int[][] graph)
   {
      for (int i = 0; i < graph.length; i++)
      {
         System.out.print("[ ");
         for (int j = 0; j < graph[i].length; j++)
         {
            System.out.print(graph[i][j] + " ");
         }
         System.out.println("]");
      }
   }


   public static void print(int[][][] graph)
   {
      for (int[][] array : graph)
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
   }

}
