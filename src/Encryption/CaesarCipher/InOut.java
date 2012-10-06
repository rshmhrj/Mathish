package Encryption.CaesarCipher;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class InOut
	{
	
	public String text;
	
	public static void OutTest() throws IOException
		{
		PrintWriter out = new PrintWriter(new FileWriter(
				"D:\\Test\\outputfile.txt"));
		
		out.print("Hello ");
		out.println("world");
		out.close();
		}
	
	public static void InTest() throws IOException
		{
		BufferedReader in = new BufferedReader(new FileReader(
				"D:\\Test\\inputfile.txt"));
		String line;
		while (in.ready()) { 
			  line = in.readLine(); 
			  System.out.println(line);
			}
		in.close();
		}
	}