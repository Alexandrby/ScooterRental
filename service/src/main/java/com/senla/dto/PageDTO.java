package com.senla.dto;

import lombok.Data;
import java.util.ArrayList;

@Data
public class PageDTO extends AbstractDTO{

    private ArrayList<AbstractDTO> list;
    private Integer totalPages;


}
