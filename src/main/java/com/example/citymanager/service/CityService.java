package com.example.citymanager.service;

import com.example.citymanager.model.City;
import com.example.citymanager.repo.ICityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityService implements ICityService<City>{
    @Autowired
    private ICityRepo cityRepo;
    @Override
    public Iterable<City> findAll() {
        return cityRepo.findAll();
    }

    @Override
    public void save(City c) {
        cityRepo.save(c);
    }


    @Override
    public void delete(Long id) {
        cityRepo.deleteById(id);
    }

    @Override
    public Optional<City> findById(Long id) {
        return cityRepo.findById(id);
    }
}
