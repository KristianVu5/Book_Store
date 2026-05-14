package bg.tu_varna.sit.book_store.repository;

import bg.tu_varna.sit.book_store.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
