package bg.tu_varna.sit.book_store.repository;

import bg.tu_varna.sit.book_store.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
