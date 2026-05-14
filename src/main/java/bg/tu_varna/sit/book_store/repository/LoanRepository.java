package bg.tu_varna.sit.book_store.repository;

import bg.tu_varna.sit.book_store.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}
