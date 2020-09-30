package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		
		Savings savAcc1 = new Savings("Abel", "987654321", 7000, 0, 0);
		
		Checking checkAcc1 = new Checking("Leo", "123456789", 4000);
		
		savAcc1.showInfo();
		System.out.println("*************");
		checkAcc1.showInfo();
		
		/**
		savAcc1.setBalance(400);
		
		savAcc1.deposit(5000);
		
		savAcc1.withdraw(4000);
		**/
	}

}
