package com.senla.service;

import com.senla.dao.repository.RentPointRepository;
import com.senla.dto.RentPointDTO;
import com.senla.entity.RentPoint;
import com.senla.mapper.RentPointMapper;
import com.senla.serviceAPI.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class RentPointService extends AbstractService<RentPoint, RentPointDTO, RentPointRepository, RentPointMapper> {

    public RentPointService(RentPointRepository repository, RentPointMapper mapper) {
        super(repository, mapper);
    }

}