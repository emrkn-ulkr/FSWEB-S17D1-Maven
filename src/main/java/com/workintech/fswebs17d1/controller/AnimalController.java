    package com.workintech.fswebs17d1.controller;

    import com.workintech.fswebs17d1.entity.Animal;
    import org.springframework.web.bind.annotation.*;

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

        @GetMapping("/{id}")
        public Animal getAnimalById(@PathVariable Integer id){
            return animals.get(id);
        }
        @PostMapping
        public Animal addAnimal(@RequestBody Animal animal){
            animals.put(animal.getId(), animal);
            return animal;
        }

        @DeleteMapping("/{id}")
        public Animal deleteAnimal(@PathVariable Integer id){
            return  animals.remove(id);
        }

        @PutMapping("/{id}")
        public Animal updateAnimal(@PathVariable Integer id,
                                   @RequestBody Animal updatedAnimal){
            animals.put(id,updatedAnimal);
            return updatedAnimal;
        }
    }
