package practice1;

class AssignmentDay10 
{
	static int a =11;//first static variable
	static String name ="Shubham";//second static variable
	
	static void printname() //static method
	{
		boolean Snowfall=true;
		System.out.println("The possibility of snowfall is high:"+Snowfall);
	}
	public static void main(String[] args)
	{
		a=11;
		System.out.println("The first static variable:"+a);
		name="Shubham";
		System.out.println("The second static variable:"+name);
		AssignmentDay10.printname();
	}
}
