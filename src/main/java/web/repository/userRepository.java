package web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.model.User;

public interface userRepository extends JpaRepository<User, Long> {
}
