package bg.tu_varna.sit.book_store.repository;

import bg.tu_varna.sit.book_store.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
