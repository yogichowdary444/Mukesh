package parameter;

public class DynamicCalculator {
	
	public int add(int a, int b) {
		int c = a+b;
		return c;
	}
	
	public double sub(double x, double y) {
		double result = y-x;
		return result;
	}
	public static String getFullName (String firstName, String lastName){
		String fullName = firstName+" "+ lastName;
		return fullName;
	}

}
