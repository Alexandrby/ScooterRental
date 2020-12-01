package com.senla.dto;

import lombok.Data;

@Data
public class RentPointDTO extends AbstractDTO{

    private Integer rentPointId;
    private String coordinates;
    private String address;
    private String phone;
    private Integer cityId;

}
