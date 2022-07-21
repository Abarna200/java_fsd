package assist_practice;
import java.util.*;
public class collections {
	public static void main(String[] args) {
		//creating arraylist
		System.out.println(" ArrayList");
		ArrayList<String> animals=new ArrayList<String>();   
	      animals.add("Dog");//
	      animals.add("Cat");    	   
	      System.out.println(animals);  
		
		//creating linkedlist
	      System.out.println("\n LinkedList");
	      LinkedList<String> fruits=new LinkedList<String>();  
	      fruits.add("Mango");  
	      fruits.add("Apple");  	      
	      Iterator<String> itr=fruits.iterator();  
	      while(itr.hasNext()) 
	      System.out.println(itr.next());  
	       
	       //creating hashset
	       System.out.println("\n HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(51);  
	       set.add(33);  
	       set.add(12);
	       set.add(19);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("\n LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);	       
	       System.out.println(set2);
	      	} 
	      }  
	

