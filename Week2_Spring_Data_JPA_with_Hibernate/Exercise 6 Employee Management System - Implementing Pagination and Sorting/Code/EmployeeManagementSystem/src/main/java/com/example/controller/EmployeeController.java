package com.example.controller;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    // Pagination
    @GetMapping("/page/{pageNo}/{pageSize}")
    public Page<Employee> getEmployees(
            @PathVariable int pageNo,
            @PathVariable int pageSize) {

        return service.getEmployees(pageNo, pageSize);
    }

    // Sorting Ascending
    @GetMapping("/sort/{field}")
    public List<Employee> sortEmployees(@PathVariable String field) {

        return service.sortEmployees(field);
    }

    // Sorting Descending
    @GetMapping("/sort-desc/{field}")
    public List<Employee> sortEmployeesDesc(@PathVariable String field) {

        return service.sortEmployeesDesc(field);
    }

    // Pagination + Sorting
    @GetMapping("/page-sort/{pageNo}/{pageSize}/{field}")
    public Page<Employee> pageSort(
            @PathVariable int pageNo,
            @PathVariable int pageSize,
            @PathVariable String field) {

        return service.getEmployeesWithPaginationAndSorting(pageNo, pageSize, field);
    }
}