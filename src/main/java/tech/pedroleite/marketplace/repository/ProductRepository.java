package tech.pedroleite.marketplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.pedroleite.marketplace.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
