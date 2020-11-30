package com.senla.dto;

import lombok.Data;

@Data
public class SeasonTicketDTO extends AbstractDTO{

    private Integer seasonTicketId;
    private Integer hoursLeft;
    private Integer costPerHour;
    private Integer profileId;


}
