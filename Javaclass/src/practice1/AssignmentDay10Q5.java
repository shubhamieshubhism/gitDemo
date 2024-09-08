package practice1;

class AssignmentDay10Q5 
{
public static int method1()
{
	int a=11;
	System.out.println("The number1:"+a);
	return a;
}
static int b;//static variable
static int c=13;//static initializer
public static void main(String[] args) 
{
	AssignmentDay10Q5.method1();
	b=12;
	System.out.println("The number2:"+b);
	c=13;
	System.out.println("The number3:"+c);
}

}

