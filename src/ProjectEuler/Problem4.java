package ProjectEuler;

import java.util.Scanner;
import math.Maths;

public class Problem4
{

	/**
	 * @param args
	 *            A palindromic number reads the same both ways. The largest
	 *            palindrome made from the product of two 2-digit numbers is
	 *            9009 = 91 99. Find the largest palindrome made from the
	 *            product of two 3-digit numbers.
	 */
	public static void main( String[] args )
	{
		// TODO String Manipulation to see if t
		System.out.println( "This program will find the largest palindrome from the product of 2 x-digit numbers." );
		body();
		System.out.println( "End of Program." );
	}

	static void body()
	{
		Scanner input = new Scanner( System.in );
		System.out.print( "Enter the number of digits (1,2,3):" );
		int digits = input.nextInt();
		input.close();

		if ( digits == 1 )
		{
			System.out.println( "\n99" );
		}
		else if ( digits == 2 || digits == 3 )
		{
			int end;
			if ( digits == 2 ) end = 99;
			else end = 999;

			int big = 1;
			for ( int i = 1; i <= end; i++ )
			{
				for ( int j = 1; j <= end; j++ )
				{
					int temp = i * j;

					if ( temp > big && Maths.isPalindrome( temp ) )
					{
						// System.out.println(i + " * " + j + " = " + temp);
						big = temp;
					}
				}
			}
			System.out.println( "Largest Palindrome with " + digits
								+ " digits: " + big );

		}
		else
		{
			System.out.println( "Bad choice..." );
			body();
		}
	}

}
