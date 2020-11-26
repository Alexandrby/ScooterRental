package com.senla.service;

import com.example.dao.repository.UserRepository;
import com.example.dto.UserDTO;
import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.serviceAPI.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class ProfileService extends AbstractService<User, UserDTO, UserRepository, UserMapper> {

    public ProfileService(UserRepository repository, UserMapper mapper) {
        super(repository, mapper);
    }

}