package com.avg.spesen.rest;

import com.avg.spesen.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GetController {
    @Autowired
    private Repository repository;

    @PostMapping("/expenseReport")
    public ResponseEntity addExpenseReport(@RequestBody ExpenseReportDTO expenseReportDTO) {

        //add ExpenseReportToRepo? -> Not needed?

        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping("/permitExpenseReport")
    public ResponseEntity permitExpenseReport(@RequestBody int id) {
        repository.approveExpenseReport(id);
        return ResponseEntity.ok(HttpStatus.NO_CONTENT);
    }

    //verändere
    //nochmal
}
