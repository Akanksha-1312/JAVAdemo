package maps;
import java.util.*;
public class HashTables {
	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(1,"Anny");  
	      ht.put(4,"Bunny");  
	      ht.put(6,"Sweety");  
	      ht.put(8,"Jonny");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }

		
	}

}
