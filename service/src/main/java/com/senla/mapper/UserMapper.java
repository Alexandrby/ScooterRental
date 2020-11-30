package com.senla.mapper;

import com.senla.repos.RoleRepository;
import com.senla.dto.LoginDataDto;
import com.senla.dto.UserDTO;
import com.senla.entity.User;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class UserMapper implements MapperAPI<User, UserDTO> {

    @Autowired
    private MainMapper modelMapper;
    @Autowired
    private RoleRepository repository;

    TypeMap<User, UserDTO> toDTOTypeMap;

    public UserDTO toDto(User user ) {
        if (toDTOTypeMap == null) {
            UserDTO userDTO = modelMapper.map(user, UserDTO.class);
        }
        toDTOTypeMap.addMappings(mapping -> mapping.map(singleLogin -> User.getRoles(), UserDTO::setRoles));
        return Objects.isNull(user) ? null : modelMapper.map(user, UserDTO.class);
    }

   /* public User toEntity(UserDTO userDTO) {
        User user = Objects.isNull(userDTO) ? null : modelMapper.map(userDTO, User.class);
        List<Role> roleList = new ArrayList<>();
        roleList.add(repository.getOne(2));
        // для создания по ролям на будущее

//        for (int roleId : loginDataDto.getRoles()
//        ) {
//            roleList.add(repository.getOne(roleId));
//        }
        user.setRoles(roleList);
        return user;*/
    }

}
