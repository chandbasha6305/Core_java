package enpulsationconcept;
//setters we can use only create method
class bank3{
	private int pin;
	private String name;
	private String place;
	private String acc;
	
	public void setdata(int pin,String name,String place,String acc) {//at a time set the data
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
public class enplusa3 {
	public static void main(String[] args) {
		bank3 b=new bank3();
		b.setdata(23, "ssdads", "sdasda", "dsdfs");
		System.out.println(b.getAcc());
		System.out.println(b.getName());
		System.out.println(b.getPin());
		System.out.println(b.getPlace());
	}
}
