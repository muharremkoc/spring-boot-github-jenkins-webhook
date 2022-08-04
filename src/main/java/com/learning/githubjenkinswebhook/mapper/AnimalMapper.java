package com.learning.githubjenkinswebhook.mapper;

import com.learning.githubjenkinswebhook.dto.AnimalRequestDto;
import com.learning.githubjenkinswebhook.model.Animal;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper
public interface AnimalMapper {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
      Animal animalRequestDtoToAnimal(AnimalRequestDto animalRequestDto);
}
