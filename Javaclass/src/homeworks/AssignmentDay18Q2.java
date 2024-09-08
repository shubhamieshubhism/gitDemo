package homeworks;

public class AssignmentDay18Q2 
{
public static void main(String[] args) 
{
Vegetabless v1 =new Potatoss("Baby potatos",34,"colour",1);//generalization
Potatoss p =(Potatoss)v1;//downcasting
p.potatossDetail();
}
}
class Vegetabless
{
	String type;
	double price;
	String colour;
	Vegetabless(String type,double price,String colour)
	{
		this.type=type;
		this.price=price;
		this.colour=colour;
	}
	public void vegetablessDetails()
	{
		System.out.println("****VEGETABLE DETAILS****");
		System.out.println("The type of potato :"+type);
		System.out.println("The price of potato :"+price);
		System.out.println("The colour of potato : "+colour);
		
	}
}
class Potatoss extends Vegetabless
{
	int quantity;
	Potatoss(String type,double price,String colour,int quantity)
	{
		super(type,price,colour);
		this.quantity=quantity;
	}
	public void potatossDetail()
	{
		System.out.println("*****POTATO DETAILS*****");
		System.out.println("The type of potato :"+type);
		System.out.println("The price of potato :"+price);
		System.out.println("The colour of potato : "+colour);
		System.out.println("The quantity : "+quantity+"kg");
		
	}
}
