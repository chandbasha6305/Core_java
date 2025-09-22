package staticconcepts;
class Demo{
	static int a;//static variables
	static int b;
	static {//static block
		System.out.println("inside the static block");
		a=20;
		b=30;
	}
	static void test() {
		System.out.println("inside the static method");
	}
	
	int c;
	int d;//instance variables
	{
		System.out.println("inside the instance block");
	}
	void test1() {
		System.out.println("inside the instance method");
	}


	public Demo(){
		System.out.println("construor");
	}
}

public class static1 {
	

	public static void main(String[] args) {
		Demo.test();
		// TODO Auto-generated method stub
		Demo w= new Demo();
		w.test1();
		System.out.println(Demo.a);
	
		System.out.println(w.c);
		
		
	}

}
