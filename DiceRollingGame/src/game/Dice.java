package game;

import java.util.Scanner;

public class Dice {
	private int sides;

	public int getSides() {
		return sides;
	}

	public void chooseDice() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of sides (Choose 4, 5, or 6):");
		sides = scn.nextInt();
	}
}
