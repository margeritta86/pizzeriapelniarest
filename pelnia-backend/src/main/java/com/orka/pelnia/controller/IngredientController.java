package com.orka.pelnia.controller;

import com.orka.pelnia.model.Ingredient;
import com.orka.pelnia.service.IngredientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IngredientController {

    private IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping("/ingredients")
    public List<Ingredient> getAll(){
       return  ingredientService.getAllIngredients();
    }

}
