package tajinder;

public class Assignment1 {
	public static void main(String args[]){
		double a=20;
		double b=80;
		double sum =a+b;
		double multiply= (sum)*25;
		double remainder = multiply%40;
		if(remainder<=20){
			System.out.println("Total was over the limit "+remainder);
		}
	}
}
