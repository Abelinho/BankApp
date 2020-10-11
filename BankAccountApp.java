package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

//import org.omg.PortableInterceptor.ServerRequestInfo;

public class BankAccountApp {

	public static void main(String[] args) {
		
		LinkedList<Account> accounts = new LinkedList<Account>();
		//Read a file and then create accounts based on that data 
		String file = "C:\\eclipse-workspace\\NewBankAccounts.txt";
		
		
		
		/*
		Savings savAcc1 = new Savings("Abel", "987654321", 7000, 0, 0);
		
		Checking checkAcc1 = new Checking("Leo", "123456789", 4000);
		
		savAcc1.showInfo();
		savAcc1.compound();
		//savAcc1.deposit(3000);
		//savAcc1.withdraw(500);
		//savAcc1.transfer("Mum", 1000);
		System.out.println("*************");
		checkAcc1.showInfo();
		**/
		/**
		savAcc1.setBalance(400);
		
		savAcc1.deposit(5000);
		
		savAcc1.withdraw(4000);
		**/
		
		// read a CSV file then create new accounts based on that data
		
		 List<String[]> newAccountHolders = utilities.CSV.read(file);
		
		 //iterate through the List of string arrays using the foreach loop and assign elements of each array to variables
		 //you will use one of these variables to create accts based on type of acct
		 for(String[] accountHolder : newAccountHolders) {
			 
			 
			 String name= accountHolder[0];
			 String ssN = accountHolder[1];
			 String accountType = accountHolder[2];
			 double initDeposit = Double.parseDouble(accountHolder[3]);
			 
			 //if account type is savings/checking, create a savings/checking acct respectively
			 if(accountType.equalsIgnoreCase("savings")) {
				 //System.out.println("Open a Savings Account");
				 accounts.add(new Savings(name, ssN, initDeposit)); //create savings acct and add/save it to the List(of accounts)
			 }else if (accountType.equalsIgnoreCase("checking")) {
					 //System.out.println("Open a Checking Account");
					 accounts.add(new Checking(name, ssN, initDeposit));//create checking acct and add/save it to the List(of accounts)
			}else {
				System.out.println("Error Could not read Account Type");
			}
			 
		 }
		 
		 //iterate thru the List of accounts and call the show info() method on each acct
		 for (Account acct : accounts) {
			 System.out.println("\n******************");
			acct.showInfo();
		}
	}

}
