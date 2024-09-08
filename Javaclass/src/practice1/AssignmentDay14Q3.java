package practice1;

class AssignmentDay14Q3 
{
public static void main(String[] args)
{
	jet p=new jet();
	System.out.println("****JET****");
	p.setName("INDIAN AIRWAY");
	System.out.println("The name: "+p.getName());
	p.setNoofpassengers(5);
	System.out.println("The no of passengers: "+p.getNoofpassengers());
	p.setColour("WHITE");
	System.out.println("The colour: "+p.getColour());
	p.setTakeofftime("3:20");
	System.out.println("Take off time: "+p.getTakeofftime());
}
}
class jet
{
	private String name;
	private int noofpassengers;
	private String colour;
	private String takeofftime;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getNoofpassengers()
	{
		return noofpassengers;
	}
	public void setNoofpassengers(int noofpassengers)
	{
		this.noofpassengers=noofpassengers;
	}
	public String getColour()
	{
		return colour;
	}
	public void setColour(String colour)
	{
		this.colour=colour;
	}
	public String getTakeofftime()
	{
		return takeofftime;
	}
	public void setTakeofftime(String takeofftime)
	{
		this.takeofftime=takeofftime;
	}
}
