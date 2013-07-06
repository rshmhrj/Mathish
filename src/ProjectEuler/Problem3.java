package ProjectEuler;

import java.util.Scanner;
import java.util.ArrayList;

public class Problem3
{

	/**
	 * @param args
	 * 
	 *            The prime factors of 13195 are 5, 7, 13 and 29. What is the
	 *            largest prime factor of the number 600,851,475,143?
	 *            600851475143
	 * 
	 */

	public static void main( String[] args )
	{

		Scanner input = new Scanner( System.in );

		long num = 0; // initialize composite number

		System.out.println( "What is your composite number?" ); // prompt
		num = input.nextLong(); // number entered will be stored as num
		input.close();

		System.out.println( "Would you like to use the OLD(0) or NEW(1) algorithm?" ); // prompt
		int algo = input.nextInt(); // algo to be used

		long start = getTime();

		int largest = (int) squareRoot( num ); // find the squareRoot of the
// number
		int root = largest + 1;

		int[] primeList;

		if ( algo == 0 )
		{
			primeList = generatePrimeListOLD( root );
		}
		else
		{
			primeList = generatePrimeListNEW( root );
		}

		int[] primeFactors = generatePrimeFactors(	num, primeList.length,
													primeList );
		int largestPrimeFactor = 0;

		if ( primeFactors.length == 1 )
		{
			largestPrimeFactor = primeFactors[0];
		}
		else if ( primeFactors.length > 1 )
		{
			largestPrimeFactor = primeFactors[primeFactors.length - 1];
		}

		System.out.println( "****The Largest Prime Factor of " + num + " is "
							+ largestPrimeFactor + ".****" );
		long end = getTime();
		int totalTimeMS = (int) ( end - start );
		System.out.println( "****The Program took " + totalTimeMS
							+ "ms to execute.****" );

		System.out.println( "End of Program." );
	} // end method main

	// calculate the Square Root (rounded up) of the inputted number
	public static long squareRoot( long n )
	{
		long largest = (long) Math.ceil( Math.sqrt( n ) );
		// System.out.println("squareRoot has been run.");
		return largest;
	} // end method squareRoot

	// generates the list of prime numbers up to
	// the square root of the inputted composite number
	public static int[] generatePrimeListOLD( int num )
	{
		int pnum = 0; // initialize prime number count
		int cnum = 0; // initialize composite number count
		int nump = num + 1;

		int[] numbers; // initialize array of numbers
		numbers = new int[ nump ]; // allocate memory for enough integers

		// adding numbers to the array
		for ( int i = 0; i <= num; i++ )
		{
			numbers[i] = i;
		} // end for

		boolean[] primes; // initialize array to find primes
		primes = new boolean[ nump ]; // allocate memory for enough integers

		// make all primes true until proven otherwise
		for ( int i = 0; i <= num; i++ )
		{
			primes[i] = true;
			pnum = pnum + 1;
		}

		// adding members to primes from numbers
		for ( int i = 0; i <= num; i++ )
		{
			if ( numbers[i] == 0 || numbers[i] == 1 )
			{
				primes[i] = false;
				cnum = cnum + 1;
				continue;
			} // end if
			for ( int j = 2; j <= num; j++ )
			{
				if ( numbers[i] % j == 0 && i != j )
				{
					primes[i] = false;
					cnum = cnum + 1;
					break;
				} // end if
			} // end inner for
		} // end outer for

		// for (int i = 0; i <= num; i++){
		// System.out.println("Prime["+i+"]: "+primes[i]);
		// } // end for

		// System.out.println("Number of Comps: "+cnum);
		pnum = pnum - cnum;
		// System.out.println("Number of Primes: "+pnum);

		int[] primeList;
		primeList = new int[ pnum ];
		int pCount = 0;

		for ( int i = 0; i <= num; i++ )
		{
			if ( primes[i] == true )
			{
				primeList[pCount] = numbers[i];
				pCount++;
			} // end if
		} // end for

		// System.out.println("generatePrimeList has been run.");
		return primeList;
	} // end method generatePrimeList

	public static int[] generatePrimeListNEW( int num )
	{
		// int nump = (num + 1);
		int pCount = 0;

		// int[] numbers = new int[nump];

		ArrayList<Integer> primes = new ArrayList<Integer>();

		for ( int i = 2; i <= num; i++ )
		{
			for ( int j = 2; j <= num; j++ )
			{
				if ( i == j )
				{
					primes.add( i );
					break;
				}
				if ( i != j && i % j == 0 )
				{
					break;
				}
			}
		}

		int[] primeList = new int[ primes.size() ];
		for ( Integer n : primes )
		{
			primeList[pCount++] = n.intValue();
		}

		// for (int i = 0; i < primes.size(); i++){
		// System.out.println("Prime["+i+"]: "+primeList[i]);
		// } // end for
		System.out.println( "generatePrimeListNEW has been run." );
		return primeList;
	}

	public static int[] generatePrimeFactors( long num, int pnum,
												int[] primeList )
	{
		int pf = 0; // initialize prime factor count

		boolean[] primeFactorsList;
		primeFactorsList = new boolean[ pnum ];

		// initialize all prime factors in the list to false
		for ( int i = 0; i <= pnum - 1; i++ )
		{
			primeFactorsList[i] = false;
		} // end for

		for ( int i = 0; i <= pnum - 1; i++ )
		{
			if ( num % primeList[i] == 0 )
			{
				primeFactorsList[i] = true;
				pf = pf + 1;
			} // end if
		} // end for

		int[] primeFactors;
		primeFactors = new int[ pf ];
		int pfCount = 0;

		for ( int i = 0; i <= pnum - 1; i++ )
		{
			if ( primeFactorsList[i] == true )
			{
				primeFactors[(int) pfCount] = primeList[i];
				pfCount = pfCount + 1;
			} // end if
		} // end for

		// for (long i = 0; i <= pf-1; i++){
		// System.out.println("PrimeFactors["+i+"]: "+primeFactors[i]);
		// } // end for

		// System.out.println("generatePrimeFactors has been run.");
		return primeFactors;
	} // end method generatePrimeList

	public static long getTime()
	{
		long currentTime = System.currentTimeMillis();
		return currentTime;
	} // end method getCurrentTimeStamp

} // end class Problem3
