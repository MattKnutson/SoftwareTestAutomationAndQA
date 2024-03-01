package ContactTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Contacts.Contact;






class ContactTest {

	@Test
	void testContact() {
    		
		// Assign data to a new Contact object // 
		
		Contact contact = new Contact("9399939", "Matt", "Knutson", "8175557799", "1234 Parkland Street");
		
		// Test to make sure the contact information is correct //
		
		assertTrue(contact.getContactID().equals("9399939"));
		assertTrue(contact.getFirstName().equals("Matt"));
		assertTrue(contact.getLastName().equals("Knutson"));
		assertTrue(contact.getPhoneNumber().equals("8175557799"));
		assertTrue(contact.getAddress().equals("1234 Parkland Street"));
		
		
	}

	@Test
	void testContactIdLength() {
		
		// Test to ensure the contact ID is 10 characters or less //
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("999999999999", "Matt", "Knutson", "8175557799", "1234 Parkland Street");
		});
	}
		
		
	@Test
	void testContactIdNull() {
		
		// Test to ensure the contact ID is NOT null //
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Matt", "Knutson", "8175557799", "1234 Parkland Street");
		});
	}
	
	
	@Test
	void testContactFirstLength() {
		
		// Test to ensure the contact's first name is 10 characters or less //
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("9399939", "Matthew From BayTown", "Knutson", "8175557799", "1234 Parkland Street");
		});
	}
	
	
	@Test
	void testContactFirstNull() {
		
		// Test to ensure the contact's first name is NOT null //
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("9399939", null, "Knutson", "8175557799", "1234 Parkland Street");
		});
	}
	
	
	@Test
	void testContactLastLength() {
		
		// Test to ensure the contact's last name is 10 characters or less //
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("9399939", "Matthew", "Knutsoneffentiguolousm", "8175557799", "1234 Parkland Street");
		});
	}
	
	
	@Test
	void testContactLastNull() {
		
		// Test to ensure the contact's last name is NOT null //
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("9399939", "Matthew", null, "8175557799", "1234 Parkland Street");
		});
	}
	
	
	@Test
	void testPhoneNumToLong() {
		
		// Test to ensure the contact's phone number is exactly 10 characters //
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("9399939", "Matthew", "Knutson", "18175557799", "1234 Parkland Street");
		});
	}
	
	
	@Test
	void testPhoneNumToShort() {
		
		// Test to ensure the contact's phone number is exactly 10 characters //
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("9399939", "Matthew", "Knutson", "5557799", "1234 Parkland Street");
		});
	}
	
	
	@Test
	void testPhoneNumNull() {
		
		// Test to ensure the contact's phone number is NOT null //
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("9399939", "Matthew", "Knutson", null, "1234 Parkland Street");
		});
	}
	
	
	@Test
	void testAddressLength() {
		
		// Test to ensure the contact's address is 30 characters or less//
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("9399939", "Matthew", "Knutson", "8175557799", "1234 Parkland Street, Saint Joesephine, WI 73453");
		});
	}
	
	
	@Test
	void testAddressNull() {
		
		// Test to ensure the contact's address is NOT null //
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("9399939", "Matthew", "Knutson", "8175557799", null);
		});
	}
	
}
	


