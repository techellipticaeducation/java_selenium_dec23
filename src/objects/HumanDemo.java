package objects;

public class HumanDemo {
	public static void main(String[] args) {
		// Instance and static variables
		
		// Project Name - British Telecom
		
		Human obj = new Human();
		obj.name = "xyz";
		Human.country = "Vaibhav";
	//  for using instance varibale  - object is required
	//  for using static variable - class ref is required (class variables)
		
		
		Human h1 = new Human();
//		h1.name = "Tom";
//		h1.age = 34;
//		h1.country = "India";
//		
//		
////		Human h4 = h1;
////		h4.name= "Brad";
////		
////		h1 = null;
////		h1 = h4;
//		
		Human h2 = new Human();
//		h2.name = "Sachin";
//		h2.age= 23;
//		h2.country = "Australia";
//		
		Human h3 = new Human();
//		h3.name = "Laxman";
//		h3.country = "Pakistan";
		
		
		System.out.println(h2.country);
		System.out.println(h1.country);
		System.out.println(h3.country);
		
//		System.out.println(h2.age);
		
		
		
		
		
//		h1.speak("Hello How are you guys ?");
//		h2.speak("Hello, I am good");
//		h3.speak("I am fine as well");
//		h4.speak("Hows the weather");
	}
}

class Human{
	// Chracteristic of Human being

	
	// instance variables
	String name;
	int age= 10;
	double weight;
	int height;
	
	static String country; // share variable
	
	static int counter;
	
	static final double PI = 3.14d;
	// final - value will never change
	// static - memory will never change
	public void registerToChat() {
		counter++;
	}

	// behaviour

	void speak(String contentToSpeak) {
		int k = 10; // local variable
		
		System.out.println(name +" - " + contentToSpeak);
	}
}





