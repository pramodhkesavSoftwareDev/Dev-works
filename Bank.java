class Bank
{
public static void main(String[] args)
{
Bank manager= new Bank();
double balance = manager.calculateInterest(100000);
	System.out.println(balance);
	balance= manager.calculateInterest(100000,5);
	System.out.println(balance);
	balance=manager.calculateInterest(1000,12,6.0f);
System.out.println(balance);
	manager.calculateInterest(1000,12,6);
	String customer =manager.calculateInterest(100000,"kathir");
	System.out.println(customer);
}
		public String calculateInterest(int am,String name)
{
return name;
}
	
		public double calculateInterest(int p,int n,float r)
{
return p*n*(r/100);
}
	public double calculateInterest(int amount,int year)
{
float interest=4.5f;
double value=amount*4.5/100 *year;
return value;
}
public double calculateInterest(int amount)
{
float interest=4.5f;
double value=amount*4.5/100;
return value;
}

}