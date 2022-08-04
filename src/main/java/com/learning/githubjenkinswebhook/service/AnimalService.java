package com.learning.githubjenkinswebhook.service;

import com.learning.githubjenkinswebhook.dto.AnimalRequestDto;
import com.learning.githubjenkinswebhook.model.Animal;

import java.util.List;

public interface AnimalService {

    Animal saveAnimal(AnimalRequestDto animalRequestDto);

    List<Animal> animalList();

}
