package objects;

public class StringMethodDemo {
	public static void main(String[] args) {
		// string - array of character
		String str1 = "This is java sessions";
		
		// capitalize first letter of every word
		
		// Wrapper Class
		// byte  -> Integer
		// short -> Short
		// int  -> Integer
		// long - Long
		// float - Float
		// double - Double
		// character - Character
		// boolena - Boolean
		
		
		// AutoBoxing and unboxing
		
		int i1 = 89;
		Integer j1 = i1; // Autoboxing
		
		
		Integer m1 = 34;
		int m2 = m1; // unboxing
		
		
		// string to datatype
		// wrapper class
		int i = 50; // datatype
		Integer.toBinaryString(i);
		String val = "23";
		int k = Integer.parseInt(val);
		System.out.println(k+k);
		
		
		
		// datatype -> String (valueOF)
		String j  = String.valueOf(i);
		
		System.out.println(i+i);
		System.out.println(j+j);
		
//		System.out.println(capitalizeString(str1));
//		
//		String[]  parts = str1.split(" ");
//		System.out.println(parts.length);
//		System.out.println(parts[1]);
//		String[] letters = parts[1].split("");
//		System.out.println(letters[1]);
//		
//		// Replace 
//		String s3 = str1.replace("is", "was");
//		System.out.println(s3);
//		
//		System.out.println(str1.length());
//		// how many characters are in string except space
//		
//		System.out.println(str1.replace(" ", "").length());
//		
//		// convert string into uppercase
//		System.out.println(str1.toUpperCase());
//		
//		// convert string into lowercase
//		System.out.println(str1.toLowerCase());
//		
		// logic to get all index of that character
//		printCharacterIndex(str1,"s");
//		printCharacterIndex(str1,"i");
//		printCharacterIndex(str1,"T");
		
		// finding char at specific index
//		System.out.println(str1.charAt(6));
	}
	
	public static void printCharacterIndex(String inputStr, String charStr) {
		int index = 0;
		System.out.println("Index for "+ charStr + " in " + inputStr);
		while(index != -1) {
			if(index == 0) {
				index = inputStr.indexOf(charStr);
			}else {
				index = inputStr.indexOf(charStr, index+1);
			}
			if(index == -1) {
				break;
			}
			System.out.println(index);
			if(index == 0) {
				index++;
			}
		}
	}
	
	public static String capitalizeString(String str1) {
		String capitalizeString  = "";
		String[] parts = str1.split(" ");
		for(int i = 0 ; i < parts.length ; i++) {
			//System.out.println(parts[i]);
			String[] allLetters = parts[i].split("");
			capitalizeString = capitalizeString + allLetters[0].toUpperCase();
//			System.out.println("ML1 - " +capitalizeString);
			for(int j = 1 ; j < allLetters.length ; j++) {
				capitalizeString = capitalizeString + allLetters[j];
			}
			capitalizeString = capitalizeString + " ";
		}
		return capitalizeString;
	}
	
	
}
