package Core_java;
class plane11{
	int i=0;
	int j=0;
	void takeoff() {
		System.out.println("take off planes");
	}
	void fly() {
		System.out.println("the plane is flying");
	}
}
class cargoplane11 extends plane11{
	@Override
	void fly() {
		System.out.println("the cargo plane is flying");
	}
	void cargooo() {
		System.out.println("the goodds");
	}
}
class fighterplane extends plane11{
	@Override
	void fly() {
		System.out.println("the weapeans are carry in plane is flying");
	}
}
class airport{
	void permit(plane11 ref) {
		ref.takeoff();
		ref.fly();
		((cargoplane11)(ref)).cargooo();
		
		
	}
	
}

public class polymoherism {
	public static void main(String[] args) {
		cargoplane11 ca=new cargoplane11();
		fighterplane fp=new fighterplane();
		airport a=new airport();
		a.permit(ca);
		a.permit(fp);
		//(cargoplane11)a)).permit(fp).cargooo();
		
	}

}
