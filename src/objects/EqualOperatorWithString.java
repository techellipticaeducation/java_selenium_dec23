package objects;

public class EqualOperatorWithString {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2= "Java";
		String s3 = new String("Java");
		String s4 = new String("Java");

		System.out.println(s1 == s2); // true
		System.out.println(s2 == s3); // true
		System.out.println(s3 == s4); // false
		System.out.println("================");
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		// value of string
		
		
		// process to removing pointing object is called interning
		
		
	}
}
