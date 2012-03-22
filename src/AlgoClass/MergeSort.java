package AlgoClass;

import java.util.Arrays;

public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program will sort an array.");
		int a[] = { 5, 4, 1, 8, 7, 2, 6, 3 };
		System.out.println("Original Array: " + Arrays.toString(a));

		System.out.println("End of Program.");
	}

	public static int[] sort(int[] x) {
		int n = x.length;
		if (!isEven(n)){
			int n1 = (int) Math.floor(n/2);
			int n2 = (int) Math.ceil(n/2);
			System.out.println("n1 = " + n1 + "; n2 = " + n2);
		}
		else{
			int n1 = n/2;
			int n2 = n/2;
			System.out.println("n1 = " + n1 + "; n2 = " + n2);
		}
		if (n == 1 || n == 0) {
			return x;
		}
		else {
			int[] a = new int[n];
			int[] b = new int[n/2];
			int[] c = new int[n/2];
			System.arraycopy(x, 0, b, 0, n/2);
			System.arraycopy(x, n/2, c, 0, n/2);
			System.arraycopy(src, srcPos, dest, destPos, len)
			return x;
		}
	}

	public static void merge(int x[]) {

	}
	
	public static boolean isEven(int n){
		return (n%2 == 0);
	}
}
