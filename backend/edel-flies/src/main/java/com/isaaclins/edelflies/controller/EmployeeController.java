package com.isaaclins.edelflies.controller;
import com.isaaclins.edelflies.entity.Employee;
import com.isaaclins.edelflies.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeRepository.findEmployeeById(id);
    }

    @GetMapping("/jobTitle/{jobTitle}")
    public List<Employee> getEmployeesByJobTitle(@PathVariable String jobTitle) {
        return employeeRepository.findByJobTitle(jobTitle);
    }

    @GetMapping("/name/{name}")
    public List<Employee> getEmployeesByNameContaining(@PathVariable String name) {
        return employeeRepository.findByNameContaining(name);
    }

    @PostMapping("/")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employeeDetails) {
        Employee employee = employeeRepository.findEmployeeById(id);
        employee.setName(employeeDetails.getName());
        employee.setJob_title(employeeDetails.getJob_title());
        // Set other properties as needed
        return employeeRepository.save(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeeRepository.deleteById(id);
    }
}