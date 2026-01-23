package Nisarga;

public class tryCatch  {
	public static void main(String[] args)
	{
	try {
		int arr[]= {10, 20, 30};
		int a=3;
		int b=0;
		 int result = a/b;
		
		System.out.println(arr[5]);
		System.out.println(result);
		
		}
		 catch(ArithmeticException e)
		{
		System.out.println(" Arithmetic Exception occurred");
		}
	 
		catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Array index out of");
	}
	catch (Exception e)
	{
			System.out.println("Generic Exception");
	}
	}
}
	
	

