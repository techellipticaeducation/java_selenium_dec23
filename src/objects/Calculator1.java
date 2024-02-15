package objects;

public class Calculator1 {
	public static void main(String...args) {
		int sum  = ScientificCalculator.add(10,20,40,50,20);
		System.out.println(sum);
		sum  = ScientificCalculator.add(10,20);
		System.out.println(sum);
		sum  = ScientificCalculator.add();
		System.out.println(sum);
		
	}
}

// Varargs = various arguments

class ScientificCalculator{
	//int[] input =  {10,20,40,50,20}
	static int add(int...input) {
		int sum = 0;
		
		for(int i = 0 ; i < input.length ; i++) {
			sum = sum + input[i];
		}
		
		for(int i : input) {
			sum = sum + i;
		}
		return sum;
	}
}
