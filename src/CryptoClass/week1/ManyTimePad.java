package CryptoClass.week1;

import CryptoClass.BitwiseXOR;
import CryptoClass.Convert;

public class ManyTimePad
{

   public static void main(String[] args)
   {
      // ManyTimePad pad = new ManyTimePad();
      String key = "f9n?ÉÛØÌ?t5*Íc?.¯Îxªí( kÉ?)Åi°3?";
      String Hkey = Convert.StringToHex(key);
      System.out.println(Hkey);

      // String CT01 =
      // "315c4eeaa8b5f8aaf9174145bf43e1784b8fa00dc71d885a804e5ee9fa40b16349c146fb778cdf2d3aff021dfff5b403b510d0d0455468aeb98622b137dae857553ccd8883a7bc37520e06e515d22c954eba5025b8cc57ee59418ce7dc6bc41556bdb36bbca3e8774301fbcaa3b83b220809560987815f65286764703de0f3d524400a19b159610b11ef3e";
      // String PT01H = BitwiseXOR.XOR(Hkey, CT01, false);
      // String PT01 = Convert.HexToString(PT01H);
      // String CT02 =
      // "234c02ecbbfbafa3ed18510abd11fa724fcda2018a1a8342cf064bbde548b12b07df44ba7191d9606ef4081ffde5ad46a5069d9f7f543bedb9c861bf29c7e205132eda9382b0bc2c5c4b45f919cf3a9f1cb74151f6d551f4480c82b2cb24cc5b028aa76eb7b4ab24171ab3cdadb8356f";
      // String PT02H = BitwiseXOR.XOR(Hkey, CT02, false);
      // String PT02 = Convert.HexToString(PT02H);
      // String CT03 =
      // "32510ba9a7b2bba9b8005d43a304b5714cc0bb0c8a34884dd91304b8ad40b62b07df44ba6e9d8a2368e51d04e0e7b207b70b9b8261112bacb6c866a232dfe257527dc29398f5f3251a0d47e503c66e935de81230b59b7afb5f41afa8d661cb";
      // String PT03H = BitwiseXOR.XOR(Hkey, CT03, false);
      // String PT03 = Convert.HexToString(PT03H);
      // String CT04 =
      // "32510ba9aab2a8a4fd06414fb517b5605cc0aa0dc91a8908c2064ba8ad5ea06a029056f47a8ad3306ef5021eafe1ac01a81197847a5c68a1b78769a37bc8f4575432c198ccb4ef63590256e305cd3a9544ee4160ead45aef520489e7da7d835402bca670bda8eb775200b8dabbba246b130f040d8ec6447e2c767f3d30ed81ea2e4c1404e1315a1010e7229be6636aaa";
      // String PT04H = BitwiseXOR.XOR(Hkey, CT04, false);
      // String PT04 = Convert.HexToString(PT04H);
      // String CT05 =
      // "3f561ba9adb4b6ebec54424ba317b564418fac0dd35f8c08d31a1fe9e24fe56808c213f17c81d9607cee021dafe1e001b21ade877a5e68bea88d61b93ac5ee0d562e8e9582f5ef375f0a4ae20ed86e935de81230b59b73fb4302cd95d770c65b40aaa065f2a5e33a5a0bb5dcaba43722130f042f8ec85b7c2070";
      // String PT05H = BitwiseXOR.XOR(Hkey, CT05, false);
      // String PT05 = Convert.HexToString(PT05H);
      String CT06 = "32510bfbacfbb9befd54415da243e1695ecabd58c519cd4bd2061bbde24eb76a19d84aba34d8de287be84d07e7e9a30ee714979c7e1123a8bd9822a33ecaf512472e8e8f8db3f9635c1949e640c621854eba0d79eccf52ff111284b4cc61d11902aebc66f2b2e436434eacc0aba938220b084800c2ca4e693522643573b2c4ce35050b0cf774201f0fe52ac9f26d71b6cf61a711cc229f77ace7aa88a2f19983122b11be87a59c355d25f8e4";
      String PT06H = BitwiseXOR.XOR(Hkey, CT06, false);
      String PT06 = Convert.HexToString(PT06H);
      // String CT07 =
      // "32510bfbacfbb9befd54415da243e1695ecabd58c519cd4bd90f1fa6ea5ba47b01c909ba7696cf606ef40c04afe1ac0aa8148dd066592ded9f8774b529c7ea125d298e8883f5e9305f4b44f915cb2bd05af51373fd9b4af511039fa2d96f83414aaaf261bda2e97b170fb5cce2a53e675c154c0d9681596934777e2275b381ce2e40582afe67650b13e72287ff2270abcf73bb028932836fbdecfecee0a3b894473c1bbeb6b4913a536ce4f9b13f1efff71ea313c8661dd9a4ce";
      // String PT07H = BitwiseXOR.XOR(Hkey, CT07, false);
      // String PT07 = Convert.HexToString(PT07H);
      // String CT08 =
      // "315c4eeaa8b5f8bffd11155ea506b56041c6a00c8a08854dd21a4bbde54ce56801d943ba708b8a3574f40c00fff9e00fa1439fd0654327a3bfc860b92f89ee04132ecb9298f5fd2d5e4b45e40ecc3b9d59e9417df7c95bba410e9aa2ca24c5474da2f276baa3ac325918b2daada43d6712150441c2e04f6565517f317da9d3";
      // String PT08H = BitwiseXOR.XOR(Hkey, CT08, false);
      // String PT08 = Convert.HexToString(PT08H);
      // String CT09 =
      // "271946f9bbb2aeadec111841a81abc300ecaa01bd8069d5cc91005e9fe4aad6e04d513e96d99de2569bc5e50eeeca709b50a8a987f4264edb6896fb537d0a716132ddc938fb0f836480e06ed0fcd6e9759f40462f9cf57f4564186a2c1778f1543efa270bda5e933421cbe88a4a52222190f471e9bd15f652b653b7071aec59a2705081ffe72651d08f822c9ed6d76e48b63ab15d0208573a7eef027";
      // String PT09H = BitwiseXOR.XOR(Hkey, CT09, false);
      // String PT09 = Convert.HexToString(PT09H);
      // String CT10 =
      // "466d06ece998b7a2fb1d464fed2ced7641ddaa3cc31c9941cf110abbf409ed39598005b3399ccfafb61d0315fca0a314be138a9f32503bedac8067f03adbf3575c3b8edc9ba7f537530541ab0f9f3cd04ff50d66f1d559ba520e89a2cb2a83";
      // String PT10H = BitwiseXOR.XOR(Hkey, CT10, false);
      // String PT10 = Convert.HexToString(PT10H);
      String CT11 = "32510ba9babebbbefd001547a810e67149caee11d945cd7fc81a05e9f85aac650e9052ba6a8cd8257bf14d13e6f0a803b54fde9e77472dbff89d71b57bddef121336cb85ccb8f3315f4b52e301d16e9f52f904";
      String PT11H = BitwiseXOR.XOR(Hkey, CT11, false);
      String PT11 = Convert.HexToString(PT11H);
      int Hlen = CT11.length();
      int len = Hlen / 2;

      System.out.println("Key is currently: " + key.length()
            + " and needs to be: " + len);

      // System.out.println("1");
      // System.out.println(CT01);
      // System.out.println(PT01H);
      // System.out.println(PT01);
      //
      // System.out.println("2");
      // System.out.println(CT02);
      // System.out.println(PT02H);
      // System.out.println(PT02);
      //
      // System.out.println("3");
      // System.out.println(CT03);
      // System.out.println(PT03H);
      // System.out.println(PT03);
      //
      // System.out.println("4");
      // System.out.println(CT04);
      // System.out.println(PT04H);
      // System.out.println(PT04);
      //
      // System.out.println("5");
      // System.out.println(CT05);
      // System.out.println(PT05H);
      // System.out.println(PT05);

      System.out.println("6");
      System.out.println(CT06);
      System.out.println(PT06H);
      System.out.println(PT06);

      // System.out.println("7");
      // System.out.println(CT07);
      // System.out.println(PT07H);
      // System.out.println(PT07);
      //
      // System.out.println("8");
      // System.out.println(CT08);
      // System.out.println(PT08H);
      // System.out.println(PT08);
      //
      // System.out.println("9");
      // System.out.println(CT09);
      // System.out.println(PT09H);
      // System.out.println(PT09);
      //
      // System.out.println("10");
      // System.out.println(CT10);
      // System.out.println(PT10H);
      // System.out.println(PT10);

      System.out.println("11");
      System.out.println(CT11);
      System.out.println(PT11H);
      System.out.println(PT11);

      Hkey = BitwiseXOR
            .XOR(CT06,
                  Convert.StringToHex("There are two types of cryptography: "),
                  false);
      System.out.println(Convert.HexToString(Hkey));

   }
   // int test = (int)'A';
   // System.out.println("\n***** Convert ASCII to Hex *****");
   // String str = "I Love Java!";
   // System.out.println("Original input : " + str);
   //
   // String hex = strToHex.convertStringToHex(str);
   //
   // System.out.println("Hex : " + hex);
   //
   // System.out.println("\n***** Convert Hex to ASCII *****");
   // System.out.println("Hex : " + hex);
   // System.out.println("ASCII : " + strToHex.convertHexToString(hex));
   // System.out.println("First Cyphertext = " + CT01);
   // System.out.println("Converted = " + pad.convertHexToString(CT01));

