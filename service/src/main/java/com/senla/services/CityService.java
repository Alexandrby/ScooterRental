package com.senla.services;


import com.senla.dto.CityDTO;
import com.senla.entity.City;
import com.senla.mapper.CityMapper;
import com.senla.repos.CityRepository;
import com.senla.serviceAPI.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class CityService extends AbstractService<City, CityDTO, CityRepository, CityMapper> {

    public CityService(CityRepository repository, CityMapper mapper) {
        super(repository, mapper);
    }

}