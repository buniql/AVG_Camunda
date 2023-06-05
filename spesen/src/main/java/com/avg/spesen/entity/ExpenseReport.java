package com.avg.spesen.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExpenseReport {
    private int id;
    private static int currentId = 0;

    private int employee_id;
    private Employee employee;
    private String date;
    private float sum;
    private String description;
    private boolean permitted = false;

    public ExpenseReport() {
        // Default constructor
    }

    public void permitExpenseReport() {
        permitted = true;
    }

    public static int getCurrentId() {
        currentId++;
        return currentId;
    }
}
