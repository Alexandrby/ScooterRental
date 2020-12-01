package com.senla.mapper;

import com.senla.dto.UserDTO;
import com.senla.entity.User;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class UserMapper implements MapperAPI<User, UserDTO> {

    @Autowired
    private MainMapper modelMapper;


    TypeMap<User, UserDTO> toDTOTypeMap;

    public UserDTO toDto(User user ) {
        if (toDTOTypeMap == null) {
            UserDTO userDTO = modelMapper.map(user, UserDTO.class);
        }
       return Objects.isNull(user) ? null : modelMapper.map(user, UserDTO.class);
    }

    public User toEntity(UserDTO userDTO) {
        User user = Objects.isNull(userDTO) ? null : modelMapper.map(userDTO, User.class);
        return user;
    }

}
