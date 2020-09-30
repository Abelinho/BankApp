package bankaccountapp;

public abstract class Account implements IBaseRate {

	

	/*list properties common to both savings and checking accts
	 * 
	 * constuctor to set base properties and initialize account
	 * 
	 * list common methods
	 * */
	 String accNo;
	 double balance;
	 String customerName;
	 String ssN;
	 double rate;
	static int index=10000;
	
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
  /**
	@Override
	public double setBaseRate() {
		// TODO Auto-generated method stub
		return IBaseRate.super.setBaseRate();
	}
	**/
	 String setAccountNumber() {
		
		String lastTwoDigOfSSN = ssN.substring(ssN.length()-2, ssN.length());
		
		int uniqueID = index; 
		
		int ranDNum = ((int)(Math.random()*1001)+100);
		
		return lastTwoDigOfSSN + uniqueID + ranDNum;
	}
	
	 public void showInfo() {
		System.out.println("Name: "+customerName+" \nAccNo: "+accNo+" \nBalance: "+balance);
	}
	
	
}
