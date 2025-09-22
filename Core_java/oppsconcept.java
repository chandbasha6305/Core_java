package Core_java;
import java.util.Scanner;
abstract class shape{
	float area;
	abstract void input();
	abstract void formala();
	abstract void display();
}
class square extends shape{
	private float a;
	@Override
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the area");
		a=sc.nextFloat();
	}
	@Override
	void formala() {
		area=a*a;
	}
	@Override
	void display() {
		System.out.println(area);
	}
}
class rectangle extends shape{
	float area;
	private float length;
	private float width;
	@Override
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the length");
		length=sc.nextFloat();
		System.out.print("enter the width");
		width=sc.nextFloat();
	}
	@Override
	void formala() {
		area=length*width;
	}
	void display() {
		System.out.println(area);
	}
	
}
class circle extends shape{
	static float pi=2.14f;
	private float radius;
	@Override
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the radius");
		radius=sc.nextFloat();
	}
	@Override
	void formala() {
		area=pi*radius*radius;
	}
	void display() {
		System.out.println(area);
	}
}
class areaformal{
	void maths(shape ref) {
		ref.input();
		ref.formala();
		ref.display();
	}
}

public class oppsconcept {
 public static void main(String[] args) {
	 square sq=new square();
	 rectangle re=new rectangle();
	 circle ce=new circle();
	 areaformal ae=new areaformal();
	 ae.maths(sq);
	 ae.maths(re);
	 ae.maths(ce);
	
 }
}
