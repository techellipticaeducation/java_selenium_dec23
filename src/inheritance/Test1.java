package inheritance;

public class Test1 {
	public static void main(String[] args) {
		B b1 = new B();
		
	}
}

class A{
	int i = 10;
	private void m1() {		
	}
}
 class B extends A{
	int j = 10;
	public  void m2() {
	}
}

class C extends B{
	
}
// Unidireactional -P -> C
// we cannot extend final class
// private modifiers deesnt allow to be part of inheritance

//whenever we create object using new keyword in a class. HAS-A Relationship
//  B HAS-A A
		
// Inheritance - IS-A Relationship
// B is a A
// your parent automatically provide all its methods and properties to child class