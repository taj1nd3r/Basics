package tajinder;

import java.util.Scanner;

public class increment {
	public static void main (String args[]){
	Scanner tajinder = new Scanner(System.in);
	System.out.println("ENTER THE NO");
	int a= tajinder.nextInt();
	//++a;// INCREMENTS THE VALUE BEFORE USING IT
	System.out.println("before incrementing "+(++a));

	System.out.println("after incrementing "+(a++));
	}
}
