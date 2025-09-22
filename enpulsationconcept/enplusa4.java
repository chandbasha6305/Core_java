package enpulsationconcept;
class Bank4{
	private int pin;
	private String name;
	private String place;
	private String acc;
	
	public Bank4(int pin,String name,String place,String acc) {//constructor--object creation call the constructor 
		this.pin = pin;
		this.name=name;
		this.place=place;
		this.acc=acc;
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

public class enplusa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank4 b1=new Bank4(22, "ddsa", "727723", "dahdsj");//parametered constructor
		System.out.println(b1.getAcc());
		System.out.println(b1.getName());
		System.out.println(b1.getPin());
		System.out.println(b1.getPlace());
	}

}
