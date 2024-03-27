package com.example.citymanager.service;

import java.util.Optional;

public interface IGeneralService<T> {
    Iterable<T> findAll();
    void save(T t);
    void delete(Long id);
    Optional<T> findById(Long id);
}
