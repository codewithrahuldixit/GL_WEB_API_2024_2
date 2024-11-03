package LVC_06_Rahul;

import java.util.ArrayList;
import java.util.Collections;

public class Kruskal {
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
    static int spanningTree(int V,ArrayList<Edge> edges) {
    	ArrayList<Edge> result = new ArrayList<Edge>();
        Collections.sort(edges); 
        System.out.println(edges);
        DisjointusingSize ds = new DisjointusingSize(V);        
        int mstWt = 0;
        // M x 4 x alpha x 2
        for (int i = 0; i < edges.size(); i++) {
            int wt = edges.get(i).weight;
            int u = edges.get(i).src;
            int v = edges.get(i).dest;
            if (ds.findUPar(u) != ds.findUPar(v)) {
                mstWt += wt;
                result.add(edges.get(i));
                ds.unionBySize(u, v);
            }
        }
        System.out.println("Minimum " + result);
        return mstWt;
    }
}
