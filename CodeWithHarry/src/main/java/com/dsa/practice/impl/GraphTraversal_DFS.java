package com.dsa.practice.impl;

public class GraphTraversal_DFS {

	public static void main(String[] args) {

		// DFS Implementation
		int[] visited = { 0, 0, 0, 0, 0, 0, 0 };
		int[][] graph = { 
				{ 0, 1, 1, 1, 0, 0, 0 }, 
				{ 1, 0, 1, 0, 0, 0, 0 }, 
				{ 1, 1, 0, 1, 1, 0, 0 },
				{ 1, 0, 1, 0, 1, 0, 0 }, 
				{ 0, 0, 1, 1, 0, 1, 1 }, 
				{ 0, 0, 0, 0, 1, 0, 0 }, 
				{ 0, 0, 0, 0, 1, 0, 0 } 
			};

		int startingNode = 5;
		DFS(graph, visited, startingNode);
		
	}
	
	public static void DFS(int[][] graph, int[] visited, int node1) {
		System.out.print(node1 + " ");
		visited[node1] = 1;
		for (int node2 = 0; node2 < 7; node2++) {
			if (graph[node1][node2] == 1 && visited[node2] == 0) {
				DFS(graph, visited, node2);
			}
		}
	}
}