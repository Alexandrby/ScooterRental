package com.senla.repos;

import com.senla.entity.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CommonRepository<Role> {

    Role findByName(String name);
}
