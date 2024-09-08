package practice1;

class AssignmentDay11Q5 
{
public static void main(String[] args) 
{
	myname p=new myname();
	p.identification();//initialization
	p.name="SHUBHAM";
	System.out.println(p.name);
}	

}
class myname
{
	String name;//non static variable
	public void identification()//non static method
	{
		System.out.println("The name:");
	}
}
