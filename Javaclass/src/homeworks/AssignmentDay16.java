package homeworks;
import java.util.Scanner;

class AssignmentDay16 
{
public static void main(String[] args)
{
	Scanner scn= new Scanner(System.in);
	System.out.println("Enter the Hotel name : ");
	String hotelname1=scn.next();
	System.out.println("Enter the Location : ");
	String location1=scn.next();
	Hotels h=new Hotels(hotelname1,location1);
	
	boolean control=true;
	while(control)
	{
		System.out.println("Enter the choice :\n 1==> ADD DOSA \n 2==> REMOVE DOSA \n 3==> HOTEL DETAILS \n 4==> DOSA DETAILS \n 5==> EXIT");
		int choice=scn.nextInt();
		switch(choice)
		{
		case 1 :
		{
			h.addDosas();
		}
		break;
		case 2 :
		{
			h.removeDosas();
		}
		break;
		case 3 :
		{
			h.hotelsDetails();
		}
		break;
		case 4 :
		{
			h.d.dosasDetails();
		}
		break;
		case 5 :
		{
			control =false;
			System.out.println("EXIT");
		}
		break;
		default:
		{
			System.out.println("Please enter valid choice");
		}
		}
	}
}
}
class Dosas//dependent class
{
	private String typeofdosa;
	private int noofplates;
	private int price;
	
	public String getTypeofdosa()
	{
		return typeofdosa;
	}
	public int getNoofplates()
	{
		return noofplates;
	}
	public int getPrice()
	{
		return price;
	}
	Dosas(String typeofdosa,int noofplates,int price)//parameterized constructor
	{
		this.typeofdosa=typeofdosa;
		this.noofplates=noofplates;
		this.price=price;
	}
	public void dosasDetails()
	{
		System.out.println("****************");
		System.out.println("Type of Dosa : "+typeofdosa);
		System.out.println("Number of plates : "+noofplates);
		System.out.println("Price : "+price);
	}
}
class Hotels//another class
{
	String name;
	String location;
	Dosas d;
	Hotels(String name,String location)//parameterized constructor
	{
		this.name=name;
		this.location=location;
	}
	public void addDosas()//helper method
	{
		if(d==null)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the type of dosa : ");
		String typeofdosa1=sc.next();
		System.out.println("Enter no of plates : ");
		int noofplates1=sc.nextInt();
		System.out.println("Enter the price : ");
		int price1=sc.nextInt();
		
		d=new Dosas(typeofdosa1,noofplates1,price1);
		System.out.println("Dosa is added successfully!");
		}
		else
		{
			System.out.println("Dosa is already added!");
		}
	}
	public void removeDosas()
	{
		if(d!=null)
		{
			d=null;
			System.out.println("Dosa got removed successfully!");
		}
		else
		{
			System.out.println("No dosa is exist!");
		}
	}
	public void hotelsDetails()
	{
		System.out.println("*************************");
		System.out.println("The name of Hotel : ");
		System.out.println("The location of Hotel : ");
		System.out.println("*************************");
	}
	
}

