package operator;

public class ElseIfDemo {
	public static void main(String[] args) {

		// if else condition

		// based on age , you have to return ageGroup for some people
		// age <= 18 = agegroup = Child
		// age > 18 and age <= 30  = agegroup = Adult
		// age > 30 and age <= 45 = agegroup = Mature
		// age > 45 , agegroup = old
		
		// 10, 18, 17, 19, 29,30,31,44,45,46
		// Boundary Validation
		
		
		

		int age = 28;
		String ageGroup ;
		
		if(age <= 18) {
			ageGroup  = "Child";
		}else if(age > 18 && age <= 30) {
			ageGroup = "Adult";
		}else if(age > 25 && age <= 45) {
			ageGroup = "Mature";
		}else {
			ageGroup = "Old";
		}

		System.out.println(ageGroup);

		

	}
}
