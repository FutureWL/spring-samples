package io.github.futurewl.data.jdbc.service;

import io.github.futurewl.data.jdbc.dao.BookDao;
import io.github.futurewl.data.jdbc.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookDao bookDao;

    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public int addBook(Book book) {
        return bookDao.addBook(book);
    }

    public int updateBook(Book book) {
        return bookDao.updateBook(book);
    }

    public int deleteBookById(Integer id) {
        return bookDao.deleteBookById(id);
    }

    public Book getBookById(Integer id) {
        return bookDao.getBookById(id);
    }

    public Book getBookById2(Integer id) {
        return bookDao.getBookByIdSlave(id);
    }

    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }
}
