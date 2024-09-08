package practice1;

class AssignmentDay12Q3 
{
public static void main(String[] args) 
{
door p=new door("BROWN",250);
p.protection();
System.out.println("The colour of door: "+p.colour);
System.out.println("The height of door: "+p.height+"cm");
}
}
class door
{
	String colour;
	double height;
	door(String colour,double height)
	{
		this.colour=colour;
		this.height=height;
	}
	public void protection()
	{
		System.out.println("THE DOOR OF TRUST");
	}
}
