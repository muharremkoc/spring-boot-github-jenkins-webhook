package com.learning.githubjenkinswebhook.repository;

import com.learning.githubjenkinswebhook.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal,String> {
}
