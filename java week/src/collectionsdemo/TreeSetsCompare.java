package collectionsdemo;

import java.util.TreeSet;

public class TreeSetsCompare {
	public static void main(String[] args) {
		TreeSet<String> ts= new TreeSet<>();
		ts.add("hi");
		ts.add("is");
		ts.add("good");
		System.out.println(ts);
		TreeSet<String> ts2= new TreeSet<>(new StringComparators());
		ts2.add("hi");
		ts2.add("is");
		ts2.add("good");
		System.out.println(ts2);
	}

}
