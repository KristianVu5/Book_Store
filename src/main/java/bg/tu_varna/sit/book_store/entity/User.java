package bg.tu_varna.sit.book_store.entity;

import bg.tu_varna.sit.book_store.enums.Role;
import bg.tu_varna.sit.book_store.enums.UserStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserStatus status;

    @Column(unique = true)
    private String cardNumber;

    @Column(nullable = false)
    private LocalDate createdAt;

    @OneToMany(mappedBy = "reader")
    private List<Loan> loans;


}
