package com.java.gamblinggame;

/**
 * imports all the class of the java.util package
 */
import java.util.Random;

public class GamblingSimulator {
	/*
	 * Declaring and initializing Variable.
	 */
	public static final int initialStake = 100;
	public static final int betStake = 1;
	public static final float percentage50 = (initialStake / 100) * 50;
	public static final float highestStake = percentage50 + initialStake;
	public static final float lowestStake = percentage50 - initialStake;
	public static final int START_DAY = 1;
	public static final int MAX_DAY = 20;
	public static final int STAKES_PER_DAY = 50;
	public static final int START_DOLLARS = 0;
	/*
	 * Taking random Object by generating random number
	 */
	static Random random = new Random();

	/**
	 * PSrogram execution starts from main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Welcome to the gambling simulator program");
		int days = START_DAY;
		int totalDollars = START_DOLLARS;
		
		for (days = START_DAY; days <= MAX_DAY; days++) {
			int totalStake = initialStake;

			while (totalStake < highestStake && totalStake > lowestStake) {
				int luck = (int) (Math.random() * 10) % 2;
				if (luck == 1) {
					totalStake = totalStake + betStake;
				} else {
					totalStake = totalStake - betStake;
				}
			}
			if (totalStake == highestStake) {
				totalDollars += STAKES_PER_DAY;
				System.out.println("Gambler won by " + totalDollars + " dollars on day " + days);
			} else {
				totalDollars -= STAKES_PER_DAY;
				System.out.println("Gambler lost by " + totalDollars + " dollars on day " + days);
			}
		}
		if (totalDollars > START_DOLLARS) {
			System.out.println("Gambler won " + totalDollars);
		} else {
			System.out.println("Gambler lost " + totalDollars);
		}

	}
}
