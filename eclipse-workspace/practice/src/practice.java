class person{
	String name;
	person()
	{
		this.name="Aniruddha";
	}
	void set_name(String Name)
	{
		name=Name;
	}



}
class employee extends person{
	int salary;
	employee(){
		salary=20000;
		
	}
	
	};
	class manager extends employee{
		int bonus;
		manager(){
			bonus=100000;
		}
		void display_bonus()
		{
			System.out.println("Manager has a bonus of " + bonus + " Rs. per Year");
		}
	}

	//student is subclass inherited from person(super class)
	//Inheritance types supported in java multilevel,hierarchical
	class student extends person{

		int age;
		int rn;
		//Parametric constructor
		student(int b,int c)
		{

			age=b;
			rn=c;
		}

		//This keyword used to get current state of object
		student()
		{
			this.age=23;

			this.rn=26;


		}

		void displayrecord()
		{

			System.out.println(age);
			System.out.println(rn);
			System.out.println(name);
		}
	}
	public class practice {
		static int j=40;

		public static void main(String[] args) {
			//A Java constructor cannot be abstract, static, final, and synchronized.
			student s1 = new student( 22,25);
			s1.displayrecord();
			student s2=new student();
			s2.set_name("ANIRUDDHA");
			s2.displayrecord();
			employee e = new employee();
			e.name="Aniruddha";
			/*Hierchical inheritance*/
			System.out.println(e.name+" has salary " +e.salary +" Rs./month");
			
			manager m =new manager();//Multilevel inheritance
			m.display_bonus();
			System.out.println(j);



		}

	}
