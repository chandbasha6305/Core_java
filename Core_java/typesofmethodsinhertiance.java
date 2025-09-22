package Core_java;
/*types of methods in inheritances
 * 1.inherited method
 * 2. override methods
 * 3.specalized methods
 * */
class plane1{
	void fly() {
		System.out.println("the plane is flying");//inheriedmethod
	}
	void takeoff() {
		System.out.println("the plane is more time taken takeoff");
	}
}
class cargoplane extends plane1{
	@Override
	void takeoff() {
		System.out.println("the plane is taken more than plane");
	}
	void cargos() {
		System.out.println("the plnae took the goods");//specialized method
	}
}

public class typesofmethodsinhertiance {
	public static void main(String[] args) {
		cargoplane ca=new cargoplane();
		ca.fly();
		ca.takeoff();
		ca.cargos();
		
	}

}
