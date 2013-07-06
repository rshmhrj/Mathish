package ProjectEuler;

import java.util.Scanner;

public class Problem6
	{

		/**
		 * @param args
		 *            The sum of the squares of the first ten natural numbers
		 *            is, 1^2 + 2^2 + ... + 10^2 = 385 The square of the sum of
		 *            the first ten natural numbers is, (1 + 2 + ... + 10)^2 =
		 *            55^2 = 3025 Hence the difference between the sum of the
		 *            squares of the first ten natural numbers and the square of
		 *            the sum is 3025 385 = 2640.
		 * 
		 *            Find the difference between the sum of the squares of the
		 *            first one hundred natural numbers and the square of the
		 *            sum.
		 */

		public static void main( String[] args )
			{
			Scanner input = new Scanner( System.in );

			System.out.println( "This program will find the difference between the 'sum of the squares' and the 'square of the sum' of the first x numbers." );
			System.out.println( "Please enter a value for x:" );
			int num = input.nextInt();
			input.close();
			long start = System.currentTimeMillis();

			int sum = 0;
			for ( int i = 1; i <= num; i++ )
				{
				sum += i;
				}
			int squareOfSum = sum * sum;

			sum = 0;

			for ( int i = 1; i <= num; i++ )
				{
				sum += ( i * i );
				}

			int difference = squareOfSum - sum;

			System.out.println( squareOfSum + " - " + sum + " = " + difference );
			long end = System.currentTimeMillis();
			int time = (int) ( end - start );
			System.out.println( "****The Program took " + time
								+ "ms to execute.****" );
			System.out.println( "End of Program." );
			} // end method main

	} // end class Problem6