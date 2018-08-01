package listDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo6 {

	public static void main(String[] args) {
		
	ArrayList<String> obj2 = new ArrayList<String>();
	obj2.add("Superman");
	obj2.add("Batman");
	obj2.add("Flash");
	System.out.println(obj2);
	for(String a:obj2) {
		System.out.println(a);
	}

	}

}
