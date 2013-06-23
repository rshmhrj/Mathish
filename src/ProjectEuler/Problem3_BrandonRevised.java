package ProjectEuler;

import java.util.Scanner;
import java.util.ArrayList;

public class Problem3_BrandonRevised
{

   /**
    * @param args
    * 
    *           The prime factors of 13195 are 5, 7, 13 and 29. What is the
    *           largest prime factor of the number 600,851,475,143? 600851475143
    * 
    */

   public static void main(String[] args)
   {

      Scanner input = new Scanner(System.in);
      input.close();

      long num = 0; // initialize composite number

      System.out.println("What is your composite number?"); // prompt
      num = input.nextLong(); // number entered will be stored as num

      long start = getTime();

      ArrayList<Integer> primeFactors = generatePrimeFactors(num);
      int largestPrimeFactor = 0;

      // largestPrimeFactor = primeFactors[primeFactors.length-1];
      largestPrimeFactor = primeFactors.get(primeFactors.size() - 1);
      System.out.println("****The Largest Prime Factor of " + num + " is "
            + largestPrimeFactor + ".****");
      long end = getTime();
      int totalTimeMS = (int) (end - start);
      System.out.println("****The Program took " + totalTimeMS
            + "ms to execute.****");

      System.out.println("End of Program.");
   } // end method main


   public static ArrayList<Integer> generatePrimeFactors(long num)
   {
      ArrayList<Integer> primeFactors = new ArrayList<Integer>();
      double root = Math.sqrt(num) + 1;

      // initialize all prime factors in the list to false
      for (int i = 2; i <= root + 1; i++)
      {
         if (num % i == 0 && isPrime(i))
         {
            primeFactors.add(i);
         }
      }

      return primeFactors;
   } // end method generatePrimeList


   private static boolean isPrime(int val)
   {
      double sqrt = Math.sqrt(val);

      for (int div = 2; div <= sqrt + 1; div++)
      {
         if (val % div == 0) { return false; }
      }
      return true;
   }


   public static long getTime()
   {
      long currentTime = System.currentTimeMillis();
      return currentTime;
   } // end method getCurrentTimeStamp

} // end class Problem3
