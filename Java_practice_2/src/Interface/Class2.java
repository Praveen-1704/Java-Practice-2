package Interface;

public class Class2 implements Class1{
	
	@Override
	public void m1()
	{
		System.out.println("hiiiiiiiiiii");
	}
	
	
	public static void main(String[] args) {
		
		Class1 C = new Class2();
		
		C.m1();
		
	}

}
