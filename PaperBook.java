package ua.lviv.iot.algo.part1.Book;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class PaperBook extends Book {
    private int pageCount;
    private int widthInMm;
    private int heightInMm;

    public PaperBook(String title, String author, String publisher, int year, String genre, int pageCount, int widthInMm, int heightInMm) {
        setTitle(title);
        setAuthor(author);
        setPublisher(publisher);
        setYear(year);
        setGenre(genre);
        setPageCount(pageCount);
        setWidthInMm(widthInMm);
        setHeightInMm(heightInMm);
    }
    @Override
    public int getPagesCount() {
        return pageCount;
    }
}
