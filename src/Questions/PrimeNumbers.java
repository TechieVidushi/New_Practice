package Questions;

public class PrimeNumbers {
	
	public static boolean isPrimeNumber(int num) {
		
		if(num<=1) {
			return false;
		}
		
		for(int i=2; i<num;i++) {
			if(num%i == 0) {
				return false;
			}
		}
		
		return true;
		
	}
	
	public static void getPrimeNumbers(int num) {
		for(int i=2; i<=num;i++) {
			if(isPrimeNumber(i))
				System.out.println(i + " ");
		}
	}

	public static void main(String[] args) {
		
		System.out.println("2 is a prime number :" + isPrimeNumber(2));
		System.out.println("3 is a prime number :" + isPrimeNumber(3));
		System.out.println("5 is a prime number :" + isPrimeNumber(5));
		System.out.println("7 is a prime number :" + isPrimeNumber(7));
		System.out.println("0 is a prime number :" + isPrimeNumber(0));
		System.out.println("-2 is a prime number :" + isPrimeNumber(-2));
		
		getPrimeNumbers(8);
		getPrimeNumbers(14);
		getPrimeNumbers(22);
	}

}
