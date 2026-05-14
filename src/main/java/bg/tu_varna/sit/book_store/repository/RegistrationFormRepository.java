package bg.tu_varna.sit.book_store.repository;

import bg.tu_varna.sit.book_store.entity.RegistrationForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationFormRepository extends JpaRepository<RegistrationForm, Long> {
}
