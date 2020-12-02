package com.senla.mapper;

import com.senla.dto.RentStoryDTO;
import com.senla.entity.RentStory;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class RentStoryMapper  implements MapperAPI<RentStory, RentStoryDTO>{

    @Autowired
    private MainMapper modelMapper;

    private TypeMap<RentStory, RentStoryDTO> toDTOTypeMap;

    public RentStoryDTO toDto(RentStory rentStory) {
        if(toDTOTypeMap == null){
            toDTOTypeMap = modelMapper.createTypeMap(RentStory.class, RentStoryDTO.class);}
        toDTOTypeMap.addMappings(mapping -> mapping.map(mappedProfileId -> rentStory.getProfile().getProfileId(), RentStoryDTO::setProfileId));
        toDTOTypeMap.addMappings(mapping -> mapping.map(mappedScooterId -> rentStory.getScooter().getScooterId(), RentStoryDTO::setScooterId));
        return Objects.isNull(rentStory) ? null : modelMapper.map(rentStory, RentStoryDTO.class);
    }

    public RentStory toEntity(RentStoryDTO rentStoryDTO){
        return Objects.isNull(rentStoryDTO) ? null : modelMapper.map(rentStoryDTO, RentStory.class);
    }
}
