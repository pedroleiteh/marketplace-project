package tech.pedroleite.marketplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.pedroleite.marketplace.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
