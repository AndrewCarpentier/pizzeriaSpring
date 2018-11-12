package fr.andrew.pizzeria.pizzeria.repository;

import fr.andrew.pizzeria.pizzeria.domain.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer> {
}
