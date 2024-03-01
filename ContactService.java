package Contacts;

import java.util.Hashtable;
import java.util.Map;









public class ContactService {
	
		// Initialize a map to hold a list of contacts //
	
		private Map<String, Contact> contactsList;
	
	
		// ContactService constructor //
	
		public ContactService() {
		
			// Use a hash table to hold contactsList entries //
		
			contactsList = new Hashtable<>();
		
		}
	
	
	
		// Add a new contact to the contatsList using it's ID //
	
		public void addContact(Contact newContact) {
		
			contactsList.put(newContact.getContactID(), newContact);
			
		}
	
	
	
		// Delete an existing contact using it's ID //
	
		public void deleteContact(String contactID) {
		
			contactsList.remove(contactID);		
		
		}
	
	
	
		// Retrieve a contact from the contactsList using it's ID //
	
		public Contact getContact(String contactID) {
		
			return contactsList.get(contactID);
		
		}
	
	
	
		// Update an existing contact's first name using it's ID //
	
		public void updateFirstName(String contactID, String newFirstName) {
		
			// Initialize a contact using a contact ID //
		
			Contact contact = contactsList.get(contactID);
		
			// IF that contact exists in the contactsList //
		
			if(contact != null) {
			
				// Update the contact's first name //
			
				contact.firstName = newFirstName;
			
			}
			
		}
		
		
		
		// Update an existing contact's last name using it's ID //
		
		public void updateLastName(String contactID, String newLastName) {
			
			// Initialize a contact using a contact ID //
			
			Contact contact = contactsList.get(contactID);
			
			// IF that contact exists in the contactsList //
			
			if(contact != null) {
				
				// Update the contact's last name //
				
				contact.lastName = newLastName;
			
			}
				
		}
			
			
			
			
		// Update an existing contact's phone number using it's ID //
			
		public void updatePhoneNumber(String contactID, String newPhoneNumber) {
				
			// Initialize a contact using a contact ID //
				
			Contact contact = contactsList.get(contactID);
				
			// IF that contact exists in the contactsList //
				
			if(contact != null) {
					
				// Update the contact's phone number //
					
				contact.phoneNumber = newPhoneNumber;
			
			}
					
		}
				
				
				
				
		// Update an existing contact's address using it's ID //
				
		public void updateAddress(String contactID, String newAddress) {
					
			// Initialize a contact using a contact ID //
					
			Contact contact = contactsList.get(contactID);
					
			// IF that contact exists in the contactsList //
					
			if(contact != null) {
					
				// Update the contact's address //
					
				contact.address = newAddress;
						
			}
					
					
		}
	
		
}
