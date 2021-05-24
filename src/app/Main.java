package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	
	// making a second change to terminal 2

	// Chocolates
	static int countMM = 0;
	static int countLacta = 0;
	static int countMars = 0;
	static int countTeasers = 0;
	static int countKinder = 0;

	// Soft Drinks
	static int countTay = 0;
	static int countDor = 0;
	static int countTag = 0;
	static int countLay = 0;
	static int countWak = 0;

	// Crisps
	static int countCok = 0;
	static int countSpr = 0;
	static int countFan = 0;
	static int countDrP = 0;
	static int countPep = 0;

	static final int TOTALITEMS = 5;

	// Helper class
	static Helper helper = new Helper();

	// Scanner and BufferedReader to get input from the user
	static Scanner sc = new Scanner(System.in);
	static BufferedReader myInput = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {

		stockFriddge();

		printMainMenu();

		askCustomer(); // need to change method signature

		printBill();

		outOfStockList();	

	}

	private static void outOfStockList() {
		System.out.println();
		if (countMM <= 0)
			System.out.println("MM is out of stock");
		if (countLacta <= 0)
			System.out.println("Lacta is out of stock");
		if (countMars <= 0)
			System.out.println("Mars is out of stock");
		if (countTeasers <= 0)
			System.out.println("Teasers is out of stock");
		if (countKinder <= 0)
			System.out.println("Kinder Bueno is out of stock");
		if (countTay <= 0)
			System.out.println("Tayto is out of stock");
		if (countTag <= 0)
			System.out.println("Tags is out of stock");
		if (countLay <= 0)
			System.out.println("Lays is out of stock");
		if (countLay <= 0)
			System.out.println("Teasers is out of stock");
		if (countWak <= 0)
			System.out.println("Walkers is out of stock");
		if (countCok <= 0)
			System.out.println("Coke is out of stock");
		if (countSpr <= 0)
			System.out.println("Sprite is out of stock");
		if (countFan <= 0)
			System.out.println("Fanta is out of stock");
		if (countDrP <= 0)
			System.out.println("Dr Peppers is out of stock");
		if (countKinder <= 0)
			System.out.println("Pepsi is out of stock");

	}

	private static void printBill() {

		int result = TOTALITEMS - countMM;
		int result2 = TOTALITEMS - countLacta;
		int result3 = TOTALITEMS - countMars;
		int result4 = TOTALITEMS - countTeasers;
		int result5 = TOTALITEMS - countKinder;

		int totalItems = result + result2 + result3 + result4 + result5;
		System.out.println();

		double total = 0;
		double total2 = 0;
		double total3 = 0;
		double total4 = 0;
		double total5 = 0;

		if (result != 0) {
			total = result * 1.2;
			System.out.println("MM " + result + " x " + 1.2 + "      " + total);

		}
		if (result2 != 0) {
			total2 = result2 * 1.2;
			System.out.println("Lacta " + result2 + " x " + 1.2 + "      " + total2);
		}

		if (result3 != 0) {
			total3 = result3 * 1.2;
			System.out.println("Mars " + result3 + " x " + 1.2 + "      " + total3);
		}
		if (result4 != 0) {
			total4 = result4 * 1.2;
			System.out.println("Teasers " + result3 + " x " + 1.2 + "      " + total4);
		}
		if (result5 != 0) {
			total5 = result5 * 1.2;
			System.out.println("Kinder Bueno " + result3 + " x " + 1.2 + "      " + total5);
		}
		double totalResult = total + total2 + total3 + total4 + total5;
		System.out.printf("TOTAL  %.2f", totalResult);

		System.out.println();
		
		//TODO crips and Soft Drinks bill

		double tt = 0;
		
		if (totalItems > 1) {
			System.out.print("==== DISCOUNT =====");
			tt = totalResult * 0.1;
			System.out.printf("%.2f", tt);
			System.out.println();
		}
		double payment = totalResult - tt;

		System.out.printf("PAYMENT %.2f", payment);

		System.out.println();

	}

	private static void stockFriddge() {

		// Chocolate
		countMM = 5;
		countLacta = 5;
		countMars = 5;
		countTeasers = 5;
		countKinder = 5;

		// Soft Drinks
		countCok = 5;
		countSpr = 5;
		countFan = 5;
		countDrP = 5;
		countPep = 5;

		// Crisps
		countTay = 5;
		countDor = 5;
		countTag = 5;
		countLay = 5;
		countWak = 5;


	}

	private static void printMainMenu() {
		System.out.println("\nWelcome to the Vending Machine App" + "\nThese are the available items:\n");

		// List of products
		productsInFridge();

	}

	private static void productsInFridge() {
		System.out.println("======== CHOCOLATE ===========");
		System.out.println(
				"Code 1 - MM quantity " + countMM + " price per unity: " + helper.getChocArray()[0].getPrice());
		System.out.println(
				"Code 2 - Lacta quantity " + countLacta + " price per unity: " + helper.getChocArray()[5].getPrice());
		System.out.println(
				"Code 3 - Mars quantity " + countMars + " price per unity: " + helper.getChocArray()[10].getPrice());
		System.out.println("Code 4 - Teasers quantity " + countTeasers + " price per unity: "
				+ helper.getChocArray()[15].getPrice());
		System.out.println("Code 5 - Kinder Bueno quantity " + countKinder + " price per unity: "
				+ helper.getChocArray()[20].getPrice());

		System.out.println();

		System.out.println("======== CRISPS ===========");
		System.out.println(
				"Code 6 - Tays quantity " + countTay + " price per unity: " + helper.getCrispsArray()[0].getPrice());
		System.out.println(
				"Code 7 - Doritos quantity " + countDor + " price per unity: " + helper.getCrispsArray()[5].getPrice());
		System.out.println(
				"Code 8 - Tags quantity " + countTag + " price per unity: " + helper.getCrispsArray()[10].getPrice());
		System.out.println(
				"Code 9 - Lays quantity " + countLay + " price per unity: " + helper.getCrispsArray()[15].getPrice());
		System.out.println("Code 10 - Wakers quantity " + countWak + " price per unity: "
				+ helper.getCrispsArray()[20].getPrice());

		System.out.println();

		System.out.println("======== SOFT DRINKS ===========");
		System.out.println("Code 11 - Coke quantity " + countCok + " price per unity: "
				+ helper.getSoftDrinksArray()[0].getPrice());
		System.out.println("Code 12 - Sprite quantity " + countSpr + " price per unity: "
				+ helper.getSoftDrinksArray()[5].getPrice());
		System.out.println("Code 13 - Fanta quantity " + countFan + " price per unity: "
				+ helper.getSoftDrinksArray()[10].getPrice());
		System.out.println("Code 14 - Dr Peppers quantity " + countDrP + " price per unity: "
				+ helper.getSoftDrinksArray()[15].getPrice());
		System.out.println("Code 15 - Pepsi quantity " + countPep + " price per unity: "
				+ helper.getSoftDrinksArray()[20].getPrice());

		System.out.println();

	}

	private static void askCustomer() {

		System.out.println("\nWhat would you like to buy?");
		int userInput = getUserInput();
//		int userInputToInteger = Integer.parseInt(userInputTest);
		updatestock(userInput);

		getUpdatedList();

		System.out.println("\nKeep purchasing: Y / N ?");

		String input = sc.nextLine().toUpperCase();

		if (input.equals("Y"))
			askCustomer();

	}

	private static void getUpdatedList() {
		System.out.println("\nUpdated list");
		productsInFridge();

	}

	private static void updatestock(int userInput) {

		if (userInput == 1)
			countMM--;
		if (userInput == 2)
			countLacta--;
		if (userInput == 3)
			countMars--;
		if (userInput == 4)
			countTeasers--;
		if (userInput == 5)
			countKinder--;
		if (userInput == 6)
			countTay--;
		if (userInput == 7)
			countDor--;
		if (userInput == 8)
			countTag--;
		if (userInput == 9)
			countLay--;
		if (userInput == 10)
			countWak--;
		if (userInput == 11)
			countCok--;
		if (userInput == 12)
			countSpr--;
		if (userInput == 13)
			countFan--;
		if (userInput == 14)
			countDrP--;
		if (userInput == 15)
			countPep--;

	}

	private static int getUserInput() {

		int userInput = -1;

		while (userInput < 0 || userInput > 15) {
			try {

				System.out.print("\nPlease type a valid a number ");
				userInput = Integer.parseInt(myInput.readLine());

			} catch (Exception e) {
				System.out.print("\nInvalid selection. Please try again");
			}

		}
		return userInput;
	}

}