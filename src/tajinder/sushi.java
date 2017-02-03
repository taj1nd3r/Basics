package tajinder;

public class sushi {
	String girlName;
	
	public sushi(String name){
		this.girlName=name;
	}

//	public void setGirlName(String girlName) {
//		this.girlName = girlName;
//	}
	public String getGirlName() {
		return girlName;
	}

	
	public void saying(){
		System.out.printf("name of the girl is %s\n", getGirlName());
		
	}
}
