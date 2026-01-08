package com.workintech.fswebs17d1.controller;

import com.workintech.fswebs17d1.entity.Animal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("workintech/animal")
public class AnimalController {
    private Map<Integer,Animal> animals = new HashMap<>();

    @GetMapping
    public List<Animal> getAllAnimals(){
        return new ArrayList<>(animals.values());
    }
}
