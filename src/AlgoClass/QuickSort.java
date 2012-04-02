package AlgoClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {

	public static int[] checkedPivots;
	public static void main(String[] args) throws IOException {
		System.out.println("This program will sort an array using the Quicksort Algo.");
		body();
		System.out.println("End of Program.");
	}
	public static void body() throws IOException {
		int n = 8;
		int[] A = Array.populate("P2", "simpleArray", n);
		populateCheckedPivots(n);
		System.out.println("Original Array: "+Arrays.toString(A));
		int[] myQuickSort = sort(A, 0, n);
		System.out.println("Sorted Array:"+Arrays.toString(myQuickSort));
	}
	private static int[] sort(int[] A, int start, int len) {
		if (len > 1){
			int pivot = choosePivot(A, start, len, 0);
			int pivotValue = A[pivot];
			
			Partition(A,start,len,pivotValue);
			int pivotIndex = Arrays.binarySearch(A, 0, len, pivotValue);
			checkedPivots[nextCheckedPivot()] = pivotIndex;
			
			sort(A, start, pivotIndex);
			sort(A, pivotIndex+1, len);
		}
		return A;
	}

	private static void Partition(int[] A, int l, int r, int pivotValue) {
		int i = l + 1;
		for (int j = l + 1; j < r; j++){
			if (A[j] < pivotValue){
				Array.swap(A, i, j);
				i++;
			}
		}
		Array.swap(A, l, i - 1);
	}
	private static void populateCheckedPivots(int n) {
		int[] temp = new int[n];
		for (int i = 0; i < n; i++){
			temp[i] = -1;
		}
		checkedPivots = temp;
	}
	private static int nextCheckedPivot() {
		int x = 0;
		for (int i = 0; i < checkedPivots.length; i++) {
			if (checkedPivots[i] == -1){
				x = i;
				break;
			}
			else{
				x = -1;
			}
		}
		return x;
	}
	private static int choosePivot(int[] A, int start, int len, int type) {
		int pivot;
		switch (type){
		case 0: // bad/naive method
			String possible = "";
			for (int i = 0; i < A.length; i++) {
				for (int j = 0; j < checkedPivots.length; j++) {
					if (A[i] == checkedPivots[j]){
						break;
					}
				}
				if (i != A.length-1){
					possible += i+" ";
				}
				else{
					possible += i;
				}
			}
			if (possible != ""){
				pivot = Integer.parseInt(possible.substring(0, possible.indexOf(" ")));
			}
			else{
				pivot = 0;
			}
			break;
		case 1: // good
			pivot = 3;
			break;
		case 2: // random
			pivot = (int)Math.random()*len;
			break;
		default: // good
			pivot = 3;
			break;
		}
		return pivot;
	}
	
}
