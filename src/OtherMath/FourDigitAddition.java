package OtherMath;

import java.util.Scanner;

public class FourDigitAddition
{

	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );

		System.out.println( "This program will add the digits of a four digit number." );
		System.out.print( "Please enter a four digit number:" );
		int num = input.nextInt();
		long start = System.currentTimeMillis();

		int thouDig = num / 1000;
		int thou = thouDig * 1000;

		int hunsDig = ( num - thou ) / 100;
		int huns = hunsDig * 100;

		int tensDig = ( num - thou - huns ) / 10;
		int tens = tensDig * 10;

		int ones = num - thou - huns - tens;

		System.out.println( thouDig + " + " + hunsDig + " + " + tensDig + " + "
							+ ones + " = "
							+ ( thouDig + hunsDig + tensDig + ones ) );

		long end = System.currentTimeMillis();
		int time = (int) ( end - start );
		System.out.println( "****The Program took " + time
							+ "ms to execute.****" );
		System.out.println( "End of Program." );
	} // end method main

} // end class ProblemTemplate