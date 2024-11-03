package LVC_06_Rahul;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// User function Template for Java

class Solution_Kruskal {
    public static void main (String[] args) {
        int V = 5;
        ArrayList<Edge> graph = new ArrayList<Edge>(5);
        int[][] edges =  {{0, 1, 2}, {0, 2, 1}, {1, 2, 1}, {2, 3, 2}, {3, 4, 1}, {4, 2, 2}};

        for (int i = 0; i < V; i++) {
           graph.add(new Edge(edges[i][0],edges[i][1],edges[i][2]));
           
        }
        System.out.println(graph);

        Kruskal obj = new Kruskal();
        int mstWt = obj.spanningTree(V, graph);
        System.out.println("The sum of all the edge weights: " + mstWt);

    }
}
