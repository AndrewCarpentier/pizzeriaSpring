package fr.andrew.pizzeria.pizzeria.business.impl;

import fr.andrew.pizzeria.pizzeria.business.IPizzaBusiness;
import fr.andrew.pizzeria.pizzeria.domain.Pizza;
import fr.andrew.pizzeria.pizzeria.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class PizzaBusinessImpl implements IPizzaBusiness{

    @Autowired
    private PizzaRepository pizzaRepository;

    public List<Pizza> findAll(){
        return pizzaRepository.findAll();
    }

    public Pizza findOneById(Integer id){
        return pizzaRepository.findById(id).get();
    }
}
