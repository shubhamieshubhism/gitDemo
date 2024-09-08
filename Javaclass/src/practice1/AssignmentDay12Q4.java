package practice1;

class AssignmentDay12Q4 
{
public static void main(String[] args)
{
	college p=new college("MIT","MASSACHUSETTE","MR JONS");
			p.collegedetails();
	System.out.println("The college name: "+p.name);
	System.out.println("The area of college: "+p.area);
	System.out.println("The principal of college: "+p.principal);
}
}
class college
{
	String name;
	String area;
	String principal;
	
	college(String name,String area,String principal)
	{
		this.name=name;
		this.area=area;
		this.principal=principal;
	}
	public void collegedetails()
	{
		System.out.println("THE COLLEGE DETAILS");
	}
}
