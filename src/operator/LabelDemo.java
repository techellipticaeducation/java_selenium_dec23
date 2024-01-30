package operator;

public class LabelDemo {
	public static void main(String[] args) {


		task:{
		System.out.println("task");
		task1:{
			System.out.println("task1");
			for(int i = 0; i < 10; i++) {
				System.out.println(i);
				if(i == 5) {
					break task;
				}
			}
		}
	}


	}
}
