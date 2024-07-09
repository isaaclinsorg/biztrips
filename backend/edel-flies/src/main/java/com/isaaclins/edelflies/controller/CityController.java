package com.isaaclins.edelflies.controller;
import com.isaaclins.edelflies.entity.City;
import com.isaaclins.edelflies.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/cities")
public class CityController {

    @Autowired
    private CityRepository cityRepository;

    @GetMapping("/")
    public List<City> getAllCities(){
        return cityRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<City> getCityById(@PathVariable int id){
        return cityRepository.findById(id);
    }

    @GetMapping("/search")
    public List<City> searchCities(@RequestParam(required = false) String fullName,
                                   @RequestParam(required = false) String abbreviation){
        if(fullName != null && abbreviation != null){
            return cityRepository.findByFullNameAndAbbreviation(fullName, abbreviation);
        } else if(fullName != null){
            return cityRepository.findByFullName(fullName);
        } else if(abbreviation != null){
            return cityRepository.findByAbbreviation(abbreviation);
        } else {
            return cityRepository.findAll();
        }
    }
    @PostMapping("/")
    public City createCity(@RequestBody City city) {
        return cityRepository.save(city);
    }

    @PutMapping("/{id}")
    public City updateCity(@PathVariable int id, @RequestBody City city) {
        city.setId(id);
        return cityRepository.save(city);
    }

    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable int id) {
        cityRepository.deleteById(id);
    }


}
