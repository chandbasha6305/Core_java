package Core_java;
class customer22{
	int i=20;
	int j=40;
	void method() {
		System.out.print("hello");
	}
	@Override
	public String toString() {
		return "customer22 [i=" + i + ", j=" + j + "]";
	}
	
}

public class tostringmethod {
	public static void main(String[] args) {
		customer22 de=new customer22();
		System.out.print(de.toString());
		de.method();
	}
}
