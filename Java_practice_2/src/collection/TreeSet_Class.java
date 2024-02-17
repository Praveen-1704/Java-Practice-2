package collection;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSet_Class implements Comparable{
	
	String name;
	int age;
	
	public TreeSet_Class(String name, int age) {
		
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
		TreeSet_Class T1 = (TreeSet_Class)O;
		return this.name.compareTo(T1.name);
	}
	
	public static void main(String[] args) {
		
		TreeSet T = new TreeSet();
		
		T.add(new TreeSet_Class("Kia", 23));
		
		T.add(new TreeSet_Class("Mahindra",31));
		
		T.add(new TreeSet_Class("TATA",43));
		
		T.add(new TreeSet_Class("Harrier", 23));
		
		T.add(new TreeSet_Class("Jeep",17));
		
		System.out.println(T);
	}

}
