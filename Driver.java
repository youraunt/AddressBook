package com.briceallen.MyPackage;

import java.io.*;
import java.util.*;

public class Driver {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		String name;
		String age;
		String number;
		String email;
		String zip;

		// Instantiate AddressBook object
		AddressBook bricesphone = new AddressBook();

		// Menu driven loop.
		menu();
		int choice = key.nextInt();
		while (choice != 5) {

			// Only adds contact if there is room in AddressBook BricesPhone.
			if (choice == 1) {

				if (bricesphone.numContacts() < 100) {

					// Reads in all  information.
					System.out.println("Enter your friend's name:");
					name = key.next();	
//					if(name == null || name.isEmpty()) {
//						throw new RuntimeException ("Nothing was entered. Please try again");
//					} else
					{ 
					}
					System.out.println("Enter their age: ");
					age = key.next();
					
					System.out.print("Enter their phone number: ");
					number = key.next();
					
					System.out.println("Enter their E-mail address: ");
					email = key.next();
					
					System.out.println("Enter their zipcode: ");
					zip = key.next();

					// creates Contact object, which is
					// a parameter to the addContact method.
					bricesphone.addContact(new Contact(name, age, number, email, zip));
				} else
					System.out.println("Sorry, your book is full.");
			}

			// Implements rest of the choices by calling appropriate AddressBook method.
			else if (choice == 2) {
				System.out.println("What is the name of the contact you want to delete?");
				name = key.next();
				bricesphone.deleteContact(name);
			} else if (choice == 3)
				System.out.println("You have " + bricesphone.numContacts() + " contacts.");
			else if (choice == 4)
				bricesphone.printContacts();
			else if (choice != 5)
				System.out.println("Sorry, that was an invalid menu choice, try again.");

			menu();
			choice = key.nextInt();

		}
	}

	public static void menu() {
		System.out.println("1.Add a new contact to your address book.");
		System.out.println("2.Delete a contact from your address book.");
		System.out.println("3.Print out the number of contacts you have.");
		System.out.println("4.Print out information of all of your contacts.");
		System.out.println("5.Quit.");
		System.out.println("Enter your menu choice:");
	}
}
