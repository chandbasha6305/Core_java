package enpulsationconcept;
class Bank{
	//normal enpulsation
	private int pinCode;
	private String accountNo;
	
	public void setpinCode(int p) {
		pinCode=p;
	}
	public void setaccountNo(String s) {
		accountNo=s;
	}
	public  int getpinCode() {
		return pinCode;
	}
	public String getaccountNo() {
		return accountNo;
	}
}

public class enpulsa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1=new Bank();
		b1.setaccountNo("gsagdgasj");
		b1.setpinCode(344);
		System.out.println(b1.getaccountNo());
		System.out.println(b1.getpinCode());
	}

}
