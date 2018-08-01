package classdemo;

public class SecondDemoClass {
	
		int x = 10;
		int y = 20;
		
	
	
	public static void main(String[] args) {
		SecondDemoClass obj2 = new SecondDemoClass();
		obj2.sum();
		System.out.println(obj2.x);
		System.out.println(obj2.y);
		
		SecondDemoClass obj3 = new SecondDemoClass();
		obj3.sum();
		System.out.println(obj3.x);
		System.out.println(obj3.y);
		
		CalculatorDemo obj4 = new CalculatorDemo();
		obj4.sub();
		obj4.sum();

	}
	public void sum() {
		int a = 60;
		int b = 80;
		int c = a+b;
		System.out.println("a + b is " +c);
	}
}
