package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		
		Savings savAcc1 = new Savings("Abel", "987654321", 7000, 0, 0);
		
		Checking checkAcc1 = new Checking("Leo", "123456789", 4000);
		
		savAcc1.showInfo();
		savAcc1.compound();
		//savAcc1.deposit(3000);
		//savAcc1.withdraw(500);
		//savAcc1.transfer("Mum", 1000);
		System.out.println("*************");
		checkAcc1.showInfo();
		
		/**
		savAcc1.setBalance(400);
		
		savAcc1.deposit(5000);
		
		savAcc1.withdraw(4000);
		**/
	}

}
