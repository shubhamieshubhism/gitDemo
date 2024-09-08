package homeworks;
import java.util.Scanner;
 class FinalAssessment
{
public static void main(String[] args) 
{
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter the name : ");
	String name11=scn.next();
	System.out.println("Enter the location : ");
	String location11=scn.next();
	System.out.println("The no of employees : ");
	int noofemployees11=scn.nextInt();
	Qspiders q =new Qspiders("NAGPUR",60,"SHUBHAM","VIMAN NAGAR",10);
	q.qspDetail();
	Jspider j = new Jspider("GANDHI NAGAR",15,"SHUBHAM","VIMAN NAGAR",10);
	j.jspDetails();
	Pyspider p = new Pyspider(6,10000,"SHUBHAM","VIMAN NAGAR",10) ;
	p.pysiderDetails();
}
}
 class TestYantra
 {
	 String name;
	 String location;
	 int noofemployees;
	 TestYantra(String name,String location,int noofemployees)
	 {
		 this.name=name;
		 this.location=location;
		 this.noofemployees=noofemployees;
	 }
 }
 class Qspiders extends TestYantra
 {
	 String branch;
	 int noofstudents;
	 Qspiders(String branch,int noofstudents,String name,String location,int noofemployees)
	 {
		 super(name,location,noofemployees);
		 this.branch=branch;
		 this.noofstudents=noofstudents;
	 }
	 {
	 }
	 public void qspDetail()
	 {
		 System.out.println("***QSPDETAILS***");
		 System.out.println("The name : "+name);
		 System.out.println("The location : "+location);
		 System.out.println("The no of employees : "+noofemployees);
		 System.out.println("The name of branch : "+branch);
		 System.out.println("The number of students : "+noofstudents);
		 System.out.println("****************");
	 }
 }
 class Jspider extends TestYantra
 {
	 String jslocation;
	 int nooftrainers;
	 Jspider(String jslocation,int nooftrainers,String name,String location,int noofemployees)
	 {
		 super(name,location,noofemployees);
		 this.jslocation=jslocation;
		 this.nooftrainers=nooftrainers;
	 }
	 public void jspDetails()
	 {
		 System.out.println("The location of JSP : "+jslocation);
		 System.out.println("The no of trainers : "+nooftrainers);
	 }
	 
 }
 class Pyspider extends TestYantra
 {
	 int courseoffered;
	 int feestructure;
	 Pyspider(int courseoffered,int feestructure,String name,String location,int noofemployees)
	 {
		 super(name,location,noofemployees);
		 this.courseoffered=courseoffered;
		 this.feestructure=feestructure;
	 }
	 public void pysiderDetails()
	 {
		 System.out.println("The no of course offered : "+courseoffered);
		 System.out.println("The fee structure : "+feestructure);
	 }
 }
