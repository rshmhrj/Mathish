package AlgoClass;

import java.util.Arrays;

@SuppressWarnings("javadoc")
public class MergeSort {

	public static void main(String[] args) {
		System.out.println("This program will sort an array.");
//		int A[] = { 5, 4, 1, 8, 7, 2, 6, 3, 9 };
		int n = 100;
		int[] A = new int[n];
		A = createRandomArray(n);
		System.out.println("Original Array: " + Arrays.toString(A));
		double myStartTime = System.currentTimeMillis();
			int[] mySort = sortArray(A);
			System.out.println("My  Sorted Array: " + Arrays.toString(mySort));
		double myEndTime = System.currentTimeMillis();
		
		double myTime = myEndTime-myStartTime;

		

		double regStartTime = System.currentTimeMillis();
			int[] regularSort = A;
			Arrays.sort(regularSort);
		double regEndTime = System.currentTimeMillis();
		
		double regTime = regEndTime-regStartTime;
		
		System.out.println("Reg Sorted Array: " + Arrays.toString(regularSort));
		System.out.println("My  time: " + myTime);
		System.out.println("Reg time: " + regTime);
		System.out.println("End of Program.");
	}

	public static int[] sortArray(int[] X) {
		int n = X.length;
		int n1;
		int n2;
		if (!isEven(n)){
			float nFloat = n;
			n1 = (int) Math.floor(nFloat/2);
			n2 = (int) Math.ceil(nFloat/2);
//			System.out.println("n1 = " + n1 + "; n2 = " + n2);
		}
		else{
			n1 = n/2;
			n2 = n/2;
//			System.out.println("n1 = " + n1 + "; n2 = " + n2);
		}
		if (n == 1 || n == 0) {
			return X;
		}
//		else if(n == 2){
//			int y = X[0];
//			int z = X[1];
//			int[] sorted = new int[2];
//			if (y < z){
//				sorted[0] = y;
//				sorted[1] = z;
//			}
//			else{
//				sorted[0] = z;
//				sorted[1] = y;
//			}
//			return sorted;
//		}
		else {
			int[] A = new int[n];
			int[] B = new int[n1];
			int[] C = new int[n2];
			System.arraycopy(X, 0, B, 0, n1);
			System.arraycopy(X, n1, C, 0, n2);
			B = sortArray(B);
			C = sortArray(C);
			A = mergeArray(B,C);
//			System.out.println("A = " + Arrays.toString(A));
//			System.out.println("B = " + Arrays.toString(B));
//			System.out.println("C = " + Arrays.toString(C));
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
}
