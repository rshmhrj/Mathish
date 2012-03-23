package AlgoClass;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		System.out.println("This program will sort an array.");
		body();
		System.out.println("End of Program.");
	}
	
	public static void body(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the size of the array to create.");
		int n = input.nextInt();
		
		int[] A = new int[n];
		A = createRandomArray(n);
		System.out.println("Original   Array: " + Arrays.toString(A));
		
		long myStartTime = System.currentTimeMillis();
			int[] mySort = sortArray(A);
			System.out.println("My  Sorted Array: " + Arrays.toString(mySort));
		long myEndTime = System.currentTimeMillis();
		
		long myTime = myEndTime-myStartTime;

	
		long regStartTime = System.currentTimeMillis();
			int[] regularSort = new int[n];
			System.arraycopy(A, 0, regularSort, 0, n);
			Arrays.sort(regularSort);
		long regEndTime = System.currentTimeMillis();
		
		long regTime = regEndTime-regStartTime;
		
		System.out.println("Reg Sorted Array: " + Arrays.toString(regularSort));
		System.out.println("My  time: " + myTime);
		System.out.println("Reg time: " + regTime);
		
		again(A,n);
	}
	
		public static void body(int[] A, int n){
		System.out.println("Original   Array: " + Arrays.toString(A));
		
		long myStartTime = System.currentTimeMillis();
			int[] mySort = sortArray(A);
			System.out.println("My  Sorted Array: " + Arrays.toString(mySort));
		long myEndTime = System.currentTimeMillis();
		
		long myTime = myEndTime-myStartTime;
	
		
		long regStartTime = System.currentTimeMillis();
			int[] regularSort = new int[n];
			System.arraycopy(A, 0, regularSort, 0, n);
			Arrays.sort(regularSort);
		long regEndTime = System.currentTimeMillis();
		
		long regTime = regEndTime-regStartTime;
		
		System.out.println("Reg Sorted Array: " + Arrays.toString(regularSort));
		System.out.println("My  time: " + myTime);
		System.out.println("Reg time: " + regTime);
		
		again(A,n);
		
	}

	public static int[] sortArray(int[] X) {
		int n = X.length;
		int n1;
		int n2;
		if (!isEven(n)){
			float nFloat = n;
			n1 = (int) Math.floor(nFloat/2);
			n2 = (int) Math.ceil(nFloat/2);
		}
		else{
			n1 = n/2;
			n2 = n/2;
		}
		if (n == 1 || n == 0) {
			return X;
		}
		else {
			int[] A = new int[n];
			int[] B = new int[n1];
			int[] C = new int[n2];
			System.arraycopy(X, 0, B, 0, n1);
			System.arraycopy(X, n1, C, 0, n2);
			B = sortArray(B);
			C = sortArray(C);
			A = mergeArray(B,C);
			return A;
		}
	}

	public static int[] mergeArray(int[] B, int[] C) {
		int n = B.length + C.length;
		if(n == 2){
			int[] D = new int[2];
			if (B[0]<C[0]) {
				D[0] = B[0];
				D[1] = C[0];
			}
			else{
				D[0] = C[0];
				D[1] = B[0];	
			}
			return D;
		}
		int[] D = new int[n];
		int i = 0;
		int j = 0;
		for (int k = 0; k < D.length; k++) {
			if (i < B.length && j < C.length){
				if(B[i] < C[j]){
					D[k] = B[i];
					i++;
				}
				else{
					D[k] = C[j];
					j++;
				}
			}
			else if(i<B.length && j>=C.length){
				D[k] = B[i];
				i++;
			}
			else if(i>=B.length && j<C.length){
				D[k] = C[j];
				j++;
			}
		}
		return D;
	}
	
	public static boolean isEven(int n){
		return (n%2 == 0);
	}
	
	public static int[] createRandomArray(int n){
		int[] temp = new int[n];
		for (int i = 0; i < n; i++) {
			temp[i] = (int)(Math.random()*1000);
		}
		return temp;
	}
	
	public static boolean isValidAgain(int n){
		if (n < 0 || n > 2){
			System.out.println("Not a valid entry.  Please re-enter");
			return false;
		}
		else{
			return true;
		}
	}
	public static void again(int[]A, int n){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Do you want to run again?  0 = No.  1 = Yes with Same array.  2 = Yes with Different array.");
		int again = input.nextInt();
		while (!isValidAgain(again)){
			System.out.println("0 = No.  1 = Yes with Same array.  2 = Yes with Different array.");
			again = input.nextInt();
		}
		switch(again){
			case 0:
				break;
			case 1:
				body(A, n);
				break;
			case 2:
				body();
				break;
		}
	}
}
