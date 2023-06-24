package org.example;

public class PaperBook extends Book {
    private final int pageCount;
    private final int widthInMm;
    private final int heightInMm;

    public PaperBook(String title, String author, String publisher, int year, String genre, int pageCount, int widthInMm, int heightInMm) {
        super(title, author, publisher, year, genre);
        this.pageCount = pageCount;
        this.widthInMm = widthInMm;
        this.heightInMm = heightInMm;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ",pageCount,widthInMm,heightInMm";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + pageCount + "," + widthInMm + "," + heightInMm;
    }

}