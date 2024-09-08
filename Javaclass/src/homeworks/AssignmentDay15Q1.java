package homeworks;

class AssignmentDay15Q1
{

public static void main(String[] args) 
{
	Bank b = new Bank("SBI","WARDHA",new Account("Shubham",1234567,10000));
	
	b.bankDetails();
	b.acc.accountDetails();

}
}
class Account //dependent class
{
	String accname;
	double accno;
	double balance;
	
	Account(String accname,double accno,double balance)
	{
		this.accname=accname;
		this.accno=accno;
		this.balance=balance;
	
	}
	public void accountDetails()
	{
		System.out.println("************************");
		System.out.println("The account name : "+accname);
		System.out.println("The account number : "+accno);
		System.out.println("The balance : "+balance);
		System.out.println("************************");
	}
}
class Bank //another class
{
	String bname;
	String blocation;
	Account acc;//dependent variable
	Bank(String bname,String blocation, Account acc)
	{
		this.bname=bname;
		this.blocation=blocation;
		this.acc=acc;
	}
	public void bankDetails()
	{
		System.out.println("*************************");
		System.out.println("The Bank name : "+bname);
		System.out.println("The location : "+blocation);
		System.out.println("*************************");
	}
	
}