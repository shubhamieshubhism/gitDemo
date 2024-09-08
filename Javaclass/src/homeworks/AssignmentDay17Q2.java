package homeworks;

public class AssignmentDay17Q2 
{
public static void main(String[] args) 
{
Potato v = new Potato(5,"Fresh",20,"Brown");
System.out.println(v.quantity);
v.vegetableDetails();
System.out.println(v.type);
System.out.println(v.price);
System.err.println(v.colour);
v.potatoDetails();
}
}
class Vegetable//parent class
{
	int quantity;
	
	public void vegetableDetails()
	{
		System.out.println("*********************");
		System.out.println("The Quantity : "+quantity);
		System.out.println("*********************");
	}
}
class Potato extends Vegetable//child class
{
	String type;
	int price;
	String colour;
	public Potato(int quantity,String type,int price,String colour)//parameterized constructor
	{
		super();
		this.type=type;
		this.price=price;
		this.colour=colour;
	}
	public void potatoDetails()
	{
		System.out.println("*********************");
		System.out.println("The type of potato : "+type);
		System.out.println("The price : "+price);
		System.out.println("The colour of potato : "+colour);
	}
}
