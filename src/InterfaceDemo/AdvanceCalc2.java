package InterfaceDemo;

public class AdvanceCalc2 implements Calc {

	public static void main(String[] args) {
		Calc obj1 = new AdvanceCalc2();
		obj1.add();
		obj1.sub();
		obj1.calculateCosc();
		obj1.calculateSin();

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