   // BitwiseXOR(CT01, CT02);
   // int x = 49 ^ 35;
   // System.out.println(x);
   // x = 31 ^ 23;
   // System.out.println(x);
   // System.out.println("awn = " + pad.convertStringToHex("awn"));
   // System.out.println("Converted = " + pad.convertHexToString("94814d"));
   // int a = Integer.parseInt("6e", 16);
   // int b = Integer.parseInt("4d", 16);
   // System.out.println("a = " + a + " and b = " + b);
   // x = a ^ b;
   // System.out.println(x);
   // String x01 = BitwiseXOR.XOR(CT01, CT02);
   // //System.out.println(x01);
   // String x02 = BitwiseXOR.XOR(x01, CT03);
   // String x03 = BitwiseXOR.XOR(x02, CT04);
   // String x04 = BitwiseXOR.XOR(x03, CT05);
   // String x05 = BitwiseXOR.XOR(x04, CT06);
   // String x06 = BitwiseXOR.XOR(x05, CT07);
   // String x07 = BitwiseXOR.XOR(x06, CT08);
   // String x08 = BitwiseXOR.XOR(x07, CT09);
   // String x09 = BitwiseXOR.XOR(x08, CT10);
   // String x10 = BitwiseXOR.XOR(x09, CT11);

   // System.out.println(x10);

}
