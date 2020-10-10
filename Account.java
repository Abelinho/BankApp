package bankaccountapp;

public abstract class Account implements IBaseRate {

	

	/*list properties common to both savings and checking accts
	 * 
	 * constuctor to set base properties and initialize account
	 * 
	 * list common methods
	 * */
	 protected String accNo;
	 private double balance;
	 private String customerName;
	 private String ssN;
	 protected double rate;
	 private static int index=10000;
	
	public Account(String name, String ssN, double initDeposit) {
		this.customerName = name;
		this.ssN = ssN;
		this.balance = initDeposit;
	 //System.out.println("Name: "+name+" SSN: "+ ssN+" BALANCE: "+initDeposit );	
	 
	//set acc number 
	 index++;
	 this.accNo = setAccountNumber();
	 
	 rate = setBaseRate();
	 
	}
  
	 String setAccountNumber() {
		
		String lastTwoDigOfSSN = ssN.substring(ssN.length()-2, ssN.length());
		
		int uniqueID = index; 
		
		int ranDNum = ((int)(Math.random()*1001)+100);
		
		return lastTwoDigOfSSN + uniqueID + ranDNum;
	}
	
	 //list common methods-transactions
	 
	 public void compound() {
		double accruedInterest = balance*(rate/100); //time period was ignored
		System.out.println("Accrued Interest: $"+accruedInterest);
		balance +=accruedInterest;
		printBalance();
	}
	 
	 public void deposit(double amount) {
		balance = balance + amount;
	}
	 
	 public void withdraw(double amount) {
		balance = balance - amount;
	}
	 
	 public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Tranfering $"+amount+" to: "+toWhere);
		printBalance();
	}
	 
	 public void printBalance() {
		System.out.println("Your current balance is: $"+balance);
	}
	 
	 public void showInfo() {
		System.out.println("Name: "+customerName+" \nAccNo: "+accNo+" \nBalance: "+balance);
	}
	
	
}
