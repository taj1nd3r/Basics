package bank;

public class BankAccount {
	private String accountno;
private double bal; 
	private String custName;
	private String email;
	private String phnNum;
	//private double withdraw; 
	
	public BankAccount(String accountno, String custName, String email, String phnNum) {
		super();
		this.accountno = accountno;
		this.bal = 0;
		this.custName = custName;
		this.email = email;
		this.phnNum = phnNum;
		//this.withdraw = 0;
	}

	public String getAccountno() {
		return accountno;
	}
//	public void setAccountno(String accountno) {
//		this.accountno = accountno;
//	}
//	
//	public void setBal(double bal) {
//		this.bal = bal;
//	}
	public double getBal() {
		return bal;
	}
	public String getCustName() {
		return custName;
	}
//	public void setCustName(String custName) {
//		this.custName = custName;
//	}
	public String getEmail() {
		return email;
	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
	public String getPhnNum() {
		return phnNum;
	}
//	public void setPhnNum(String phnNum) {
//		this.phnNum = phnNum;
//	}
	
	public void deposit(double deposit ){
		
	this.bal=+deposit;

		System.out.println("Your balance in account is: "+this.bal);
	}
	
	
	public void withdraw(double withdraw ){
		if(this.bal>withdraw){
		this.bal= this.bal-withdraw;
		
System.out.println("customer remaining balance is " + this.bal);
		}
		else {
			
			System.out.println("Insufficient funds");
			}
		
	}
	

}
