package homeworks;

class AssignmentDay15Q2
{
public static void main(String[] args)
{
	Hotel h = new Hotel("Rajwada palace","Wardha");
	h.hotelDetails();
	h.addDosa("Masal Dosa", 2, 100);
	h.d.dosaDetails();
	h.removeDosa();
}
}
class Dosa//dependent class
{
	String typeofdosa;
	int noofplates;
	int price;
	
	Dosa(String typeofdosa,int noofplates,int price)
	{
		this.typeofdosa=typeofdosa;
		this.noofplates=noofplates;
		this.price=price;
	}
	public void dosaDetails()
	{
		System.out.println("*****************");
		System.out.println("The type of dosa : "+typeofdosa);
		System.out.println("The number of plates : "+noofplates);
		System.out.println("The price : "+price);
	}
}
class Hotel
{
	String hotelname;
	String hotellocation;
	Dosa d;
	
	Hotel(String hotelname,String hotellocation)
	{
		this.hotelname=hotelname;
		this.hotellocation=hotellocation;
	}
	
	public void addDosa(String typeofdosa,int noofplates,int price)
	{
		if(d==null)
		{
		
		 d = new Dosa(typeofdosa,noofplates,price);//dosa added
		System.out.println("Dosa has been added successfully : ");
		}
		else
		{
			System.out.println("NO oreder has been placed");
		}
	}
	public void removeDosa()
	{
		if(d==null)
		{
		d=null;
		System.out.println("Dosa has been removed successfully :");
		}
	
	}
	public void hotelDetails()
	{
		System.out.println("***************");
		System.out.println("Name of hotel : "+hotelname);
		System.out.println("Location of hotel : "+hotellocation);
		System.out.println("***************");
	}
	
}