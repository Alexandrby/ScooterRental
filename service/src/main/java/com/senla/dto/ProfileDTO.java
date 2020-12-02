package com.senla.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Data
public class ProfileDTO extends AbstractDTO{

    private Integer profileId;
    private String firstName;
    private String secondName;
    private String role;
    private Integer discountId;
    private Integer seasonTicketId;
    private Integer userId;
    private Integer rentStoryId;



}