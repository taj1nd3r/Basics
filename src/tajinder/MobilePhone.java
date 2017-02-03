package tajinder;

import java.util.ArrayList;

public class MobilePhone {


	private static ArrayList<Contacts> myContacts= new ArrayList<Contacts>();

	MobilePhone mobiledata= new MobilePhone();

	public boolean addContact(Contacts contact){
		if(findContact(contact.getName())>=0){
			System.out.println("Contact is already on file");
			return false;

			//		data.add(contact);
			//		
		}
		myContacts.add(contact);
		return true;
	}
	public boolean removeContact(Contacts contact){
		int foundPosition= findContact(contact);
		if(foundPosition<0){
			System.out.println(contact.getName() +"was not found");	
			return false;
		}
		this.myContacts.remove(foundPosition);
		System.out.println(contact.getName() + "was deleted");
		return true;

	}
	private int findContact(Contacts contact){
		return myContacts.indexOf(contact);
		//return position;

	}
	private int findContact(String contactName){
		for(int i=0;i<this.myContacts.size();i++){
			Contacts contact= this.myContacts.get(i);
			if (contact.getName().equals(contactName));
			return i;
		}
		return -1;
}

	public boolean updateContact(Contacts oldContact, Contacts newContact){
		int foundPosition= findContact(oldContact);
		if(foundPosition<0){
			System.out.println(oldContact.getName() +"was not found");	
			return false;
		}
		this.myContacts.set(foundPosition, newContact);
		//	myContacts.set(replacableContact, newContact);
		System.out.println(oldContact.getName()+ " was replaced by "+newContact.getName());
		return true;
	}

	public String queryContact(Contacts contact){
		if(findContact(contact)>=0){
			return contact.getName();
		}
		return null;
	}
}


