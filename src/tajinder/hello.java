package tajinder;

import java.util.Scanner;

public class hello {
	public static void main(String args[]) {
//		anotherclass a= new anotherclass();
//		a.simpleMessage();
//		String b="kidan";
//		a.simpleMessage(b);
		
		Scanner input= new Scanner(System.in);
		String name= input.nextLine();
		anotherclass a = new anotherclass();
		a.simpleMessage(name);
				
	}

}
