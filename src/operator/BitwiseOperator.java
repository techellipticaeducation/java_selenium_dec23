package operator;

public class BitwiseOperator {
	public static void main(String[] args) {
		// AND 
		// whenever you need to compare two comparison , bitwise

		// age  < 18 = child
		// age > 18 and age < 30 = adult
		// age > 30 and age < 45 = mature
		// age > 45 = old

		// True & True   - True
		// True & False  - false
		// False & True  - false
		// False & False - false

		// OR  - |

		// True | True   - True
		// True | False  - True
		// False | True  - True
		// False | False - false
		
		// & , | - Bitwise
		// && , || - Logical Operator
		
		System.out.println(FALSE() || TRUE());
	}
	
	public static boolean TRUE() {
		System.out.println("1");
		return true;	
	}
	public static boolean FALSE() {
		System.out.println("0");
		return false;	
	}
	
	
}
