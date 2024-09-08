package homeworks;

class ClassAssisment2
{
public static void main(String[] args) 
{
	Laptops12 l=new Laptops12("DELL","GREY",50000);
	l.connectHeadphones("SCHENIZER","BLACK",1000);
	l.s.headphoneDetail();
	l.laptops12Details();
}
}
class Headphone//dependent class
{
	String model;
	String hcolor;
	double hprice;
	Headphone(String model,String hcolor,double hprice)
	{
		this.model=model;
		this.hcolor=hcolor;
		this.hprice=hprice;
	}
	public void headphoneDetail()
	{
		System.out.println("***HEADPHONE DETAILS***");
		System.out.println("The model : "+model);
		System.out.println("The color : "+hcolor);
		System.out.println("The price : "+hprice);
	}
}
class Laptops12// another class
{
	String brand;
	String color;
	double price;
	Headphone s;
	Laptops12(String brand,String color,double price)
	{
		this.brand=brand;
		this.color=color;
		this.price=price;	
	}
	public void connectHeadphones(String model,String hcolor,double hprice)
	{
		s=new Headphone(model,hcolor,hprice);
		System.out.println("The headphone got connected");
	}
	public void laptops12Details()
	{
		System.out.println("***LAPTOP DETAILS***");
		System.out.println("The brand : "+brand);
		System.out.println("The color : "+color);
		System.out.println("The price : "+price);
	}
}
