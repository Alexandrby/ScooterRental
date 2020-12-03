package com.senla.mapper;

import com.senla.dto.ScooterDTO;
import com.senla.entity.Scooter;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Objects;

@Component
public class ScooterMapper implements MapperAPI<Scooter, ScooterDTO> {

    @Autowired
    private MainMapper modelMapper;

    private TypeMap<Scooter, ScooterDTO> toDTOTypeMap;

    public ScooterDTO toDto(Scooter scooter) {
        if(toDTOTypeMap == null){
            toDTOTypeMap = modelMapper.createTypeMap(Scooter.class, ScooterDTO.class);}
        toDTOTypeMap.addMappings(mapping -> mapping.map(mappedRentPointId -> scooter.getRentPoint().getRentPointId(), ScooterDTO::setRentPointId));
        return Objects.isNull(scooter) ? null : modelMapper.map(scooter, ScooterDTO.class);
    }

    public Scooter toEntity(ScooterDTO scooterDTO){
        return Objects.isNull(scooterDTO) ? null : modelMapper.map(scooterDTO, Scooter.class);
    }

}
