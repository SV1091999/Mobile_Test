import java.util.Scanner;

public class First_Non_Repeated_Character {


	  public static String firstNonRepeated(String s) {
	        int[] count = new int[200];
	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            count[c]++;
	        }
	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            if (count[c] == 1) {
	                return String.valueOf(c);
	                
	            }
	        }
	        return "";
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.print("Enter a string (or 'exit' to quit): ");
	            String input = scanner.nextLine();
	            if (input.equalsIgnoreCase("exit")) {
	                System.out.println("Please re-run the program again. Thank you!");
	                break;
	            }
	            String result = firstNonRepeated(input);
	            if (result.isEmpty()) {
	                System.out.println("No Non Repeated Character Found!!!");
	            } else {
	                System.out.println("First non-repeated character: " + result);
	            }
	        }
	        scanner.close();
	    }
}
