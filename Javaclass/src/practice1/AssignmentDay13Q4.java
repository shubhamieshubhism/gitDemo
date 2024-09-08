package practice1;

class AssignmentDay13Q4 
{

public static void main(String[] args) 
{
	mobile p=new mobile("SAMSUNG");
	p.calling();
	System.out.println("The name of company: "+p.company);
	System.out.println("************************");
	mobile p1=new mobile(2,"0000000000");
	System.out.println("The no of mobile: "+p1.noofmobile);
	System.out.println("The mobile number: "+p1.number);
	System.out.println("************************");
	mobile p2=new mobile(20000d);
	System.out.println("The price: "+p2.price);
	
}
}
class mobile
{
	String company;
	int noofmobile;
	String number;
	double price;
	
	mobile(String company)
	{
		this.company=company;
	}
	mobile(int noofmobile ,String number)
	{
		this.noofmobile=noofmobile;
		this.number=number;
	}
	mobile(double price)
	{
		this.price=price;
	}
	public void calling()
	{
		System.out.println("The mobile detail");
	}
}