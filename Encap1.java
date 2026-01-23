package Nisarga;

public class Encap1 {
	private double salary;
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encap1 en = new Encap1();
		en.setSalary(8000.0);
		System.out.println(en.getSalary());
	}
}
