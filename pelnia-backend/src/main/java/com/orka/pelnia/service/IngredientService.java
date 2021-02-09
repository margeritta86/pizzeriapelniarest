package com.orka.pelnia.service;


import com.orka.pelnia.model.Ingredient;
import com.orka.pelnia.repository.IngredientRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.List;

@Service
public class IngredientService {

    private IngredientRepository ingredientRepository;

    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @PostConstruct
    public void fillDatabase(){
        Ingredient ing1 = new Ingredient("Szynka",new BigDecimal(5),150);
        Ingredient ing2 = new Ingredient("Pieczarki",new BigDecimal(8),150);
        Ingredient ing3 = new Ingredient("Ananas",new BigDecimal(4),150);

        ingredientRepository.save(ing1);
        ingredientRepository.save(ing2);
        ingredientRepository.save(ing3);
    }

    public List<Ingredient> getAllIngredients(){

        return ingredientRepository.findAll();
    }
}
