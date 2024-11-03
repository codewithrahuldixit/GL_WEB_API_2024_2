package LVC_06_Rahul;

public class Pair {
	public int node;
	public int distance;
	 public Pair(int distance, int node) {
	     this.node = node;
	     this.distance = distance;
	 }
	@Override
	public String toString() {
		return "Pair [node=" + node + ", distance=" + distance + "]";
	}
	 
	}
