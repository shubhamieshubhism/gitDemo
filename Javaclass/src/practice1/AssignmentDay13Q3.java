package practice1;

class AssignmentDay13Q3 
{
public static void main(String[] args) 
{
	house p=new house("XYZ Recident");
	p.living();
	System.out.println("The name of house: "+p.name);
	System.out.println("************************");
	house p1=new house(12,"Wardha");
	System.out.println("The house number: "+p1.housenumber);
	System.out.println("The area: "+p1.area);
	System.out.println("************************");
	house p2=new house(1000d);
	System.out.println("The rent: "+p2.rent);
	
}
}
class house
{
	String name;
	int housenumber;
	String area;
	double rent;
	
	house(String name)
	{
		this.name=name;
	}
	house(int housenumber,String area)
	{
		this.housenumber=housenumber;
		this.area=area;
	}
	house(double rent)
	{
		this.rent=rent;
	}
	public void living()
	{
		System.out.println("The house detail");
	}
}