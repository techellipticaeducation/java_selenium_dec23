package operator;

public class SwitchDemo {
	public static void main(String[] args) {
		// Equality purpose
		String monthName = "Mar";
		int monthNumber = 0;
		switch (monthName) {
		case "Jan":
		case "January":
			monthNumber = 1;
			break;

		case "Feb":
		case "February":
			monthNumber = 2;
			break;

		case "Mar":
		case "March":
			monthNumber = 3;
			break;

		default:
			break;
		}

	}
}
// Assignments
// try to write your test-cases
