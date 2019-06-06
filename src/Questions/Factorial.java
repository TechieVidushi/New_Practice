package Questions;

public class Factorial {

	//without recursive -- for loop
	
	public static int factorial(int num) {
		if(num==0) {
			return 1;
		}
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	// with recursive -- function calling function
	 public static int fact(int num) {
		 int fact=1;
		 if(num==0)
			 return 1;
		 else
			 return(num * fact(num-1));
		 
	 }
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorial(6));
		System.out.println(factorial(4));
		
		System.out.println(fact(4));
		System.out.println(fact(7));
	}

}
