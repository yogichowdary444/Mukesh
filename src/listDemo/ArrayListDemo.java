package listDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList obj1 = new ArrayList();
		obj1.add(45678345);
		obj1.add('M');
		obj1.add("Selenium WebDriver");
		obj1.add(12.3456);
		System.out.println(obj1);
		System.out.println(obj1.get(2));

	}

}
