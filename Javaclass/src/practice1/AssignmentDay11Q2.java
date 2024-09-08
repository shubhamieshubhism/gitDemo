package practice1;

class AssignmentDay11Q2
{
public static void main(String[] args)
{
bottle p=new bottle();
p.brand="Milton";
bottle q=new bottle();
q.material="plastic";
bottle r=new bottle();
r.capacity=2;
System.out.println("THE BOTTLE");
p.holdwater();
System.out.println("The brand of bottle:"+p.brand);
q.holdwater();
System.out.println("The material of bottle:"+q.material);
r.holdwater();
System.out.println("The capacityof bottle:"+r.capacity+"Liters");



}
}
class bottle
{
	String brand;
	String material;
	double capacity;
	
	public void holdwater()
	{
		System.out.println("The Bottle can hold water and keep it cool");
		
	}
	
}
