package operator;

import java.util.Scanner;

public class LoopDemo {
	// 	While
	// dowhile
	// for
	
	// What is loop?
	public static void main(String[] args) {
		
		
		// indefinite loop -  while , do.while
		// reading database
		// defininte loop - for
		
		
		// condition , body of loop
		// while, min - 0, first condition check then execution 
//		int i = 20;
//		while(i <= 10) {
//			System.out.println(i);
//			i++;
//		}
		// dowhile - first execution check then condition
		
//		int j = 20;
//		do {
//			System.out.println(j);
//			j++;
//		}while(j <= 10);
		
		// do while loop execute atleast once
		
		// for loop
		// tables, 1 to 20 , but skip 12th table
		// jump statement , break
		// continue - skip
		for(int i = 1; i  <= 20 ; i++) {
			
			if(i == 12) {
				continue;
			}
			
			System.out.print(i + " = ");
			for(int k = 1 ; k<= 10 ; k++ ) {
				System.out.print(k*i+" ");
			}
			System.out.println();
		}
		// Fibonacci
		// prime number
		// star program
		// armstrong
		
		
	}
	
	
}
