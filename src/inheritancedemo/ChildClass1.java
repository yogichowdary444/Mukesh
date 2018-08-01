package inheritancedemo;

public class ChildClass1 extends BaseClassDemo {

	public static void main(String[] args) {
		BaseClassDemo obj1 = new ChildClass1();
		ChildClass1 obj=(ChildClass1)obj1;
		obj.add();
		obj1.sub();
		obj.div();
		
	}
	
	public void add() {
		
		System.out.println("This is Child class Add");
		super.add();
	}
	
	public void mul() {
		System.out.println("This is Child class Multiplication");
	}
	
	public void div() {
		this.mul();
		System.out.println("This is Child class Division");
	}

}
