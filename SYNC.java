package Nisarga;
//here without synchronized random number will be as output.
//with synchronized will get 2000.

class counter
{
	int count=0;
	synchronized void increment()
{
	count++;
}
}
public class SYNC extends Thread  {
public static void main(String[] args)
{
counter c=new counter();
Thread t1= new Thread(() ->
{
for(int i=0; i <1000; i++) c.increment();
});
 
Thread t2= new Thread(() ->
{
for(int i=0; i <1000; i++) c.increment();
});		
t1.start();
t2.start();
 
try {
	t1.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();//Throwable class used to print detailed info about exception.ou
}
try {
	t2.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println(c.count);
}
 
}

	