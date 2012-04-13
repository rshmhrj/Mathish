package AlgoClass;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class AdjacencyList {

	public static int[][] generateArrayFromAdjacencyList(String problem, String filename, int length) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader(
				"C://EclipseWorkspaces//public//Mathish//src//AlgoClass//Questions//"+problem+"//"+filename+".txt"));
		int[][] AdjList = new int[length][];
		int n = 0;
		while (in.ready()) { 
			String line = in.readLine();
			Scanner input = new Scanner(line);

			int[] temp = new int[countNumbersOnLine(line)];
			int i = 0;
			while (line.length() > 1){
				int number = input.nextInt();
				String stringNumber = Integer.toString(number);
				int numberLength = stringNumber.length();
				int location = line.indexOf(stringNumber);
				line = line.substring(location+numberLength);
				temp[i] = number;
				i++;
			}
			
			AdjList[n] = new int[i];
			System.arraycopy(temp, 0, AdjList[n], 0, i);
			n++;
			}
		
		in.close();
		return AdjList;
	}
	
	public static int countNumbersOnLine(String line){
		int count = 0;
		int length = line.length();
		if (length <= 31) count = 5;
		else if (length <= 35) count = 6;
		else if (length < 40) count = 7;
		else count = 8;
		return count;
	}
}
