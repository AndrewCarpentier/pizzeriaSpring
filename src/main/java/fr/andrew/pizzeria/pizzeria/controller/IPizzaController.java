package fr.andrew.pizzeria.pizzeria.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

public interface IPizzaController {

    String findAll(Model model);
    String findOneById(Model model, Integer id);
}
