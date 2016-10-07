package ps3;

import java.util.Date;

public class Account {
	
		private int id = 0;
		private double balance = 0;
		private double annualInterestRate;
		private Date dateCreated;
		
		public Account() {
		    id = 0;
		    balance = 0;
		    annualInterestRate = annualInterestRate;
		    dateCreated = dateCreated;
		}
		public Account(int id, double balance) {
		    this.id = id;
		    this.balance = balance;
		}
		public int getId(){
			return id;
		}
		 public void setId(int id){     
			 this.id = id;   
			 }
		public double getBalance(){
			return balance;
		}
		public void setBalance(double balance){
			this.balance = balance;
		}
		public double getInterestRate(){
			return annualInterestRate;
		}
		public void setInterestRate(double annualInterestRate){
			this.annualInterestRate = annualInterestRate;
		}
		public Date getDateCreated(){
			return dateCreated;
		}
		public double getMonthlyInterestRate(){
			return (annualInterestRate / 12);
		}
		public void withdraw (double amount) throws InsufficientFundsException{
		
			 if(amount <= balance)
		      {
		         balance -= amount;
		      }
		      else
		      {
		         double needs = amount - balance;
		         throw new InsufficientFundsException(needs);
		      }
		}
		public void deposit (double amount){
			
			balance += amount;
		}
		
}
