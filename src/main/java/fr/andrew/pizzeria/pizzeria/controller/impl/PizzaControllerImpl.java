package fr.andrew.pizzeria.pizzeria.controller.impl;


import fr.andrew.pizzeria.pizzeria.business.impl.PizzaBusinessImpl;
import fr.andrew.pizzeria.pizzeria.controller.IPizzaController;
import fr.andrew.pizzeria.pizzeria.domain.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PizzaControllerImpl implements IPizzaController{

    @Autowired
    private PizzaBusinessImpl pizzaBusiness;

    @GetMapping("/pizza")
    public String findAll(Model model) {
        List<Pizza> pizzas = pizzaBusiness.findAll();
        model.addAttribute("pizzas", pizzas);

        return "pizza/pizza";
    }

    @GetMapping("/detail")
    public String findOneById(Model model, @RequestParam Integer id) {
        Pizza pizza = pizzaBusiness.findOneById(id);
        model.addAttribute("pizza", pizza);

        return "pizza/pizzaDetail";
    }
}
