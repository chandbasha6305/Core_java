package enpulsationconcept;
//zero parameter constructor
class Bank6{
	private int pin;
	private String name;
	private String place;
	private String acc;
	public Bank6() {
		this.pin=100;
		this.name="chand";
		this.place="narpala";
		this.acc="chan1234";
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

public class enplusa6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank6 b1=new Bank6();//zero parameter constructor
		System.out.println(b1.getAcc());
		System.out.println(b1.getName());
		System.out.println(b1.getPin());
		System.out.println(b1.getPlace());
	}

}
