package practice1;

class AssignmentDay12Q2 
{
public static void main(String[] args) 
{
	cycle p=new cycle("HERO",2,2,"BLACK",10000);
	p.cycling();
	System.out.println("The Name of cycle: "+p.name);
	System.out.println("The no of wheels: "+p.noofwheels);
	System.out.println("The no of pedals: "+p.noofpedals);
	System.out.println("The colour: "+p.colour);
	System.out.println("The proce of cycle: "+p.price);
}
}
class cycle
{
	String name;
	int noofwheels;
	int noofpedals;
	String colour;
	double price;
	
	cycle(String name,int noofwheels,int noofpedals,String colour,double price)
	{
		this.name=name;
		this.noofwheels=noofwheels;
		this.noofpedals=noofpedals;
		this.colour=colour;
		this.price=price;
	}
	public void cycling()
	{
		System.out.println("The Details of cycle");
	}
	
}
