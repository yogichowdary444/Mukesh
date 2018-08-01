package setexamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
	//output comes random order
	public static void main(String[] args) {
		Set<String> value = new HashSet<String>();
		value.add("30");
		value.add("yogi");
		value.add("Superman");
		value.add("QTP");
		value.add("Batman");
		System.out.println(value);
		
//		for(String a: value){
//			System.out.println(a);
//		}
		//Coverting Set to List
		ArrayList<String> list = new ArrayList<>(value);
		System.out.println(list.get(3));

	}

}
