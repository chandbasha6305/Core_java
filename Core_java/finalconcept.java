package Core_java;
/*final concept
 * 1.final as variable like final int a=10; the value cannot be change if you are change that will be error
 * 2.final as given the method if give as final of method can be  inherted but cannot be override that is error
 * 3.final as give class cannot be inherted error will be come*/
class dem012{
	final int i=10;
	final void disp() {
		System.out.println("hello");
	}
}
final class demow{

}
class demo22 extends dem012{
	//@Override
	//void disp() {
	//	System.out.println("hlo");
	//}
}

public class finalconcept {
	public static void main(String[] args) {
		demo22 de=new demo22();
	
		de.disp();
	}
}
