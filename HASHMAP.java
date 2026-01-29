package Nisarga;
import java.util.*;
import java.util.Map;
 

public class HASHMAP {
public static void main(String[] args){
	Map<Integer, String>Employee = new HashMap<>();
	//HashMap<Integer, String>Employee1= new HashMap<>();{ two other ways to declare map object....
	//Map<Integer,String>Emp = new HashMap();
	 
			Employee.put(101, "Vinay");
			Employee.put(102, "Sonali");
			Employee.put(103, "Renu");//adding 
			System.out.println(Employee);
			
			System.out.println(Employee.containsKey(101)); //searching with a key
			System.out.println(Employee.containsValue("Vinay"));//searching for value
			//Employee.equals(Employee);
			System.out.println(Employee.get(101));
			System.out.println(Employee.getOrDefault(104, "Names"));
			
			
			
	 
		}
	 
	}

