package com.senla.services;


import com.senla.dto.UserDTO;
import com.senla.entity.User;
import com.senla.mapper.UserMapper;
import com.senla.repos.UserRepository;
import com.senla.serviceAPI.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class ProfileService extends AbstractService<User, UserDTO, UserRepository, UserMapper> {

    public ProfileService(UserRepository repository, UserMapper mapper) {
        super(repository, mapper);
    }

}