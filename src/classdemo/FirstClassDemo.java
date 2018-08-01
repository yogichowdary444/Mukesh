package classdemo;

public class FirstClassDemo {
	
	int x = 10;
	int y = 20;

	public static void main(String[] args) {
		FirstClassDemo obj1 = new FirstClassDemo();
		obj1.sum();
		System.out.println("x value i "+ obj1.x);
		System.out.println("y value i "+ obj1.y);
		
		FirstClassDemo obj2 = new FirstClassDemo();
		obj2.sum();
		System.out.println("x value i "+ obj2.x);
		System.out.println("y value i "+ obj2.y);

	}
	
	public void sum(){
		int a = 80;
		int b = 100;
		int c = a+b;
		System.out.println("the sum is " + c);
		
	}

}
