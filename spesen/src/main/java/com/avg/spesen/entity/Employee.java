package com.avg.spesen.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
    private int id;
    private String prename;
    private String surname;
}
