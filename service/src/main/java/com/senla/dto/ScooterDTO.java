package com.senla.dto;

import lombok.Data;

@Data
public class ScooterDTO extends AbstractDTO{

    private Integer scooterId;
    private String model;
    private String status;
    private Integer rentPointId;

}
