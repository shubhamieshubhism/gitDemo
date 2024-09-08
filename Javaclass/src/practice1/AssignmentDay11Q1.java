package practice1;

class AssignmentDay11Q1 
{
	public static void main(String[] args)
	{
laptop q = new laptop();
q.Brand="Asus";
q.Price=40000;
q.colour="white";
q.processor="I9 Fifth Gen";
System.out.println("**********LAPTOP DETAILS****************");
System.out.println("The Brand of Laptop:"+q.Brand);
System.out.println("The Price of Laptop:"+q.Price);
System.out.println("The colour of Laptop:"+q.colour);
System.out.println("The processor of Laptop:"+q.processor);
System.out.println("****************************************");
q.processing();
q.gaming();
}
}
class laptop
{
	String Brand;//Attributes
	double Price;
	String colour;
	String processor;
	public void processing() //Behavior number1
	{
		System.out.println("You can write programs on Laptop");
	}
	
	public void gaming()  //Behavior number 2
	{
		System.out.println("You can play high end games on Laptop");
	}
}

