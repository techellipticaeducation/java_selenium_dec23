package objects;

public class TestRunner1 {
	public static void main(String[] args) {
		
//		TestSuite suite1 = new TestSuite();
//		suite1.suiteName = "Test1 Suite";
//		TestSuite suite2 = new TestSuite();
//		suite1.suiteName = "Test2 Suite";
		
		TestSuite suite3 = new TestSuite();
		suite3.suiteName = "Test3 Suite";
		TestRunner1.m1(suite3);
		System.out.println(suite3.suiteName);
		
		
		int i = 34;
		int j = 56;
		TestRunner1.add(i,j);
		System.out.println(i);
		System.out.println(j);
	}
	
	public static void m1(TestSuite t1) {
		t1.suiteName = "Updated Suite";
	}
	
	// When ever we pass datatype as arguments- call by value
	// call by value is create clone of that variable and 
	// send as value
	
	// When ever we pass Object as arguments- call by ref
	// no copy. no cloning -> exact object passed
	
	public static void add(int i, int j) {
		i = 10;
		j = 20;
	}
}

class TestSuite{
	String suiteName = "";
}




