package operator;

public class ElseIfChallengeDemo {
public static void main(String[] args) {
	
	
	// Monthname = Jan, Month number  = 1
	// Monthname = Feb, Month number  = 2
	// Monthname = March, Month number  = 2
	
	String monthName = "Mar";
	int monthNumber = 0;
	if((10%6 == 8) || monthName.equals("January")) {
		monthNumber = 1;
	}else if(monthName.equals("Mar") || monthName.equals("February")) {
		monthNumber = 2;
	}else if(monthName.equals("Mar") || monthName.equals("March")) {
		monthNumber = 3;
	}
	
	System.out.println(monthNumber);
	
	// Switch case
}
}
