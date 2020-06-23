
/*
 * Java final keyword - 
 * 1.to stop value change .
 * 2.to stop inheritance by using final keyword before parent class 
 * 3.to stop method overriding by using final keyword before parent class method
 * 4.It is similar constant keyword in c++
 
 
 
 */
class student{
	final String name ;//to stop value change 
	int age;
	student()
	{
		name="Aniruddha";
		this.age = 22;
		
	}
	void display()
	{
		System.out.println(" Name : " + name);//final variable can be initialized  in constructor only.
		System.out.println(" Age : "+age);
	}
	
}
public class final1 {

	public static void main(String[] args) {
		student s  = new student();
		s.display();
		

	}

}
