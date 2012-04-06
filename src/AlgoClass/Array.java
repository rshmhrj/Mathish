package AlgoClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Array {
	
	public static int[] populate(String problem, String filename) throws IOException{
			BufferedReader in = new BufferedReader(new FileReader(
					"C://EclipseWorkspaces//public//Mathish//src//AlgoClass//Questions//"+problem+"//"+filename+".txt"));
			int[] temp = new int[100000];
			int n = 0;
			while (in.ready()) { 
				String line = in.readLine();
				line = line.replace(" ", "");
				temp[n] = Integer.parseInt(line);
				n++;
				}
			in.close();
			int[] IntegerArray = new int[n];
			System.arraycopy(temp, 0, IntegerArray, 0, n);
			//System.out.println(Arrays.toString(IntegerArray));
			return IntegerArray;
	}
	
	public static int[] populate(String problem, String filename, int arraySize) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader(
				"C://EclipseWorkspaces//public//Mathish//src//AlgoClass//Questions//"+problem+"//"+filename+".txt"));
		int[] IntegerArray = new int[arraySize];
		int n = 0;
		while (in.ready() && n < arraySize) { 
			String line = in.readLine();
			line = line.replace(" ", "");
			IntegerArray[n] = Integer.parseInt(line);
			n++;
			}
		in.close();
		//System.out.println(Arrays.toString(IntegerArray));
		return IntegerArray;
	}
	
	public static void swap(int[]A, int x, int y){
		int temp = A[x];
		A[x] = A[y];
		A[y] = temp;
	}
	
    public static void vecswap(int x[], int a, int b, int n) {
    	for (int i=0; i<n; i++, a++, b++)
    	    swap(x, a, b);
        }
    
	public static int[] createRandomArray(int n){
		int[] temp = new int[n];
		for (int i = 0; i < n; i++) {
			temp[i] = (int)(Math.random()*1000);
		}
		return temp;
	}
}
