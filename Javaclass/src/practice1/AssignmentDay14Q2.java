package practice1;

class AssignmentDay14Q2 
{
public static void main(String[] args) 
{
	medicine p=new medicine();
	System.out.println("*****MEDICINE*****");
	p.setName("OXYTOCINE");
	System.out.println("The name: "+p.getName());
	System.out.println("The disease: "+p.getDisease());
	p.setPrice(1000);
	System.out.println("The price: "+p.getPrice());
	System.out.println("The colour: "+p.getColour());
}
}
class medicine
{
	private String name;
	private String disease;
	private double price;
	private String colour;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getDisease()
	{
		return disease;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public String getColour()
	{
		return colour;
	}
}
