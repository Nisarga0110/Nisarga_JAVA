package Nisarga;
import java.util.*;

public class BankEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer age = 25;
		Integer CIBIL_Score = 700;
		ArrayList<Double>income = new ArrayList<>();
		
		income.add(25000.00);
		income.add(35000.00);//autoBoxing
		double MonthlyIncome = income.get(0);//unboxing
		if(age>=25 && CIBIL_Score >= 700 && MonthlyIncome>=25000.00) {
			System.out.println("loan approved");
		}else {
			System.out.println("Loan not approved");
		}
		age.intValue();//wrapper classes
		CIBIL_Score.intValue();
		
		
		

	}

}
