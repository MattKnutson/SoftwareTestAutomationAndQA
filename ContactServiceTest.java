package ContactTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Contacts.Contact;
import Contacts.ContactService;








class ContactServiceTest {

		@Test
		public void testContactService() {
			
			// Create a new ContactService object //
			
			ContactService testService = new ContactService();
			
			
			
			// Create a new Contact with valid variables and add it to the contactsList //
			
			Contact testContact = new Contact("9399939", "Matt", "Knutson", "8175557799", "1234 Parkland Street");
			
			testService.addContact(testContact);
			
			
			
			// Retrieve the testContact from the list using it's ID //
			
			Contact retrievedContact = testService.getContact("9399939");
			
			// Ensure that the contact associated with the ID is not empty/null //
			
			assertNotNull(retrievedContact);
			
			// Ensure that the retrievedContact's entries match the entries associated with the testContact's ID //
			
			assertEquals("Matt", retrievedContact.getFirstName());
			
			assertEquals("Knutson", retrievedContact.getLastName());
			
			assertEquals("8175557799", retrievedContact.getPhoneNumber());
			
			assertEquals("1234 Parkland Street", retrievedContact.getAddress());
			
			
			
			// Ensure the contact's first name is update-able via it's ID //
			
			// Change the contact's first name //
			
			testService.updateFirstName("9399939", "Edward");
			
			// Retrieve the updated contact entry //
			
			retrievedContact = testService.getContact("9399939");
			
			// Ensure the new entry is NOT empty/null //
			
			assertNotNull(retrievedContact);
			
			// Ensure the contact entry reflects the new data //
			
			assertEquals("Edward", retrievedContact.getFirstName());
			
			
			
			// Ensure the contact's last name is update-able via it's ID //
			
			// Change the contact's last name //
						
			testService.updateLastName("9399939", "Hockney");
						
			// Retrieve the updated contact entry //
						
			retrievedContact = testService.getContact("9399939");
						
			// Ensure the new entry is NOT empty/null //
						
			assertNotNull(retrievedContact);
			
			// Ensure the contact entry reflects the new data //
						
			assertEquals("Hockney", retrievedContact.getLastName());
			
			
			
			// Ensure the contact's phone number is update-able via it's ID //
			
			// Change the contact's phone number //
						
			testService.updatePhoneNumber("9399939", "8176580657");
						
			// Retrieve the updated contact entry //
						
			retrievedContact = testService.getContact("9399939");
						
			// Ensure the new entry is NOT empty/null //
						
			assertNotNull(retrievedContact);
						
			// Ensure the contact entry reflects the new data //
						
			assertEquals("8176580657", retrievedContact.getPhoneNumber());
						
						
						
			// Ensure the contact's address is update-able via it's ID //
			
			// Change the contact's address //
						
			testService.updateAddress("9399939", "911 Cody Court Selima, NH 73450");
						
			// Retrieve the updated contact entry //
						
			retrievedContact = testService.getContact("9399939");
						
			// Ensure the new entry is NOT empty/null //
						
			assertNotNull(retrievedContact);
						
			// Ensure the contact entry reflects the new data //
						
			assertEquals("911 Cody Court Selima, NH 73450", retrievedContact.getAddress());	
			
			
			
			// Ensure that a contact can be deleted via it's ID //
			
			testService.deleteContact("9399939");
			
			// Make sure the contact entry is empty/null //
			
			assertNull(testService.getContact("9399939"));
						
						
			
		}
	

}	
