/*
Scenario:
You are tasked with developing a simple Library Management System in Java. The system should allow users to add books, search for books by title, and display all books in the library. Each book has a title, author, and ISBN number.
Requirements:
Create a Book class with the following attributes:
title (String)
author (String)
isbn (String)
Create a Library class that manages a collection of books. The Library class should have the following methods:
addBook(Book book): Adds a book to the library.
searchByTitle(String title): Searches for a book by its title and returns the book if found.
displayAllBooks(): Displays all books in the library.
Create a Main class to test the functionality of the Library class.
Question:
Write the Java code to implement the above scenario. Your code should include the Book class, the Library class, and the Main class. Ensure that the Main class demonstrates adding books, searching for a book by title, and displaying all books.
*/
import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("----------------------");
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public Book searchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("Library is empty.");
        } else {
            for (Book book : books) {
                book.displayBook();
            }
        }
    }
}

public class casestudy1 {
    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("Java Programming", "James Gosling", "101");
        Book book2 = new Book("Data Structures", "Mark Allen", "102");

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("\nDisplaying All Books:");
        library.displayAllBooks();

        System.out.println("\nSearching for a Book:");
        Book foundBook = library.searchByTitle("Java Programming");

        if (foundBook != null) {
            System.out.println("Book Found:");
            foundBook.displayBook();
        } else {
            System.out.println("Book not found.");
        }
    }
}

