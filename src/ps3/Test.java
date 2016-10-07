package ps3;

public class Test {
	
	public static void main(String [] args) throws InsufficientFundsException
	   {
	Account a = new Account(1122, 20000);
	a.setInterestRate(4.5);
	a.withdraw(2500);
	a.deposit(8000);
	System.out.println("The balance is " + a.getBalance() + ", the monthly interest rate is " +  a.getMonthlyInterestRate() + "%, and account was created on " + a.getDateCreated());
	a.withdraw(100000000);
	
}
}