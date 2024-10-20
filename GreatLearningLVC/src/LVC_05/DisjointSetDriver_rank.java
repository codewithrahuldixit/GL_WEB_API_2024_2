package LVC_05;

public class DisjointSetDriver_rank {
	  public static void main (String[] args) {
	    	DisjointusingRank ds = new DisjointusingRank(7);
	        ds.unionByRank(1, 2);
	        ds.unionByRank(2, 3);
	        ds.unionByRank(4, 5);
	        ds.unionByRank(6, 7);
	        ds.unionByRank(5, 6);

	        // if 3 and 7 same or not
	        if (ds.findUPar(3) == ds.findUPar(7)) {
	            System.out.println("Same");
	        } else
	            System.out.println("Not Same");

	        ds.unionByRank(3, 7);
	        if (ds.findUPar(3) == ds.findUPar(7)) {
	            System.out.println("Same");
	        } else
	            System.out.println("Not Same");
	    }

} 