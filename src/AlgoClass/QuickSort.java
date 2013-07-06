package AlgoClass;

import java.io.IOException;
import java.util.Arrays;

public class QuickSort
	{

		public static void main( String[] args ) throws IOException
			{
			System.out.println( "This program will sort an array using the Quicksort Algo." );
			body();
			System.out.println( "End of Program." );
			}

		public static void body() throws IOException
			{
			int[] A = Array.populate( "P2", "array3" );
			int n = A.length;

			System.out.println( "Number of elements in input array = " + n );
			if ( n < 1000 ) System.out.println( "Original Array: "
												+ Arrays.toString( A ) );

			long myStartTime = System.currentTimeMillis();
			// 0 = first, 1 = middle, 2 = random, 3 = median of three, 9 = last
			int[] myQuickSort = sort( A, n, 0, n - 1, 1 );
			long myEndTime = System.currentTimeMillis();

			long myTime = myEndTime - myStartTime;

			if ( n < 1000 ) System.out.println( "Sorted Array:"
												+ Arrays.toString( myQuickSort ) );
			System.out.println( "My  time: " + myTime );
			}

		private static int[] sort( int[] A, int len, int left, int right,
									int type )
			{
			if ( len <= 1 )
				{
				return A;
				}
			else
				{
				int pivot = choosePivot( A, len, left, right, type );
				if ( A[pivot] != A[left] ) Array.swap( A, pivot, left );

				int newPivot = partition( A, left, right );

				int leftLen = newPivot - left;
				int rightLen = right - newPivot;

				sort( A, leftLen, left, newPivot - 1, type );
				sort( A, rightLen, newPivot + 1, right, type );

				return A;
				}
			}

		private static int partition( int[] A, int l, int r )
			{
			int p = A[l];
			int i = l + 1;
			for ( int j = l + 1; j < r + 1; j++ )
				{
				if ( A[j] < p )
					{
					Array.swap( A, i, j );
					i++;
					}
				}
			Array.swap( A, l, i - 1 );
			return i;
			}

		private static int choosePivot( int[] A, int n, int l, int r, int type )
			{
			int mid = (int) ( ( l + r ) / 2 );
			// 0 = first, 1 = middle, 2 = random, 3 = median of three, 9 = last
			if ( type == 0 )
				{
				return l;
				}
			else if ( type == 1 )
				{
				return mid;
				}
			else if ( type == 3 )
				{
				return meidanOfThree( A, l, mid, r );
				}
			else if ( type == 9 )
				{
				return r;
				}
			else
				{
				return ( (int) Math.random() * n ) + l;
				}
			}

		private static int meidanOfThree( int[] A, int l, int mid, int r )
			{
			int a = A[l];
			int b = A[mid];
			int c = A[r];
			int large, small, median = 0;

			if ( a > b )
				{
				large = a;
				small = b;
				}
			else
				{
				large = b;
				small = a;
				}

			if ( c > large ) median = large;
			else if ( c < small ) median = small;
			else median = c;

			if ( median == A[l] ) return l;
			else if ( median == A[mid] ) return mid;
			else return r;
			}

	}
