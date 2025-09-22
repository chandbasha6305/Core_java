package Core_java;
interface calcaulator{
	public abstract void add();
	public abstract void sub();
}
class calculator1 implements calcaulator{
	@Override
	public void add() {
		System.out.println("add and sunsd");
	}
	@Override
	public void sub() {
		System.out.println("vvgsagad");
	}
	public void mul() {//specialized
		System.out.println("multasd");
	}
	
}
class calculator2 implements calcaulator{
	@Override
	public void add() {
		int a=20;
		int b=40;
		System.out.println(a+b);
		
	}
	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int a=40;
		int b=30;
		System.out.println(a-b);
	}
}
/*class allmethods{
	void poly(calcaulator ref) {
		ref.add();
		ref.sub();
	}
}*/

public class interface1 {
	public static void main(String[] args) {
	
		calculator1 cal=new calculator1();
		calculator2 cal2=new calculator2();
		calcaulator ref;
		ref=cal;
		ref.add();
		ref.sub();
		((calculator1)(ref)).mul();
		ref=cal2;
		ref.add();
		ref.sub();
		
	}
}
