package com.senla.services;


import com.senla.mapper.RoleMapper;
import com.senla.serviceAPI.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class RoleService extends AbstractService<Role, RoleDTO, RoleRepository, RoleMapper> {

    public RoleService(RoleRepository repository, RoleMapper mapper) {
        super(repository, mapper);
    }

}