package homeworks;

public class AssignmentDay17Q1 
{
public static void main(String[] args)
{
	Dell d = new Dell();
	d.delldeatails();
	System.out.println(d.model);
	System.out.println(d.colour);
	System.out.println(d.brand);
	System.out.println(d.price);
	System.out.println(d.ram);
	System.out.println(d.os);
	d.laptopDetails();
}
}
class Laptop//parent class 
{
	String brand;
	double price;
	int ram;
	String os;	
	public void laptopDetails()
	{
		System.out.println("**************************");
		System.out.println("The Brand : "+brand);
		System.out.println("The Price : "+price);
		System.out.println("The ram : "+ram);
		System.out.println("The OS  :"+os);
		System.out.println("**************************");
	}
}
class Dell extends Laptop//child class
{
	String model;
	String colour;
	
	public void delldeatails()
	{
		System.out.println("**************************");
		System.out.println("The Model : "+model);
		System.out.println("The Colour : "+colour);
		System.out.println("**************************");
	}
}