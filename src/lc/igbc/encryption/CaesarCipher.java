package lc.igbc.encryption;

import java.io.IOException;
import java.util.Scanner;

public class CaesarCipher
{

   static short type;
   static short shift;
   static short again = 1;


   /**
    * @param args
    * @throws IOException
    */
   public static void main(String[] args) throws IOException
   {
      // TODO Auto-generated method stub

      System.out.println("Caesar Cipher program.");
      while (again == 1)
      {
         setsToContinue();
         setAgain();
      }
      System.out.println("End of Program");
   }


   public static void Continue() throws IOException
   {
      if (type == 1)
      {
         Encryption.Encrypt();
      }
      else
      {
         Decryption.Decrypt();
      }
   }


   public static void setType()
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter 1 for Encryption; 2 for Decryption.");
      short temp = input.nextShort();
      if (!isValidType(temp))
      {
         System.out.println("Please enter a valid number, 1 or 2.");
         setType();
      }
      else
      {
         type = temp;
      }
   }


   public static short getType()
   {
      return type;
   }


   public static void setShift()
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the shift amount (0 - 25).");
      short temp = input.nextShort();
      if (!isValidShift(temp))
      {
         System.out.println("Please enter a valid shift (0-25)");
         setShift();
      }
      else
      {
         shift = temp;
      }
   }


   public static short getShift()
   {
      return shift;
   }


   public static boolean isValidType(short temp)
   {
      if (temp == 1 || temp == 2)
      {
         return true;
      }
      else
      {
         return false;
      }
   }


   public static boolean isValidShift(short temp)
   {
      if (temp > 0 && temp < 26)
      {
         return true;
      }
      else
      {
         return false;
      }
   }


   public static void toContinue() throws IOException
   {
      if (isValidType(type) && isValidShift(shift))
      {
         Continue();
      }
      else if (isValidType(type) && !isValidShift(shift))
      {
         System.out.println("Please enter a valid choice.");
         setShift();
      }
      else
      {
         System.out.println("Please enter a valid choice.");
         setType();
      }
   }


   public static void setsToContinue() throws IOException
   {
      setType();
      setShift();
      toContinue();
   }


   public static void setAgain()
   {
      Scanner input = new Scanner(System.in);
      System.out
            .println("Do you want to do another encryption/decryption?  If yes, enter 1.  If not, enter 0.");
      short temp = input.nextShort();
      if (!isValidAgain(temp))
      {
         System.out.println("Please enter a valid choice.  1 or 0.");
         setAgain();
      }
      else
      {
         again = temp;
      }
   }


   public static short getAgain()
   {
      return again;
   }


   public static boolean isValidAgain(short temp)
   {
      if (temp == 1 || temp == 0)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
}
