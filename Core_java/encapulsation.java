package Core_java;
class bank{
	private int pin;
	private int bankaccount;
	public bank() {
		pin=12;
		bankaccount=20000;
		
	}
	
	public bank(int pin,int bankaccount) {
		this();
		this.bankaccount=bankaccount;
		this.pin=pin;
	}
	
	int getPin() {
		return pin;
	}
	int getbankaccount() {
		return bankaccount;
	}
	
	
}
/* encapsulation  defination is having object having a important data so we provide the
    security so we can use the private keyword so the direct access is not given the
    control access go the setters and getters ,setters and getters are methods like setters 
     are set the data and getters are get the data .
     1.what is encapulsation
     2.what is setters and getters
     3.what is shadowing problems to over come the drawback we can use this keyword
     4.how to call contructor
     5.contructor overloading
     6.contructor chaining*/

public class encapulsation {
	public static void main(String[]args) {
		bank s=new bank();
		System.out.println(s.getbankaccount());
		System.out.println(s.getPin());
		bank e=new bank(2323,344);
		System.out.println(e.getbankaccount());
		System.out.println(e.getPin());
	}
}
