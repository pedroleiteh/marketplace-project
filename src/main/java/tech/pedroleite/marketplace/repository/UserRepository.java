package tech.pedroleite.marketplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.pedroleite.marketplace.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
