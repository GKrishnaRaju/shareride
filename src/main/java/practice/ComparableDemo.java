package practice;
import java.util.ArrayList;
import java.util.TreeSet;
class Box implements Comparable<Box> {// step 1
	int l, b;
	public Box(int l, int b) {		this.l = l;		this.b = b;	}

	@Override
	public String toString() {		return "Box [l=" + l + ", b=" + b + "]";	}
	@Override
	public int compareTo(Box o) { // step 2
		if ((l > o.l) && (b > o.b))
			return 1;
		return -1;
//		if ((b > o.b))// && (b > o.b))
//			return 1;
//		return -1;
	}
}
public class ComparableDemo {
	public static void main(String[] args) {
		Box b1 = new Box(4, 5);
		Box b2 = new Box(2, 3);
		Box b3 = new Box(1, 4);
		
		TreeSet<Box> tsb = new TreeSet<>();
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
		al.sort(null);
		System.out.println(al);
	}
}
