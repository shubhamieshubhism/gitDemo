package homeworks;

class FinalMock 
{
public static void main(String[] args) 
{
	Xyz x = new Xyz(10,20,30,"Shubham","Wardha",40000);
	x.xyzDetails();
}
}
class Xyz
{
	int a;
	int b;
	int c;
	String name;
	String location;
	double price;
	
	Xyz(int a,int b,int c,String name,String location,double price)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.name=name;
		this.location=location;
		this.price=price;
	}
	public void xyzDetails()
	{
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		System.out.println("C:"+c);
		System.out.println("Name:"+name);
		System.out.println("Location:"+location);
		System.out.println("Price:"+price);
	}
}
