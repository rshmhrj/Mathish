package AlgoClass.Questions.P3;

import java.io.IOException;
import java.util.Scanner;

import AlgoClass.AdjacencyList;
import AlgoClass.MinimumCuts;

public class countMinimumCuts
	{

		private static int	minimumCuts;

		public static void main( String[] args ) throws IOException
			{
			System.out.println( "This program will count the minimum number of cuts in a given Adjacency List." );
			body();
			System.out.println( "End of program." );
			}

		public static void body() throws IOException
			{
			Scanner input = new Scanner( System.in );
			System.out.print( "Please enter the number of iterations:" );
			int iterations = input.nextInt();
			// long[][] test =
// AdjacencyList.generateArrayFromAdjacencyListLong("P3",
			// "kargerAdj (1)", 40);
			// int[][] test = AdjacencyList.generateArrayFromAdjacencyList("P3",
			// "box2", 4);
			// Array.printAdjacencyListArray(test);
			// long vertexCount = AdjacencyList.countVerticesUndirected(test);
			// long edgeCount = AdjacencyList.countEdgesUndirected(test);
			// System.out.println("Number of Vertices = " + vertexCount);
			// System.out.println("Number of Edges = " + edgeCount);
			//
			// System.out.println();

			countMinCuts( iterations );
			input.close();
			}

		public static void
				countMinCuts( int numberOfExecutions ) throws IOException
			{
			int iterationCounter = 1;
			minimumCuts = MinimumCuts.cut( AdjacencyList.generateArrayFromAdjacencyListInt( "P3",
																							"kargerAdj (1)",
																							40 ) );
			while ( iterationCounter <= numberOfExecutions )
				{
				int newMinCut = MinimumCuts.cut( AdjacencyList.generateArrayFromAdjacencyListInt(	"P3",
																									"kargerAdj (1)",
																									40 ) );
				if ( newMinCut < minimumCuts )
					{
					minimumCuts = newMinCut;
					}
				System.out.println( "Iteration " + iterationCounter + " Cut = "
									+ newMinCut );
				iterationCounter++;
				}
			System.out.println( "After " + numberOfExecutions + " iterations, " );
			System.out.println( "the minimum # of cuts = " + minimumCuts );
			}

	}
