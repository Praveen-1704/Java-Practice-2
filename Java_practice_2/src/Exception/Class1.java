package Exception;

public class Class1 {
	
	public static void main(String[] args) throws Exception{
		
		int age=12;
		
		if(age<18)
		{
			throw new Not_In_This_Line_Exception();
		}
		else
		{
			System.out.println("Stand on the Line");
		}
	}

}
