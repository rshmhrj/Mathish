package AlgoClass.Questions.P2;

import java.io.IOException;
import java.util.Arrays;

import AlgoClass.Array;

public class countComparisons {

	/**
	 * @param args
	 */
	static long comparisonCount = 0;
	//public static enum type {bad, good, random};
	
	public static void main(String[] args) throws IOException {
		System.out.println("This program will count the amount of comparisons made during Quicksort.");
		body();
		System.out.println("End of Program.");
	}
	
	public static void body() throws IOException {
		int n = 8;
		int[] A = Array.populate("P2", "simpleArray", n);
		System.out.println("Original Array: "+Arrays.toString(A));
//		int[] myQuickSort = sorting(A,0,n);
		int[] myQuickSort = QuickSort(A, 0, n);
		System.out.println("Sorted Array:"+Arrays.toString(myQuickSort));
	}

	private static int[] QuickSort(int[] A, int start, int n) {
		if (n <= 1){
			return A;
		}
		else {
//			int type = 0;
//			int pivot = ChoosePivot(A,n,type);
			int pivot = 0;
			int leftSize = pivot;
			int rightSize = n-pivot-1;
			
			Partition(A,leftSize,rightSize,pivot);
			
				int[] left = new int[leftSize];
				int[] right = new int[rightSize];
				System.arraycopy(A, 0, left, 0, leftSize);
				System.arraycopy(A, pivot+1, right, 0, rightSize);
				
				QuickSort(A, 0, leftSize);
				QuickSort(A, pivot, rightSize);
				return A;
		}
	}

	private static void Partition(int[] A, int left, int right, int pivot) {
//		int[] p = new int[left];
		int i = left + 1;
		for (int j = left + 1; j <= right; j++){
			if (A[j] < A[pivot]){
				Array.swap(A, i, j);
				i++;
			}
		}
		Array.swap(A, left, i - 1);
	}

	private static int ChoosePivot(int[] A, int n, int type) {
		int pivot;
		switch (type){
		case 0: // bad/naive method
			pivot = 0;
			break;
		case 1: // good
			pivot = 3;
			break;
		case 2: // random
			pivot = (int)Math.random()*n;
			break;
		default: // good
			pivot = 3;
			break;
		}
		return pivot;
	}
	
	public static int[] sorting(int[] x, int off, int len){

	// Choose a partition element, v
	int m = off + (len >> 1);       // Small arrays, middle element

	int v = x[m];

	// Establish Invariant: v* (<v)* (>v)* v*
	int a = off, b = a, c = off + len - 1, d = c;
	while(true) {
	    while (b <= c && x[b] <= v) {
		if (x[b] == v)
			Array.swap(x, a++, b);
		b++;
	    }
	    while (c >= b && x[c] >= v) {
		if (x[c] == v)
			Array.swap(x, c, d--);
		c--;
	    }
	    if (b > c)
		break;
	    Array.swap(x, b++, c--);
	}

	// Swap partition elements back to middle
	int s, n = off + len;
	s = Math.min(a-off, b-a  );  Array.vecswap(x, off, b-s, s);
	s = Math.min(d-c,   n-d-1);  Array.vecswap(x, b,   n-s, s);

	// Recursively sort non-partition-elements
	if ((s = b-a) > 1)
	    sorting(x, off, s);
	if ((s = d-c) > 1)
	    sorting(x, n-s, s);
	return x;
	}

}
