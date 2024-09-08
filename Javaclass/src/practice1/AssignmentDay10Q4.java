package practice1;

public class AssignmentDay10Q4 
{
static String Name="SHUBHAM";//static variable
public static int method1()
{
	int a=100;
	System.out.println("The number:"+a);
	return a; //first method
}
public static String method2()
{
	String city="Wardha";
	System.out.println("The name of city:"+city);
	return city;
}
static
{
	int Number=1;
	System.out.println(Number);
	boolean rain=false;
	System.out.println(rain);
	String town="Nagpur";
	System.out.println(town);
}
public static void main(String[] args) 
{
	System.out.println("The name:"+Name);
	AssignmentDay10Q4.method1();
	AssignmentDay10Q4.method2();
	}
}
