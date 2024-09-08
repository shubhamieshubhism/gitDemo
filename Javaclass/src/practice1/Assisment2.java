package practice1;

class Assisment2
{
public static void main(String[] args)
{
	pencil p=new pencil("Natraj");
	p.pencildetails();
	System.out.println("Brand: "+p.brand);
	System.out.println("****************");
	pencil p2=new pencil("Black",10);
	p2.pencildetails();
	System.out.println("Colour: "+p2.colour);
	System.out.println("Price: "+p2.price+"rs");
	
	
}
}
class pencil
{
	String brand;
	String colour;
	int price;
	String type;
	
	pencil(String brand)
	{
		this.brand=brand;
	}
	pencil(String colour,int price)
	{
		this.colour=colour;
		this.price=price;
	}
	public void pencildetails()
	{
		System.out.println("PENCIL DETAILS");
	}
	
}
