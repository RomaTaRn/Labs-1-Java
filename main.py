from models.ElectronicBook import ElectronicBook
from models.PaperBook import PaperBook
from managers.BookManager import BookManager

if __name__ == '__main__':
    books = [
        ElectronicBook("The Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company", 1951, "Coming-of-age fiction", "PDF", 1000000),
        PaperBook("The Great Gatsby", "F. Scott Fitzgerald", "Charles Scribner's Sons", 1925, "Tragedy", 180, 140, 210),
        ElectronicBook("The Lord of the Rings", "J.R.R. Tolkien", "George Allen & Unwin", 1954, "Fantasy", "EPUB", 2000000),
        PaperBook("To Kill a Mockingbird", "Harper Lee", "J. B. Lippincott & Co.", 1960, "Southern Gothic", 281, 130, 200)
    ]

    book_manager = BookManager()
    for book in books:
        book_manager.add_book(book)

    print("Printing books:")
    book_manager.print_books()

    print("Length of book manager:", len(book_manager))

    print("Getting book at index 0:", book_manager[0].title)

    print("Iterating over books:")
    for book in book_manager:
        print(book.title)

    print("Do something list:", book_manager.do_something_list())

    print("Enumerating books:")
    print(book_manager.enumerate_books())

    print("Zipping with do something:")
    print(book_manager.zip_with_do_something())

    print("Dict with int values:")
    print(book_manager.dict_with_type(int))

    print("All condition:", book_manager.check_all(lambda book: book.get_pages_count() > 200))

    print("Any condition:", book_manager.check_any(lambda book: "The" in book.title))
