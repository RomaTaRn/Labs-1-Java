from abc import ABC, abstractmethod

from managers.BookManager import logged
from abc import ABC, abstractmethod

from managers.BookManager import logged


class BookException(Exception):
    pass

class RedundantPagesException:
    pass


@logged(RedundantPagesException, 'console')
def your_function():
    pass

import logging

def logged(exception, mode):
    def decorator(func):
        def wrapper(*args, **kwargs):
            try:
                return func(*args, **kwargs)
            except exception as e:
                logger = logging.getLogger(__name__)
                if mode == 'console':
                    logger.addHandler(logging.StreamHandler())
                elif mode == 'file':
                    logger.addHandler(logging.FileHandler('logfile.log'))
                logger.exception(e)
        return wrapper
    return decorator

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

