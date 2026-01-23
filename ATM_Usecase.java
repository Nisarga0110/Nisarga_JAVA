package Nisarga;
import java.util.Scanner;

public class ATM_Usecase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Correct_pin = 1234;
		//int i =1;
		//while(i<=4){
		try {
			System.out.println("enter the pin");
			int pin = sc.nextInt();
			if(pin == Correct_pin) {
				System.out.println("Pin is correct");
				}
			else {
				throw new Exception("wrong pin!!! Retry again");
			}
		}
			
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
		       // i++;
		//}
			
		}
		

	}


