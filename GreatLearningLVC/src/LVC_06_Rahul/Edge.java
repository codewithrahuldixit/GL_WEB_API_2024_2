package LVC_06_Rahul;
public class Edge implements Comparable<Edge> {
    int src, dest, weight;
    Edge(int _src, int _dest, int _wt) {
        this.src = _src; 
        this.dest = _dest; 
        this.weight = _wt;
    }
    // Comparator function used for
    // sorting edgesbased on their weight
    public int compareTo(Edge compareEdge) {
        return this.weight - compareEdge.weight;
    }
	@Override
	public String toString() {
		return "Edge [src=" + src + ", dest=" + dest + ", weight=" + weight + "]";
	}
	
    
};
