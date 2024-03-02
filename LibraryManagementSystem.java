/*You are tasked with creating a simple library management system. 
The system should be able to handle books. 
Each of these items has a title, author, publication date and an ISBN number.
Question:
1]Design a Java program that uses the principles of Object-Oriented Programming (OOP) 
to model this scenario. Your program should demonstrate the use of the following OOP concepts:

2]Classes and Objects: Define class for item type Book.
3]Inheritance: Create a superclass (eg, Libraryitem) that the specific item classes inherit from.

4]Encapsulation: Use private fields with public getters and setters.

5]Polymorphism: Use method overriding.

6]Abstraction: Make Libraryitem an abstract class with an abstract method 
(e.g., displayDetails()).

>>>Take the input from user.

Sample Input - 
Java Programming
John Doe
2022-01-01
978-0-123456-78-9

Sample Output-

Book Title: Java Programming

Authors:
	John Doe

Publication Date: 2022-01-01

ISBN: 978-0-123456-78-9
*/

import java.util.Scanner;

// Abstract class LibraryItem
abstract class LibraryItem 
{
    // Fields
    private String title;
    private String author;
    private String publicationDate;
    private String ISBN;

    // Constructor
    public LibraryItem(String title, String author, String publicationDate, String ISBN)
	{
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.ISBN = ISBN;
    }

    // Abstract method
    public abstract void displayDetails();

    // Getters and setters method to get and set/Modify the private data 
    public String getTitle() 
	{
        return title;
    }

    public void setTitle(String title) 
	{
        this.title = title;
    }

    public String getAuthor()
	{
        return author;
    }

    public void setAuthor(String author) 
	{
        this.author = author;
    }

    public String getPublicationDate() 
	{
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate)
	{
        this.publicationDate = publicationDate;
    }

    public String getISBN()
	{
        return ISBN;
    }

    public void setISBN(String ISBN) 
	{
        this.ISBN = ISBN;
    }
}

// Class Book inheriting from LibraryItem
class Book extends LibraryItem 
{
    // Constructor
    public Book(String title, String author, String publicationDate, String ISBN) {
        super(title, author, publicationDate, ISBN);
    }

    // Method overriding
    @Override
    public void displayDetails() 
	{
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publication Date: " + getPublicationDate());
        System.out.println("ISBN: " + getISBN());
    }
}
class LibraryManagementSystem 
{
    public static void main(String[] args) 
	{
        // Taking input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Book Title:");
        String title = scanner.nextLine();

        System.out.println("Enter Author:");
        String author = scanner.nextLine();

        System.out.println("Enter Publication Date (YYYY-MM-DD):");
        String publicationDate = scanner.nextLine();

        System.out.println("Enter ISBN:");
        String ISBN = scanner.nextLine();

        // Creating a Book object
        Book book = new Book(title, author, publicationDate, ISBN);

        // Displaying details
        book.displayDetails();

        
    }
}

