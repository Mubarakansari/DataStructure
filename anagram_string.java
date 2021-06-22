public class anagram_string {
	public static void main(String[] args) {
		
		String  firstString = "hvfjawh";
		String  secondString = "jhavhfw"; //javf, jaf, ja, a, 0
		
		 System.out.println("String Are :" + isAnagramUsingStringMethods(firstString, secondString));
	}
	
	public static String isAnagramUsingStringMethods(String firstString, String secondString){
		if(firstString.length() != secondString.length()) {
			return "length not correct";
		}	
		
		for(int i=0; i< firstString.length(); i++){
			char c = firstString.charAt(i);
			int index = secondString.indexOf(c);
			if(index != -1) {
			  secondString = secondString.substring(0, index) + secondString.substring(index + 1, secondString.length());
			}
		}
		return "Anagrams";
	}
		
}