package vehicle;

public class Car extends Vehicle{
	int seats;
	String lights;
	int horsePower;

	public Car(String body, String color, int wheels, String model,int seats,String lights,int horsePower) {
		super(body, color, wheels, model);

	}
	
	public void handStreering(){
		System.out.println("car handstreering is perfect");
		super.changingGears();
		
		
	}
	public void changingGears(){
		System.out.println("car handstreering");
		System.out.println("speed is higest at 4th gear");
		
	}
	public void speed(){
		System.out.println("car speed");
	}

}
