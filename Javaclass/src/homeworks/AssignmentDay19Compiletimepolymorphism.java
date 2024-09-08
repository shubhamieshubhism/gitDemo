package homeworks;

public class AssignmentDay19Compiletimepolymorphism
{
public static void main(String[] args) 
{
Parentss.display();
Childss.display();
}
}
class Parentss
{
	public static void display()
	{
		System.out.println(" Hi from parent");
	}
}
class Childss extends Parentss
{
	public static void display()
	{
		System.out.println(" Hi from child");
	}
}
