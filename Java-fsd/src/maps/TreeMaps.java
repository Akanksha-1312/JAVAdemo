package maps;
import java.util.*;
public class TreeMaps {
	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(5,"Anny");    
	      map.put(2,"Cutie");    
	      map.put(8,"Bunny");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());

	}

}}
