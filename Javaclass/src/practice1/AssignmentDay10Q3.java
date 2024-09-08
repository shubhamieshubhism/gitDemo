package practice1;

class AssignmentDay10Q3 
{
public static void method1()
{
	System.out.println("This is first method");
}
public static int method2()
{
	int a=10;
	System.out.println("This is second methos with a:"+a);
	return a;
}
public static void method3()
{
	System.out.println("This is third method");
}
static
{
	int p=11;
	System.out.println("The value of p:"+p);
	//multiline static initializer one
}
static
{
	String Name="Shubham";
	System.out.println("The name is:"+Name);
	//multiline static initializer two
}
public static void main(String[] args) 
{
	AssignmentDay10Q3.method1();
	AssignmentDay10Q3.method2();
	AssignmentDay10Q3.method3();
}
}
