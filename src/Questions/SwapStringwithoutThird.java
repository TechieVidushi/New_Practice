package Questions;

public class SwapStringwithoutThird {

	public static void main(String[] args) {
		String a ="Hello";
		String b= "World";
		
		System.out.println("Before swapping :");
		System.out.println(a);
		System.out.println(b);
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("After swapping :");
		System.out.println(a);
		System.out.println(b);

	}

}
