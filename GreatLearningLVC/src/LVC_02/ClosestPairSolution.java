package LVC_02;

public class ClosestPairSolution {

	static class Pair{
		private int x;
		private int y;
		public Pair(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		public Pair() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Pair [x=" + x + ", y=" + y + "]";
		}
		public static float dist(Pair p1, Pair p2) {
		
		    return (float) Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) +
		                             (p1.y - p2.y) * (p1.y - p2.y)                   );}	}
	
	
	
	
	
	
	 public static String BruteClosestPair(Pair [] coord) {
		 float dmin=Float.MAX_VALUE;
			Pair minPair[]=new Pair[2];
			float dist;
			for(int i = 0 ; i<coord.length;i++)
				for(int j = i+1 ; j<coord.length;j++) {
					dist=Pair.dist(coord[i],coord[j]);
					if(dmin>dist) {
						dmin = dist;
						minPair[0]=coord[i];
						minPair[1]=coord[j];
						}
					}
			
			return "The Closest Pair are as Follows \n"+" 1:- "+minPair[0]+
					"\n 2:- "+minPair[1]+"\n with Minimum Distance "+dmin;
			
		 
	 }
	
	public static void main(String[] args) {
		Pair [] coord = {new Pair(5,6),new Pair(20,8),new Pair(40,65),new Pair(1,2)};
		System.out.println(BruteClosestPair(coord));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
