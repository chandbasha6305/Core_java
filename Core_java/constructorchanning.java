package Core_java;
class customer1{
	private int cId;
	private String cName;
	private int cNum;
	
	public customer1() {
		this.cId=272;
		this.cName="chand";
		this.cNum=23;
	}
	public customer1(int cId,String cName,int cNum) {
		this();
		this.cName=cName;
		
	}
	public int getcId() {
		return cId;
	}
	public int getcNum() {
		return cNum;
	}
	public String getcName() {
		return cName;
	}
}

public class constructorchanning {
	public static void main(String[] args) {
		customer1 cus=new customer1(2,"dhjdj",44);
		System.out.println(cus.getcId());
		System.out.println(cus.getcName());
		System.out.println(cus.getcNum());
	}

}
