package fr.andrew.pizzeria.pizzeria.controller;

import fr.andrew.pizzeria.pizzeria.business.PizzaBusiness;
import fr.andrew.pizzeria.pizzeria.domain.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PizzaController {

    @Autowired
    private PizzaBusiness pizzaBusiness;

    @GetMapping("/pizzas")
    public String pizza(Model model) {
        List<Pizza> pizzas = pizzaBusiness.findAll();
        model.addAttribute("pizzas", pizzas);

        return "pizzas";
    }

    @GetMapping("/pizza")
    public String pizza(Model model, @RequestParam Integer id) {
        Pizza pizzas = pizzaBusiness.findAll(id);
        model.addAttribute("pizza", pizzas);

        return "pizza";
    }
}
