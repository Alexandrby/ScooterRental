package com.senla.services;

import com.senla.repos.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BDUserDetailsService implements UserDetailsService {
    private Logger logger = LoggerFactory.getLogger(BDUserDetailsService.class);

    private final UserService service;

    public BDUserDetailsService(UserService service) {
        this.service = service;
    }

   /* @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User user = userRepository.findByLogin(login).orElseThrow(() ->
                new UsernameNotFoundException("User doesn't exists"));
        return User.fromUser(user);
    }*/
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        logger.info("find loginData by login {}", s);
        com.senla.entity.User user = service.findByLogin(s);
        if (user == null) {
            logger.warn("user {} not found", s);
            throw new UsernameNotFoundException("User not found");
        }
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();


            authorities.add(new SimpleGrantedAuthority(Role.));

        authorities.containsAll(user.getRoles());
        logger.info("find a roles {}", user.getRoles());
        return new User(user.getLogin(), user.getPassword(), authorities);
    }
}
