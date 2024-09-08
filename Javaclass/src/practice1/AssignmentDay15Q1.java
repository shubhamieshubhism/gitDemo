package practice1;

class AssignmentDay15Q1
{
public static void main(String[] args) 
{
	Bank b = new Bank("SBI","WARDHA");
	b.bankDetails();
	b.acc.accountDetails();
}
}
class Account
{
	private String accname;
	private double accno;
	private double balance;
	public String getAccname()
	{
		return accname;
	}
	public double getAccno()
	{
		return accno;
	}
	public double getBalance()
	{
		return balance;
	}
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
class Bank
{
	String bname;
	String blocation;
	Account acc;
	Bank(String bname,String blocation)
	{
		this.bname=bname;
		this.blocation=blocation;
	}
	public void bankDetails()
	{
		System.out.println("*************************");
		System.out.println("The Bank name : "+bname);
		System.out.println("The location : "+blocation);
		System.out.println("*************************");
	}
	
}

