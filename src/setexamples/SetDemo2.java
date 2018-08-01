package setexamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class SetDemo2 {
	//output comes insertion order
	public static void main(String[] args) {
		LinkedHashSet<String> value = new LinkedHashSet<>();
		value.add("30");
		value.add("yogi");
		value.add("Superman");
		value.add("QTP");
		value.add("Batman");
		System.out.println(value);
		
		for(String a: value){
			System.out.println(a);
		}

	}

}
