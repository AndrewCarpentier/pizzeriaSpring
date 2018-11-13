package fr.andrew.pizzeria.pizzeria.repository;

import fr.andrew.pizzeria.pizzeria.domain.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer> {

}
