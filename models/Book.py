from abc import ABC, abstractmethod

class Book(ABC):
    def __init__(self, title, author, publisher, year, genre):
        self.title = title
        self.author = author
        self.publisher = publisher
        self.year = year
        self.genre = genre

    @abstractmethod
    def get_pages_count(self):
        pass