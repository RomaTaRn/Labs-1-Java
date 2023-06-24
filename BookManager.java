package ua.lviv.iot.algo.part1.Book;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new ElectronicBook("The Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company", 1951, "Coming-of-age fiction", "PDF", 1000000));
        books.add(new PaperBook("The Lord of the Rings", "J.R.R. Tolkien", "Allen & Unwin", 1954, "High fantasy", 1178, (int) 135.0, (int) 210.0));

        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}