import java.util.Scanner;

public class Lab5again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1 = new Scanner(System.in);
		String choice = "";
		System.out.println("Welcome to the Grand Circus Casino! Roll the dice? Please enter yes or no.");
		choice = scan1.nextLine();
		int x;
		int y;
		while (choice.equalsIgnoreCase("yes")) {

			System.out.println("Roll 1:");

			x = (int) (Math.random() * 6 + 1);
			System.out.println(x);
			y = (int) (Math.random() * 6 + 1);
			System.out.println(y);


			if (x == 1 && y == 1) {
				System.out.println("Snake Eyes!");
			}

			else if ((x + y) == 12) {
				System.out.println("Boxcar!");
			}

			System.out.println("Roll again? Please enter yes or no");
			choice = scan1.nextLine();
		}

		System.out.println("Okay!  See you later :))");

	}

}
