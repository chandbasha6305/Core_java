package Core_java;
// multi level inhertences  
class GrandParent{
	int height=6;
	int weight=70;
	void colour() {
		System.out.println("the colour is fair colour");
	}
	void hair() {
		System.out.println("the hair colour is black");
	}
}
class Parent1 extends GrandParent{
	
}
class child1 extends Parent1{
	
}
public class multileveinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandParent ch=new GrandParent();
		ch.hair();
		ch.colour();
		Parent1 par=new Parent1();
		par.colour();
	}

}
