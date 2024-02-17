package programs;

public class MissingNumbers {
	
	
	
	public static void main(String[] args) {
		
		int arr[] = {1,5,7,10};
		int i=arr[0];
		int j=0;
		
		while(j<arr.length)
		{
			if(i==arr[j])
			{
				i++;
				j++;
			}
			else
			{
				System.out.println(i);
				i++;
			}
		}
	}

}
