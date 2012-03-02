package Encryption.CaesarCipher;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CaesarCipherFromFile
	{
	
	static ArrayList<String> alphabet = new ArrayList<String>();
	static String file = "";
	
	public static void main(String[] args) throws IOException
		{
		// TODO Auto-generated method stub
		System.out
				.println("This program will either encrypt or decrypt a file using the Caesar Cipher.");
		body();
		System.out.println("End of Program.");
		
		} // end method main
		
	public static void setAlphabet()
		{
//		alphabet.("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
//				"l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
//				"y", "z");
		}
	
	public static void body() throws IOException
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter the name of the file (in C:\\Test) that you want to read.");
			String fileName = "C:\\Test\\" + input.next();
		
			fileReading(fileName);
			System.out.println(file);
		
		System.out.println("End of Body.");
		}
	
	public static void fileReading(String fileName) throws IOException
		{
			BufferedReader in = new BufferedReader(new FileReader(fileName));
			while (in.ready()) { 
				  file += in.readLine(); 
				}
			in.close();
		}
	
	} // end class CaesarCipherFromFile