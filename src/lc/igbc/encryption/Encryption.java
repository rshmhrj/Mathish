package lc.igbc.encryption;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Encryption
{

	static String	fileName;
	static String	file;

	public static void Encrypt() throws IOException
	{

		System.out.println( "Encryption started." );
		System.out.println( "Please enter the name of the file (in D:\\Test) that you want to read.  Do not include the '.txt'" );
		enterName();
		setFile( fileName );
		getFile();
	}

	public static void enterName()
	{
		Scanner input = new Scanner( System.in );
		String tempName = input.next();
		isValidFileName( tempName );
	}

	public static String getFileName()
	{
		return fileName;
	}

	public static void setFileName( String fileName )
	{
		Encryption.fileName = fileName;
	}

	public static void setFile( String fileName ) throws IOException
	{
		BufferedReader in = new BufferedReader( new FileReader( fileName ) );
		while ( in.ready() )
		{
			file += in.readLine();
		}
		in.close();
	}

	public static void getFile()
	{
		System.out.println( file );
	}

	public static void isValidFileName( String name )
	{
		if ( name.indexOf( "D:" ) != -1 || name.indexOf( ".txt" ) != -1 )
		{
			System.out.println( "Invalid Name.  Please enter the name of the file (without D:\\Test and without the .txt)." );
			enterName();
		}
		else
		{
			setFileName( "D:\\Test\\" + name + ".txt" );
		}
	}
}
