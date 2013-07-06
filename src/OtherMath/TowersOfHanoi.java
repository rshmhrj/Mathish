package OtherMath;

import java.util.Scanner;

public class TowersOfHanoi
{

	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );

		System.out.println( "This program will find the optimal number of moves in a Towers of Hanoi scenario of T(x,3); x discs and three pegs." );
		System.out.println( "Please enter a value for x:" );
		long num = input.nextLong();
		long start = System.currentTimeMillis();

		System.out.println( "The optimum number of moves needed is: "
							+ move( num ) );

		long end = System.currentTimeMillis();
		int time = (int) ( end - start );
		System.out.println( "****The Program took " + time
							+ "ms to execute.****" );
		System.out.println( "End of Program." );
	} // end method main

	public static long move( long height )
	{
		if ( height <= 0 )
		{
			return 0;
		}
		else if ( height == 1 )
		{
			return 1;
		}
		else
		{
			return 2 * move( height - 1 ) + 1;
		}
	}

} // end class ProblemTemplate