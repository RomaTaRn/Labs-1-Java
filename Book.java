package ua.lviv.iot.algo.part1.Book;

import lombok.*;
@Getter
@Setter

@ToString

public abstract class Book {
    private String title;
    private String author;
    private String publisher;
    private int year;
    private String genre;

    public static void main(String[] args) {
        Book[] books = {
                new ElectronicBook("The Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company", 1951, "Coming-of-age fiction", "PDF", 1000000),
                new PaperBook("The Great Gatsby", "F. Scott Fitzgerald", "Charles Scribner's Sons", 1925, "Tragedy", 180, 140, 210),
                new ElectronicBook("The Lord of the Rings", "J.R.R. Tolkien", "George Allen & Unwin", 1954, "Fantasy", "EPUB", 2000000),
                new PaperBook("To Kill a Mockingbird", "Harper Lee", "J. B. Lippincott & Co.", 1960, "Southern Gothic", 281, 130, 200)
        };

        for (Book book : books) {
            System.out.println(book);
        }
    }

    public abstract int getPagesCount();
}
