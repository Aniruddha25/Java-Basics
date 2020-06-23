class A{
	
}
class B extends A{
	
}
class Base{
	A message()
	{   A a1 = new A();
		System.out.println("This is base class");
		return a1;
		
	}
	
}
class derived extends Base{
	B message()
	{
		B b1 = new B();
		System.out.println("This is derived  class");
		return b1;
		
	}
	
}
public class covariant {

	public static void main(String[] args) {
		Base b2 = new Base();
		b2.message();
		derived d2 = new derived();
		d2.message();		
		

	}

}
