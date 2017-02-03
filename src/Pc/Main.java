package Pc;

public class Main {
	public static void main(String args[]){
		Dimensions dimensions = new Dimensions(20, 20, 5);
		Case theCase= new Case("220B", "Dell", "240", dimensions);
		
		Monitor monitor= new Monitor("27 inch beast", "Acer", 27, new Resolution(2540,1140));
		
		Motherboard motherboard= new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
		
		PC thePc= new PC(theCase, monitor, motherboard);
		//thePc.pre
		
		thePc.getTheCase().pressPowerButton();
		thePc.getMonitor().drawPixelAt(50, 55, "blue");
		thePc.getMotherboard().loadProgram("Windows 1.1");
		
		
		
	}

}
