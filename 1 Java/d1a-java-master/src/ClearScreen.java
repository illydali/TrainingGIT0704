
import java.io.IOException;
import java.util.Scanner;

public class ClearScreen {
	public static void main(String[] args) throws InterruptedException, IOException {
		Scanner scanner = null;
		scanner = new Scanner(System.in);
		System.out.println("welcome");
		scanner = new Scanner(System.in);
		System.out.println("clear the screen?");
		System.err.println(System.getProperty("os.name"));
		scanner.nextLine();
		if (System.getProperty("os.name").contains("Windows")) {
			ProcessBuilder commandPromptProcessBuilder = new ProcessBuilder("cmd", "/c", "cls");
			commandPromptProcessBuilder.inheritIO().start().waitFor();
		} else {
			Runtime.getRuntime().exec("cls");
		}

//		System.out.println("welcome again...");
//		scanner = new Scanner(System.in);
//		System.out.println("clear the screen again?");
//		scanner.nextLine();
//		System.out.print("\003[H\003[J");
		System.out.flush();
	}
}