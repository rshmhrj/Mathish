package Encryption.CaesarCipher;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;
//import java.io.PrintWriter;

public class CaesarCipherFromFile
	{
	
	static ArrayList<String> alphabet = new ArrayList<String>();
	static String file = "";
	
	public static void main(String[] args) throws IOException
		{
		// TODO Auto-generated method stub
		System.out
				.println("This program will either encrypt or decrypt a file using the Caesar Cipher.");
		setAlphabet();
		body();
		System.out.println("End of Program.");
		
		} // end method main
		
	public static void setAlphabet()
		{
		alphabet.add("a");
		alphabet.add("b");
		alphabet.add("c");
		alphabet.add("d");
		alphabet.add("e");
		alphabet.add("f");
		alphabet.add("g");
		alphabet.add("h");
		alphabet.add("i");
		alphabet.add("j");
		alphabet.add("k");
		alphabet.add("l");
		alphabet.add("m");
		alphabet.add("n");
		alphabet.add("o");
		alphabet.add("p");
		alphabet.add("q");
		alphabet.add("r");
		alphabet.add("s");
		alphabet.add("t");
		alphabet.add("u");
		alphabet.add("v");
		alphabet.add("w");
		alphabet.add("x");
		alphabet.add("y");
		alphabet.add("z");
		}
	
	public static void body() throws IOException
		{
			Scanner input = new Scanner(System.in);
			
			System.out.print("For encryption enter 1; For decryption enter 2:");
			int type = input.nextInt();
			
			System.out.println("Please enter the name of the file (in C:\\Test) that you want to read.  Do not include the '.txt'.");
			String fileName = "C:\\Test\\" + input.next() + ".txt";
			setFile(fileName);
			
			System.out.print("Choose the amount of the shift (0 - 26):");
			short shift = input.nextShort();
			
			if (type == 1)	encrypt(shift);
			else if (type == 2) decrypt(shift);
			else
				{
					System.out.println("Please enter a valid choice.  Either 1 or 2.");
					body();
				}

			System.out.println("End of Body.");
		}
	
	public static void setFile(String fileName) throws IOException
		{
		BufferedReader in = new BufferedReader(new FileReader(fileName));
		while (in.ready())
			{
				file += in.readLine();
			}
		in.close();
		}
	
	public static void getFile()
		{
		System.out.println(file);
		}
	
	public static void encrypt(short shift)
		{
		System.out.println("encryption");
		
		}
	
	public static void decrypt(short shift)
		{
		System.out.println("decryption");
		}
	
	} // end class CaesarCipherFromFile