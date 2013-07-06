package OtherMath;

import java.util.Scanner;

public class FibonacciSequenceRecursion
	{

		/**
		 * @param args
		 *            This program will generate the first x numbers of the
		 *            Fibonacci sequence. Starting with 0 and 1, each next
		 *            number is the result of the addition of the previous two
		 *            numbers.
		 */
		public static void main( String[] args )
			{
			Scanner input = new Scanner( System.in );

			System.out.println( "This program will generate the first x numbers of the Fibonacci Sequence." );
			System.out.println( "Please enter a value for x:" );
			int num = input.nextInt();
			input.close();
			long start = System.currentTimeMillis();

			for ( int i = 0; i <= num; i++ )
				{
				System.out.println( "Fibonacci Sequence[" + i + "]: " + fib( i ) );
				}

			long end = System.currentTimeMillis();
			int time = (int) ( end - start );
			System.out.println( "****The Program took " + time
								+ "ms to execute.****" );
			System.out.println( "End of Program." );
			} // end method main

		public static int fib( int num )
			{
			if ( num < 0 )
				{
				return 0;
				}
			else if ( num == 0 || num == 1 )
				{
				return num;
				}
			else
				{
				return fib( num - 1 ) + fib( num - 2 );
				}
			}

	} // end class ProblemTemplate