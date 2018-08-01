package parameter;

public class PassParameter2 {

	public static void main(String[] args) {
		DynamicCalculator obj1 = new DynamicCalculator();
		int sum = obj1.add(150, 50);
		System.out.println("sum is " + sum);
		double yogi = obj1.sub(30.22222, 40.221234532);
		System.out.println("sub is " + yogi);
		String one = obj1.getFullName("yogi", "chowdary");
		System.out.println(one);

	}
	

}
