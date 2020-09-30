package bankaccountapp;

public class Savings extends Account implements IBaseRate {

	/*
	 * list properties specific to Savings acct
	 * 
	 * constructor to initialize Savings acct properties
	 * 
	 * list any methods specific to Savings accts																																	
	 * 
	 * */
	int safetyDepositBoxID; 
	int safetyDepositBoxKey; 
	
	
	public Savings(String customerName,String ssN, double initDeposit, int safetyDepositBoxID, int safetyDepositBoxKey) {
		super(customerName, ssN, initDeposit);
		accNo = "1"+ accNo;
		rate = rate - 0.25;
		setSafetyDepositBox();
		
	}

	
	/**
	@Override
	public double setBaseRate() {
		
		return super.setBaseRate();
	}
     
     **/


	public void setSafetyDepositBox() {
		safetyDepositBoxID = ((int)(Math.random()*1000)+100);
		safetyDepositBoxKey = ((int)(Math.random()*10000)+1000);
	}

	@Override
	public void showInfo() {
		System.out.println("Account type: SAVINGS");
		super.showInfo();
		System.out.println(" Your SAVINGS account features: " + 
				"\n Safety Deposit Box ID: "+safetyDepositBoxID+
				"\n Safety Deposit Box Key: "+safetyDepositBoxKey+
				"\n A Base Rate of: "+rate+"%");
				
				
		
	}

	
	
	
	
	
	/**
	private long accNo;
	private double balance;
	private String customerName;
	private String email;
	private long phoneNo;
	
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	//code for deposit
	public  void deposit(double amountDep) {
		//double latestbalance = amountDep + getBalance(); //increment the balance
		this.balance += amountDep;
		
		 //setBalance(latestbalance); //set the new value of balance
		 System.out.println("your new balance is: "+ this.balance);
	}
	
	//code for withdrawal
	public void withdraw(double amountWithdrawn) {
	
	 if(this.balance > amountWithdrawn) {
		 double bal = getBalance() - amountWithdrawn ;
		 
		 setBalance(bal);
		 
		 System.out.println("your new balance is: "+ getBalance());
	 }	
		else {
			System.out.println("Insufficient funds");
		}
	 
	}
	*/
}
