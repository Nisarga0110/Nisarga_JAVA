package Nisarga;

public class MyThread  extends Thread
	{
	public void nis()
		{
			System.out.println("Thread is running");
		}
	public void run()
	{
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args)
	{
	MyThread t= new MyThread();
	t.start();
	//t.sleep(2000);
	}
	}

	

