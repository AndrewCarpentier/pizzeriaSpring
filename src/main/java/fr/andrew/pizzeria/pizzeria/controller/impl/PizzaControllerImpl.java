package fr.andrew.pizzeria.pizzeria.controller.impl;


import fr.andrew.pizzeria.pizzeria.business.impl.PizzaBusinessImpl;
import fr.andrew.pizzeria.pizzeria.controller.IPizzaController;
import fr.andrew.pizzeria.pizzeria.domain.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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

    @GetMapping("/pizza/detail")
    public String findOneById(Model model, @RequestParam Integer id) {
        Pizza pizza = pizzaBusiness.findOneById(id);
        model.addAttribute("pizza", pizza);

        return "pizza/pizzaDetail";
    }

    @GetMapping("/pizza/delete")
    public String delete(@RequestParam Integer id) {
        pizzaBusiness.deletePizza(id);
        return "redirect:/pizza";
    }

    @GetMapping("/pizza/add")
    public String add(Model model, String libelle, String reference, Integer prix, String url_image) {
        model.addAttribute("pizza", new Pizza());
        return "/pizza/pizzaAdd";
    }

    @PostMapping("/pizza/add")
    public String addPost(@RequestParam String libelle, @RequestParam String reference, @RequestParam Integer prix, @RequestParam String urlImage){
        Pizza pizza = new Pizza();
        pizza.setLibelle(libelle);
        pizza.setReference(reference);
        pizza.setPrix(prix);
        pizza.setUrlImage(urlImage);

        pizzaBusiness.addPizza(pizza);

        return "redirect:/pizza";
    }
}
