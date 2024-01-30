package objects;

public class HumanDemo {
	public static void main(String[] args) {
		// Instance and static variables
		
		Human h1 = new Human();
		h1.name = "Uma";
		
		Human h4 = h1;
		h4.name= "Vaibhav";
		
		h1 = null;
		h1 = h4;
		
		Human h2 = new Human();
		h2.name = "Gurpreet";
		
		Human h3 = new Human();
		h3.name = "Raman";
		
		h1.speak("Hello How are you guys ?");
		h2.speak("Hello, I am good");
		h3.speak("I am fine as well");
		h4.speak("Hows the weather");
	}
}

class Human{
	// Chracteristic of Human being

	String name;
	int age;
	double weight;
	int height;
	String country;

	// behaviour

	void speak(String contentToSpeak) {
		System.out.println(name +" - " + contentToSpeak);
	}
}





