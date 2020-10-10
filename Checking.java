package bankaccountapp;

public class Checking extends Account implements IBaseRate {

	/*
	 * list properties specific to checking acct
	 * 
	 * constructor to initialize checking acct properties
	 * 
	 * list any methods specific to checking accts																																	
	 * 
	 * */
	
	private int debitCardNumber;
	private int debitCardPIN;
	
	public Checking(String customerName,String ssN, double initDeposit ) {
	super(customerName, ssN, initDeposit);
	accNo = "2"+ accNo;
	rate = rate*0.15;
	setDebitCard();
	}
    //+ Math.pow(10, 10)
	public void setDebitCard() {
		debitCardNumber = (int)(Math.random()*Math.pow(10, 12));
		debitCardPIN = ((int)(Math.random()*10000)+1000);
	}
	
	@Override
	public void showInfo() {
		System.out.println("Account type: CHECKING");
		super.showInfo();
		System.out.println(" Your CHECKING account features: " + 
				"\n Debit Card Number: "+debitCardNumber+
				"\n Debit Card PIN: "+debitCardPIN+
				"\n A Base Rate of: "+rate+"%");
		
	}
	
	
}
