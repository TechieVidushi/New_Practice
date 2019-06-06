package Questions;

public class MissingNumber {

	public static void main(String[] args) {
		int a[]= {-5,-1, 1, 3, 5, 7, 9, 11};
		int sum=0;
		
		for(int i=0; i<a.length; i++) {
			sum=sum + a[i];
		}
		
		System.out.println(sum);
		int sum1=0;
		
		for(int j= -5; j<=11; j+=2) {
			sum1 = sum1 + j;
		}
		
		System.out.println(sum1);
		
		System.out.println("Missing number is :" +(sum1-sum));
	}

}
