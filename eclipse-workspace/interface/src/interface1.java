/*
 * Interface is used to achieve abstraction and multiple inheritance in Java.
 */
interface person{
	void work();

	
}
interface  person1{
	void run();
}
class student implements person,person1{
	public void work()
	{
		System.out.println("Study");
	}
	public void run()
	{
		System.out.println("Running at 10kmph");
	}
	
}
class employee implements person{
	public void work()
	{
		System.out.println("office-work");
	}
}



public class interface1 {

	public static void main(String[] args) {
		person p = new student();
		p.work();
		student s =new student();
		s.work();
		s.run();
		
		
		

	}

}
