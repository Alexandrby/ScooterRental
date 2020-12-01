package com.senla.dto;

import com.senla.entity.SeasonTicket;
import lombok.Data;


@Data
public class ProfileDTO extends AbstractDTO{

    private Integer profileId;
    private String firstName;
    private String secondName;
    private String role;
    private Integer discountId;
    private SeasonTicket seasonTicketId;
    private Integer userId;
    private Integer rentStoryId;



}