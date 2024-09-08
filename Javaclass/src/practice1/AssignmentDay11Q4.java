package practice1;

class AssignmentDay11Q4 
{
	public static void main(String[] args)
	{
		bodymeasurments p=new bodymeasurments();
		p.healthheight();
		p.height=175;
		System.out.println(p.height+"cm");
		p.healthweight();
		p.weight=70;
		System.out.println(p.weight+"kg");
	}

}
class bodymeasurments
{
	double height;
	double weight;
public void healthheight()
{
	System.out.println("The height");
}
public void healthweight()
{
	System.out.println("The weight");
}
}
