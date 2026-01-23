package Nisarga;

public class throw1 {
public static void main(String[] args) {
		int bal=2000;
		try {
			if(bal <5000) {
				throw new Exception("Insufficient bal");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		}
}
