package bank;

public class Main {
	
	public static void main(String args[]){
		BankAccount acc=new BankAccount("1234","tajinder","tajinderasr9@gmail.com","3437778460");
//		acc.deposit(65.98);
//		acc.withdraw(5);
//		acc.withdraw(100);
//		acc.deposit(500);
//		acc.withdraw(100);
//		//System.out.println("Account No is "+acc.getAccountno());;
//		
		VipCustomer cust= new VipCustomer();
		System.out.println(cust.getName());
		
		VipCustomer cust1= new VipCustomer("tajinder","t@gmail.com");
		System.out.println(cust1.getName());
		
		VipCustomer cust2= new VipCustomer("tj","t@gmail.com",7778.4);
		System.out.println(cust2.getName());
		System.out.println(cust.getCreditLimit());
		
		
		
		
		
	}

}
