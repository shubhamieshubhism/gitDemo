package practice1;

class AssignmentDay13Q5 
{
public static void main(String[] args) 
{
	laptops p=new laptops("DELL","I5");
	p.gaming();
	System.out.println("***********************");
	System.out.println("The company: "+p.company);
	System.out.println("The processor: "+p.processor);
	laptops p1=new laptops("8GB",64);
	System.out.println("***********************");
	System.out.println("The ram: "+p1.ram);
	System.out.println("The memory "+p1.memory);
	System.out.println("***********************");
	laptops p2=new laptops(40000);
	System.out.println("The price: "+p2.price);
}
}
class laptops
{
	String company;
	String processor;
	String ram;
	int memory;
	double price;
	
	laptops(String company,String processor)
	{
		this.company=company;
		this.processor=processor;
	}
	laptops(String ram,int memory)
	{
		this.ram=ram;
		this.memory=memory;
	}
	laptops(double price)
	{
		this.price=price;
	}
	public void gaming()
	{
		System.out.println("The laptop details");
	}
}
