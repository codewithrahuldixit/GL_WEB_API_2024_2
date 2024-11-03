package LVC_05;



public class DisjointusingRank {
	private DisjointSet ds;

	public DisjointusingRank(int n) {
		super();
		this.ds = new DisjointSet(n);
	}

	public int findUPar(int node) {
		if (node == ds.parent.get(node)) {
			return node;
		}
		int super_p = findUPar(ds.parent.get(node));
		ds.parent.set(node, super_p);
		return ds.parent.get(node);
	}

	public void unionByRank(int u, int v) {
		int super_u = findUPar(u);
		int super_v= findUPar(v);
		if (super_u == super_v)
			return;
		if (ds.rank.get(super_u) < ds.rank.get(super_v)) {
			ds.parent.set(super_u, super_v);
		} else if (ds.rank.get(super_v) > ds.rank.get(super_u)) {
			ds.parent.set(super_v, super_u);
		} else {
			ds.parent.set(super_v, super_u);
			int rankU = ds.rank.get(super_u);
			ds.rank.set(super_u, rankU + 1);
		}
	}

}
