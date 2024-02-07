package objects;

import java.util.Date;

public class CallingDemo {

	public static void main(String[] args) {
		Test5 t1 = new Test5();
		t1.m2();
	
		
		Test5.m3();
		
		System.out.println();
		
		Date dt = new Date();
		// How to check documentation of class
	}

}

class Test5{
	int i = m1();

	void m2() {

	}


	static void m3() {

	}


	int m1() {
		return 50;
	}
}

