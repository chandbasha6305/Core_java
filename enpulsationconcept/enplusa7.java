package enpulsationconcept;
/* CONSTRUCTOR OVERLOADING MEANS MULTIPLES CONSTRUCTORS WITH A SAME NAME AND INSIDE A CLASS IS KNOW AS CONSTRUCTOR OVERLOADING*/
class Bank7{
	private int pin;
	private String name;
	private String place;
	private String acc;
	public Bank7() {///same name and muliplues constructors
		this.pin=100;
		this.name="chand";
		this.place="narpala";
		this.acc="chan1234";
	}
	public Bank7(int pin,String name,String place,String acc ) {
		this.acc=acc;
		this.name=name;
		this.place=place;
		this.pin=pin;
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

public class enplusa7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank7 b1=new Bank7();
		System.out.println(b1.getAcc());
		System.out.println(b1.getName());
		System.out.println(b1.getPin());
		System.out.println(b1.getPlace());
		Bank7 b2=new Bank7(22, "asdas", "hhwhw", "sewee");
		System.out.println(b2.getAcc());
		System.out.println(b2.getName());
		System.out.println(b2.getPin());
		System.out.println(b2.getPlace());
	}

}
