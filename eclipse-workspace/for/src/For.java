import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		int a=5;
		//Useful mathematics functions
		System.out.println(Math.log10(a));
		System.out.println(Math.max(a, 4));
		System.out.println(Math.min(a, 4));
		System.out.println(Math.sqrt(a));
		System.out.println(Math.cbrt(a));
		System.out.println(Math.random());
		System.out.println(Math.pow(a, 3));
		//Typecasting
		float b=10.4f;
		a=(int)b;
		double c = (double) b;
		System.out.println(a);
		System.out.println(c);
		char d = 'A';
		System.out.println((int)d);
		long e = 100000000000000000L;
		System.out.println(e);
		String j ="Aniruddha";
		System.out.println(j);
		//unary operators
		d++;
		System.out.println(d);
		System.out.println(--c);
		//if-else
		a=4;
		if(a>5 && a<15)
		{
			System.out.println("a is greater");
		}
		else if(a<5 && a>3)
		{
			System.out.println(a-=5);
		}
		else
		{
			System.out.println(Math.sqrt(a));
		}
		a=4;
		//switch case
		switch(a)
		{
		case 1:
			System.out.println(Math.sqrt(a));
			break;
		case 4:
			System.out.println(Math.pow(a, 2));
			break;
		}
		//loops
		for(a=5;a>1;a--)
		{
			System.out.println(a);
		}
		while(a<5)
		{
			a++;
			System.out.println(a);
		}
		do {
			System.out.println(a);
			a--;
		}while(a==4);
		//For traversing array
		int arr[] = {5,7,10,8,4,19};
		for(int i:arr)
		{
			System.out.println(i);
		}
		//use of break and continue statements
		for(int i=0;i<15;i++)
		{
			
			if(i==3 || i==5)
			{
				continue;
			}
			
			if(i==8)
			{
				break;
			}
			System.out.println(i);
			
		}
		//Taking input from user
		Scanner scan = new Scanner(System.in);
		int l=scan.nextInt();
		scan.nextLine();
		String k=scan.nextLine();
		System.out.println(l);
		System.out.println(k);
		
		
		
		
		
				
	}

}
