package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Start Amount: ");
		double startAmount = in.nextDouble();
		System.out.println("Win Chance: ");
		double winChance = in.nextDouble();
		System.out.println("Win Limit: ");
		double winLimit = in.nextDouble();
		System.out.println("Total Simulations");
		int totalSimulations = in.nextInt();
		int numPlays;

		for (numPlays = 0; numPlays < totalSimulations; numPlays++) {
			while (startAmount != winLimit && startAmount != 0) {
				double number = (Math.random()*100);
				if (number > winChance) {
					startAmount--;
					System.out.println(startAmount);
				} else {
					startAmount++;
					System.out.println(startAmount);
				}
			}
		}
		}

	}
