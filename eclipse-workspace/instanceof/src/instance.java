interface sound{}
class dog implements sound{
	public void d()
	{
		System.out.println("BhoBho");
	}
}
class cat implements sound{
	public void c()
	{
		System.out.println("MewMew");
	}
}
class call{
	void invoke(sound s)
	{
		if(s instanceof dog)
		{
			dog d = (dog) s;//downcasting
			d.d();
		}
		if(s instanceof cat) {
			cat c = (cat) s;
			c.c();
		}
	}
}
public class instance {

	public static void main(String[] args) {
		sound s = new dog();
	    call c1 = new call();
	    c1.invoke(s);
		
	

	}

}
