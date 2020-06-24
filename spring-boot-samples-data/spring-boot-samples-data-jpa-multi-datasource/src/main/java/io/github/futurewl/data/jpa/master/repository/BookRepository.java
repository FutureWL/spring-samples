package io.github.futurewl.data.jpa.master.repository;

import io.github.futurewl.data.jpa.master.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
