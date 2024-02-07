package objects;

public class MethodOverloadingDemo {
	public static void main(String[] args) {
		//Calculator10.add
		
	}
}
// Method Overloading 
// only varies with parameters
// return type no impact on method overloading

// Signature 
class Calculator10{


	static int add(int i , int j) {
		return i + j;
	}

	static int add(int i , int j, int k) {
		return i + j+k;
	}

	static int add(float i , int j) {
		return (int)i + j;
	}

}
