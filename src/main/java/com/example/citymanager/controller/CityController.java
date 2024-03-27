package com.example.citymanager.controller;

import com.example.citymanager.model.City;
import com.example.citymanager.model.Country;
import com.example.citymanager.service.ICityService;
import com.example.citymanager.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("/city")
public class CityController {
    @Autowired
    private ICityService cityService;
    @Autowired
    private ICountryService countryService;
    @ModelAttribute("countrys")
    public Iterable<Country> listCountry(){return countryService.findAll();}
    @GetMapping("")
    public ModelAndView listCity(){
        ModelAndView modelAndView = new ModelAndView("index");
        Iterable<City> listCity = cityService.findAll();
        modelAndView.addObject("listCity",listCity);
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView showFormCreate(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("city",new City());
        return modelAndView;
    }
    @PostMapping("/create")
    public String createNewCity(@ModelAttribute("city")City city){
        cityService.save(city);
        return "redirect:/city";
    }
    @GetMapping("/update/{id}")
    public ModelAndView showFormUpdate(@PathVariable Long id){
        ModelAndView modelAndView = new ModelAndView("update");
        Optional<City> city = cityService.findById(id);
        modelAndView.addObject("city",city.get());
        return modelAndView;
    }
    @PostMapping("/update")
    public String updateCar(@ModelAttribute("car") City city){
        cityService.save(city);
        return "redirect:/city";
    }
    @GetMapping("/delete/{id}")
    public String deleteCar(@PathVariable Long id){
        cityService.delete(id);
        return "redirect:/city";
    }
    @GetMapping("/detail/{id}")
    public ModelAndView detailCity(@PathVariable Long id){
        Optional<City> city = cityService.findById(id);
        ModelAndView modelAndView = new ModelAndView("detail");
        modelAndView.addObject("city",city.get());
        return modelAndView;
    }
}
