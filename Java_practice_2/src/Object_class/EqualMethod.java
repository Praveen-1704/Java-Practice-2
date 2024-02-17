package Object_class;

public class EqualMethod {
	
	String name;
	
	int age;
	
	public EqualMethod(String name, int age) {
		
		this.name=name;
		
		this.age=age;
	}
	
	public boolean equals(Object O)
	{
		EqualMethod E = (EqualMethod) O;
		return this.name==E.name;
	}
	
	public static void main(String[] args) {
		
		EqualMethod E = new EqualMethod("Manoj", 13);
		
		EqualMethod E1 = new EqualMethod("Manoj",14);
		
		System.out.println(E.equals(E1));
	}
	

}
