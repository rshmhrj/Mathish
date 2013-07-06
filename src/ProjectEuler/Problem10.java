package ProjectEuler;

import java.util.LinkedList;
import java.util.Scanner;

import math.Maths;
import java.util.ArrayList;

@SuppressWarnings( "unused" )
public class Problem10
{

	/**
	 * @param args
	 *            The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17. Find the
	 *            sum of all the primes below two million. 2,000,000 2000000
	 */

	public static void main( String[] args ) throws Exception
	{
		Scanner input = new Scanner( System.in );

		System.out.println( "This program will find the sum of all the primes below x." );
		System.out.print( "Please enter a value for x:" );
		int x = input.nextInt();
		input.close();

		long start = System.currentTimeMillis();

		System.out.println( body( x ) );

		long end = System.currentTimeMillis();

		System.out.println( countPrimesFast( x ) );

		long time = ( end - start );
		System.out.println( "****The Program took " + time
							+ "ms to execute.****" );
		System.out.println( "End of Program." );
	}

	public static long body( int x )
	{
		long ans = 2;
		// String additions = "";
		for ( int i = 2; i <= x; i++ )
		{
			if ( Maths.isPrime( i ) ) ans += (long) i;
		}
		// ArrayList<Integer> primes = Maths.generatePrimeNumbers(x);
		// for (int i = 0; i < primes.size(); i++)
		// {
		// ans += primes.get(i);
		// // if (i==0) additions +=
// additions+(Integer.toString(primes.get(i)));
		// // else if (i==primes.size()-1) additions +=
		// (" + "+Integer.toString(primes.get(i)));
		// // else additions += (" + "+Integer.toString(primes.get(i)));
		// }
		// System.out.println(additions);
		return ans;
	}

	private static double countPrimesFast( int count ) throws Exception
	{
		if ( count < 10 ) { throw new IllegalArgumentException(
																"method only works for count >= 10" ); }
		long start = System.currentTimeMillis();
		long sum = 2 + 3 + 5 + 7;
		int[] step = { 1, 3, 7, 9 };
		LinkedList<Integer> previousPrimes = new LinkedList<Integer>();
		previousPrimes.add( 3 );
		previousPrimes.add( 5 );
		previousPrimes.add( 7 );

		for ( int i = 10; i < count; i += 10 )
		{
			step: for ( int j : step )
			{
				int k = i + j;
				double sqrt = Math.sqrt( k );
				for ( int prevPrime : previousPrimes )
				{
					if ( prevPrime > sqrt )
					{
						break;
					}
					if ( k % prevPrime == 0 )
					{
						continue step;
					}
				}
				sum += k;
				previousPrimes.add( k );
			}
		}
		System.out.println( sum + " sum " );
		return System.currentTimeMillis() - start;
	}

}