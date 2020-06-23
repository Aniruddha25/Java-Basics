
public class recursing {
	int data=25;
	static void change(recursing r)
	{
		r.data=r.data+25;
	}
	static int factorial(int n)
	{
		if (n==1)
		{
			return 1;
		}
		else
		{
			return n*factorial(n-1);
		}
	}
	static int power(int p,int n)
	{
		if(n>0)
		{
			return p*power(p,n-1);
		}
		else
		{
			return 1;
		}
		
	}
	static int sum(int n)
	{
		if(n>0)
		{
			return n+sum(n-1);
		}
		else
		{
			return 0;
		}
	}
	
	

	public static void main(String[] args) {
		int p =factorial(5);
		System.out.println(p);
		int k =power(5,3);
		System.out.println(k);
		int j =sum(12);
		System.out.println(j);
		recursing r = new recursing();
		r.change(r);//call by value 
		System.out.println(r.data);



	}

}
