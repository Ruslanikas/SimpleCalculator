package lt.vtmc.ems;

import java.util.Scanner;

public class AppMenu {
	private char exit;
	private Scanner input = new Scanner(System.in);

	public void mainMenu() throws Exception {

		while (exit != 'n') {
			System.out.println("Simple Java calculator ver. 1.0");
			arithmeticCalculateMenu();
			exitMenu();
		}
	}

	private void arithmeticCalculateMenu() throws Exception {

		System.out.print("First number: ");
		int number1 = input.nextInt();
		System.out.print("Second number: ");
		int number2 = input.nextInt();
		System.out.print("Operator: ");
		String op = input.next();

		int result = 0;

		if (op.equals("+")) {
			result = number1 + number2;
		} else if (op.equals("-")) {
			result = number1 - number2;
		} else if (op.equals("*")) {
			result = number1 * number2;
		} else if (op.equals("/")) {
			result = number1 / number2;
		} else {
			throw new Exception("Operator not recognized");
		}
		System.out.println("Result: " + result);
	}

	private void exitMenu() {

		System.out.println("Continue (y/n): ");
		String read = input.next().toLowerCase();
		input.close();
		char close = read.charAt(0);
		switch (close) {
		case 'y':
			exit = 'y';
			System.out.println("Good luck!");
			break;
		case 'n':

			exit = 'n';
			System.out.println("Good Bye!");
			break;
		default:
			System.out.println("Wrong symbol!");

		}
	}
}