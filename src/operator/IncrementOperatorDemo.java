package operator;

public class IncrementOperatorDemo {
public static void main(String[] args) {
	// ++ , -- // can only increase by 1
	// pre increment , first increase then assign ++i
	// post increment, first assign then increase i++
	
	
	
	int i = 10;
	
	int j  = ++i + ++i + i-- + --i + i++;
//            11   12    12     10  + 10
	
// short cut - when ever you see variable . write it
	// when you see ++ operator add it
	System.out.println("i="+i);
	System.out.println("j="+j);
	
	
	
}
}
