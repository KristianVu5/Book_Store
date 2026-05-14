package bg.tu_varna.sit.book_store.entity;

import bg.tu_varna.sit.book_store.enums.FormStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "registration_forms")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String applicantName;

    @Column(nullable = false)
    private String applicantEmail;

    @Column(nullable = false)
    private LocalDate submittedAt;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FormStatus status;
}
