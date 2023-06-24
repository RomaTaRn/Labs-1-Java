package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class BookManager {
    private final List<Book> books;

    public BookManager(List<Book> books) {
        this.books = books;
    }

    public void writeToFile(String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            String headers = books.get(0).getHeaders();
            writer.write(headers);
            writer.write("\n");

            for (Book book : books) {
                String csvData = book.toCSV();
                writer.write(csvData);
                writer.write("\n");
            }

            System.out.println("Дані було успішно записано у файл " + filePath);
        } catch (IOException e) {
            System.err.println("Виникла помилка при записі у файл: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        List<Book> books = List.of(
                new ElectronicBook("The Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company", 1951, "Coming-of-age fiction", "PDF", 1000000),
                new PaperBook("The Lord of the Rings", "J.R.R. Tolkien", "Allen & Unwin", 1954, "High fantasy", 1178, (int) 135.0, (int) 210.0)
        );

        BookManager bookManager = new BookManager(books);
        bookManager.writeToFile("books.csv");
    }
}