package com.avg.spesen.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @GetMapping("/start")
    String start() {
        //start process
        return "process started";
    }
}
