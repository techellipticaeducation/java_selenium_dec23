package java_selenium_dec23;



public class CharacterDemo {
public static void main(String[] args) {
	

	
	// char - 2 type 
	// ascii code - 1 byte
	// keyboard
	
	// 1 character
	char c1 = 'a';
	System.out.println(c1);
	
	// convert my character into int value
	int ascci_a = (int)c1;
	System.out.println(ascci_a);
	// convert int to character
	
	int k1 = 345;
	char k1_char = (char)k1;
	System.out.println(k1_char);
	
	// all character are int (4 byte)
	// but all int are not char
	
	// unicode - 2 byte - 16 bits
	// language have a unicode chart - which is present in hexadecimal number system
	
	char unicode_k1 = '\u0915';
	System.out.println(unicode_k1);
}
}
