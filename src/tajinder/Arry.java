package tajinder;

import java.lang.reflect.Array;
import java.util.Random;

public class Arry {
	public static void main(String args[]){
//		//	int newarray[]= new int[16];
//		//	System.out.println("length of array "+newarray.hashCode());
//		int[] newArray= new int[15];
//		Random number= new Random();
//		for(int i=0;i<=10;i++){
//		newArray= number.nextInt();
//			
//		}
//	}
	
	
	int rand = (int)(Math.random() * 10);
    int[] counts = new int [10];

    for(int i = 0; i < 100; i++){

      counts[i]++;
    }//end for

    System.out.println("number\t" + "occurence ");

    for (int num = 0; num < counts.length; num++){

      System.out.println(num + "\t" + counts[num]);
    
}}}
