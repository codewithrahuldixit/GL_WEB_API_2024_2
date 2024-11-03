package LVC_06_Rahul;
import java.util.*;

//User function Template for Java


class Solution {
//Function to find sum of weights of edges of the Minimum Spanning Tree.
static int spanningTree(int V,
		 ArrayList<ArrayList<Pair>> adj) {
   PriorityQueue<Pair> pq =
       new PriorityQueue<Pair>((x, y) -> x.distance - y.distance);

   int[] vis = new int[V];
   // {wt, node}
   pq.add(new Pair(0, 0));
   int sum = 0;
   while (pq.size() > 0) {
       int wt = pq.peek().distance;
       int node = pq.peek().node;
       pq.remove();

       if (vis[node] == 1) continue;
       // add it to the mst
       vis[node] = 1;
       sum += wt;

       for (int i = 0; i < adj.get(node).size(); i++) {
          int edW = adj.get(node).get(i).distance;
           int adjNode = adj.get(node).get(i).node;
           if (vis[adjNode] == 0) {
               pq.add(new Pair(edW, adjNode));
           }
       }
   }
   return sum;
}
}

public class Solution_Prims {
public static void main(String[] args) {
   int V = 5;
   //ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
   int[][] edges =  {{0, 1, 2}, {0, 2, 1}, {1, 2, 1}, {2, 3, 2}, {3, 4, 1}, {4, 2, 2}};

   ArrayList<ArrayList<Pair>> adj = new ArrayList<>(); 
   for(int i = 0;i<V;i++) {
       adj.add(new ArrayList<>()); 
   }
   for(int i = 0;i<edges.length;i++) {
       adj.get(edges[i][0]).add(new Pair(edges[i][2], edges[i][1])); 
       adj.get(edges[i][1]).add(new Pair(edges[i][2], edges[i][0])); 
   }     
   System.out.println(adj);
   
   Solution obj = new Solution();
   int sum = obj.spanningTree(V, adj);
   System.out.println("The sum of all the edge weights: " + sum);
}
}