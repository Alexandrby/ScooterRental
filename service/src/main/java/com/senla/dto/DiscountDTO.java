package com.senla.dto;

import lombok.Data;

@Data
public class DiscountDTO extends AbstractDTO{

    private Integer discountId;
    private Integer discountRate;
    private Integer profileId;

}
