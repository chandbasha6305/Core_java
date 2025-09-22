package Core_java;
abstract class student{
	 abstract void semseter();
	 void subject() {
		 System.out.println("semestre of bboks");
	 }
	 void teacher() {
		 System.out.println("chand basha ");
	 }
}
class student1 extends student{
	@Override
	void semseter() {
		System.out.println("fisrt semeseter ");
		
	}
}

class student2 extends student{
	@Override
	void semseter() {
		// TODO Auto-generated method stub
		System.out.println("second semeseter ");
		
	}
}
class student3 extends student{
	@Override
	void semseter() {
		// TODO Auto-generated method stub
		System.out.println("third semeseter ");
		
	}
}
class college{
	void attents(student ref) {
		ref.semseter();
		ref.subject();
		ref.teacher();
	}
}
public class abstractpolymohersism {
	public static void main(String[] args) {
		student1 s=new student1();
		student2 s1=new student2();
		student3 s2=new student3();
		college c=new college();
		c.attents(s);
		c.attents(s1);
		c.attents(s2);
	}

}
