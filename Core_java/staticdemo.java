package Core_java;
class customer2{
	static int a;
	static int b;
	static{
		a=20;
		b=30;
		System.out.println("static block is executed");
		System.out.println(a);
		
		
	}
	static void method() {
		System.out.println("static method is execuated");
	}
	int x;
	int y;
	{
		System.out.println("instance block is executed");
		System.out.println(x);
	}
	void method1() {
		System.out.println("instance method is execuated");
		System.out.println(x);
	}
	public customer2() {
		System.out.println("the construtor will be execuated");
		System.out.println(x);
	}
}

public class staticdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customer2 cal=new customer2();

		
		
	}

}
