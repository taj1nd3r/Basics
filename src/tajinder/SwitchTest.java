package tajinder;

import java.util.Scanner;

public class SwitchTest {
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");

		char valueEntered= input.next().charAt(0);
		
		char value = Character.toUpperCase(valueEntered);
		
		System.out.println("value "+valueEntered);
		

		switch (value) {
		case 'A':
			System.out.println("Found A");
			break;

		case 'B':
			System.out.println("Found B");
			break;

		case 'C':
			System.out.println("Found c");
			break;
		case 'D':
			System.out.println("Found D");
			break;
		default:
			System.out.println("Default case");
			break;

		}
	}

}
