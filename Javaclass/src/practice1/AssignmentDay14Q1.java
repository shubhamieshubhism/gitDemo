package practice1;

class AssignmentDay14Q1 
{
public static void main(String[] args) 
{
	bag p=new bag();
	System.out.println("*****BAG*****");
	System.out.println("The brand : "+p.getBrand());
	p.setBrand("LOCAL");
	System.out.println("The modified brand : "+p.getBrand());
	System.out.println("The price: "+p.getPrice());
	
	p.setColour("Black");
	System.out.println("The modified colour: "+p.getColor());
	
}
}
class bag
{
	private String brand;
	private double price;
	private String colour;
	public String getBrand()
	{
		return brand;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public double getPrice()
	{
		return price;
	}
	public String getColor()
	{
		return colour;
	}
	public void setColour(String colour)
	{
		this.colour=colour;
	}
}
