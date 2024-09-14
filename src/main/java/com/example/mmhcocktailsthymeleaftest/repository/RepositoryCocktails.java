package com.example.mmhcocktailsthymeleaftest.repository;

import com.example.mmhcocktailsthymeleaftest.model.Cocktail;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class RepositoryCocktails {

    private List<Cocktail> listOfCocktails;

    public RepositoryCocktails(){
        listOfCocktails = new ArrayList<>();
        hardcodedDrinks();

    }

    public void hardcodedDrinks(){
        listOfCocktails.add(new Cocktail("Old Fashioned", Arrays.asList("Syrup", "gin","Water", "Bitters", "Ice", "Bourbon", "Garnishes")));
        listOfCocktails.add(new Cocktail("Daiquiri", Arrays.asList("ice cubes", "light rum","lime juice", "triple sec", "white sugar", "lime", "white sugar")));
        listOfCocktails.add(new Cocktail("Negroni", Arrays.asList("campari", "gin","vermouth", "carbonated water", "lemon")));
        listOfCocktails.add(new Cocktail("CocktailA", Arrays.asList("campari", "gin","vermouth", "carbonated water", "Syrup")));
        listOfCocktails.add(new Cocktail("CocktailB", Arrays.asList("dark rum", "cola","lemon")));
        listOfCocktails.add(new Cocktail("CocktailC", Arrays.asList("gin", "tonic","lemon")));
    }

    public List<Cocktail> getListOfCocktails(){
        return listOfCocktails;
    }

    public List<Cocktail> getCocktailsByIngredients(String ingredient){
        List<Cocktail> resultList = new ArrayList<>();
        for(Cocktail c:listOfCocktails){
            if(c.getIngredients().contains(ingredient)){
                resultList.add(c);
            }
        }
        return resultList;
    }
}
