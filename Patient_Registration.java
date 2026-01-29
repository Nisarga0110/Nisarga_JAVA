package Nisarga;
import java.util.HashMap;
import java.util.Map;



public class Patient_Registration {
	
 static Map<Integer, String> patients = new HashMap<>();

		    // adding
		    static void addPatient(int id, String name) {
		        patients.put(id, name);
		        System.out.println("Patient added");
		    }

		    // updating
		    static void updatePatient(int id, String name) {
		        if (patients.containsKey(id)) {
		            patients.put(id, name);
		            System.out.println("Patient updated");
		        } else {
		            System.out.println("Patient not found");
		        }
		    }

		    // get patient details
		    static void getPatient(int id) {
		        if (patients.containsKey(id)) {
		            System.out.println("Patient Name: " + patients.get(id));
		        } else {
		            System.out.println("Patient not found");
		        }
		    }

		    // removing
		    static void removePatient(int id) {
		        patients.remove(id);
		        System.out.println("Patient removed");
		    }

		    // list all patients
		    static void listPatients() {
		        System.out.println(patients);
		    }

		    // check existence
		    static void checkPatient(int id) {
		        System.out.println(patients.containsKey(id));
		    }

		    // count patients
		    static void countPatients() {
		        System.out.println("Total patients: " + patients.size());
		    }

		    // clear system
		    static void clearSystem() {
		        patients.clear();
		        System.out.println("All records cleared");
		    }

		    public static void main(String[] args) {

		        addPatient(1, "Ravi");
		        addPatient(2, "Anita");

		        getPatient(1);
		        
		        updatePatient(2, "Anita Sharma");

		        listPatients();
		        
		        checkPatient(3);

		        countPatients();
		        
		        removePatient(1);

		        clearSystem();
		    }
		}


	


