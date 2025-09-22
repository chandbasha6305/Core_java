package Core_java;
class Heart{
	private int weight;
	private int bp;
	public Heart(int weight ,int bp) {
		this.weight=weight;
		this.bp=bp;
	}
	public int getWeight() {
		return weight;
	}
	
	public int getBp() {
		return bp;
	}
	
}
class Brain{
	private int weight;
	private String colour;
	public Brain(int weight, String colour) {
		this.weight = weight;
		this.colour = colour;
	}
	public String getColour() {
		return colour;
	}
	public int getWeight() {
		return weight;
	}
	
}
class Bike{
	private String brand;
	private int milage;
	public Bike(String brand, int milage) {
		this.brand = brand;
		this.milage = milage;
	}
	public String getBrand() {
		return brand;
	}
	public int getMilage() {
		return milage;
	}
	
	
}
class Books{
	private String name;
	private String author;
	public Books(String name, String author) {
		this.name = name;
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	
}
class Student{
	Heart he=new Heart(20,70);
	Brain be=new Brain(1,"blue");
	void hasA(Bike ref) {
		ref.getBrand();
		ref.getMilage();
	}
	void hasB(Books ref1) {
		ref1.getAuthor();
		ref1.getName();
	}
}

public class aggrerations2 {
	public static void main(String[] args) {
		Bike be=new Bike("hero",40);
		Books bo=new Books("chand","nothing");
		Student se=new Student();
		System.out.println(se.he.getWeight());
		System.out.println(se.he.getBp());
		System.out.println(se.be.getWeight());
		System.out.println(se.be.getColour());
		se.hasA(be);
		System.out.println(be.getBrand());
		System.out.println(be.getMilage());
		se.hasB(bo);
		System.out.println(bo.getAuthor());
		System.out.println(bo.getName());
		se=null;
		System.out.println("-------------");
		System.out.println(be.getBrand());
		System.out.println(be.getMilage());
		System.out.println(bo.getAuthor());
		System.out.println(bo.getName());
		
	}

}
