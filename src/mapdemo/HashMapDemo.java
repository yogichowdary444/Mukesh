package mapdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

	HashMap<String, String> obj1 = new HashMap<String, String>();
	
	obj1.put("400", "Mukesh");
	obj1.put("601", "UFT Unified Functional Testing");
	obj1.put("602", "Quick Test Professional");
	obj1.put("500", "Selenium");
	obj1.put("600", "QTP");
	obj1.put("700", "Appium");
	obj1.put("700", "Appium");
	String value = obj1.get("400");
	System.out.println(obj1);
	System.out.println("value from HashMap is " + value);
	
	for(Map.Entry<String, String> data: obj1.entrySet()){
		System.out.println("Key from map is " + data.getKey() +" and value is "+ data.getValue());
		
	}

	}

}
