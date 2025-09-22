package enpulsationconcept;
//avoid the shadooing problem
class Bank1{
	private String name;
	private String place;
	public void setName(String name) {
		this.name=name;
	}
	public void setPlace(String place) {
		this.place=place;
	}
	public String getName() {
		return name;
	}
	public String getPlace() {
		return place;
	}
	
}

public class enpulsa2 {
	public static void main(String[] args) {
		Bank1 b=new Bank1();
		b.setName("ksgajgd");
		b.setPlace("ashdkhksa");
		System.out.println(b.getName());
		System.out.print(b.getPlace());
	}
}
