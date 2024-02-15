package objects;

public class StringDemo {
	public static void main(String[] args) {
		// literal way
		String s1 = "Java";
		String s2 = "Java";
		String s3 = "python";
		String s4 = "Java";
		String s5 = "Python"; // 3 objects
		
		// object way
		String st4 = new String("Java"); // 4 object
		String st5 = new String("php"); // 6 objects 
		String st8 = new String("C"); // 8 object
		String st9 = new String("C"); // 9 object
		
	}
}


