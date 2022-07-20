package maps;
import java.util.*;
public class HashMaps {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Anny");    
	      hm.put(2,"Bunny");    
	      hm.put(3,"Canny");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }

		
	}

}
