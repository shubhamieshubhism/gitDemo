package homeworks;

public class AssignmentDay18Q1 
{
public static void main(String[] args)
{
Laptopss l1 =new Dellss("DELL",40000,8,"windows","DS1001","SILVER");
Dellss d = (Dellss)l1;//downcasting
d.dellssDetail();
}
}
class Laptopss
{
	String brand;
	double price;
	int ram;
	String os;
	Laptopss(String brand,double price,int ram,String os)
	{
		this.brand=brand;
		this.price=price;
		this.ram=ram;
		this.os=os;
	
	}
	public void laptopssDetails()
	{
		System.out.println("*****THE LAPTOP DETAILS*****");
	}
    
}
class Dellss extends Laptopss
{
	String model;
	String colour;
	Dellss(String brand,double price,int ram,String os,String model,String colour)
	{
		super(brand,price,ram,os);
		this.model=model;
		this.colour=colour;
	}
	public void dellssDetail()
	{
		System.out.println("*****DELL DETAILS*****");
		System.out.println("The brand of laptop : "+brand);
		System.out.println("The price of laptop : "+price);
		System.out.println("The ram of laptop : "+ram);
		System.out.println("The os of laptop : "+os);
		System.out.println("The model of the dell : "+model);
		System.out.println("The colour of the dell : "+colour);
	
	}
}
