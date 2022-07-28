package collectionsdemo;

import java.util.ArrayList;

public class ListDemo2 {
	public static void main(String[] args) {
		
	
	ArrayList list=new ArrayList();
	list.add(12);
	list.add(552);
	list.add(65);
	list.add("hello");
	list.add(56);
	System.out.println(list);
	ArrayList<Integer> list2=new ArrayList<Integer>();
	list2.add(12);
	list2.add(552);
	list2.add(65);
	//list2.add("hello");
	list2.add(56);
	System.out.println(list2);
	ArrayList<String> list3=new ArrayList<String>();
	list3.add("Hi");
	list3.add("How");
	list3.add("are");
	list3.add("you");
	System.out.println(list3);
	
	}

}
