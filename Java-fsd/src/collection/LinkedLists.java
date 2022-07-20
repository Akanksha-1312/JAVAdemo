package collection;
import java.util.*;

public class LinkedLists {
public static void main(String[] args) {
	System.out.println("LinkedList ");
    LinkedList<String> names=new LinkedList<String>();  
    names.add("Akanksha");  
    names.add("jenifier");  	      
    Iterator<String> itr=names.iterator();  
    while(itr.hasNext()){  
     System.out.println(itr.next()); 
}

}}
