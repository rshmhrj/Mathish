package CryptoClass;

import java.util.ArrayList;

import math.Maths;
import AlgoClass.Array;
import CryptoClass.Convert;
import CryptoClass.BitwiseXOR;

public class testEncrypt
{

   /**
    * @param args
    */
   public static void main(String[] args)
   {
      // TODO Auto-generated method stub
      System.out.println("Pay Bob 100$00 :: ");
      String bob = Convert.StringToHex("Pay Bob 100$") + "00000000";
      System.out.println(bob);
      System.out.println("20814804c1767293b99f1d9cab3bc3e7");
      System.out.println("ac1e37bfb15599e5f40eef805488281d");

      System.out.println();
      // String bxor =
      // BitwiseXOR.XOR("9b5f44f293cd85080d90e8c43318f939854cfb8ea2dd87bbf48b94ea7eadaaa3c596a1087a481e","a86564abfcb8f7286bf99ab747389a51ea3f9ee082beeecb9ceee69e1bd5de83a4e2d569192330");
      // System.out.println(bxor);
      // System.out.println(Convert.HexToString(bxor));

      System.out.println(Maths.gcd(1989, 867));
      Array.toString(Maths.extendedGCD(120, 23));
      System.out.println("");
      System.out.println("-----------------");
      int[] Z =
         { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
      ArrayList<Integer> array = Maths.findInvertibleElements(Z);
      System.out.println(array);
   }

}
