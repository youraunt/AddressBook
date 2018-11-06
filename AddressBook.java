/**
 * @author bkallen
 *
 */
package com.briceallen.MyPackage;

import java.io.*;
import java.util.*;

public class AddressBook {

    private ArrayList<Contact> entries; // An array of Contacts - each stores info for one friend

    // Create an empty AddressBook
    public AddressBook() {
        entries = new ArrayList<Contact>();
    }

    // Add a contact that's passed in as a parameter.
    public void addContact(Contact c) {
        entries.add(c);
    }

    // Print info of all contacts 
    public void printContacts() {    	
        for (int i=0;i<entries.size();i++)
            System.out.println(entries.get(i));
    }

    // total number of entries in AddressBook
    public int numContacts() {
        return entries.size();
    }

    // Returns number if Contact with name s exists corresponding
    // to which place in the array friends the Contact is stored. Returns -1
    // otherwise.
    private int haveContact(String s) {
        for (int i=0;i<entries.size();i++)
            if (entries.get(i).getName().equals(s))
                return i;
        return -1;
    }

    // Deletes a contact with name s, if one is in the AddressBook.
    public void deleteContact(String s) {
        int place = haveContact(s);
        if (place >= 0)
            entries.remove(place);
    }
}
