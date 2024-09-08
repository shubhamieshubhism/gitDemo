package practice1;

class AssignmentDay12Q5 
{
public static void main(String[] args) 
{
bike p=new bike("BULLET","BLACK",350,250000);
p.bikedetails();
System.out.println("The name of bike: "+p.name);
System.out.println("The colour of bike: "+p.colour);
System.out.println("The cubic capacity: "+p.cc+"cc");
System.out.println("The price of the bike: "+p.price);
}
}
class bike
{
	String name;
	String colour;
	double cc;
	double price;
bike(String name,String colour,double cc,double price)
{
	this.name=name;
	this.colour=colour;
	this.cc=cc;
	this.price=price;
}
public void bikedetails()
{
	System.out.println("THE BIKE DETAILS");
}
}
