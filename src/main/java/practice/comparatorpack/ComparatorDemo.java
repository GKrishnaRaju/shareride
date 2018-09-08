package practice.comparatorpack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

class Box {// step 1
	int l, b;

	public Box(int l, int b) {
		this.l = l;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Box [l=" + l + ", b=" + b + "]";
	}

}

class BoxLCompartor implements Comparator<Box> {

	@Override
	public int compare(Box o1, Box o2) {
		if (o1.l > o2.l)
			return 1;
		return -1;
	}

}

public class ComparatorDemo {
	public static void main(String[] args) {
		Box b1 = new Box(4, 5);
		Box b2 = new Box(2, 3);
		Box b3 = new Box(1, 4);

		BoxLCompartor  bc = new BoxLCompartor();
		
		TreeSet<Box> tsb = new TreeSet<>(bc);
		tsb.add(b1);
		tsb.add(b2);
		tsb.add(b3);
		System.out.println(tsb);

		ArrayList<Box> al = new ArrayList();
		al.add(b1);
		al.add(b2);
		al.add(b3);
		System.out.println("---------with array list --------");
		System.out.println(al);
		al.sort(bc);
		System.out.println(al);
	}
}
