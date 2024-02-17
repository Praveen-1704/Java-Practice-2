package Object_class;

public class To_String {
	
	String name;
	int age;
	
	
	public To_String(String name,int age) {
		
		this.name=name;
		this.age=age;
	}
	
	
	@Override
	
	public String toString()
	{
		return name+" "+age;
	}
	
	
	public static void main(String[] args) {
		
		
		To_String T = new To_String("Bala",19);
		
		System.out.println(T);
		
	}

}
