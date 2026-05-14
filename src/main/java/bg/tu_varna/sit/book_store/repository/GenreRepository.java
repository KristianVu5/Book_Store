package bg.tu_varna.sit.book_store.repository;

import bg.tu_varna.sit.book_store.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
