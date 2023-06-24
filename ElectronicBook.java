package org.example;

public class ElectronicBook extends Book {
    private final String format;
    private final long fileSizeInBytes;

    public ElectronicBook(String title, String author, String publisher, int year, String genre, String format, long fileSizeInBytes) {
        super(title, author, publisher, year, genre);
        this.format = format;
        this.fileSizeInBytes = fileSizeInBytes;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ",format,fileSizeInBytes";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + format + "," + fileSizeInBytes;
    }

}
