package LVC_05;

public class DisjointSetDriver_size {
	  public static void main (String[] args) {
	    	DisjointusingSize ds = new DisjointusingSize(7);
	        ds.unionBySize(1, 2);
	        ds.unionBySize(2, 3);
	        ds.unionBySize(4, 5);
	        ds.unionBySize(6, 7);
	        ds.unionBySize(5, 6);

	        // if 3 and 7 same or not
	        if (ds.findUPar(3) == ds.findUPar(7)) {
	            System.out.println("Same");
	        } else
	            System.out.println("Not Same");

	        ds.unionBySize(3, 7);
	        if (ds.findUPar(3) == ds.findUPar(7)) {
	            System.out.println("Same");
	        } else
	            System.out.println("Not Same");
	    }

} 