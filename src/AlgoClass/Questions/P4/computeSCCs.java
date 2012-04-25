package AlgoClass.Questions.P4;

import java.io.IOException;
import java.util.Stack;

import AlgoClass.DepthFirst;
import AlgoClass.DirectedGraph;

public class computeSCCs {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("This program will compute the SCCs in a Directed Graph.");
		body();
		System.out.println("End of Program.");
	}
	
	public static void body() throws IOException{
		//read graph
		int[][][] bigGraph = DirectedGraph.generateArrays("P4", "test1", 9);
		int[][] G = bigGraph[0];
		int[][] Grev = bigGraph[1];
		
//		DirectedGraph.print(bigGraph);
//		System.out.println("--------");
		DirectedGraph.print(G);
		System.out.println("--------");
		DirectedGraph.print(Grev);
		System.out.println("--------");
		
		
		//create forward and reverse graphs
	}

}
