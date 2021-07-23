package io.devdezyn.petcareapp.services;

import java.util.Set;

public interface CrudService<T, ID> {
    Set<T> findAll();

    T findById(ID id);

    T findByUsername(String username);

    T findByLastName(String lastName);

    T save(T object);

    void deleteById(ID id);

    void delete(T object);
}
