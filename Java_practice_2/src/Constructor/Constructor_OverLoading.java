package Constructor;

public class Constructor_OverLoading {
	
	String name;
	
	int age;
	
	public Constructor_OverLoading(String name) {
		this.name=name;
		
	}
	
	public Constructor_OverLoading(String name,int age) {
		
		this(name);
		this.age=age;
	}
	
	public static void main(String[] args) {
		
		Constructor_OverLoading C = new Constructor_OverLoading("Bala");
		
		Constructor_OverLoading C1 = C;
		
		System.out.println(C);
		
		System.out.println(C.name);
		
		System.out.println(C1.name);
	}
	

}
