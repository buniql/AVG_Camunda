package com.avg.spesen.repository;

import com.avg.spesen.entity.Employee;
import com.avg.spesen.entity.Expense_report;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

@org.springframework.stereotype.Repository
public class Repository {

    private ArrayList<Employee> EmployeeList;
    private ArrayList<Expense_report> ExpenseReportList;

    @Autowired
    public Repository() {
        //make REST Get request;

        //map data to entities

        //save data in lists accordingly
    }
}
