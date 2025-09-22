package Core_java;
/* a parent class having more childrens like more childs*/
class parent11{
	int a=70;
	int b=0;
	void color() {
		System.out.println("the colour is black");
	}
	void hair() {
		System.out.println("the hair colour is white");
	}
}
class child11 extends parent11{
	
}
class child22 extends parent11{
	
}
public class herieracalinheritances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child11 ch=new child11();
		ch.color();
		child22 ch1=new child22();
		ch1.color();
	}

}
