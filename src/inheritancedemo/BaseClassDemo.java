package inheritancedemo;

public class BaseClassDemo {
	
	public   void add() {
		System.out.println("This is Base class addition");
	}
	
	public   void sub() {
		System.out.println("This is Base class subtraction");
	}

	public static void main(String[] args) {
		BaseClassDemo obj1 = new BaseClassDemo();
		obj1.add();
	}
}
