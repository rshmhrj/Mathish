package model_thinking;

import java.util.Scanner;

public class ColonelBlotto
{

   /**
    * @param args
    */
   public static void main(String[] args)
   {
      System.out
            .println("This program will give you the minimum number of 'fronts' necessary for a smaller force to win");
      body();
      System.out.println("End of program.");
   }


   public static void body()
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of forces for the bigger army:");
      int bigArmyNumber = input.nextInt();
      System.out.print("Enter the number of forces for the smaller army:");
      int smallArmyNumber = input.nextInt();

      int numberOfFronts = 0;

      for (int frontCounter = 1; frontCounter <= bigArmyNumber; frontCounter++)
      {
         if (!isWholeNumberOfPeople(bigArmyNumber, frontCounter)) continue;
         int peoplePerFront_Big = bigArmyNumber / frontCounter;
         int peoplePerFront_Small = peoplePerFront_Big + 1;

         if (smallArmyNumber / peoplePerFront_Small > frontCounter / 2)
         {
            numberOfFronts = frontCounter;
            break;
         }
      }

      System.out.println("Minimum Number of Fronts needed is ::"
            + Integer.toString(numberOfFronts));
   }


   public static boolean isWholeNumberOfPeople(int armyNum, int frontNum)
   {
      if (armyNum % frontNum == 0) return true;
      return false;
   }

}
