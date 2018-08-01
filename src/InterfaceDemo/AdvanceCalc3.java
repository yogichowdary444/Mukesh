package InterfaceDemo;

public class AdvanceCalc3 implements Calc {

	public static void main(String[] args) {
		//you can not create object of an interface
		//AdvanceCalc2 obj1 = new Calc();
		
		//you can not create object of an interface because it has abstract class methods
		//Calc obj1 = new AdvanceCalc2();

	}

	public void calculateSin(){
		System.out.println("I am in Advance calc- sin");
	}
	
	public void calculateCosc(){
		System.out.println("I am in Advance calc- cosc");
	}
	
	
	public void add() {
		
		System.out.println("Im in calc add");
	}

	
	public void sub() {
		
		System.out.println("Im in calc sub");
	}
	
	

}
