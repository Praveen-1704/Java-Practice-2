package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Class implements Comparable{
	
	String name;
	int age;
	
	public ArrayList_Class(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString()
	{
		return name+" "+age;
	}
	
	
	@Override
	public int compareTo(Object O)
	{
		ArrayList_Class a = (ArrayList_Class) O;
		return this.name.compareTo(a.name);
	}
	
	
	public static void main(String[] args) {
		
		ArrayList A = new ArrayList();
		
		A.add(new ArrayList_Class("Mango",21));
		
		A.add(new ArrayList_Class("Banana",24));
		
		A.add(new ArrayList_Class("Apple",29));
		
		A.add(new ArrayList_Class("Orange",22));
		
		
		Collections.sort(A);
		System.out.println(A);
		
		
		System.out.println(A.get(2));
		
	}

}
