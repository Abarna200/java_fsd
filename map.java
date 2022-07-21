package assist_practice;
import java.util.*;
public class map {
	public static void main(String[] args) {
		//Hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Tom");    
	      hm.put(2,"Jack");    
	      hm.put(3,"Spike");   
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry<Integer,String> m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	     //HashTable
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      ht.put(4,"High");  
	      ht.put(5,"Low");  
	      ht.put(6,"Medium");
	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry<Integer,String> n:ht.entrySet()){    
	      System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      //TreeMap
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Cow");    
	      map.put(9,"Cat");    
	      map.put(10,"Dog");       
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry<Integer,String> l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  

}
