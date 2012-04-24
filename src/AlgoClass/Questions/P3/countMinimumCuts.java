package AlgoClass.Questions.P3;

import java.io.IOException;
import java.util.Arrays;

import AlgoClass.AdjacencyList;
import AlgoClass.Array;
import AlgoClass.MinimumCuts;

public class countMinimumCuts {

	private static int minimumCuts = 0;
	
	public static void main(String[] args) throws IOException {
		System.out.println("This program will count the minimum number of cuts in a given Adjacency List.");
		body();
		System.out.println("End of program.");
	}
	
	public static void body() throws IOException {
//		int[][] test = AdjacencyList.generateArrayFromAdjacencyList("P3", "kargerAdj (1)", 40);
		int[][] test = AdjacencyList.generateArrayFromAdjacencyList("P3", "box1", 4);
		Array.printAdjacencyListArray(test);
		int vertexCount = AdjacencyList.countVerticesUndirected(test);
		int edgeCount = AdjacencyList.countEdgesUndirected(test);
		System.out.println("Number of Vertices = " + vertexCount);
		System.out.println("Number of Edges = " + edgeCount);
		MinimumCuts.cut(test);
	}
	
	public static void countMinCuts(int[][] graph, int numberOfExecutions){
		int iterationCounter = 0;
		while (iterationCounter < numberOfExecutions){
			MinimumCuts.cut(graph);
			
			iterationCounter++;
		}
	}
	
}
