package Core_java;

class customer{
	private int cNum;
	private String cName;
	private int cId;
	
	
	public customer() {
		cNum=20;
		cName="chand";
		cId=12;
	}
	public customer(int cNum,String cName,int cId) {
		this.cNum=cNum;
		this.cName=cName;
		this.cId=cId;
	}
	int getcNum() {
		return cNum;
	}
	String getcName() {
		return cName;
	}
	int getcId() {
		return cId;
	}
}

public class constructormethodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//customer cus=new customer();
		//System.out.println(cus.getcNum());
		//System.out.println(cus.getcName());
		//System.out.println(cus.getcId());
		customer cus1=new customer(2,"dhgd",12);
		System.out.println(cus1.getcNum());
		System.out.println(cus1.getcName());
		System.out.println(cus1.getcId());
	}

}
