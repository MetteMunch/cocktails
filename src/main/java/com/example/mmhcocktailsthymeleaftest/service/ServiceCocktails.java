package com.example.mmhcocktailsthymeleaftest.service;

import com.example.mmhcocktailsthymeleaftest.model.Cocktail;
import com.example.mmhcocktailsthymeleaftest.repository.RepositoryCocktails;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceCocktails {

    private RepositoryCocktails rp;

    public ServiceCocktails(RepositoryCocktails rp){
        this.rp = rp;
    }


    public List<Cocktail> getListOfCocktails(){
        return rp.getListOfCocktails();
    }

    public List<Cocktail> getCocktailsByIngredients(String ingredient){
        return rp.getCocktailsByIngredients(ingredient);
    }


}
