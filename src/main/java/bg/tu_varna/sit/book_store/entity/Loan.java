package bg.tu_varna.sit.book_store.entity;

import bg.tu_varna.sit.book_store.enums.LoanStatus;
import bg.tu_varna.sit.book_store.enums.LoanType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "loans")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate issuedAt;

    @Column(nullable = false)
    private LocalDate dueDate;

    private LocalDate returnedAt;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private LoanType type;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private LoanStatus status;

    @ManyToOne
    @JoinColumn(name = "issued_by_id", nullable = false)
    private User issuedBy;

    @ManyToOne
    @JoinColumn(name = "reader_id", nullable = false)
    private User reader;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;
}
