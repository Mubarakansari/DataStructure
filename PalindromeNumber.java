public class PalindromeNumber {
	public static void main(String[] args) {
		int digit = 525;
		int temp = digit;
		int reserveNumber = 0; 
		
		while(digit > 0) {
			int lastDigit = digit %10;
			digit = digit /10; 
			reserveNumber = (reserveNumber * 10) + lastDigit;
		}
		
		if(reserveNumber == temp) {
		System.out.println("PalindromeNumber>>"+ reserveNumber);
		} else {
			System.out.println("Not PalindromeNumber>>"+ reserveNumber);
		}
		
	}	
	
}