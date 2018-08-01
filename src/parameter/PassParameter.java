package parameter;

public class PassParameter {

	public static void main(String[] args) {
		PassParameter obj1 = new PassParameter();
		obj1.add(50, 50);
		obj1.sub(30.22222, 40.221234532);

	}
	public void add(int a, int b) {
		int c = a+b;
		System.out.println("sum of a+b is " + c);
	}
	
public void sub(double x, double y) {
		double result = y-x;
		System.out.println("subtraction of a-b is "+ result);
	}

}
