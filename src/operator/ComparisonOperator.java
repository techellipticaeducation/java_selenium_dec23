package operator;

public class ComparisonOperator {
public static void main(String[] args) {
	int i = 10;
	int j = 10;
	
//	System.out.println(i == j); // true
//	System.out.println(i != j); // false
//	System.out.println(i > j);  // false
//	System.out.println(i < j); // false
//	System.out.println(i >= j); // true
//	System.out.println(i <= j); // true
	
	// return type will always a boolean value
	char c = 'b'; // 98
	char c1 = 'a';   // 97
	
	int c10 = c;  // auto conversion - 
	
	int i6 = 98;
	char c6 =(char)i6; // type cast
	
	System.out.println(c == ++c1); // true // 98 98
	
	// all char are int by default
	// all int are not char
	
}
}
