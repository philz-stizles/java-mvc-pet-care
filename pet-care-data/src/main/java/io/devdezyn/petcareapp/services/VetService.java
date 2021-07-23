package io.devdezyn.petcareapp.services;

import io.devdezyn.petcareapp.model.Vet;

import java.util.Set;

public interface VetService {
    Set<Vet> findAll();

    Vet findById(Long id);

    Vet save(Vet vet);
}
