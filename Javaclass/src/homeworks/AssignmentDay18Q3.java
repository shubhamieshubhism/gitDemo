package homeworks;

public class AssignmentDay18Q3 
{
public static void main(String[] args) 
{
Hotelss h1 = new Krishnagrand("dosa and idli",3,50);// generalization
Krishnagrand k =(Krishnagrand)h1;//downcasting
k.krishnagrandDetails();

}
}
class Hotelss
{
	String dishes;
	int noofplates;
	Hotelss(String dishes,int noofplates)
	{
		this.dishes=dishes;
		this.noofplates=noofplates;
	}
	public void hotelDetails()
	{
		System.out.println("*****HOTELDETAILS*****");
		System.out.println("Dishes : "+dishes);
		System.out.println("No of plates : "+noofplates);
	}
}
class Krishnagrand extends Hotelss
{
	double price;
	Krishnagrand(String dishes,int noofplates,double price)
	{
		super(dishes,noofplates);
		this.price=price;
	}
	public void krishnagrandDetails()
	{
		System.out.println("**KRISHNAGRAND**");
		System.out.println("Dishes : "+dishes);
		System.out.println("No of plates : "+noofplates);
		System.out.println("The price : "+price+"RS");
		
	}
}
