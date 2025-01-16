package tech.pedroleite.marketplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.pedroleite.marketplace.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
