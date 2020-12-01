package com.senla.mapper;

import com.senla.dto.CityDTO;
import com.senla.entity.City;
import org.springframework.stereotype.Component;
import java.util.Objects;

@Component
public class CityMapper implements MapperAPI<City, CityDTO> {

    private final MainMapper modelMapper;

    public CityMapper(MainMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public CityDTO toDto(City city) {
        return Objects.isNull(city) ? null : modelMapper.map(city, CityDTO.class);
    }

    public City toEntity(CityDTO cityDTO){
        return Objects.isNull(cityDTO) ? null : modelMapper.map(cityDTO, City.class);
    }


}
