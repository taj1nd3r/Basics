package tajinder;

import java.util.Scanner;

public class Average {
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		int total=0;
		int grade;
		int average;
		int counter= 0;
		System.out.println("Please enter the grades");
		while(counter<10){
			grade=input.nextInt();
			total=total+grade;
			counter++;

		}
		average= total/counter;
		System.out.println("The average is :"+average);
	}
}
