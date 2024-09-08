package homeworks;

import java.util.Scanner;

class MiniProjectForHomework
{
public static void main(String[] args) 
{
	try (Scanner scn = new Scanner(System.in)) {
		System.out.println("Enter the name of college :");
		String name11=scn.next();
		System.out.println("Enter the location of college :");
		String loc1=scn.next();
		System.out.println("Enter the principal name :");
		String princi1=scn.next();
		
		College col =new College(name11,loc1,princi1);
		boolean control=true;
		while(control)
		{
			System.out.println("Enter the choice : \n 1 ==> ADMIT STUDENT \n 2 ==> REMOVE STUDENT \n 3 ==> COLLEGE DETAILS \n 4 ==> STUDENT DETAILS \n 5 ==> EXIT");
			int choice =scn.nextInt();
			switch(choice)
			{
			case 1 :
			{
				col.admitStudent();
			}
			break;
			case 2 :
			{
				col.stu.studentDetails();
			}
			break;
			case 3 :
			{
				col.collegeDetails();
			}
			break;
			case 4 :
			{
				col.removeStudent();
				
			}
			break;
			case 5 :
			{
				control=false;
				System.out.println("EXIT");
			}
			break;
			default:
			{
				System.out.println("Please enter valid choice");
			}
			}
			
			
		}
	}
	
}
}
class Student
{
	private String sname;
	private int sid;
	private long cno;
	private double percentage;
	
	public String getSname()
	{
		return sname;
	}
	public int getSid()
	{
		return sid;
	}
	public long getCno()
	{
		return cno;
	}
	public double getPercentage()
	{
		return percentage;
	}
	
	Student(String sname,int sid,long cno,double percentage)
	{
		this.sname=sname;
		this.sid=sid;
		this.cno=cno;
		this.percentage=percentage;
	}
	
	public void studentDetails()
	{
		System.out.println("***************************");
		System.out.println("The name of student is :"+sname);
		System.out.println("The id of the student is :"+sid);
		System.out.println("The contact of the student is :"+cno);
		System.out.println("The percentage of the student is :"+percentage);
	}
}
	class College
	{
		String name;
		String location;
		String principal;
		
		Student stu;
		College(String name,String location,String principal)
		{
			this.name=name;
			this.location=location;
			this.principal=principal;
		}
		public void admitStudent()
		{
			if(stu==null)
			{
			try (Scanner sc = new Scanner(System.in)) 
			{
				System.out.println("Entr the name of student :");
				String name1=sc.next();
				System.out.println("Enter the student ID :");
				int id1=sc.nextInt();
				System.out.println("Enter the contact of student :");
				long cno1=sc.nextLong();
				System.out.println("Enter the percentage of student :");
				double percentage1=sc.nextDouble();
				
				stu =new Student(name1,id1,cno1,percentage1);
			}
			System.out.println("Student got admitted successfully!");
			}
			else
			{
				System.out.println("Student already exists! admissionis closed");
			}
		}
		public void removeStudent()
		{
			if(stu!=null)
			{
				stu=null;
				System.out.println("Student got removed successfully!");
			}
			else
			{
				System.out.println("NO student exists! so cannot be removed");
			}
		}
		public void collegeDetails()
		{
			System.out.println("*******************");
			System.out.println("The name of college is :"+name);
			System.out.println("The location of college is :"+location);
			System.out.println("The principal of college is :"+principal);
			
		}
	}

