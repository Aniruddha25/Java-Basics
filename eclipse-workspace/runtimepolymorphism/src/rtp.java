/*
 * parent class variable refers to object of child class / upcasting ie. runtime polymorphism
 * if final,static,private keyword is used before parent class method then it is static binding
 */
class employee{
	void print_salary()
	{
		System.out.println("Minimum salary is 1000");
	}
	
}
class salesman extends employee{
	void print_salary()
	{   System.out.println("Salesman :");
		System.out.println("Minimum salary is 3000");
	}
	
}
class manager extends employee{
	void print_salary()
	{
		System.out.println("Manager :");
		System.out.println("Minimum salary is 5000");
	}
	
	
}
class salesmanager extends manager{
	void print_salary()
	{
		System.out.println("SalesManager :");
		System.out.println("Minimum salary is 6000");
	}
}
class accountant extends employee{
	void print_salary()
	{ System.out.println("Accountant:");
		System.out.println("Minimum salary is 4000");
	}
	
	
}
public class rtp {

	public static void main(String[] args) {
		employee e;
		e= new salesman();
		e.print_salary();
		e=new manager();
		e.print_salary();
		e=new accountant();
		e.print_salary();
		employee e1 = new salesmanager();//multilevel polymorphism
		e1.print_salary();
		//The java instanceof operator is used to test whether the object is 
		//an instance of the specified type (class or subclass or interface).
		System.out.println(e instanceof employee);
		System.out.println(e1 instanceof manager);
		
		
		

	}

}
