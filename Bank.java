class Bank{
	public static void main(String[] args){
		
		// Created Instance for Bank Accounts
		BankAccount BA1 = new BankAccount();
		BankAccount BA2 = new BankAccount();

		BA1.AccountNumber	= 1009098;
		BA1.AccountHName	= "Varshith";
		BA1.Amount			= 1000.0;
		BA1.PhoneNumber		= 9014561315L;

		BA2.AccountNumber	= 1009088;
		BA2.AccountHName	= "Nathani Ashok";
		BA2.Amount			= 100000.0;
		BA2.PhoneNumber		= 9989510813L;

		



		System.out.println("\n Account 1 details:");

		System.out.println("BA1.BranchName\t\t\t:"+	  BA1.BranchName);
		System.out.println("BA1.ifsc\t\t\t:"+		  BA1.ifsc);
		System.out.println("BA1.AccountNumber\t\t:"+  BA1.AccountNumber);
		System.out.println("BA1.AccountHName\t\t:"+   BA1.AccountHName);
		System.out.println("BA1.Ammount\t\t\t:"+	  BA1.Amount);
		System.out.println("BA1.PhoneNumber\t\t\t"+	  BA1.PhoneNumber);


		System.out.println("\n Account 2 details:");

		System.out.println("BA2.BranchName\t\t\t:"+	  BA2.BranchName);
		System.out.println("BA2.ifsc\t\t\t:"+		  BA2.ifsc);
		System.out.println("BA2.AccountNumber\t\t:"+  BA2.AccountNumber);
		System.out.println("BA2.AccountHName\t\t:"+   BA2.AccountHName);
		System.out.println("BA2.Ammount\t\t\t:"+	  BA2.Amount);
		System.out.println("BA2.PhoneNumber\t\t\t"+	  BA2.PhoneNumber);
		
	}
}
