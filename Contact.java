package Contacts;






public class Contact {
	
	// Contact Object Variables //
	
	private final String contactID;
	String firstName;
	String lastName;
	String phoneNumber;
	String address;
		
	// Define the Contact constructor using variables //
		
	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
			
			// Throw an exception if the contact ID is to long, or null //
			
			if(contactID == null || contactID.length() > 10) {
					
				throw new IllegalArgumentException("Invalid ID");
					
			}
			
			// Throw an exception if the contact's first name is to long, or null //
			
			if(firstName == null || firstName.length() > 10) {
					
				throw new IllegalArgumentException("Invalid entry for first name");
					
			}
			
			// Throw an exception if the contact's last name is to long, or null //
			
			if(lastName == null || lastName.length() > 10) {
					
				throw new IllegalArgumentException("Invalid entry for last name");
					
			}
			
			// Throw an exception if the contact's phone number is NOT exactly 10 characters, or null //
			
			if(phoneNumber == null || phoneNumber.length() != 10) {
					
				throw new IllegalArgumentException("Invalid phone number");
					
			}
			
			// Throw an exception if the contact's address is to long, or null //
			
			if(address == null || address.length() > 30) {
					
				throw new IllegalArgumentException("Invalid address");
					
			}
				
			// Assign user input to the object's variables //
				
			this.contactID = contactID;
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumber = phoneNumber;
			this.address = address;
				
		}
			
			
		// Return each part of the contact object //
			
		public String getContactID() {
			return contactID;
				
		}
			
		public String getFirstName() {
			return firstName;
				
		}
			
		public String getLastName() {
			return lastName;
				
		}
			
		public String getPhoneNumber() {
			return phoneNumber;
				
		}
			
		public String getAddress() {
			return address;
				
		}
			
			
		
		
}


