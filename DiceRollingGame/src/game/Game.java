

import java.util.Random;

public class Game {

	private int[] score;

	public void AddPlayer() {
		Player member = new Player();
		int players = member.ChoosePlayerCount();
		score = new int[players];
		member.InputName_Password();
	}

	public void PlayGame() {
		Player member = new Player();
		int players = member.ChoosePlayerCount();
		score = new int[players];
		Random random = new Random();
		int bonus;

		Dice dice = new Dice();
		dice.chooseDice();

		for (int c = 0; c < players; c++) {
			System.out.println("Player " + (c + 1) + ": Enter 1 to roll the dice");
			int roll = dice.getSides();
			int number = random.nextInt(roll) + 1;
			System.out.println("Side is: " + number);

			if (number == 6 || number == 1) {
				bonus = 2;
			} else {
				bonus = 0;
			}

			score[c] += bonus + number;
		}
	}

	public void DisplayScore() {
		Player member = new Player();
		int players = member.ChoosePlayerCount();
		String[] names = member.getNames();

		for (int i = 0; i < players; i++) {
			System.out.println("Player Name: " + names[i] + " Score: " + score[i]);
		}
	}
}
