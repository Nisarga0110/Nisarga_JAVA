package Nisarga;
import java .util.Scanner;

public class Seq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n= sc.nextInt();
        if(n>1) {
        	System.out.println("n should be greater than 1");
        for(int i=1;i<=n;i++) {
        	System.out.print(i + " ");
        }
        }System.out.println("n should be greater than 1");
	}

}
