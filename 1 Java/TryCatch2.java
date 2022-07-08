import java.util.*;
public class TryCatch2 {
	public static void main(String[] args) {
		
		Integer num1 = null;
		Integer num2 = null;
		
		while (num1 == null || num2 == null) {
			
			try (Scanner scanner = new Scanner(System.in)) {
				
				
				num1 = Integer.parseInt(scanner.nextLine());
				num2 = Integer.parseInt(scanner.nextLine());
				
				Integer sum = num1 + num2;
				System.out.println(num1 + "+" + num2 + "=" + sum);
			}
			catch (Exception e) {
				if (num1==null) {
					System.out.println("error inputing first number");
				}
				else {
					System.out.println("error inputing second number");
				}
				
			}
		}
		
	}
}
