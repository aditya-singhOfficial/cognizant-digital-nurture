package com.example.service;

import com.example.entity.Employee;
import com.example.repo.IEmployeeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private IEmployeeRepo repo;

    // Pagination
    public Page<Employee> getEmployees(int pageNo, int pageSize) {

        Pageable pageable = PageRequest.of(pageNo, pageSize);

        return repo.findAll(pageable);
    }

    // Sorting
    public List<Employee> sortEmployees(String field) {

        return repo.findAll(Sort.by(field));
    }

    // Descending Sorting
    public List<Employee> sortEmployeesDesc(String field) {

        return repo.findAll(Sort.by(Sort.Direction.DESC, field));
    }

    // Pagination + Sorting
    public Page<Employee> getEmployeesWithPaginationAndSorting(
            int pageNo,
            int pageSize,
            String field) {

        Pageable pageable =
                PageRequest.of(pageNo, pageSize, Sort.by(field));

        return repo.findAll(pageable);
    }
}