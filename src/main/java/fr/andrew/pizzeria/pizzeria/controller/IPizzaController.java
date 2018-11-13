package fr.andrew.pizzeria.pizzeria.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

public interface IPizzaController {

    String findAll(Model model);
    String findOneById(Model model, Integer id);
    String delete(Integer id);
    public String add(Model model, String libelle, String reference, Integer prix, String url_image);
    String addPost(String libelle, String reference, Integer prix, String url_image);
}
