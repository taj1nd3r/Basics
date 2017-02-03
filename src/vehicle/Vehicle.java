package vehicle;

public class Vehicle {
	private String body;
	private int wheels;
	private String color;
	private String model;

	public Vehicle(String body, String color, int wheels, String model){
		this.body=body;
		this.color=color;
		this.wheels=wheels;
		this.model=model;
	}
	
	public void handStreering(){
		System.out.println("Vehicle handstreering");
		
		
	}
	public void changingGears(){
		System.out.println("Vehicle handstreering");
		
		
	}
	public void speed(){
		System.out.println("Vehicle speed");
	}

}
