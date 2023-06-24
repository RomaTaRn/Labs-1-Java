from models.ElectronicBook import ElectronicBook
from models.PaperBook import PaperBook
from managers.BookManager import BookManager

if __name__ == '__main__':
    book_manager = BookManager()

    book_manager.add_book(ElectronicBook("The Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company", 1951,
                                         "Coming-of-age fiction", "PDF", 1000000))
    book_manager.add_book(PaperBook("The Great Gatsby", "F. Scott Fitzgerald", "Charles Scribner's Sons", 1925,
                                    "Tragedy", 180, 140, 210))
    book_manager.add_book(ElectronicBook("The Lord of the Rings", "J.R.R. Tolkien", "George Allen & Unwin", 1954,
                                         "Fantasy", "EPUB", 2000000))
    book_manager.add_book(PaperBook("To Kill a Mockingbird", "Harper Lee", "J. B. Lippincott & Co.", 1960,
                                    "Southern Gothic", 281, 130, 200))

    book_manager.print_books()
