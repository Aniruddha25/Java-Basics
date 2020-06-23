class student{
	String name;
	int age;
	public void set_name(String name)
	{
		this.name=name;
		
	}
	public String get_name()
	{
		return name;
	}
	public void set_age(int age)
	{
		this.age=age;
	}
	public int get_age()
	{
		return age;
	}
	
}
public class encapsulate {

	public static void main(String[] args) {
		student s = new student();
		s.set_name("Aniruddha");
		s.set_age(22);
		System.out.println("Name : " + s.get_name());
		System.out.println("Age : " + s.get_age());

		
	}

}
