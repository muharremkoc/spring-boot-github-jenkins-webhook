package com.learning.githubjenkinswebhook.service;

import com.learning.githubjenkinswebhook.dto.AnimalRequestDto;
import com.learning.githubjenkinswebhook.mapper.AnimalMapper;
import com.learning.githubjenkinswebhook.model.Animal;
import com.learning.githubjenkinswebhook.repository.AnimalRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AnimalServiceImpl implements AnimalService{
        final AnimalRepository animalRepository;

        final AnimalMapper animalMapper;

    @Override
    public Animal saveAnimal(AnimalRequestDto animalRequestDto) {
        Animal animal= animalMapper.animalRequestDtoToAnimal(animalRequestDto);
        return animalRepository.save(animal);
    }

    @Override
    public List<Animal> animalList() {
        return animalRepository.findAll();
    }
}
