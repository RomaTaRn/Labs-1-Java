from models.Book import Book

class PaperBook(Book):
    def __init__(self, title, author, publisher, year, genre, page_count, width_in_mm, height_in_mm):
        super().__init__(title, author, publisher, year, genre)
        self.page_count = page_count
        self.width_in_mm = width_in_mm
        self.height_in_mm = height_in_mm

    def get_pages_count(self):
        return self.page_count