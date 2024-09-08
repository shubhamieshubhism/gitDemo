package practice1;

public class AssignmentDay12Q1 
{
public static void main(String[] args) 
{
	employee p =new employee("Shubham","Adhar Card",40000);
	p.working();
	System.out.println("The name of employee:"+p.name);
	System.out.println("The id of employee:"+p.id);
	System.out.println("The salary of employee:"+p.salary);
}
}
class employee
{
	String name;
	String id;
	double salary;
	employee(String name,String id,double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void working()
	{
		System.out.println("The employee is needed to submit this details ASAP");
	}
}