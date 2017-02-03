package tajinder;

import java.util.Scanner;

public class feet {
	public static void main(String args[]){



		Scanner input= new Scanner(System.in);

		System.out.println("Enter no of feet ");
		double feet =input.nextDouble(); 
		System.out.println("Enter no of inches ");
		
		double inch =input.nextDouble(); 
		//System.out.println("Enter no of feet ");


		double cm=calcFeetAndInchesCentimeters(feet,inch);
		System.out.println("After converting feet and inches to cm "+cm+" cms");
		double inches = calcFeetAndInchesCentimeters(inch);
		System.out.println("After converting inches to feet "+inches+" feet");

	}



	public static double calcFeetAndInchesCentimeters(double feet, double inch){
		if(feet>=0 || (inch>=0 && inch<=12)){


			double inches=feet*12+inch;
			double cm= inches*2.54;
			return cm;
		}else
			return -1;
	}
	public static double calcFeetAndInchesCentimeters( double inch){
		if(inch>=0 ){


			//double inches=feet*12+inch;
			double feet= inch/12;
			return feet;
		}else
			return -1;
	}
}
