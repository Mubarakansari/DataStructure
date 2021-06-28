public class sumOfDigit {
	public static void main(String[] args) {
		int digit = 3414;
		int sum = 0;
		while(digit > 0) {
			int lastDigit = digit %10;
			digit = digit / 10; 
			sum = sum + lastDigit; 
		}	
		System.out.println("sum>>"+ sum);
	}	
	
}