package com.java.gamblinggame;

import java.util.Random;

/**
 * Class to create Gambling with different methods
 */
public class Gambling_Simulator {
	/*
	 * variable Declaration
	 */
	public static final int initialStake = 100;
	public static final int betStake = 1;
	public static final float percentage50 = (initialStake / 100) * 50;
	public static final float highestStake = percentage50 + initialStake;
	public static final float lowestStake = percentage50 - initialStake;
	/*
	 * Random class to generate random numbers
	 */
	static Random random = new Random();

	public static int startGambling() {
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
		return totalStake;
	}
	/*
	 * Method for checking after 20days winning or lossing profit
	 */
	public void playFor20Days() {
		int total_Amount_Invested_In_20_Days = 2000;
		int amount_After_20Days = 0;

		for (int i = 1; i <= 20; i++) {
			int result = startGambling();
			amount_After_20Days += result;
			if (result == 50) {
				System.out.println("Lost 50$ in day " + i);
			}
			if (result == 150) {
				System.out.println("Won 50$ in day " + i);
			}
		}
		System.out.println("Amount after 20 day is " + amount_After_20Days);
		if (amount_After_20Days > total_Amount_Invested_In_20_Days) {
			int profit = amount_After_20Days - total_Amount_Invested_In_20_Days;
			System.out.println("Total profit after 20 days is = " + profit);

		} else if (amount_After_20Days < total_Amount_Invested_In_20_Days) {
			int loss = total_Amount_Invested_In_20_Days - amount_After_20Days;
			System.out.println("Total loss after 20 days is = " + loss);
		} else
			System.out.println("No profit No loss");
	}
	/*
	 * Program execution starts from main method
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the Gambler Game");
		Gambling_Simulator Object = new Gambling_Simulator();
		Object.playFor20Days();
	}
}
