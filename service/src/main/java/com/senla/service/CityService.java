package com.senla.service;


import com.senla.CityDTO;
import com.senla.entity.City;
import com.senla.mapper.CityMapper;
import com.senla.repos.CityRepository;
import org.springframework.stereotype.Service;

@Service
public class CityService extends AbstractService<City, CityDTO, CityRepository, CityMapper> {

    public CityService(CityRepository repository, CityMapper mapper) {
        super(repository, mapper);
    }

}