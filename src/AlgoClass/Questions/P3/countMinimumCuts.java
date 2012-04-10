package AlgoClass.Questions.P3;

import java.io.IOException;

import AlgoClass.AdjacencyList;

public class countMinimumCuts {

	public static void main(String[] args) throws IOException {
		System.out.println("This program will count the minimum number of cuts in a given Adjacency List.");
		body();
		System.out.println("End of program.");
	}
	
	public static void body() throws IOException {
		int[] test = AdjacencyList.generateArrayFromAdjacencyList("P3", "kargerAdj", 40);
		System.out.println(test);
	}
}
