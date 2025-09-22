package enpulsationconcept;
/*constructor chaining :: call one constructor to another construtor using this()  is keyword */
class Bank8{
	private int pin;
	private String name;
	private String place;
	private String acc;
	public Bank8() {///same name and muliplues constructors
		this.pin=100;
		this.name="chand";
		this.place="narpala";
		this.acc="chan1234";
	}
	public Bank8(int pin,String name,String place,String acc ) {
		this();//construcor chaining
		//this.acc=acc;
		//this.name=name;
		//this.place=place;
		//this.pin=pin;
	}
	public int getPin() {
		return pin;
	}
	public String getName() {
		return name;
	}
	
	public String getPlace() {
		return place;
	}
	
	public String getAcc() {
		return acc;
	}
	
}

public class enpulsa8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bank8 b1=new Bank8();
		//System.out.println(b1.getAcc());
		//System.out.println(b1.getName());
		//System.out.println(b1.getPin());
		//System.out.println(b1.getPlace());
		Bank8 b2=new Bank8(22, "asdas", "hhwhw", "sewee");
		System.out.println(b2.getAcc());
		System.out.println(b2.getName());
		System.out.println(b2.getPin());
		System.out.println(b2.getPlace());
	}

}
