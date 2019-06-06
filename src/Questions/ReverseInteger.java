package Questions;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int num = 456789;
		int rev=0;
		
		/*while(num!=0) {
			rev = rev*10 + num%10;
			num= num/10;
		}
		System.out.println(rev);*/
		
		long num1 = 34578353;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}

}
