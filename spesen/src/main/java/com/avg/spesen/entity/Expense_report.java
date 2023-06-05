package com.avg.spesen.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Expense_report {
    private Employee employee;
    private String date;
    private float sum;
    private String description;
}
