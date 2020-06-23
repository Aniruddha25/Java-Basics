class person{
	String name;
	int age;
	person(int age,String name)
	{
		this.age=age;
		this.name=name;
		
	}
	void display()
	{
		System.out.println("Name : " + name);
		System.out.println("age : " + age);
		
	}
	

}
class student extends person{
	int rn;
	student(int age,String name,int rn)
	{
		super(age,name);
		this.rn=rn;
	}
	void display()
	{
		super.display();
		System.out.println("RN : " + rn);
	}
	
	
}
public class super1 {

	public static void main(String[] args) {
		student s = new student(22,"Aniruddha",25);
		s.display();
		

	}

}
