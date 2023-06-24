package ua.lviv.iot.algo.part1.Book;

import lombok.*;
@Getter
@Setter

@ToString
public class Book {
    private String title;
    private String author;
    private String publisher;
    private int year;
    private String genre;
    private int countInWarehouse;

    public Book getBook(int quantity) {
        int availableBooks = Math.min(quantity, countInWarehouse);
        countInWarehouse -= availableBooks;
        return new Book(title, author, publisher, year, genre, availableBooks);
    }

    public boolean hasMoreBooks() {
        return countInWarehouse > 0;
    }

    private static Book instance = new Book();

    public static Book getInstance() {
        return instance;
    }
 public  Book(){}
    public Book(String title, String author, String publisher, int year, String genre, int countInWarehouse) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.genre = genre;
        this.countInWarehouse = countInWarehouse;
    }
    public static void main(String[] args) {
        Book[] books = {
                new Book(),
                new Book("The Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company", 1951, "Coming-of-age fiction", 10),
                Book.getInstance(),
                Book.getInstance()
        };

        for (Book book : books) {
            System.out.println(System.identityHashCode(book));
        }
    }
}

