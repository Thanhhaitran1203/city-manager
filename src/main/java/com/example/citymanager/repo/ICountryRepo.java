package com.example.citymanager.repo;

import com.example.citymanager.model.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICountryRepo extends CrudRepository<Country, Long> {
}
