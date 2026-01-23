package Nisarga;

class PatientRegistration{
	private int id;
	private String name;
	private int age;
	private String illness;
	
	
	void setInfo(int id,String name,int age,String illness) {
		this.id= id;
		this.name= name;
		this.age= age;
		this.illness= illness;
	}
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getIllness() {
		return illness;
	}
	void Display() {
		System.out.println("Patient Id :" + id);
		System.out.println("Patient Name :" + name);
		System.out.println("Patient Age :" + age);
		System.out.println("Patient Status :" + illness);
	}
};
 
abstract class Doctor{
	public static String DocName;
	public static String Specialisation;
	
	public void DocInfo(String DocName, String Specialisation) {
		System.out.println("Docter Name :"+ DocName);
		System.out.println("Docter Speciality :"+ Specialisation);
	}
	
abstract void Diagnosed();
 
}
 
class DocS extends Doctor{
	void Diagnosed() {
		System.out.println("You have No Health issue");
	}
}
 
 
 
public class HealthSector {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatientRegistration Pr= new PatientRegistration();
		Pr.setInfo(123, "sagar", 24, "Fine");
        Pr.Display();
		DocS D = new DocS();
		D.DocInfo("Dr.Sree", "cardio");
		D.Diagnosed();
	}
 
}
 