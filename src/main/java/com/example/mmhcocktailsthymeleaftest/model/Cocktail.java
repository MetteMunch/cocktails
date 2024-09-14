package com.example.mmhcocktailsthymeleaftest.model;

import java.util.List;

public class Cocktail {

    private String name;
    private List<String> ingredients;

    public Cocktail(String name, List<String> ingredients){
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString(){
        return name;
    }

}
