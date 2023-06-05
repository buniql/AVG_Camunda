package com.avg.spesen.repository;

import com.avg.spesen.entity.Employee;
import com.avg.spesen.entity.ExpenseReport;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {

    private ArrayList<Employee> EmployeeList;
    private ArrayList<ExpenseReport> ExpenseReportList;

    private static final String EXPENSE_REPORT_URL = "http://localhost:3000/expense_reports";

    private static final String EMPLOYEE_URL = "http://localhost:3000/employees";

    @Autowired
    public Repository() throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();

        String response = restTemplate.getForObject(EXPENSE_REPORT_URL, String.class);

        ObjectMapper objectMapper = new ObjectMapper();
        ExpenseReportList = objectMapper.readValue(response, new TypeReference<ArrayList<ExpenseReport>>() {});

        response = restTemplate.getForObject(EMPLOYEE_URL, String.class);

        objectMapper = new ObjectMapper();
        EmployeeList = objectMapper.readValue(response, new TypeReference<ArrayList<Employee>>() {});

        for(ExpenseReport expenseReport : ExpenseReportList){
            Employee toSet = null;
            for(Employee employee : EmployeeList) {
                if(employee.getId() == expenseReport.getEmployee_id()) toSet = employee;
            }
            expenseReport.setEmployee(toSet);
        }


    }

    public void approveExpenseReport(int index) {
        for(ExpenseReport expenseReport : ExpenseReportList)
            if(expenseReport.getId() == index) {
                expenseReport.setPermitted(true);
                return;
            }
    }
}
