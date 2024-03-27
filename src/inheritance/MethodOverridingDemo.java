package inheritance;

public class MethodOverridingDemo {
	public static void main(String[] args) {
		M2 mObj  = new M2();
		mObj.m1();
		//mObj.
		// ByDefault every class has a parent class - Object
	}
}

class M1{
	private void m1() {
		System.out.println("M1 -> m1");	
	}
}

class M2 extends M1{
	public void m1() {
		//super.m1();
		System.out.println("M2 -> m1");	
	}
}

// in case of method overriding , we cannot decrease visibility
// public > protected > default > private

// if method is final , we cannot override that method anymore.

// parent and child having same signature method , then child method override parent method
// Method overriding