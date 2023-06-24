from models.Book import Book

class ElectronicBook(Book):
    BYTES_PER_PAGE_COUNT = 2048

    def __init__(self, title, author, publisher, year, genre, file_format, file_size_in_bytes):
        super().__init__(title, author, publisher, year, genre)
        self.file_format = file_format
        self.file_size_in_bytes = file_size_in_bytes

    def get_pages_count(self):
        return self.file_size_in_bytes // self.BYTES_PER_PAGE_COUNT

    def do_something(self):
        return "ElectronicBook do_something result"
