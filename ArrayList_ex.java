package Nisarga;
import java.util.*;

public class ArrayList_ex {

	public static void main(String[] args) {
			{
		List<String> names=new ArrayList<>();
		//ArrayList<String> name= new ArrayList<>();
		//ArrayList<String> name1= new ArrayList();
				names.add("Nis");//add
				names.add("Niv");
				names.add("Raghu");
				names.add("Soumya");
				names.add("hari");
				names.add(2, "john");//at particular index
				names.addFirst("kavya");// adds at first index
				names.addLast("rocky");//adds at last index
				names.contains("Nis");
				names.equals(names);
				names.get(0);
				names.getFirst();
				names.getLast();
				names.hashCode();
				names.indexOf("Raghu");
				names.isEmpty();
				names.iterator();
				names.lastIndexOf("hari");
				names.listIterator();
				names.remove(2);
				names.remove("kavya");
				names.removeFirst();
				names.removeLast();
				names.removeAll(names);
				names.retainAll(names);
				names.size();
				names.set(5, "aditi");
				
				System.out.println(names);
			}
		 
		}

	}
;

