package Questions;

public class StringManipulation {

	public static void main(String[] args) {
		String str = "The rains have started here";
		String str1 = "THe rains have started here";
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("e"));
		System.out.println(str.indexOf("e", str.indexOf("e")+1));
		System.out.println(str.indexOf("here"));
		System.out.println(str.indexOf("z"));//not available = -1
		System.out.println(str.indexOf("hello"));
		
		//string comparison
		
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		
		//substring 
		
		System.out.println(str.substring(0, 9));
		
		//trim : only before space and after space
		String str2 = "    Hello World   ";
		System.out.println(str2);
		System.out.println(str2.trim());
		
		//replace :
		System.out.println(str2.replace(" ", ""));
		System.out.println(str2.replace("l", "t"));
		
		
		//split :
		String test = "Hello_World_test_Selenium";
		String test_val[] = test.split("_");
		for(int i=0;i<test_val.length;i++) {
			System.out.print(test_val[i] + " ");
		}
		
		System.out.println(str2.concat(str1));
		
		
	}

}
