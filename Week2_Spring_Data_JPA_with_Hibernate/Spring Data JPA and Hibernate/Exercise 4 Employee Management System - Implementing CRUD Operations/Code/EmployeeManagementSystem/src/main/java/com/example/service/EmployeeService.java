package com.example.service;

import com.example.entity.Employee;
import com.example.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private IEmployeeRepo repo;

    public Employee save(Employee employee) {
        return repo.save(employee);
    }

    public List<Employee> getAll() {
        return repo.findAll();
    }

    public Optional<Employee> getById(Integer id) {
        return repo.findById(id);
    }

    public Employee update(Employee employee) {
        return repo.save(employee);
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}