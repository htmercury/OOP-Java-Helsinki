
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author htmercury
 */
public class Library {

    private ArrayList<Book> books = new ArrayList<Book>();

    public Library() {
    }

    public void addBook(Book newBook) {
        books.add(newBook);
    }

    public void printBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();

        // iterate the list of books and add all the matching books to the list found
        for (Book b : books) {
            if (StringUtils.included(b.title(), title)) {
                found.add(b);
            }
        }
        
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();

        // iterate the list of books and add all the matching books to the list found
        for (Book b : books) {
            if (StringUtils.included(b.publisher(), publisher)) {
                found.add(b);
            }
        }
        
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();

        // iterate the list of books and add all the matching books to the list found
        for (Book b : books) {
            if (b.year() == year) {
                found.add(b);
            }
        }
        
        return found;
    }
}
