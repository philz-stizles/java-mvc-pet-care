package io.devdezyn.petcareapp.services;

import io.devdezyn.petcareapp.model.Pet;

import java.util.Set;

public interface PetService {
    Set<Pet> findAll();

    Pet findById(Long id);

    Pet save(Pet pet);
}
