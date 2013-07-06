package OtherMath;

import java.util.Scanner;
import java.util.ArrayList;

public class FibonacciSequenceLoop
{

	/**
	 * @param args
	 *            This program will generate the first x numbers of the
	 *            Fibonacci sequence. Starting with 0 and 1, each next number is
	 *            the result of the addition of the previous two numbers.
	 */
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );

		System.out.println( "This program will generate the first x numbers of the Fibonacci Sequence." );
		System.out.println( "Please enter a value for x:" );
		int num = input.nextInt();
		long start = System.currentTimeMillis();

		ArrayList<Integer> fib = new ArrayList<Integer>();

		// populate the first two members of the sequence, 0 and 1.
		fib.add( 0 );
		fib.add( 1 );

		for ( int fNum = 1; fNum < num - 1; fNum++ )
		{
			int holder = fib.get( fNum - 1 ) + fib.get( fNum );
			fib.add( holder );
		}

		for ( int i = 0; i <= num - 1; i++ )
		{
			System.out.println( "Fibonacci Sequence[" + i + "]: " + fib.get( i ) );
		}

		long end = System.currentTimeMillis();
		int time = (int) ( end - start );
		System.out.println( "****The Program took " + time
							+ "ms to execute.****" );
		System.out.println( "End of Program." );
	} // end method main

} // end class ProblemTemplate