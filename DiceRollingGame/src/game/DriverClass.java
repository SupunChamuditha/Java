import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {
		int choice;
		Game game = new Game();
		Scanner scn = new Scanner(System.in);

		do {
			System.out.println("01 Add Players ");
			System.out.println("02 Start Game ");
			System.out.println("03 Display Score");
			System.out.println("04 Exit ");
			System.out.println("Choose what you want:");
			choice = scn.nextInt();

			switch (choice) {
				case 1:
					game.AddPlayer();
					break;
				case 2:
					game.PlayGame();
					break;
				case 3:
					game.DisplayScore();
					break;
				case 4:
					System.out.println("Exiting the game.");
					break;
				default:
					System.out.println("Invalid choice!");
			}
		} while (choice != 4);
	}
}