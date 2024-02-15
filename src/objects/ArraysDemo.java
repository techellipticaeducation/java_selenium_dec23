package objects;

public class ArraysDemo {
	public static void main(String[] args) {
		//  5 subject  - math, physics, arts, chemistry, biology
		// 4 students and 5 subject = 250 variables
		// Collection where we can save multiple values
		
		// length = 5
		// upper bound = length -1
		// we cannot add any new values to array. we can only update
		// once array is created , we cannot change arrays
		
		
		int[] student1Marks = {34,50,23,78,90};
		
		// Collections 
		int[] ar1 = new int[5];
		//ar1[5] = 10;
		
		
		// array inside array (2 D Array) - Excel Sheets
		int[][] allStudents = {
				{34,50,23,78,90},
				{34,70,23,98,90},
				{84,90,13,90,67},
				{14,30,73,18,30}
		};
		
//		System.out.println(allStudents[1][3]);
//		System.out.println(allStudents[2][1]);
//		
//		for(int i = 0 ; i < allStudents.length ;i++) {
//			int[] studentMarks = allStudents[i];
//			for(int j = 0; j  < studentMarks.length ; j++) {
//				System.out.print(studentMarks[j] + " ");
////				System.out.println(allStudents[i][j]);
//			}
//			System.out.println();
//		}
		
		
		// Foreach loop
		for( int[] studentMark  :  allStudents) {
			for(int k : studentMark) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		
		
		
//		
		
//		System.out.println(student1Marks[0]);
//		System.out.println(student1Marks[1]);
//		System.out.println(student1Marks[2]);
//		System.out.println(student1Marks[3]);
//		System.out.println(student1Marks[4]);
		
	}
}
