package AlgoClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
//import java.util.Scanner;

public class CountInversions {
	
	static int left = 0;
	static int right = 0;
	static int split = 0;
	
	public static void main(String[] args) throws IOException {
		System.out.println("This program will sort an array and count the number of inversions.");
		body();
		System.out.println("End of Program.");
	}
	
	public static void body() throws IOException {
		//Scanner input = new Scanner(System.in);
		int[] A = populateArray();
		
		int[] mySort = sortAndCount(A, 100000);
		
		
	}
	
	public static int[] sortAndCount(int[] X, int A_length) {
		switch(A_length){
		case 1:
			return X;
		default:
			{		
				int B_length;
				int C_length;
				if (!isEven(A_length)){
					float A_length_float = A_length;
					B_length = (int) Math.floor(A_length_float/2);
					C_length = (int) Math.ceil(A_length_float/2);
				}
				else{
					B_length = A_length/2;
					C_length = A_length/2;
				}
				int[] A = new int[A_length];
				int[] B = new int[B_length];
				int[] C = new int[C_length];
				System.arraycopy(X, 0, B, 0, B_length);
				System.arraycopy(X, B_length, C, 0, C_length);
				B = sortAndCount(B,B_length);
				C = sortAndCount(C,C_length);
				A = mergeAndCountSplitInv(A_length,B,B_length,C,C_length);
				return A;
			}
		}
	}

	public static int[] mergeAndCountSplitInv(int A_length, int[] B, int B_length, int[] C, int C_length) {
		int[] D = new int[A_length];
		int i = 0;
		int j = 0;
		for (int k = 0; k < A_length; k++) {
			if (i < B_length && j < C_length){
				if(B[i] < C[j]){
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
	
	public static boolean isEven(int n){
		return (n%2 == 0);
	}
	
	public static int[] populateArray() throws IOException
	{
	BufferedReader in = new BufferedReader(new FileReader(
			"C:\\EclipseWorkspaces\\public\\Mathish\\src\\AlgoClass\\Questions\\IntegerArray.txt"));
	int[] IntegerArray = new int[100000];
	int n = 0;
	while (in.ready() && n < 100000) { 
		IntegerArray[n] = in.read();
		n++;
		}
	in.close();
	return IntegerArray;
	}
}
