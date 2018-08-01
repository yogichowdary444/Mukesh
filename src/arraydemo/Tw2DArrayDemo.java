package arraydemo;

public class Tw2DArrayDemo {

	public static void main(String[] args) {
		
		int school[][][] = new int [4][3][2];
		
		school[3][0][0] = 10;
		school[0][2][0] = 20;
		school[0][0][1] = 30;
		school[1][0][0] = 40;
		school[1][1][1] = 50;
		school[1][1][0] = 60;
		
		
		System.out.println(school[3][0][0]);
		System.out.println(school[0][2][0]);
		System.out.println(school[0][0][1]);
		System.out.println(school[1][0][0]);
		System.out.println(school[1][1][1]);
		System.out.println(school[1][1][0]);
		

	}

}
