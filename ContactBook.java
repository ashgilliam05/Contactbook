/*

    Users will utilize this application to enter and store two types of contacts: business contacts and personal contacts.
    Both types have common fields as well as properties unique to them.
    Users are able to traverse through the menu system, add business and/or personal contacts, and select a contact added during run-time by numeric identifier.
    Upon exiting, they will lose all data entered during run-time.
    
    Program utilizes:  ArrayList(collections), private(access modifier for encapsulation), abstract/extends(inheritance), @Override(Polymorphism).

Written by:  Ashley Carbone
TYP1 - Project in Introduction to Object-Oriented Design and Development
acarbon@wgu.edu

 */

import java.util.*;
import java.util.ArrayList;
public class ContactBook 
{
    public static void main(String[] args) 
    {
    Scanner in = new Scanner(System.in);
    ArrayList<BasicContact> addressBook = new ArrayList<BasicContact>();
    
   boolean run = true;
   while(run) //Keeps Main Menu open until switch case 4 is ran, which will quit the program.
   {
    System.out.println("MAIN MENU");
    System.out.println();
    System.out.println("1) Add Business Contact");
    System.out.println("2) Add Personal Contact");
    System.out.println("3) Display Contacts");
    System.out.println("4) Exit");
    System.out.print("Type the number of what you would like to do and press the Enter key:  ");
    int input = in.nextInt();
    in.nextLine();  //Clears out the new line to prevent it from going to next line.
    
    switch (input)
    {  
        case 1:
            //Menu item 1 allows us to add a business contact.
            System.out.println("Add a Business Contact");
            System.out.println("--------------------------------");
            createNewBusinessContact(in, addressBook);
            System.out.println("");
            break;
        case 2: 
            //Menu item 2 allows us to add a personal contact.
            System.out.println("Add a Personal Contact");
            System.out.println("--------------------------------");
            createNewPersonalContact(in, addressBook);
            System.out.println("");
            break;
        case 3:
            //Menu item 3 allows us to view contacts that have been added.
            viewAllContacts(in, addressBook);
            break;
        case 4:
            //Quits the program.
            System.out.println("Quiting...");
            run = false;
            break;
        default:
            System.out.println();
            System.out.println("Please enter a number between 1-4.");
            System.out.println();
        }
    }
    System.exit(0);  //Force close program after exit.
    }

    //Create new business contact and adds to addressBook.
    private static void createNewBusinessContact(Scanner input, ArrayList<BasicContact> addressBook) 
    {
        System.out.println("First Name:  ");
        String firstName = input.nextLine();
        System.out.println("Last Name:  ");
        String lastName = input.nextLine();
        System.out.println("Address:  ");
        String address = input.nextLine();
        System.out.println("Phone Number:  ");
        String phoneNum = input.nextLine();
        System.out.println("Email Address:  ");
        String emailAddy = input.nextLine();
        System.out.println("Job Title:  ");
        String jobTitle = input.nextLine();
        System.out.println("Organization:  ");
        String org = input.nextLine();
        
        BusinessContact p = new BusinessContact();
        p.setFirstName(firstName);
        p.setLastName(lastName);
        p.setAddress(address);
        p.setEmailAddy(emailAddy);
        p.setPhoneNum(phoneNum);
        p.setJobTitle(jobTitle);
        p.setOrg(org);
        addressBook.add(p);
        
        //addressBook.add(new BusinessContact(firstName, lastName, address, phoneNum, emailAddy, jobTitle, org)); 
    }
    
    //Create new personal contact.  Adds to addressBook.
    private static void createNewPersonalContact(Scanner input, ArrayList<BasicContact> addressBook) 
    {
        System.out.println("First Name:  ");
        String firstName = input.nextLine();
        System.out.println("Last Name:  ");
        String lastName = input.nextLine();
        System.out.println("Address:  ");
        String address = input.nextLine();
        System.out.println("Phone Number:  ");
        String phoneNum = input.nextLine();
        System.out.println("Email Address:  ");
        String emailAddy = input.nextLine();
        System.out.println("Date of Birth:  ");
        String dateBirth = input.nextLine();
       
        PersonalContact p = new PersonalContact();
        p.setFirstName(firstName);
        p.setLastName(lastName);
        p.setAddress(address);
        p.setEmailAddy(emailAddy);
        p.setPhoneNum(phoneNum);
        p.setDateBirth(dateBirth);
        addressBook.add(p);
        
         //addressBook.add(new PersonalContact(firstName, lastName, address, phoneNum, emailAddy, dateBirth));
        
    }
    
    //View all contact by last name, first name format with numeric identifier.
    private static void viewAllContacts(Scanner input, ArrayList<BasicContact> addressBook)
    {
        boolean run = true;
        while(run)  //Loops through addressBook to allow user to view all contacts listed.
        {
        
            System.out.println("0) Exit");
 
        for(int i = 0; i < addressBook.size(); i++)
        {
            System.out.print(i+1 +") ");  //Adjusts the index output to human readable format, instead of starting at 0.  The addressBook at 0 index will display as 1).
            addressBook.get(i).printLastNameFirstName(); 
            //((BasicContact)addressBook.toArray()[i]).printLastNameFirstName();
            //addressBook.
        }
        
        //Allows the user to enter the numeric identifier for the contact of choice.
        System.out.print("Enter the number choice:  ");
        int choice = input.nextInt();
        input.nextLine(); //Clears out the new line to prevent it from going to next line.
        //0) is listed as Exit (see line 104).  Will exit if user enters number greater than number of contacts in addressBook.
        if(choice == 0 || choice > addressBook.size())  //
            run = false;
        else
            displayDetail(input, choice-1, addressBook);
        }
    }
    
    /**
     * Displays detailed contact information
     * @param input - Parse input, so that we can control when this method returns.
     * @param index - The index of the contact user chooses.
     * @param addressBook - The addressBook that is holding all contacts created.
     */
    private static void displayDetail(Scanner input, int index, ArrayList<BasicContact> addressBook) 
    {
        //((BasicContact)addressBook.toArray()[index]).printInfo();
        addressBook.get(index).printInfo();
        System.out.println("Press Enter to return to contact display");
        String in = input.nextLine();  //Wait for user to press Enter so user can view contact and press Enter when finished.

    }
}    
 

