package tajinder;

public class nestedif {
	public static void main(String args[]){
		int age=60;
		
		if(age<50){
			System.out.println("you are not senior citizen");
			
		}else{
			System.out.println("you are senior citizen");
			if(age>70){
				System.out.println("You are super senior citizen");
			}
				else{
					System.out.println("you are only senior citizen!!");
				}
			}
		}
	}


