package practice;

import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class SortString {

	public static void main(String[] args) {

		String s = "I Am In Banglore";
		StringTokenizer st = new StringTokenizer(s);
		TreeSet ts = new TreeSet();
		int i = 1;
		while (st.hasMoreTokens()) {

			String nextToken = st.nextToken();
			System.out.println("Tonken " + i + "  " + nextToken);
			i++;

			ts.add(nextToken);
		}
		System.out.println(ts);

		ArrayList al = new ArrayList();

		String a[] = { "boy", "dog", "cat" };
		for (int j = 0; j < a.length; j++) {
			al.add(a[j]);
		}

		System.out.println(al);
		al.sort(null);
		System.out.println(al);

	}

}
