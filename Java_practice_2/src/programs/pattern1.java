package programs;

public class pattern1 {
	
	String name="Rama";
	
	public void m1()
	{
		String name="Apple";
		
		System.out.println(this.name);
	}
	
	public static void main(String[] args) {
		
		pattern1 P = new pattern1();
		
		P.m1();
		
		System.out.println(P.name);
		
		String name="Krishna";
		
		
		
	}

}
