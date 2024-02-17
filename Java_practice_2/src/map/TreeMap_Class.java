package map;

import java.util.TreeMap;

public class TreeMap_Class implements Comparable{
	
	String name;
	int age;
	
	public TreeMap_Class(String name,int age) {
		
		this.name=name;
		this.age=age;
		
	}
	
	@Override
	public String toString()
	{
		return name+" "+age;
	}
	
	
	@Override
public int compareTo(Object Obj)
	{
		TreeMap_Class T1 = (TreeMap_Class)Obj;
		return this.age-T1.age;
	}
	
	public static void main(String[] args) {
		
		TreeMap T = new TreeMap();
		
		T.put(new TreeMap_Class("Hari",23), "Mango");
		
		T.put(new TreeMap_Class("Mano", 21),"Apple");
		
		T.put(new TreeMap_Class("Abi",24),"Pineapple");
		
		System.out.println(T);
		
		
		
	}

}
