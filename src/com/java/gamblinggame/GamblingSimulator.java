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
		int totalStake = initialStake;
		System.out.println("Welcome to the gambling simulator program");
		while (totalStake < highestStake && totalStake > lowestStake) {
			int play = random.nextInt(2);
			/*
			 * logic for checking winning or loosing by using switch case
			 */
			switch (play) {
			case 0:
				totalStake = totalStake - betStake;
				System.out.println("Stake After loosing :" + totalStake);
				break;
			case 1:
				totalStake = totalStake + betStake;
				System.out.println("Stake After Winning :" + totalStake);
				break;

			}
		}
		/*
		 * Logic for checking Won or lost
		 */
		if (totalStake == highestStake)
			System.out.println("Gambler won by: " + totalStake);
		else
			System.out.println("Gambler lost by: " + totalStake);

	}
}
