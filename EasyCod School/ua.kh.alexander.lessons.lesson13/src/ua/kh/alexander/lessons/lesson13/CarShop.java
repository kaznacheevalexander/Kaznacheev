package ua.kh.alexander.lessons.lesson13;

import java.util.Scanner;

public class CarShop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CarShopList shopList = new CarShopList();
		String input;

		System.out.println("Hello! Wellcome...");
		do {
			System.out.println("1. Disks");
			System.out.println("2. Headlights");
			System.out.println("3. Brake Systems");
			System.out.println("0. exit");

			input = scanner.nextLine();

			switch (input) {
			case "1":
				System.out.println("1. BBS");
				System.out.println("2. O.Z.");
				break;
			case "2":
				System.out.println("1. Lights with incandescent");
				System.out.println("2. Xenon headlights");
				System.out.println("3. LED lights");
				break;
			case "3":
				System.out.println("1. JBT");
				System.out.println("2. Brembo");

			default:
				break;
			}
		} while (!input.equals("0"));

	}
}
