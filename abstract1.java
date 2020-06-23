/*
 * An abstract class must be declared with an abstract keyword.
 * It can have abstract and non-abstract methods.
 *It cannot be instantiated.
 *It can have constructors and static methods also.
 *It can have final methods which will force the subclass not to change the body of the method.
 * 
 */
abstract class animal{
	abstract void sound();//no method body and abstract 
	animal()
	{
		System.out.println("I am animal");
	}
	void run()
	{
		System.out.println("I am running");
	}
	
}
class dog extends animal{
	void sound() {
		System.out.println(" My sound  is BhoBho");
	}
	
}
class cat extends animal{
	void sound()
	{
		System.out.println(" My sound is MewMew");
	}
}

public class abstract1 {

	public static void main(String[] args) {
		animal a = new dog();
		a.sound();
		a = new cat();
		a.sound();
		a.run();


	}

}
