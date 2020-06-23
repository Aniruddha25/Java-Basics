/*
 * Interface inheritance
 *if we have to use body for function inside interface then use default / static keyword 
  before function name
 *An interface which has no member is known as a marker or tagged interface.
 */
interface print{
	void printing();
	default void design()
	{
		System.out.println("Designing");
	}
	static void display()
	{
		System.out.println("Display screen");
	}

}
interface show extends print{
	void showing();

}
public class interface2  implements show{
	public void showing()
	{
		System.out.println("Show");
	}
	public void printing()
	{
		System.out.println("Printing");
		showing();

	}


	public static void main(String[] args) {
		print.display();
		interface2 obj = new interface2();
		obj.printing();
		obj.design();





	}

}
