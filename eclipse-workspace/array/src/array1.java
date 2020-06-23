
public class array1 {
	 static void maximum(int arr[])//to find maximum value from array
	{
		int max=arr[0];
		for(int i:arr)
		{
			if(i>max)
			{
				max=i;
			}
		}
		System.out.println("Maximum value : " +  max);
	}
	 static int [] read_array()
	 {
		 int a[]= {5,9,13,17};
		 return a;
	 }

	public static void main(String[] args) {
		int arr[] = new int[5];
		int arr1[] = {3,5,6,7};
		for(int i =0;i<5;i++)
		{
			arr[i]=i+1;
		}
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]);
		}
		System.out.println(" ");
		for(int k=(arr.length-1);k>=0;k--)
		{
			System.out.println(arr[k]);
		}
		//for-each loop for traversing array
		for(int p:arr1)
		{
			System.out.println(p);
		}
		maximum(arr1);
		int a1[]=read_array();
		for(int i:a1)
		{
			System.out.println(i);
		}
		//Multidimensional array
		int a2 [][] = {{1,2,3},{2,3,5},{3,5,8}};
		int a3[][] =a2;
		//addition of 2d arrays
		int a4[][] = new int[3][3];
		int a5[][] = new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a4[i][j]=a2 [i][j]+a3 [i][j];
			}
		}
		for(int i =0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a4[i][j] + " ");
				
			}
			System.out.println();
		}
		//multiplication of 2 matrix
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{   
				a5[i][j]=0;
				for(int k=0;k<3;k++)
				{
				  a5[i][j]+=a2 [i][k]*a3 [k][j];
				}
			}
		}
		for(int i =0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a5[i][j] + " ");
				
			}
			System.out.println();
		}
		
		
		
		
		for(int i =0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a2[i][j]);
				
			}
			System.out.println();
		}
		int b[]=arr.clone();
		for(int r : b)
		{
			System.out.println(r);
		}

	}

}
