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
		int arrayLength = input.nextInt();
		
		int[] A = new int[arrayLength];
		A = createRandomArray(arrayLength);
		System.out.println("Original   Array: " + Arrays.toString(A));
		
		long myStartTime = System.currentTimeMillis();
			int[] mySort = sortArray(A, arrayLength);
			System.out.println("My  Sorted Array: " + Arrays.toString(mySort));
		long myEndTime = System.currentTimeMillis();
		
		long myTime = myEndTime-myStartTime;

	
		long regStartTime = System.currentTimeMillis();
			int[] regularSort = new int[arrayLength];
			System.arraycopy(A, 0, regularSort, 0, arrayLength);
			Arrays.sort(regularSort);
		long regEndTime = System.currentTimeMillis();
		
		long regTime = regEndTime-regStartTime;
		
		System.out.println("Reg Sorted Array: " + Arrays.toString(regularSort));
		System.out.println("My  time: " + myTime);
		System.out.println("Reg time: " + regTime);
		
		again(A,arrayLength);
	}
	
		public static void body(int[] A, int arrayLength){
		System.out.println("Original   Array: " + Arrays.toString(A));
		
		long myStartTime = System.currentTimeMillis();
			int[] mySort = sortArray(A,arrayLength);
			System.out.println("My  Sorted Array: " + Arrays.toString(mySort));
		long myEndTime = System.currentTimeMillis();
		
		long myTime = myEndTime-myStartTime;
	
		
		long regStartTime = System.currentTimeMillis();
			int[] regularSort = new int[arrayLength];
			System.arraycopy(A, 0, regularSort, 0, arrayLength);
			Arrays.sort(regularSort);
		long regEndTime = System.currentTimeMillis();
		
		long regTime = regEndTime-regStartTime;
		
		System.out.println("Reg Sorted Array: " + Arrays.toString(regularSort));
		System.out.println("My  time: " + myTime);
		System.out.println("Reg time: " + regTime);
		
		again(A,arrayLength);
		
	}

	public static int[] sortArray(int[] X, int A_length) {
		switch(A_length){
//		case 0:
//			return X;
		case 1:
			return X;
		default:
			{		
				int B_length = A_length/2;
				int C_length = A_length - B_length;

				int[] A = new int[A_length];
				int[] B = new int[B_length];
				int[] C = new int[C_length];
				System.arraycopy(X, 0, B, 0, B_length);
				System.arraycopy(X, B_length, C, 0, C_length);
				B = sortArray(B,B_length);
				C = sortArray(C,C_length);
				A = mergeArray(A_length,B,B_length,C,C_length);
				return A;
			}
		}
	}

	public static int[] mergeArray(int A_length, int[] B, int B_length, int[] C, int C_length) {
		int[] D = new int[A_length];
		int i = 0;
		int j = 0;
		for (int k = 0; k < A_length; k++) {
			if (i < B_length && j < C_length){
				if(B[i] <= C[j]){
					D[k] = B[i];
					i++;
				}
				else{
					D[k] = C[j];
					j++;
				}
			}
			else if(j>=C_length && i<B_length){
				D[k] = B[i];
				i++;
			}
			else if(i>=B_length && j<C_length){
				D[k] = C[j];
				j++;
			}
		}
		return D;
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
