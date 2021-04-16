/*
 * Project and Training 1 - Computer Science, Berner Fachhochschule
 */

package greetings;

import java.util.Scanner;

//CHECKSTYLE:OFF MagicNumber
public class Greetings {

	public static String getGreeting(String city) {
		// TODO: Your code goes here
		return "";
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a city: ");
		String city = scanner.nextLine();
		System.out.println(getGreeting(city));
		scanner.close();

	}
}
