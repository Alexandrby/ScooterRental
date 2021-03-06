package com.senla.mapper;

import com.senla.dto.ProfileDTO;
import com.senla.entity.Profile;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class ProfileMapper implements MapperAPI<Profile, ProfileDTO>{

    @Autowired
    private MainMapper modelMapper;

    private TypeMap<Profile, ProfileDTO> toDTOTypeMap;

    public ProfileDTO toDto(Profile profile) {
        if (toDTOTypeMap == null) {
            toDTOTypeMap = modelMapper.createTypeMap(Profile.class, ProfileDTO.class);
        }
        toDTOTypeMap.addMappings(mapping -> mapping.map(mapDiscountId -> profile.getDiscount().getDiscountId(), ProfileDTO::setDiscountId));
        toDTOTypeMap.addMappings(mapping -> mapping.map(mappedSeasonTicketId -> profile.getSeasonTicket().getSeasonTicketId(), ProfileDTO::setSeasonTicketId));
        toDTOTypeMap.addMappings(mapping -> mapping.map(mappedUserId -> profile.getUser().getUserId(), ProfileDTO::setUserId));
        toDTOTypeMap.addMappings(mapping -> mapping.map(mappedRentStoryId -> profile.getRentStoryList(), ProfileDTO::setRentStoryId)); //?
        return Objects.isNull(profile) ? null : modelMapper.map(profile, ProfileDTO.class);
    }



    public Profile toEntity(ProfileDTO profileDTO) {
        return Objects.isNull(profileDTO) ? null : modelMapper.map(profileDTO, Profile.class);
    }
}