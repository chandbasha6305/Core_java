package Core_java;
class calculator{
	void add() {
		System.out.println("add nothing");
	}
	void add(int a,int b) {
		System.out.println("int and int");
	}
	void add(int a ,int b,int c) {
		System.out.println("int int int");
	}
	void add(int a ,float b) {
		System.out.println("int float");
	}
	void add(byte a,char b) {
		System.out.println("byte and char");
	}
	void add(char a,char b) {
		System.out.println("int anf char");
	}
}

public class methodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator cal=new calculator();
		cal.add(3,8);

	}

}
