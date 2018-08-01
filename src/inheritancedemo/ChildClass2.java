package inheritancedemo;

public class ChildClass2 extends BaseClassDemo {

	public static void main(String[] args) {
		BaseClassDemo obj1 = new BaseClassDemo();
		obj1.add();
		obj1.sub();
		
	}
	
	public void mul() {
		System.out.println("This is Child class Multiplication");
	}
	
	public void div() {
		System.out.println("This is Child class Division");
	}

}
