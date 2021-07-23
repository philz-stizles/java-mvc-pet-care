package io.devdezyn.petcareapp.services;

import io.devdezyn.petcareapp.model.Owner;

import java.util.Set;

public interface OwnerService {
    Set<Owner> findAll();

    Owner findById(Long id);

    Owner findByUsername(String username);

    Owner findByLastName(String lastName);

    Owner save(Owner owner);
}
