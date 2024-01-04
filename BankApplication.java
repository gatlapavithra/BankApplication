import java.util.Scanner;
class BankApplication 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your 'NAME' & 'CUSTOM ID' to access your bank account");
		String Customername=sc.nextLine();
		String CustomerId=sc.nextLine();
		BankACC obj1=new BankACC(Customername,CustomerId);
		obj1.menu();
	}
}
class BankACC
{
	double bal;
	double prevTrans;
	String Customername;
	String CustomerId;
	BankACC(String Customername,String CustomerId)
	{
		this.CustomerId=CustomerId;
		this.Customername=Customername;
	}
	void deposit(double amount)
	{
		if (amount!=0)
		{
			bal+=amount;
			prevTrans=-amount;
		}
		else if (bal<amount)
		{
			System.out.println("bank balance is insufficient");	
		}
	}
	void withdraw(double amount)
	{
		if (amount>500)
		{
			System.out.println("withdraw amt:"+amount);
		}
		else {
			System.out.println("enter valid value...");
		}
	}
	void getpreviousTrans()
	{
		if (prevTrans>0)
		{
			System.out.println("deposited:"+prevTrans);
		}
		else if (prevTrans<0)
		{
			System.out.println("withdrawn:"+Math.abs(prevTrans));
		}
		else {
			System.out.println("no transaction occured");
		}
	}
	void menu()
	{
		char option;
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome"+Customername);
		System.out.println("your Id"+CustomerId);
		System.out.println("\n");
		System.out.println("a) Check balance");
		System.out.println("b) Deposit amount");
		System.out.println("c) Withdraw amount");
		System.out.println("d) Previous Transaction");
		System.out.println("e) Exit");
	    do
	    {
		System.out.println("*******************************");
			System.out.println("choose an option");
			option=sc.next().charAt(0);
			System.out.println("\n");	
		 switch (option)
		 {
			case 'a':
				System.out.println(".............");
				System.out.println("Balance ="+bal);
				System.out.println("--------------------");
				System.out.println("\n");
				break;
			case 'b':
				System.out.println(".............");
				System.out.println("enter amount deposit");
				System.out.println("--------------------");
				double amount=sc.nextDouble();
				deposit(amount);
				System.out.println("\n");
				break;
			case 'c':
				System.out.println(".............");
				System.out.println("enter amount withdraw");
				System.out.println("--------------------");
				double amountW=sc.nextDouble();
				withdraw(amountW);
				System.out.println("\n");
				break;
			case 'd':
			    System.out.println(".............");
				System.out.println("previous transaction");
				System.out.println("--------------------");
				getpreviousTrans();
				System.out.println("--------------------");
				System.out.println("\n");
				break;
			case 'e':
				System.out.println("--------------------");
				break;
			default:
				System.out.println("choose a correct option to proceed");	
		}
	}
	    while (option!='e');
		System.out.println("--------thank you for using our bank services--------");
    }
}		