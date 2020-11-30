package com.senla.repos;

import com.senla.entity.Profile;

public interface ProfileRepository extends CommonRepository<Profile>{

    public Profile getByUser_id(int id);

}
