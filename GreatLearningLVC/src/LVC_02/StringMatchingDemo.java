package LVC_02;

public class StringMatchingDemo {
	public static void main(String[] args) {
		String s = "Rahul Kumar Dixit";
		String s1 = "Dixit";
		System.out.println(StringMatching(s,s1));
	}
	private static String StringMatching(String s, String s1) {
		int M = s1.length();
		 int N = s.length();
		 for (int i = 0; i <= N - M; i++) 
			{ 
			int j; 
			for (j = 0; j < M; j++) 
			if (s.charAt(i+j) != s1.charAt(j)) 
			break;
			 if (j == M) 
			return "The Given Pattern Is A Substring Of Given String"; 
			}
		 return "The Given Pattern Is Not A Substring Of Given String";
	}
}
