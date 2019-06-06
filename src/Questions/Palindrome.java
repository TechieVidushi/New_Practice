package Questions;

public class Palindrome {
	
	public static void isPalindromeNumber(int num) {
		System.out.println("Given num is :" +num);
		
		int sum=0;
		int r=0;
		int t ;
		
		t=num;
		
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		
		if(t==sum) {
			System.out.println("Number is palindrome");
		}
		else
			System.out.println("Number is not a palindrome");
		
	}

	public static void main(String[] args) {
		
		isPalindromeNumber(151);
		isPalindromeNumber(988);
		

	}

}
