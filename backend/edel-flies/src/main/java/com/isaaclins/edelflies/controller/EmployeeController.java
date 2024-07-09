package com.isaaclins.edelflies.controller;

import com.isaaclins.edelflies.repository.CityRepository;
import com.isaaclins.edelflies.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/cities")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
}