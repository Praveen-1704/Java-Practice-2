package Exception;

public class ThrowsKeyword {
	
	public static void m1() throws Exception
	
	{
		System.out.println(10/0);
	}
	
	public static void main(String[] args) throws Exception{
		
		m1();
	}
	
	

}
