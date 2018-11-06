package com.briceallen.MyPackage;

public class Contact {

    private String name; // Stores name 
    private String age;  // Stores age 
    private String phonenumber; // Stores phone number 
    private String zip;		//Store zip
    private String email;  // Stores email

    // Creates Contact object based on parameters.
    public Contact(String n, String a, String p, String z, String e) {
		name = n;
		age = a;
		phonenumber = p;
		zip = z;
		email = e;
    }

    // Changes phone number of contact
    public void changeNumber(String newnum) {
		phonenumber = newnum;
    }

    // Returns the name 
    public String getName() {
		return name;
    }

    // Returns the age 
    public String getAge() {
		return age;
    }

    // Returns the phone number 
    public String getNumber() {
		return phonenumber;
    }
    
 // Returns the zip 
    public String getZip() {
		return zip;
    }
 // Returns the email 
    public String getEmail() {
		return email;
    }
    // Prints all information about a contact out.
    public void printContact() {
		System.out.println("Name: " + name + " Age: " + age + " Phone#: " + phonenumber);
		System.out.println("Email: " + email + "ZipCode: "+ zip);
    }

   
  

}
