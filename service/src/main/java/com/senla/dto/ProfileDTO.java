package com.senla.dto;

import lombok.Data;
import org.springframework.core.SpringVersion;

import java.util.List;

@Data
public class ProfileDTO extends AbstractDTO{

    private Integer profileId;
    private String firstName;
    private String secondName;
    private String role;
    private Integer discountId;

    /*

    public void setLoginDataId(int loginDataId) {
        this.loginDataId = loginDataId;

         public List<Integer> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        for (Role role: roles) {
         this.roles.add(role.getRoleId());
        }
    }*/


}