
public class wrap {

	public static void main(String[] args) {
		//Autoboxing - converting primitive datatype to wrapper class
		float x =24.5f;
		Float f  = Float.valueOf(x);
		Float f1=x;
		System.out.println(x + " " +f + " " + f1);
		//unboxing - converting wrapper object to primitive
		Integer i = Integer.valueOf(10);
		int j =i.intValue();
		int k =j;
		System.out.println(i + " " +j + " " + k);
		String s  = String.valueOf("Aniruddha");
		String t =s;
		System.out.println(t);
		
		
		
		

	}

}
