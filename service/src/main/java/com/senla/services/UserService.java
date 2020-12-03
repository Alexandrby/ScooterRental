
package com.senla.services;


import com.senla.dto.UserDTO;
import com.senla.entity.User;
import com.senla.mapper.UserMapper;
import com.senla.repos.UserRepository;
import com.senla.serviceAPI.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractService<User, UserDTO, UserRepository, UserMapper> {



    public UserService(UserRepository repository, UserMapper mapper ) {
        super(repository, mapper);

    }



}
