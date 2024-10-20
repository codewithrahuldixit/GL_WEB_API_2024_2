package LVC_04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphDemo {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Code For Adjacency Matrix Representation
		 //boolean graphMatrix [][] = createAdjMatrix(); 
	//	 print(graphMatrix);
		 
		 //Code For Adjacency list Representation 
	//	ArrayList<ArrayList<Integer>> list = createAdjList(); 
	//	printAdjList(list);
		
		/*//Breath First Search Traversal
		ArrayList<ArrayList<Integer>> list = createAdjList();
		printAdjList(list);
		System.out.println("Enter the Starting Node to Start Traversal ");
		int start = sc.nextInt();
		ArrayList<Integer> bfs = bfsTraversal(start, list);
		System.out.println("BFS Traversal as Follows ");
		System.out.println(bfs);
		*/
		ArrayList<ArrayList<Integer>> list = createAdjList();
		printAdjList(list);
		System.out.println("Enter the Starting Node to Start Traversal ");
		int start = sc.nextInt();
		boolean visted[] = new boolean[list.size()];
		ArrayList<Integer> dfs = new ArrayList<>();
		dfsTraversal(start,visted, list,dfs);
		System.out.println("BFS Traversal as Follows ");
		System.out.println(dfs);

	}

	private static ArrayList<Integer> bfsTraversal
	(int start , ArrayList<ArrayList<Integer>> adj) {
		ArrayList<Integer> bfs = new ArrayList<>();
		boolean visted[] = new boolean[adj.size()];
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visted[start] = true;
		while (!q.isEmpty()) {
			Integer node = q.poll();
			bfs.add(node);
			// Get all adjacent vertices of the dequeued vertex s
			// If a adjacent has not been visited, then mark it
			// visited and enqueue it
			for (Integer it : adj.get(node)) {
				if (visted[it] == false) {
					visted[it] = true;
					q.add(it);
				}
			}
		}
		return bfs;
	}
	
	public static void dfsTraversal(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, 
		    ArrayList<Integer> ls) {		        
		        //marking current node as visited
		        vis[node] = true;
		        ls.add(node);		        
		        //getting neighbour nodes
		        for(Integer it: adj.get(node)) {
		            if(vis[it] == false) {
		            	dfsTraversal(it, vis, adj, ls);
		            }
		        }
		    }

	private static void printAdjList(ArrayList<ArrayList<Integer>> list) {
		int i = 0;
		for (ArrayList<Integer> arrayList : list) {
			System.out.println(i + " ----- " + arrayList);
			i++;
		}
	}

	private static ArrayList<ArrayList<Integer>> createAdjList() {
		int n, e;
		System.out.println("Enter the number of Nodes in a Graph");
		n = sc.nextInt();
		System.out.println("Enter the number of Edges in a Graph");
		e = sc.nextInt();
		int edge[][] = getedges(n, e);
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		for (int i = 0; i < n+1; i++) {		
			list.add(new ArrayList<>());
		}
		for (int i = 1; i < edge.length; i++) {
			list.get(edge[i][0]).add(edge[i][1]);
			list.get(edge[i][1]).add(edge[i][0]);
		}
		return list;
	}

	private static int[][] getedges(int n, int e) {
		int edge[][] = new int[e+1][2];
		for (int i = 1; i < edge.length; i++) {
			System.out.println("Enter the " + i + " Edge pair");
			System.out.println("Enter the U");
			edge[i][0] = sc.nextInt();
			System.out.println("Enter the V");
			edge[i][1] = sc.nextInt();
		}
		return edge;
	}

	private static void print(boolean[][] graphMatrix) {
		for (int i = 1; i < graphMatrix.length; i++) {
			System.out.print("[ ");
			for (int j = 1; j < graphMatrix[i].length; j++) {
				System.out.print(" " + graphMatrix[i][j] + " ");
			}
			System.out.print(" ]");
			System.out.println("");
		}
	}

	public static boolean[][] createAdjMatrix() {
		int n, e;
		System.out.println("Enter the number of Nodes in a Graph");
		n = sc.nextInt();
		System.out.println("Enter the number of Edges in a Graph");
		e = sc.nextInt();
		int edge[][] = getedges(n, e);
		boolean matrix[][] = new boolean[n + 1][n + 1];
		for (int i = 1; i < edge.length; i++) {
			matrix[edge[i][0]][edge[i][1]] = true;
			matrix[edge[i][1]][edge[i][0]] = true;
		}
		return matrix;
	}
}
