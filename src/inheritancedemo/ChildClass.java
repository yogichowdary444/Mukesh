package inheritancedemo;

public class ChildClass extends BaseClassDemo {

	public static void main(String[] args) {
		ChildClass obj1 = new ChildClass();
		
		obj1.add();
		obj1.sub();
		obj1.mul();
		obj1.div();
		

	}
	
	
	
	public void mul() {
		System.out.println("This is Child class Multiplication");
	}
	
	public void div() {
		System.out.println("This is Child class Division");
	}

}
