class BookManager:
    def __init__(self):
        self.books = []

    def add_book(self, book):
        self.books.append(book)

    def print_books(self):
        for book in self.books:
            print(book.__dict__)

    def __len__(self):
        return len(self.books)

    def __getitem__(self, index):
        return self.books[index]

    def __iter__(self):
        return iter(self.books)

    def do_something_list(self):
        return [book.do_something() for book in self.books]

    def enumerate_books(self):
        return list(enumerate(self.books))

    def zip_with_do_something(self):
        return list(zip(self.books, self.do_something_list()))

    def dict_with_type(self, data_type):
        return {book: book._Book__dict_with_type(data_type) for book in self.books}

    def check_all(self, condition):
        return {"all": all(condition(book) for book in self.books)}

    def check_any(self, condition):
        return {"any": any(condition(book) for book in self.books)}
