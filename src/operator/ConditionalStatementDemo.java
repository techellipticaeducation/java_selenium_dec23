package operator;

import java.util.Scanner;

public class ConditionalStatementDemo {
public static void main(String[] args) {
	// if else condition
	
	// based on age , you have to return ageGroup for some people
	// age <= 18 = agegroup = Child
	// age > 18 = agegroup = Adult
	
	// Ternary Operator
	
	Scanner vaibhav = new Scanner(System.in);
	System.out.println("Enter Your Age");
	int age = vaibhav.nextInt();
	String ageGroup = (age <= 18) ? "Child" : "Adult" ;
	System.out.println("Age Group " + ageGroup);
	
	
	int i = 10; //  Early Initialization
	
	
	int j ;
	j = 20;   // Late Initialization
	
}
}
