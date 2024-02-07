package objects;

public class MethodDemo {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int sum = calc.add(10,20);
		/*
				
				System.out.println(sum);
				sum = calc.add(10,20);
				System.out.println(sum);
		      safasdfas
		      */
		calc.m1(1);
		double d1 = calc.piValue();
		System.out.println(d1);
	}
}


class Calculator{
	// input = parameteres
	// logic = method body
	// output = return type

	// return keyword - last logical statement of method

	
	/**
	 * 
	 * @param i
	 * @param j
	 * @return
	 */
	int add(int i, int j){
		int k = i + j;
		return k;
	}

	void m1(int value) {
		if(value < 10) {
			System.out.println("value is less then 10");
			return;
		}
		System.out.println("value is more then 10");

	}

	void m2(int value) {
		System.out.println(value);
	}	
	// Non Parameterized method
	float piValue() {
		return 3.14f;
	}



}
