package io.github.futurewl.data.jpa.master.dao;

import io.github.futurewl.data.jpa.master.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDao {

    @Autowired
    @Qualifier("masterJdbcTemplate")
    private JdbcTemplate masterJdbcTemplate;

    @Autowired
    @Qualifier("slaveJdbcTemplate")
    private JdbcTemplate slaveJdbcTemplate;

    public int addBook(Book book) {
        String sql = "insert into book(name,author) values (?,?)";
        return masterJdbcTemplate.update(sql, book.getName(), book.getAuthor());
    }

    public int updateBook(Book book) {
        String sql = "update  book set name=?,author=? where id=?";
        return masterJdbcTemplate.update(sql, book.getName(), book.getAuthor(), book.getId());
    }

    public int deleteBookById(Integer id) {
        String sql = "delete from book where id=?";
        return masterJdbcTemplate.update(sql, id);
    }

    public Book getBookById(Integer id) {
        String sql = "select * from book where id=?";
        return masterJdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Book.class), id);
    }

    public List<Book> getAllBooks() {
        String sql = "select * from book";
        return masterJdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));
    }

    public Book getBookByIdSlave(Integer id) {
        String sql = "select * from book where id=?";
        return slaveJdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Book.class), id);
    }
}
