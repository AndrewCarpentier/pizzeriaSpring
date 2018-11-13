package fr.andrew.pizzeria.pizzeria.business;

import fr.andrew.pizzeria.pizzeria.domain.Pizza;

import java.util.List;

public interface IPizzaBusiness {

    List<Pizza> findAll();
    Pizza findOneById(Integer id);
    Void deletePizza(Integer id);
    Void addPizza(Pizza pizza);
}
