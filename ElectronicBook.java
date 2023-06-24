package ua.lviv.iot.algo.part1.Book;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class ElectronicBook extends Book {
    private String format;
    private long fileSizeInBytes;
    private static final int BYTES_PER_PAGE_COUNT = 2048;

    public ElectronicBook(String title, String author, String publisher, int year, String genre, String format, long fileSizeInBytes) {
        setTitle(title);
        setAuthor(author);
        setPublisher(publisher);
        setYear(year);
        setGenre(genre);
        setFormat(format);
        setFileSizeInBytes(fileSizeInBytes);
    }

    @Override
    public int getPagesCount() {
        return (int) (fileSizeInBytes / BYTES_PER_PAGE_COUNT);
    }
}
