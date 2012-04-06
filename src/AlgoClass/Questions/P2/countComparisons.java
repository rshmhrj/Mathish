package AlgoClass.Questions.P2;

import java.io.IOException;

import AlgoClass.Array;

public class countComparisons {

	static int count = 0;
	
	public static void main(String[] args) throws IOException {
		System.out.println("This program counts the comparisons made by the QuickSort Algo (with different pivot choices).");
		body();
		System.out.println("End of Program.");
	}
	
	/*
	 * 
	 * Array0.txt low  [64]   Array0.txt high  [60]   Array0.txt median  [55]
	 * Array1.txt low  [253]  Array1.txt high  [253]  Array1.txt median  [66]
	 * Array2.txt low  [1596] Array2.txt high  [1596] Array2.txt median  [228]
	 * Array3.txt low  [576]  Array3.txt high  [669]  Array3.txt median  [636]
	 * Array4.txt low  [237]  Array4.txt high  [235]  Array4.txt median  [172]
	 * Array5.txt low  [252]  Array5.txt high  [185]  Array5.txt median  [186]
	 * Array6.txt low  [236]  Array6.txt high  [258]  Array6.txt median  [177]
	 * Array7.txt low  [213]  Array7.txt high  [199]  Array7.txt median  [180]
	 * Array8.txt low  [231]  Array8.txt high  [206]  Array8.txt median  [192]
	 * Array9.txt low  [282]  Array9.txt high  [310]  Array9.txt median  [214]
	 * Array10.txt low [191]  Array10.txt high [232]  Array10.txt median [206]
	 * 
	 * 
	 */
	private static void body() throws IOException {
		String name = "QuickSort";
		int[] A = Array.populate("P2", name);
		int[] B = Array.populate("P2", name);
		int[] C = Array.populate("P2", name);
		int n = A.length;
		
		sort(A, n, 0, n-1, 0); // first element
//			count += n-1;
			System.out.println("Number of comparisons  (first): " + count);
		
			count = 0;
		
		sort(B, n, 0, n-1, 9); // last element
//			count += n-1;
			System.out.println("Number of comparisons   (last): " + count);
		
			count = 0;
		
		sort(C, n, 0, n-1, 3); // median of three element
//			count += n-1;
			System.out.println("Number of comparisons (median): " + count);
	}
	
	private static int[] sort(int[] A, int len, int left, int right, int type) {
		if (len <= 1){
			return A;
		}
		else{
			count += len-1;
			int pivot = choosePivot(A, len, left, right, type);
			if (A[pivot] != A[left]) Array.swap(A, pivot, left);
			
			int newPivot = partition(A, left, right);
			
			int leftLen = newPivot - left;
			int rightLen = right - newPivot;
			
			sort(A, leftLen, left, newPivot-1, type);
			sort(A, rightLen, newPivot+1, right, type);
		
			return A;
		}
	}

	private static int partition(int[] A, int l, int r) {
		int p = A[l];
		int i = l + 1;
		for (int j = l + 1; j <= r; j++){
			if (A[j] < p){
				Array.swap(A, i, j);
				i++;
			}
		}
		Array.swap(A, l, i - 1);
		return i-1;
	}
	
	private static int choosePivot(int[] A, int n, int l, int r, int type) {
		int mid = (int)((l+r)/2);
		// 0 = first, 1 = middle, 2 = random, 3 = median of three, 9 = last
		if (type == 0){
			return l;
		}
		else if(type == 1){
			return mid;
		}
		else if (type == 3){
			return meidanOfThree(A,l,mid,r);
		}
		else if (type == 9){
			return r;
		}
		else{
			return ((int)Math.random()*n) + l;
		}
	}
	
	private static int meidanOfThree(int[]A, int l, int mid, int r) {
		int a = A[l];
		int b = A[mid];
		int c = A[r];
		int large, small, median = 0;
		
		if (a > b){
			large = a;
			small = b;
		}
		else{
			large = b;
			small = a;
		}
		
		if (c > large) median = large;
		else if (c < small) median = small;
		else median = c;
		
		if (median == A[l]) return l;
		else if (median == A[mid]) return mid;
		else return r;
	}
	
	
}
