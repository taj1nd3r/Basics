package tajinder;

import java.util.ArrayList;

public class Contacts {
	private String name;
	private String phoneNumber;
	
	
	
	
	public Contacts(String name, String contact) {
		super();
		this.name = name;
		this.phoneNumber = contact;
	}
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public String getContact() {
		return phoneNumber;
	}
//	public void setContact(String contact) {
//		this.contact = contact;
//	}
	



public  static Contacts createContact(String name, String phoneNumber){
	return new Contacts(name, phoneNumber);
}
	
}

