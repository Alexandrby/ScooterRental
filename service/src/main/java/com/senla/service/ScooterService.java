package com.senla.service;

import com.senla.dao.repository.ScooterRepository;
import com.senla.dto.ScooterDTO;
import com.senla.entity.Scooter;
import com.senla.mapper.ScooterMapper;
import com.senla.serviceAPI.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class ScooterService extends AbstractService<Scooter, ScooterDTO, ScooterRepository, ScooterMapper> {

    public ScooterService(ScooterRepository repository, ScooterMapper mapper) {
        super(repository, mapper);
    }

}