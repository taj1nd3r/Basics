package tajinder;

import java.util.Scanner;

public class calculator {
	static double a;
	static double b;
	static double answer;
	public static void main(String args[]){
		
		Scanner data= new Scanner(System.in);
		//Scanner b= new Scanner(System.in);
		System.out.println("Enter first num: ");
		a = data.nextDouble();
		System.out.println("Enter second num: ");
		b = data.nextDouble();
		//answer=a+b;
		//System.out.println("Answer is "+answer);
		
		String operation;
		System.out.println("Which operation you want to perform: ");
		operation= data.next();
		
		
		System.out.println("Calling "+operation);
		
		if (operation.matches("add")){
			System.out.println("Answer after operation is"+answer);
			answer =add(a,b);
			}
//		elseif(operation == "sub");
//		{
//			answer =sub(a,b); 
//			}
//		elseif(operation == "mul");{
//			answer =mul(a,b);
//			}
//		else{
//			answer =div(a,b); 
//		}
		
	//	System.out.println("Answer after operation is"+answer);
		
		}	

	
		
	

	public static double add(double a,double b){
		answer=a+b;
		return answer;
		
	}
	public static double sub(double a,double b){
		answer=a-b;
		return answer;
		
		
	}
	public static double mul(double a,double b){
		answer=a*b;
		return answer;
		
		
	}
	public static double div(double a,double b){
		answer=a/b;
		return answer;
		
		
	}
}
