package operator;

public class AssignmentOperator {
	public static void main(String[] args) {
		
		
		int i = 0;
		
//		i = i  + 1;
//		
//		i++;
		
//		i+=5; // i  = i + 5
//		i*=5; // i = i * 5
//		i/=5; // i = i / 5
//		i%=5; // i = i % 5
//		i-=5; // i = i - 5
//		System.out.println(i);
		
		// sum of 2 digit number 
		// 45 = 4 + 5 = 9
		// 78 = 7 + 8  = 15
		// 99 = 9 + 9 = 18
		
		// Logic
		/*
		 *   45
		 *   45 % 10  = 5
		 *   45 / 10 = 4 
		 *   13568   - loops
		 */
		
		int k = 67;
		int sum = k%10 + k/10;
		System.out.println(sum);
		
		// how to reverse a number - 76
		
	}
}
