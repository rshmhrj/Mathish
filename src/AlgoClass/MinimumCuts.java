package AlgoClass;

import java.util.Arrays;
import AlgoClass.AdjacencyList;

import math.Maths;

public class MinimumCuts {

	public static int cut(int[][] graph){
		int iteration = 1;
		while (graph.length > 2){
			int[] leadingValues = Array.extractLeadingValues(graph);
			
			//randomly choose one edge (u,v)
			int[] edgesToCut = Array.chooseTwoRandomElements(leadingValues);
			
			while(!AdjacencyList.checkIfEdgeExists(graph, edgesToCut)){
				edgesToCut = Array.chooseTwoRandomElements(leadingValues);
			}

			//merge/contract u & v into a single vertex
			graph = contract(graph,edgesToCut,iteration);
			iteration++;
		}
		
		return graph[1].length-1;
	}
	
	public static int[][] contract(int[][] graph, int[] edge, int iteration){
		int contractedVertex = 1000*iteration;
				//Integer.parseInt((Integer.toString(edge[0]) + Integer.toString(edge[1])));
		int contractedVertexLength = 0;
		
		int[][] result = new int[graph.length-1][];
		int i = 1; // location to insert into result
		
		for (int[] vertex : graph){
			if (vertex[0] != edge[0] && vertex[0] != edge[1]){
				int modifiedVertexLength = vertex.length;
				for (int insideVertex = 1; insideVertex < vertex.length; insideVertex++){
					if (vertex[insideVertex] == edge[0] || vertex[insideVertex] == edge[1]){
						vertex[insideVertex] = contractedVertex;
					}
				}
				result[i] = new int[modifiedVertexLength];
				System.arraycopy(vertex, 0, result[i], 0, modifiedVertexLength);
				i++;
			}
			else{
				int vertexLengthMinusDoubles = 0;
				for (int insideVertex = 1; insideVertex < vertex.length; insideVertex++){
					if(vertex[insideVertex] == edge[0] || vertex[insideVertex] == edge[1]){
						vertexLengthMinusDoubles += 1;
					}
				}
				contractedVertexLength += vertex.length - vertexLengthMinusDoubles;
			}
		}
		int[] temp = new int[contractedVertexLength - 1];
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
		temp[0] = contractedVertex;
		result[0] = temp;
		
		return result;
	}
	
	public static int cut(long[][] graph){
		int iteration = 1;
		while (graph.length > 2){
			int[] leadingValues = Array.extractLeadingValues(graph);
			
			//randomly choose one edge (u,v)
			int[] edgesToCut = Array.chooseTwoRandomElements(leadingValues);
			
			while(!AdjacencyList.checkIfEdgeExists(graph, edgesToCut)){
				edgesToCut = Array.chooseTwoRandomElements(leadingValues);
			}

			//merge/contract u & v into a single vertex
			graph = contract(graph,edgesToCut,iteration);
			iteration++;
		}
		
		return graph[1].length-1;
	}
	
	public static long[][] contract(long[][] graph, int[] edge, int iteration){
		long contractedVertex = 1000*iteration;
		int contractedVertexLength = 0;
		
		long[][] result = new long[graph.length-1][];
		int i = 1; // location to insert into result
		
		for (long[] vertex : graph){
			if (vertex[0] != edge[0] && vertex[0] != edge[1]){
				int modifiedVertexLength = vertex.length;
				for (int insideVertex = 1; insideVertex < vertex.length; insideVertex++){
					if (vertex[insideVertex] == edge[0] || vertex[insideVertex] == edge[1]){
						vertex[insideVertex] = contractedVertex;
					}
				}
				result[i] = new long[modifiedVertexLength];
				System.arraycopy(vertex, 0, result[i], 0, modifiedVertexLength);
				i++;
			}
			else{
				int vertexLengthMinusDoubles = 0;
				for (int insideVertex = 1; insideVertex < vertex.length; insideVertex++){
					if(vertex[insideVertex] == edge[0] || vertex[insideVertex] == edge[1]){
						vertexLengthMinusDoubles += 1;
					}
				}
				contractedVertexLength += vertex.length - vertexLengthMinusDoubles;
			}
		}
		long[] temp = new long[contractedVertexLength - 1];
		int j = 1;
		for (long[] vertex:graph){
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
		temp[0] = contractedVertex;
		result[0] = temp;
		
//		System.out.println(iteration+Arrays.toString(temp));
		return result;
	}

}
