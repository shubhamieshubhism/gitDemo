package practice1;

class AssignmentDay11Q3 
{
	public static void main(String[] args) 
	{
		myself p = new myself();
		p.name="SHUBHAM";
		p.address="WARDHA";
		p.gender="M";
		p.nameofaperson();
		System.out.println("The name:"+p.name);
		p.addressofaperson();
		System.out.println("Address:"+p.address);
		p.genderofaperson();
		System.out.println("Gender:"+p.gender);
		
	}
}
class myself
{
	String name; //non static variable 1
	public void nameofaperson() //non static method 1
	{
		System.out.println("The name of a person");
	}
	String address;//non static variable 2
	public void addressofaperson()//non static method 2
	{
		System.out.println("The Address of a person");
	}
	String gender;//non static variable 3
	public void genderofaperson()//non static method3
	{
		System.out.println("The gender of a person");
	}
}