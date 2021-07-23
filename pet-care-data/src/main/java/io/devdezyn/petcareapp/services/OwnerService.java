package io.devdezyn.petcareapp.services;

import io.devdezyn.petcareapp.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByUsername(String username);

    Owner findByLastName(String lastName);
}
