package stringDemo;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String fullName = "selenium-QTP-Grid-UFT";
		
		String []toolName = fullName.split("-");
		for(int i=0;i<toolName.length; i++) {
			System.out.println("value for "+i+" is "+toolName[i]);
			if(toolName[i].equalsIgnoreCase("selenium")) {
				System.out.println("Test passed");
				break;
				
			}
			else {
				System.out.println("Test Fail");
				break;
			}
		}

	}

}
