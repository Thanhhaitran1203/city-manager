package com.example.citymanager.repo;

import com.example.citymanager.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICityRepo extends CrudRepository<City,Long> {
    Optional<City> findById(Long id);
}
