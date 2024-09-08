package homeworks;

public class AssignmentDay19Q2 
{
public static void main(String[] args) 
{
	Parents p=new Childs();//generalization 
	p.display();
	Parents p1=new Parents();//specialization
	p1.display();
}
}
class Parents
{
	public void display()
	{
		System.out.println(" Hi from the parent class");
	}
}
class Childs extends Parents
{
	public void diaplay()
	{
		System.out.println(" Hi form the child class");
	}
}