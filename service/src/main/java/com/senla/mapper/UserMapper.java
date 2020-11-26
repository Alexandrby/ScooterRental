package com.senla.mapper;

import com.senla.dao.repository.RoleRepository;
import com.senla.dto.LoginDataDto;
import com.senla.dto.UserDTO;
import com.senla.entity.User;
import com.senla.entity.Role;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class UserMapper implements MapperAPI<User, UserDTO> {

    @Autowired
    private MainMapper modelMapper;
    @Autowired
    private RoleRepository repository;

    TypeMap<LoginData, LoginDataDto> toDTOTypeMap;

    public LoginDataDto toDto(LoginData loginData) {
        if (toDTOTypeMap == null) {
            toDTOTypeMap = modelMapper.createTypeMap(LoginData.class, LoginDataDto.class);
        }
        toDTOTypeMap.addMappings(mapping -> mapping.map(singleLogin -> loginData.getRoles(), LoginDataDto::setRoles));
        return Objects.isNull(loginData) ? null : modelMapper.map(loginData, LoginDataDto.class);
    }

    public LoginData toEntity(LoginDataDto loginDataDto) {
        LoginData loginData = Objects.isNull(loginDataDto) ? null : modelMapper.map(loginDataDto, LoginData.class);
        List<Role> roleList = new ArrayList<>();
        roleList.add(repository.getOne(2));
        // для создания по ролям на будущее

//        for (int roleId : loginDataDto.getRoles()
//        ) {
//            roleList.add(repository.getOne(roleId));
//        }
        loginData.setRoles(roleList);
        return loginData;
    }

}
