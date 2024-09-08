package homeworks;

class SurpriseAssignment 
{
	public static void main(String[] args)
	{
		Theater t = new Movie("BATMAN","CHRISTOPHER NOLAN","MR PATRICK","ACTION","PVR",2);
		Movie m=(Movie)t;
		m.movieDetails();
	}
}
class Theater
{
	String type;
	String location;
	int nooftickets;
	Theater(String type,String location,int nooftickets)
	{
		this.type=type;
		this.location=location;
		this.nooftickets=nooftickets;
	}
}
class Movie extends Theater
{
	String moviename;
	String director;
	String actor;
	Movie(String moviename,String director,String actor,String type,String location,int nooftickets)
	{
		super(type,location,nooftickets);
		this.moviename=moviename;
		this.director=director;
		this.actor=actor;
	}
	public void movieDetails()
	{
		
		System.out.println("The name of movie is :"+moviename);
		System.out.println("The name of director is :"+director);
		System.out.println("The name of actor is : "+actor);
		System.out.println("The type of movie is : "+type);
		System.out.println("The location of theater is : "+location);
		System.out.println("The number of tickets is : "+nooftickets);
		
	}
}
