package Core_java;
/* hybrid inheritances means the single inheritances both heriterical inheritances*/
class Grandparent11{
	int i=0;
	int j=0;
	void haircolur() {
		System.out.println("the hair colour is black");
	}
}
class parent111 extends Grandparent11{
	
}
class child111 extends parent111{
	
}
class child222 extends parent111{
	
}

public class hybridinheritances {
	public static void main(String[] args) {
		Grandparent11 gp=new Grandparent11();
		gp.haircolur();
		parent111 pa=new parent111();
		pa.haircolur();
		child111 ch=new child111();
		ch.haircolur();
		child222 ch1=new child222();
		ch1.haircolur();
	}
}
