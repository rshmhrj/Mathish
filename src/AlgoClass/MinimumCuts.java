package AlgoClass;

import java.util.Arrays;
import AlgoClass.AdjacencyList;

import math.Maths;

public class MinimumCuts {

	public static int cut(int[][] graph){
		while (graph.length > 2){
			//randomly choose one edge (u,v)
			int[] edgesToCut = Maths.twoRandoms(1, AdjacencyList.countEdgesUndirected(graph));
			while(!AdjacencyList.checkIfEdgeExists(graph, edgesToCut)){
				System.out.println(Arrays.toString(edgesToCut));
				edgesToCut = Maths.twoRandoms(1, AdjacencyList.countEdgesUndirected(graph));
			}
			System.out.println(Arrays.toString(edgesToCut));
			
			


			
			//merge/contract u & v into a single vertex
			graph = contract(graph,edgesToCut);
			Array.printAdjacencyListArray(graph);			
			
			
			//remove all self loops
			//break;
		}
		
		return graph.length;
	}
	
	public static int[][] contract(int[][] graph, int[] edge){
		int contractedVertex = Integer.parseInt((Integer.toString(edge[0]) + Integer.toString(edge[1])));
		int contractedVertexLength = 0;
		
		int[][] result = new int[graph.length-1][];
		int i = 1; // location to insert into result
		
		for (int[] vertex : graph){
			if (vertex[0] != edge[0] && vertex[0] != edge[1]){
				int modifiedVertexLength = vertex.length;
				for (int insideVertex = 1; insideVertex < vertex.length; insideVertex++){
					if (vertex[insideVertex] == edge[0] || vertex[insideVertex] == edge[1]){
						if (alreadyExists(contractedVertex, vertex))
						vertex[insideVertex] = contractedVertex;
					}
				}
				result[i] = new int[vertex.length];
				System.arraycopy(vertex, 0, result[i], 0, vertex.length);
				i++;
			}
			else{
				contractedVertexLength += vertex.length;
			}
		}
		int[] temp = new int[Integer.parseInt((Integer.toString(edge[0]) + Integer.toString(edge[1]))) - 4 + 1];
		int j = 1;
		for (int[] vertex:graph){
			if(vertex[0] == edge[0]){
				for (int k = 1; k < vertex.length; k++){
					if (vertex[k] != edge[1]){
						temp[j] = vertex[k];
						j++;
					}
				}
			}
			if(vertex[0] == edge[1]){
				for (int k = 1; k < vertex.length; k++){
					if (vertex[k] != edge[0]){
						temp[j] = vertex[k];
						j++;
					}
				}
			}
		}
		System.out.println(Arrays.toString(temp));
		temp[0] = contractedVertex;
		result[0] = temp;
		
		return result;
	}
}
