package Core_java;

/*interitences is process of aquring of proporites and behaviour one class to another class*/
class Parent{
	int height=200;
	int weight=266;
	void haircut(){
		System.out.println("the hair is black");
	}
	void colour() {
		System.out.println("the colour is white");
	}
	void face() {
		System.out.println("the face is round face");
	}
	
}
class child extends Parent{
	
}
public class singleinteritance {
	public static void main(String[] args) {
		child ch=new child();
		ch.colour();
		ch.face();
	}

}
