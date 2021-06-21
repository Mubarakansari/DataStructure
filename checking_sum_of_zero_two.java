public class checking_sum_of_zero_two {
	public static void main(String[] args) {
		int [] arr = {-5, -4, -3, -2, 0, 2, 4, 6, 8};
		int startPoint = 0;
		int endPoint = arr.length - 1;
		
		for(int i= startPoint; i< endPoint; i++) {
			int sum = arr[startPoint] + arr[endPoint];			
			if(sum == 0) {
			System.out.println("sum>>"+ "[" + arr[startPoint] + "," + arr[endPoint] + "]");
				break;
		    } else if(sum > 1) {
				endPoint --;
			} else {
				startPoint ++;
			}
				
		}		
	}	
	
}