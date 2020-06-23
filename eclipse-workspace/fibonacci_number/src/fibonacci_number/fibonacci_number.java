package fibonacci_number;

public class fibonacci_number {

	public static void main(String[] args) {
	   int i=0;
	   int j=1;
	   int k;
	   int n=6;
	   for(int p=0;p<n;p++)
	   {
		   k=i+j;
		   System.out.println(k);
		   i=j;
		   j=k;
		   
	   }
	   
	   

	}

}
