package practice1;

class AssignmentDa10q2 
{
static int variable1=0;
static String variable2="Hello";
static int variable3=1;
static boolean variable4=false;

static 
{
System.out.println("Variable first variable is"+variable1);
System.out.println("Variable third variable is"+variable3);
//multiline static initializer
}
static
{
	System.out.println("The second variable is"+variable2);
	System.out.println("The fourth variable is"+variable4);
 //second multiline static initializer
}
public static void main(String[] args) 
{
    System.out.println("The output of the static variables and static method are above");
}
}

