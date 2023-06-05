package com.avg.spesen.repository;

import com.avg.spesen.entity.Employee;
import com.avg.spesen.entity.ExpenseReport;

public class ExpenseReportDTO {
    public int employee_id;
    public String date;
    public float sum;
    public String description;

    //TODO

    /**
    public ExpenseReport toExpenseReport(Employee employee) {
        return ExpenseReport.builder().id(ExpenseReport.getCurrentId()).employee(employee).date(date).sum(sum).description(description).build();
    }
     **/
}
