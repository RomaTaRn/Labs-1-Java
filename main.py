class Book:
    def __init__(self, title="", author="", publisher="", year=0, genre="", count_in_warehouse=0):
        self.title = title
        self.author = author
        self.publisher = publisher
        self.year = year
        self.genre = genre
        self.count_in_warehouse = count_in_warehouse

    def get_book(self, quantity):
        available_books = min(quantity, self.count_in_warehouse)
        self.count_in_warehouse -= available_books
        return Book(self.title, self.author, self.publisher, self.year, self.genre, available_books)

    def has_more_books(self):
        return self.count_in_warehouse > 0

    instance = None

    @classmethod
    def get_instance(cls):
        if cls.instance is None:
            cls.instance = cls()
        return cls.instance

    def __str__(self):
        return f"Title: {self.title}, Author: {self.author}, Publisher: {self.publisher}, Year: {self.year}, Genre: {self.genre}, Count in Warehouse: {self.count_in_warehouse}"


books = [
    Book(),
    Book("The Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company", 1951, "Coming-of-age fiction", 10),
    Book.get_instance(),
    Book.get_instance()
]

for book in books:
    print(id(book))
