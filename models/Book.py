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

    def do_something(self):
        pass

    def __dict_with_type(self, data_type):
        return {key: value for key, value in self.__dict__.items() if isinstance(value, data_type)}
