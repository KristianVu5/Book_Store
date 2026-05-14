package bg.tu_varna.sit.book_store.repository;

import bg.tu_varna.sit.book_store.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
