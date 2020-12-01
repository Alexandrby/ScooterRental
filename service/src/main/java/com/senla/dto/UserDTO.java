package com.senla.dto;

import lombok.Data;

@Data
public class UserDTO extends AbstractDTO{

    private Integer userId;
    private String login;
    private String password;
    private Integer profileId;

}
