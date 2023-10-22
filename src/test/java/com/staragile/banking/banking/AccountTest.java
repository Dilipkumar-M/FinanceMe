package com.staragile.banking.banking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

	public class AccountTest {

	    @Test
	    public void testAccountConstructor() {
	        // Test the constructor that initializes the account
	        Account account = new Account("12345", "John Doe", "123 Main St", "555-123-4567");

	        // Verify that the account object is created correctly
	        assertEquals("12345", account.getAccountId(), "Account ID should match");
	        assertEquals("John Doe", account.getCustomerName(), "Customer Name should match");
	        assertEquals("123 Main St", account.getCustomerAddress(), "Customer Address should match");
	        assertEquals("555-123-4567", account.getContactNumber(), "Contact Number should match");
	    }

	    @Test
	    public void testAccountToString() {
	        // Test the toString() method of the Account class
	        Account account = new Account("67890", "Alice Smith", "456 Elm St", "555-987-6543");

	        // Verify that the toString() method produces the expected string representation
	        String expectedToString = "Account ID: 67890, Customer Name: Alice Smith, Customer Address: 456 Elm St, Contact Number: 555-987-6543";
	        assertEquals(expectedToString, account.toString(), "toString() should produce the expected output");
	    }

	    @Test
	    public void testAccountEquality() {
	        // Test the equality of two account objects
	    	Account account1 = new Account("12345", "John Doe", "123 Main St", "555-123-4567");
	    	Account account2 = new Account("12345", "John Doe", "123 Main St", "555-123-4567");

	        // Verify that account1 and account2 are considered equal
	        assertEquals(account1, account2, "Account objects should be equal");
	    }
	}