package LVC_04;

import java.util.Scanner;

public class HorspoolDemo {
	public static int SIZE = 500;
	public static int table[] = new int[SIZE];
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int pos;
		System.out.println("Enter the String ");
		String source = sc.nextLine();
		System.out.println("Enter the Pattern ");
		String pattern = sc.nextLine();
		System.out.println(source);
		System.out.println(pattern);

		shifttable(pattern);
		pos = horspool(source, pattern);

		if (pos == -1)
			System.out.println("PATTERN NOT FOUND");
		else
			System.out.println("PATTERN FOUND FROM POSITION: \t" + pos + "\n");
	}

	private static int horspool(String source, String pattern) {
		int i, k, pos, m;
		char s[] = source.toCharArray();
		char p[] = pattern.toCharArray();
		m = pattern.length();
		//i is used to keep track of source is exhausted 
		i = m - 1;
		while (i < source.length()) {
			k = 0;
			//k is Keep Tracking the pattern from last
			//And comparing with the source 
			while ((k < m) && (p[m - 1 - k] == s[i - k]))
				k++;
			if (k == m) {
				pos = i - m + 1;
				return pos;
			} else
				//how many shift taken place in horspool decided by the last character
				i += table[s[i]];
		}
		return -1;
	}

	private static void shifttable(String pattern) {
		int i, j, m;
		char p[] = pattern.toCharArray();
		m = pattern.length();

		for (i = 0; i < SIZE; i++)
			table[i] = m;
		for (j = 0; j < m; j++)
			table[p[j]] = m - 1 - j;

	}
}
