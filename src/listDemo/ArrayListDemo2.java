package listDemo;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
	ArrayList obj1 = new ArrayList();
	
	obj1.add(123);
	obj1.add('M');
	obj1.add("Work hard and become a best tester in the world");
	obj1.add("Work hard and become a best tester in the world");
	obj1.add(123.456);
	System.out.println(obj1);
	int Total = obj1.size();
	System.out.println(Total);

	for(Object abc: obj1) {
		System.out.println(abc);
	}

	}

}
