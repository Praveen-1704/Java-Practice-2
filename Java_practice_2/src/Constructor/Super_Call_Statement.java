package Constructor;

public class Super_Call_Statement extends Constructor_OverLoading{
	
	String name;
	
	public Super_Call_Statement(String name) {
		
		super(name);
	}
	
	public static void main(String[] args) {
		
		Constructor_OverLoading C2 = new Constructor_OverLoading("Cat");
		Super_Call_Statement S = (Super_Call_Statement) C2;
		System.out.println(S.name);
	}
	
	
	


}
