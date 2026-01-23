package Nisarga;



@FunctionalInterface   //Annotation
interface validator
{
boolean validate(String input);
}
 
public class FuncInterface{

public static void main(String[] args)
{
validator emailCheck=email->email.contains("@");
 
System.out.println(emailCheck.validate("testgmail.com"));
}
 
}
 