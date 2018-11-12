package fr.andrew.pizzeria.pizzeria.business;

import fr.andrew.pizzeria.pizzeria.domain.Pizza;
import fr.andrew.pizzeria.pizzeria.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaBusiness {
    @Autowired
    private PizzaRepository pizzaRepository;

    public List<Pizza> findAll(){
        return pizzaRepository.findAll();
    }
}
