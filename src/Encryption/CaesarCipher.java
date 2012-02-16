package Encryption;
import java.util.Scanner;

public class CaesarCipher {
	
	/**
	 * @param args
	 * Paste problem text here and format.
	 */
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program will either encrypt or decrypt a string of text using the Caesar Cipher.");
		System.out.print("For encryption enter 1; For decryption enter 2:");
		int type = input.nextInt();
		System.out.println("Enter the text to be worked on.");
		String text = input.nextLine();
		
		System.out.print("Choose the amount of the shift (0 - 26):");
		int shift = input.nextInt();
		
		long start = System.currentTimeMillis();
		
		if (type == 1){
			encrypt(shift, text);
		}
		else if (type == 2){
			decrypt(shift, text);
		}
		else{
			System.out.println("Please enter a valid choice.  Either 1 or 2.");
			main();
		}

		
		long end = System.currentTimeMillis();
		int time = (int)(end - start);
		System.out.println("****The Program took "+time+"ms to execute.****");
		System.out.println("End of Program.");
	} // end method main

	public static string encrypt(int shift, String text){
		return "encrypt";
	}
	
	public static string decrypt(int shift, String text){
		return "decrypt";
	}

} // end class CaesarCipher