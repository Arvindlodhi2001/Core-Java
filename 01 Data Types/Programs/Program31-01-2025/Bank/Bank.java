public class Bank{
       public static void main(String[] args){
	      
		  Account A1 = new Account();
		  Account A2 = new Account();
		  
		      A1.BankName = "HDFC Bank ";
			  A1.BankBranchName = "HDFC Bank Ammerepit";
			  A1.BankIFCS  = "9827HDFCABC12345";
			  
			  A1.AccountHolderName  = "Arvind Lodhi";
			  A1.AccountNumber  = 9827805086L;
			  A1.Balance  = 499999.99;
			  
			  System.out.println("Bank Name ID :-" + A1.BankName);
			  System.out.println("Bank Branch Name :-" + A1.BankBranchName );
			  System.out.println("Bank IFCS :-" + A1.BankIFCS );
			  
			  System.out.println("Account Holder Name :-" + A1.AccountHolderName  );
			  System.out.println("Account Number:-" + A1.AccountNumber  );
			  System.out.println("Balance :-" + A1.Balance  );
			  
			  
			  System.out.println("----------------************--------------" );
			  
			  A2.BankName = "HDFC Bank ";
			  A2.BankBranchName = "HDFC Bank Ammerepit";
			  A2.BankIFCS  = "9827HDFCABC12345";
			  
			  A2.AccountHolderName  = "Akash Lodhi";
			  A2.AccountNumber  = 78280346856L;
			  A2.Balance  = 999999.99;
			  
			  System.out.println("Bank Name ID :-" + A2.BankName);
			  System.out.println("Bank Branch Name :-" + A2.BankBranchName );
			  System.out.println("Bank IFCS :-" + A2.BankIFCS );
			  
			  System.out.println("Account Holder Name :-" + A2.AccountHolderName  );
			  System.out.println("Account Number:-" + A2.AccountNumber  );
			  System.out.println("Balance :-" + A2.Balance  );
			  
			  
			  System.out.println("----------------************--------------" );
	   }
}