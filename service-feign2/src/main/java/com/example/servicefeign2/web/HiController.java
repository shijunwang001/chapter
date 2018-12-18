package com.example.servicefeign2.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    com.example.servicefeign2.service.SchedualServiceHi SchedualServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam(value = "name") String name) {
        return SchedualServiceHi.sayHiFromClientOne(name);

    }

}
