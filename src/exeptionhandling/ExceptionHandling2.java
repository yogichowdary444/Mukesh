package exeptionhandling;

import java.util.InputMismatchException;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		System.out.println("Start");
		try{
		int c = 10/0;
		System.out.println("Division Value is " +c);
		} catch(ArithmeticException e) {
			System.out.println("Soomething Went wrong please check exception" + e.getMessage());
			System.out.println("Soomething Went wrong please check exception");
		}catch (InputMismatchException e) {
			System.out.println("Hey please enter integer values only");
		}catch (Exception e) {
			System.out.println("oops Something went wrong");
		}
		
		finally {
			System.out.println("Finally block");
			System.out.println("End");
		}
		
	}

}
