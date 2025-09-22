package Core_java;
/*aggregations and compositions
 * compositions is tight bound so create object
 * aggregation is loose bound so we can create method*/
class Os{
	private String name;
	private int size;
	
	public Os(String name, int size) {
		this.name=name;
		this.size=size;
	}
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
	
}
class Charge{
	private float volt;
	private String name;
	public Charge(float volt,String name) {
		this.volt=volt;
		this.name=name;
	}
	public float getVolt() {
		return volt;
	}
	public String getName() {
		return name;
	}
}
class Moblie{
	Os os=new Os("anroid",56);//compostion
	void hasA(Charge ref) {//aggrtation
		ref.getName();
		ref.getVolt();
	}
}

public class aggrerations {
	public static void main(String[] args) {
		Moblie mb=new Moblie();
		Charge ch=new Charge(2.0f,"samsung");
		System.out.println(mb.os.getName());
		System.out.println(mb.os.getSize());
		mb.hasA(ch);
		System.out.println(ch.getName());
		System.out.println(ch.getVolt());
		mb=null;
		//System.out.println(mb.os.getName());
		//System.out.println(mb.os.getSize());
		System.out.println(ch.getName());
		System.out.println(ch.getVolt());
	}

}
