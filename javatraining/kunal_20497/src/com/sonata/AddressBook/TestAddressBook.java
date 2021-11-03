package com.sonata.AddressBook;

public class TestAddressBook {

	public static void main(String[] args) 
		
		
	
		SingleAddress a1 = new SingleAddress();
		a1.setLastname("Rao");
		a1.setFirstname("Kunal");
		a1.setAddress("RR nagar");
		a1.setCity("bangalore");
		a1.setCountry("India");
		a1.setZipcode(560040);
		
		
		SingleAddress a2 = new SingleAddress();
		a2.setLastname("Raju");
		a2.setFirstname("mohan");
		a2.setAddress("JJ nagar");
		a2.setCity("bangalore");
		a2.setCountry("India");
		a2.setZipcode(560050);
		book.add(a1);
		book.add(a2);
		
}
		//Duplicate Address exception
		SingleAddress a1 = new SingleAddress("kunal", "rao", "RR nagar", "Bangalore", "India", 560040);
		if (book.add(a1) < 0) {
			throw new NewException("Duplicate Address found.");
		book.display();
		}
	
		//Deleting details
		if (book.remove("rao") < 0) {
			throw new NewException("Address deleted");
		}
	}
	
	
	
	
		
		
	}


