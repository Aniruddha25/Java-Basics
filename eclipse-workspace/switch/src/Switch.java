import java.util.Random;
public class Switch {
	public static void main(String[] args) {
		Random r = new Random();
		int i[][] = new int[2][2];
		i[0][0] = 1;
		i[0][1] = 2;
		i[1][0] = 3;
		i[1][1] = 4;
		int j = r.nextInt(50);
		
		for(int a[] : i) {
			for(int b : a) {
				System.out.println(b);
			}
		}
		System.out.println(j);
			
	}
	

}
