package LVC_05;



public class DisjointusingSize {
	private DisjointSet ds;

	public DisjointusingSize(int n) {
		super();
		this.ds = new DisjointSet(n);
	}

	public int findUPar(int node) {
		if (node == ds.parent.get(node)) {
			return node;
		}
		int ulp = findUPar(ds.parent.get(node));
		ds.parent.set(node, ulp);
		return ds.parent.get(node);
	}

	public void unionBySize(int u, int v) {
        int super_u = findUPar(u);
        int super_v = findUPar(v);
        if (super_u == super_v) return;
        if (ds.size.get(super_u) < ds.size.get(super_v)) {
            ds.parent.set(super_u, super_v);
            ds.size.set(super_v, ds.size.get(super_v) + ds.size.get(super_u));
        } else {
        	ds.parent.set(super_v, super_u);
        	ds.size.set(super_u, ds.size.get(super_u) + ds.size.get(super_v));
        }
    }

}
