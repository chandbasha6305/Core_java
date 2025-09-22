package Core_java;


/* abstract is like as normal class but we cannot create object of the abstract class
 * abstarct means there is only method signature there is no body is known is abstract
 * abstract can acheive there are two types 1.absract 2.interface
 * abstract can having two types 1.pure abstarction and 2.impure abstractions that time using interfaces concept
 * abstract cannot work in final and abstract
 * abstract given the method class should be abstract */
abstract class te{
	abstract void method1();
	static {
		System.out.println("static block");
	}
	void display() {
		
	}
	public te(int a) {
		System.out.println("parent constructor calling");
	}
}
class test3 extends te{
	
	{
		System.out.println("instansce block will excuted");

	}
	
	@Override
	void method1() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("basha");
	}
	public test3(int a,int b) {
		super(20);

		System.out.println("child constructor calling");
	}
	public test3(int a) {
		this(30,40);
		System.out.println("calling");
	}
	public test3() {
		this(20);
		System.out.println("zero paramenter construtor");
	}
}

public class abstractclass {
	public static void main(String[] args) {
		test3 t=new test3();
		t.display();
		t.method1();
	}

}
