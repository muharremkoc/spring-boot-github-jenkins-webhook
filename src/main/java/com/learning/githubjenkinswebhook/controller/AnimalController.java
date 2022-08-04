package com.learning.githubjenkinswebhook.controller;

import com.learning.githubjenkinswebhook.dto.AnimalRequestDto;
import com.learning.githubjenkinswebhook.model.Animal;
import com.learning.githubjenkinswebhook.service.AnimalService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AnimalController {

    final AnimalService animalService;


    @PostMapping("/animal")
    public Animal createAnimal(@RequestBody AnimalRequestDto animalRequestDto){

        return animalService.saveAnimal(animalRequestDto);
    }

    @GetMapping("/animal")
    public List<Animal> getAnimals(){

        return animalService.animalList();
    }
}
