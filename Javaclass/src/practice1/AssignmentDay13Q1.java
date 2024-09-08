package practice1;

class AssignmentDay13Q1 
{
	public static void main(String[] args) 
	{	
	auto p=new auto("Bajaj",2);
	p.commutation();
	System.out.println("Company: "+p.company);
	System.out.println("Distance: "+p.distance);
	System.out.println("***********************");
	auto p1=new auto(300d,3);
	System.out.println("Fair: "+p1.fair);
	System.out.println("NO of passengers: "+p1.noofpassenger);
	System.out.println("***********************");
	auto p2=new auto("Bajaj","Suburbs","Suresh");
	System.out.println("Company: "+p2.company);
	System.out.println("Area: "+p2.area);
	System.out.println("Name of driver: "+p2.nameofdriver);
	System.out.println("***********************");
	}	
}
class auto
{
	String company;
	int distance;
	double fair;
	String area;
	int noofpassenger;
	String nameofdriver;
	auto(String company,int distance)
	{
		this.company=company;
		this.distance=distance;
	}
	auto(double fair,int noofpassenger)
	{
		this.fair=fair;
		this.noofpassenger=noofpassenger;
	}
	auto(String company,String area,String nameofdriver)
	{
		this.company=company;
		this.area=area;
		this.nameofdriver=nameofdriver;
	}
	public void commutation()
	{
		System.out.println("YOU CAN COMMUTE IN AUTO");
	}
}