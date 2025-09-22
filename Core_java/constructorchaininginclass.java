package Core_java;
class test{
	int x;
	int y;
	public test() {
		x=20;
		y=25;
	}
	public test(int x,int y) {
		this.x=x;
		this.y=y;
	}
}
class test1 extends test{
	int a;
	int b;
	public test1(){
		this(4,50);
		a=100;
		b=200;
	}
	public test1(int a,int b) {
		super(80,88);
		this.a=a;
		this.b=b;
	}
	void disp() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
	}
}
public class constructorchaininginclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 te=new test1();
		te.disp();
	}

}
