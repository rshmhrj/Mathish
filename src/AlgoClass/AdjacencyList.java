package AlgoClass;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AdjacencyList {

	public static int[] generateArrayFromAdjacencyList(String problem, String filename, int length) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader(
				"C://EclipseWorkspaces//public//Mathish//src//AlgoClass//Questions//"+problem+"//"+filename+".txt"));
		int[] temp = new int[length];
		int n = 0;
		while (in.ready()) { 
			String line = in.readLine();
			Scanner input = new Scanner(line);
			while (line.length() > 0){
				int test = input.nextInt();
				System.out.println(test);
				line = "";
			}
			line = line.replace(" ", "");
			temp[n] = Integer.parseInt(line);
			n++;
			}
		in.close();
		int[] IntegerArray = new int[n];
		System.arraycopy(temp, 0, IntegerArray, 0, n);
		return temp;
	}
	
}
