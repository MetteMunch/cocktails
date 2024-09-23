package com.example.mmhcocktailsthymeleaftest.controller;

import com.example.mmhcocktailsthymeleaftest.model.Cocktail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.mmhcocktailsthymeleaftest.service.ServiceCocktails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping
public class ControllerCocktails {

    private ServiceCocktails sc;

    public ControllerCocktails(ServiceCocktails sc) {
        this.sc = sc;
    }

    @GetMapping("/cocktails")//denne bestemmer hvilken URL der kalder metoden
    public String getListOfCocktails(Model model) {
        List<Cocktail> cocktails = sc.getListOfCocktails();
        System.out.println("Cocktails: " + cocktails);  // Debugging
        model.addAttribute("cocktailsList", cocktails);
        return "indx"; //denne String angiver hvilken
        // HTML fil.navn Spring skal lede efter og scanne
    }

    @GetMapping("/search")
    public String getCocktailsByIngredients(@RequestParam(value = "ingredient", required = false) String ingredientName, Model model) {
        if (ingredientName == null || ingredientName.isEmpty()) {
            model.addAttribute("cocktailsWithSpecificIngredient", null);
            model.addAttribute("ingredientName", null);
        } else {
            List<Cocktail> cocktails = sc.getCocktailsByIngredients(ingredientName);
            model.addAttribute("cocktailsWithSpecificIngredient", cocktails);
            model.addAttribute("ingredientName", ingredientName);
        }
        return "listIngredientsSearch";

    }
}
