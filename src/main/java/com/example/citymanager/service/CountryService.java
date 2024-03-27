package com.example.citymanager.service;

import com.example.citymanager.model.Country;
import com.example.citymanager.repo.ICountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryService implements ICountryService<Country>{
    @Autowired
    private ICountryRepo countryRepo;
    @Override
    public Iterable<Country> findAll() {
        return countryRepo.findAll();
    }

    @Override
    public void save(Country country) {
        countryRepo.save(country);
    }
    @Override
    public void delete(Long id) {
        countryRepo.deleteById(id);
    }

    @Override
    public Optional<Country> findById(Long id) {
        return countryRepo.findById(id);
    }
}
