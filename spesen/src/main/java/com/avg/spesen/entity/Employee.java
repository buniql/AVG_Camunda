package com.avg.spesen.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {
    private int id;
    private String prename;
    private String surname;

    public Employee() {
        // Default constructor
    }
}
