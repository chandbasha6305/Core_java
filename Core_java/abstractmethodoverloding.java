package Core_java;
abstract class body{
	 abstract void system();
}
class body2 extends body{
	@Override
	void system() {
		System.out.println("system will be executed");
		
	} 
	void system(int a) {
		System.out.println("system will be executed like int ");
		
	}
	void system(int a,int b) {
		System.out.println("system will be executed like int int ");
		
	}
	void system(int a, float b) {
		System.out.println("system will be executed like int float ");
		
	}
	void system(int a,int b,int c) {
		System.out.println("system will be executed like int  int int");
		
	}
	void system(int a,char c) {
		System.out.println("system will be executed like int char ");
		
	}
	void system(char a ,int b) {
		System.out.println("system will be executed like char int ");
	}
	 
 }

public class abstractmethodoverloding {
	public static void main(String[] args) {
		body2 se=new body2();
		se.system(2);
		//se.system('B','a');in this case ambiguous error will be came because there is no implicat typecasting
	}
}
