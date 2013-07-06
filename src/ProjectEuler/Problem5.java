package ProjectEuler;

import java.util.Scanner;

public class Problem5
{

	/**
	 * @param args
	 *            2520 is the smallest number that can be divided by each of the
	 *            numbers from 1 to 10 without any remainder. What is the
	 *            smallest positive number that is evenly divisible by all of
	 *            the numbers from 1 to 20?
	 */
	public static void main( String[] args )
	{
		System.out.println( "This program will find the smallest positive number that is divisible by all of the numbers from 1 to x." );
		Scanner input = new Scanner( System.in );

		System.out.println( "Please enter the value for x:" );
		int num = input.nextInt();
		input.close();

		long start = System.currentTimeMillis();

		int[] range = new int[ num - 1 ];

		int rangeNum = 2;
		for ( int i = 0; i <= num - 2; i++ )
		{
			range[i] = rangeNum;
			rangeNum += 1;
		}

		for ( int i = 2; i <= num - 2; i++ )
		{
			for ( int j = 0; j <= num - 2; j++ )
			{
				while ( i != j && range[i] % range[j] == 0 )
				{
					range[i] = range[i] / range[j];
					break;
				}
			}
		}

		long answer = 1;
		for ( int i = 0; i <= num - 2; i++ )
		{
			answer *= range[i];
		}

		System.out.println( "Answer = " + answer );
		long end = System.currentTimeMillis();
		int time = (int) ( end - start );
		System.out.println( "****The Program took " + time
							+ "ms to execute.****" );
		System.out.println( "End of Program." );

	} // end method main

} // end class Problem5