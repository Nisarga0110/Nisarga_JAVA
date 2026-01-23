package Nisarga;

public class EmpNameProcess {

	public static void main(String[] args) {
	        
	        String[] employees = {
	            "Nis","Niv","Raghu", "soumya"};

	      
	        for (int i = 0; i < employees.length; i++) {

	            String name = employees[i];

	            System.out.println("Employee: " + name);

	          
	            if (name.length() > 10) {
	                System.out.println("Long Name");
	            } 
	            else if (!name.contains(" ")) {
	                System.out.println("Single Word Name");
	            } 
	            else {
	                System.out.println("Normal Name");
	            }

	          
	            String upper = name.toUpperCase();
	            System.out.println("UPPER: " + upper);

	          
	            StringBuffer sb = new StringBuffer(name);
	            System.out.println("REVERSE: " + sb.reverse());

	        
	            StringBuilder sbuilder = new StringBuilder(name);
	            sbuilder.append(" - Verified");
	            System.out.println("APPENDED: " + sbuilder);

	            System.out.println(); 
	        }
	    }
	}

		

	
