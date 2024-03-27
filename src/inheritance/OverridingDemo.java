package inheritance;

public class OverridingDemo {
	public static void main(String[] args) {
		K1 k1 = new K1();
		k1.name  = "Ram";
		System.out.println(k1);
		
		K1 k2 = new K1();
		k2.name  = "Shyam";
		System.out.println(k2);
		
		k1 = null;
		k2 = null;
		System.gc(); // Manually
			
	}
}


class K1{
	
	String name;
	
	public String toString() {
		return "My custom object for "+name+" - " + super.toString();
	}

	
	protected void finalize() throws Throwable {
		System.out.println(name + " - Bye bye guys i am going to recycle bin");
	}
	
}
