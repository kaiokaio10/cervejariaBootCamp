package camp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import camp.entity.Beer;

import java.util.Optional;

public interface BeerRepository extends JpaRepository<Beer, Long> {

    Optional<Beer> findByName(String name);
}
