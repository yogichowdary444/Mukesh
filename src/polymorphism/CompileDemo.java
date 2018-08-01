package polymorphism;

public class CompileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompileDemo obj2 = new CompileDemo();
		obj2.add(12, 18);
		obj2.add(20, 30, 38);
		obj2.add(20.50, 20.3456);
		obj2.add("yogi", 20, 30);

	}
	public void add(int a,int b){
		int c = a+b;
		System.out.println(c);
	}
	
	public void add(double a,int b){
		double c = a+b;
		System.out.println(c);
	}
	public void add(double a,double b){
		double c = a+b;
		System.out.println(c);
	}
	
	
	
public void add(int a, int b,int d){
	int c = a+b+d;
	System.out.println(c);
		
	}

public void add(String a, int b,int d){
	String c = a+b+d;
	System.out.println(c);
		
	}

}
