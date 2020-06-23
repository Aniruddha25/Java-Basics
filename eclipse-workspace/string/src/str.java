/*
 * Note: String objects are stored in a special memory area known as the "string constant pool"
 */
import java.util.ArrayList;
public class str {

	public static void main(String[] args) {
		char a[]= {'a','m','k'};
		String s = "Aniruddha";
		String s1 = new String("Anil");
		String s2=new String(a);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s.charAt(3));//returns character at particular index
		System.out.println(s.length());//length of string method
		String name="Aniruddha";
		String s4  = String.format("My Name is %s", name);// formatting string
		System.out.println(s4);
		String s5 = String.format("Value is %d", 101);
		System.out.println(s5);
		//substring
		String s6 = s.substring(2,4);
		String s7=s.substring(4);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s.contains("nir"));//contains - checks whether substring
		                                     // /char sequence present in the string
		if(s.contains(s1.substring(0,2)))
		{
			System.out.println("s1's some part is present in string s");
		}
		//joining two or more strings using join function
		String t = String.join("-", "22","5","1998");
		System.out.println(t);
		String u  = String.join(":","5","05");
		System.out.println(u);
		//comparing two strings using equals method
		String f1 = "Anil";
		String f2 =f1;
		if(f1.equals(f2))
		{
			System.out.println("Two strings are equal");
		}
		ArrayList<String> arr = new ArrayList<>();// similar to vector in c++
		arr.add("Aniruddha");
		arr.add("Anil");
		arr.add("nikita");
		arr.add("Radhika");
		arr.add("Juilee");
		arr.remove(4);
		
		for(String i : arr)
		{
			if(i.equals("Aniruddha"))
			{
				System.out.println("String is present in  the list");
			}
		}
		String  b1 = " Hello ";
		String b2 = " Java ";
		String b3  = " World ";
		String b4 =b1.concat(b2).concat(b3);
		System.out.println(b4);
		String b5  = "PRAJAY";
		String b6 = b5.replace("PRA","SU");
		System.out.println(b6);
		String c2="javatpoint";  
		String c3="JAVATPOINT"; 
		System.out.println(c2.equalsIgnoreCase(c3));//It ignores case just j=check char sequence
		System.out.println(c2.compareTo(c3.toLowerCase()));//comparing two strings using compareTo method It returns 0 for equal strings
		//Splitting string into the words
		String d1 = "My Name is Aniruddha";
		String []words = d1.split("\\s");//splitting the words according to the white space
		for(String i : words)
		{
			System.out.println(i);
		}
		for(String i :d1.split("\\s",3))//splitting the string to given no. of parts
		{
			System.out.println(i);
		}
		String d2 = "Nalayak";
		String []d3 = d2.split("la",0);
		for(String i : d3)
		{
			System.out.println(i);
		}
		String d4 = d1.intern();//copy of original string
		System.out.println(d4);
		System.out.println(d4.indexOf("is"));//returns index of substring
		String d5 =d4.toUpperCase();
		String d6=d5.toLowerCase();
		System.out.println(d5);
		System.out.println(d6);
		String e1 = "  HELLO ";
		System.out.println(e1.trim());// to remove white spaces from string
		String e2 = String.valueOf("HI");
		System.out.println(e2);
		String e3 = e2 + e2;
		System.out.println(e3);
		//String pattern checking
		System.out.println(e3.startsWith("HI"));
		System.out.println(e3.endsWith("HI"));
		//Mutable strings StringBuffer/StringBuilder class 
		StringBuffer g1 = new StringBuffer("I");
		g1.append(" Love You ");
		System.out.println(g1);
		g1.insert(11, "Nikki");
		System.out.println(g1);
		g1.replace(11,16,"Chikki");
		System.out.println(g1);
		g1.delete(11, 17);
		System.out.println(g1);
		g1.reverse();
		System.out.println(g1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
