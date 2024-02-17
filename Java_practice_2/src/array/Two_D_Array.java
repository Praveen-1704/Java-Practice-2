package array;


public class Two_D_Array {

	public static void main(String[] args) {
		
		int arr[] [] = new int[2][3];
		
		arr[0][0]=23;
		
		arr[0][1]=21;
		
		arr[0][2]=25;
		
		arr[1][0]=33;
		
		arr[1][1]=35;
		
		arr[1][2]=37;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
