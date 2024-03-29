package com.innowing.info.model;

import lombok.Data;
import org.springframework.data.domain.Sort;

@Data
public class StudentPage {
    private int pageNumber = 0;
    private int pageSize = 20;
    private Sort.Direction sortDirection = Sort.Direction.ASC;
    private String sortBy = "id";
}
