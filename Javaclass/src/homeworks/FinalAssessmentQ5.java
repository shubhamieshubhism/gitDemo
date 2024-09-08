package homeworks;

class FinalAssessmentQ5 implements
Interface1
{
	public void xyz()
	{
		System.out.println("HELLO FROM THE NON STATIC METHOD");

	}
public static void main(String[] args)
{
	Interface1 i1= new FinalAssessmentQ5();
	i1.xyz();

}
}
interface Interface1
{
	final static int a =22;
	final static String b = "Hello";
	abstract public void xyz();
}

