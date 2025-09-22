package enpulsationconcept;
//DEFAULT CONSTRUCTOR if user not create constructor java complier will be created the default constructor 
class Bank5{
	private int pin;
	private String name;
	private String place;
	private String acc;
	//here there is no constructor but java complier given if user given constructor the java complier not give default constrr.
	//public Bank5(string name ,string place ,string acc){
	//
	
	//}
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

public class enpulsa5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank5 b1=new Bank5();
		System.out.println(b1.getAcc());
		System.out.println(b1.getName());
		System.out.println(b1.getPin());
		System.out.println(b1.getPlace());
	}

}
