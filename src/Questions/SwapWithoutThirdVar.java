package Questions;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {
		int x=5;
		int y=10;
		
		//using third variable 
		int t;
		t=x;
		x=y;
		y=t;
		System.out.println(x);
		System.out.println(y);
		
		//without third using '+' operator
		x=x+y;//15
		y=x-y;//5
		x=x-y;//10
		
		System.out.println(x);
		System.out.println(y);
		
		// without third using '*' operator
		
		x=x*y;
		y=x/y;
		x=x/y;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("without third using 'XOR : ^' operator (bitwise conversion)");
		x=x ^ y;
		y=x ^ y;
		x=x ^ y;
		
		System.out.println(x);
		System.out.println(y);
		
		
		

	}

}
