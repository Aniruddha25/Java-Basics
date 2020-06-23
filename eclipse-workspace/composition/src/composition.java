class person{
	String name;
	String gender;
	int age;
	
	person()
	{
		name="Aniruddha";
		gender = "Male";
		 age=22;
	}
	void display()
	{
		 System.out.println("Name : " + name);
		 System.out.println("Gender : " + gender);
		 System.out.println("Age : " + age);
	
	}
	
	
}
 class birthdate{
	int day,month,year;
	birthdate()
	{
		day=22;
		month=5;
	    year =1998;
	}
	//Method or function overloading
	void set_date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	void set_date(int day,int month)
	{
		this.day=day;
		this.month=month;
		year=1999;
		
	}
}
 class student extends person{
	 String name;
	 int age;
	 birthdate b;
	 student(birthdate b)
	 {
		 name="Aniruddha";
		
        this.b=b;
	 }
	 void display()
	 {
		person p = new person();
		p.display();
		System.out.println("Birthdate :");
		 System.out.println(b.day + " - "+b.month + " - "+b.year);
	 }
	 
	
}
public class composition {

	    public static void main(String[] args) {
		birthdate b =new birthdate();
		student s = new student(b);
		s.display();
	

	}

}
