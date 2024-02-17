package Object_class;

import java.util.Objects;

public class HashCode {
	
	String name;
	
	int age;
	
	public HashCode(String name, int age) {
		
		this.name=name;
		this.age=age;
	}
	
	@Override
	
	public int hashCode()
	{
		return Objects.hash(name);
	}

	
	public static void main(String[] args) {
		
		HashCode H = new  HashCode("Bala",19);
		
		System.out.println(H.hashCode());
	}
}
