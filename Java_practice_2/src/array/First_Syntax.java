package array;

import java.util.Arrays;

public class First_Syntax {
	
	
	
	public static void main(String[] args) {
		
		int arr[] = { 23,34,12,5,78};
		
		System.out.println(arr.length);
		
		System.out.println(arr[4]);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
