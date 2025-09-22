package Core_java;
class plane{
	void fly() {
		System.out.println("fly is speed");
	}
	void takeoff() {
		System.out.println("take offf 15 min");
	}
	void takeon() {
		System.out.println("take on");
	}
}
class passenger extends plane{
	@Override
	void takeoff() {
		System.out.println("take offf 20 min");
	}
	
	void takes()
	{
		System.out.println("take the passsagers");
	}
}
class cargo extends plane{
	@Override
	void takeoff() {
		System.out.println("take offf 25 min");
	}
	void takecargo() {
		System.out.println("take the cargoss");//specialized
	}
}

public class inheritancemethods {
	/* inheritance method are three types
	 * 1.inherited method
	 * 2.override method like @overide
	 * 3.specialized method
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cargo ca=new cargo();
		ca.fly();
		
	}

}
