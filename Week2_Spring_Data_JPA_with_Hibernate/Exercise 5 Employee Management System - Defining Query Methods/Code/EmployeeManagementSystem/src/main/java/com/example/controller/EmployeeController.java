package com.example.controller;

import com.example.entity.Employee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;



    @PostMapping
    public Employee save(@RequestBody Employee employee) {
        return service.save(employee);
    }

    @GetMapping
    public List<Employee> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Employee> getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Employee update(@PathVariable int id,
                           @RequestBody Employee employee) {

        employee.setId(id);
        return service.update(employee);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "Employee Deleted Successfully";
    }



    @GetMapping("/name/{name}")
    public List<Employee> getByName(@PathVariable String name) {
        return service.getByName(name);
    }

    @GetMapping("/email/{email}")
    public Employee getByEmail(@PathVariable String email) {
        return service.getByEmail(email);
    }

    @GetMapping("/department/{id}")
    public List<Employee> getByDepartment(@PathVariable int id) {
        return service.getByDepartment(id);
    }



    @GetMapping("/search/{name}")
    public List<Employee> search(@PathVariable String name) {
        return service.search(name);
    }

    @GetMapping("/all")
    public List<Employee> allEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping("/query/email/{email}")
    public Employee queryEmail(@PathVariable String email) {
        return service.getEmployeeByEmail(email);
    }

    @GetMapping("/query/department/{id}")
    public List<Employee> queryDepartment(@PathVariable int id) {
        return service.getEmployeesByDepartment(id);
    }
}