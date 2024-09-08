package practice1;

class AssignmentDay13Q2
{
	public static void main(String[] args) 
	{
		{
			employees p=new employees("Shubham","Adhar Card");
			p.working();
			System.out.println("**************************");
			System.out.println("The name: "+p.name);
			System.out.println("The id: "+p.id);
			employees p1=new employees("Wardha",2);
			System.out.println("**************************");
			System.out.println("The address: "+p1.address);
			System.out.println("The experience: "+p1.experience);
			employees p2=new employees(2,40000);
			System.out.println("**************************");
			System.out.println("The experience: "+p2.experience);
			System.out.println("The salary: "+p2.salary);
			
			}
	}
}

class employees
{
	String name;
	String id;
	String address;
	int experience;
	double salary;
	
	employees(String name,String id)
	{
		this.name=name;
		this.id=id;
	}
	employees(String address,int experience)
	{
		this.address=address;
		this.experience=experience;
	}
	employees(int experience,double salary)
	{
		this.experience=experience;
		this.salary=salary;
	}
	public void working()
	{
		System.out.println("The employees details");
	}
}