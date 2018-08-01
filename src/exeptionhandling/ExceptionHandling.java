package exeptionhandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Start");
		try{
		int c = 10/0;
		System.out.println("Division Value is " +c);
		} catch(ArithmeticException e) {
			System.out.println("Soomething Went wrong please check exception" + e.getMessage());
			System.out.println("Soomething Went wrong please check exception");
		}
		
		System.out.println("End");

	}

}
