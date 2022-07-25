
public class StackOverflowEx {
	public static void main(String[] args) {
		goToUSA();
	}

	public static void goToUSA() {
		System.err.println("USA");
		goToMexico();
	}

	public static void goToMexico() {
		System.err.println("Mexico");
		goToUSA();
	}
}
