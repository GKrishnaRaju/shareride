package practice.hashcodepack;

import java.util.HashSet;

class Box {
	int l, b;

	public Box(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Box [l=" + l + ", b=" + b + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + b;
		result = prime * result + l;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Box other = (Box) obj;
		if (b != other.b)
			return false;
		if (l != other.l)
			return false;
		return true;
	}

}

public class HashCodeDemo {
	public static void main(String[] args) {

		HashSet<Box> hs = new HashSet<Box>();
		Box b1 = new Box(4, 5);
		hs.add(b1);
		Box b2 = new Box(4, 5);
		System.out.println(hs.contains(b2));
		System.out.println(hs.contains(b1));

		System.out.println(hs.size());

	}

}
