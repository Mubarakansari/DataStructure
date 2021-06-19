public class checking_sum_of_zero {
	public static void main(String[] args) {
		int [] arr = {-5, -4, -3, -2, 0, 2, 4, 6, 8};
		boolean isZero = false;
		
		for(int i= 0; i< arr.length; i++) {
			if(!isZero) {
				for(int j= 1; j< arr.length; j++) {
					if( arr[i] + arr[j] == 0) {
						System.out.println("Value ="+"["+ arr[i] +","+ arr[j]+ "]");
						isZero = true;
					}	
				}
			}			
		}	
	}
}