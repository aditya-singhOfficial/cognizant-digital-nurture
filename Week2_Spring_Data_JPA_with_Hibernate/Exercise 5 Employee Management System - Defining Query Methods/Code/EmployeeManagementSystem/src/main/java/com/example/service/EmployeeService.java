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

    public Optional<Employee> getById(int id) {
        return repo.findById(id);
    }

    public Employee update(Employee employee) {
        return repo.save(employee);
    }

    public void delete(int id) {
        repo.deleteById(id);
    }



    public List<Employee> getByName(String name) {
        return repo.findByName(name);
    }

    public Employee getByEmail(String email) {
        return repo.findByEmail(email);
    }

    public List<Employee> getByDepartment(int departmentId) {
        return repo.findByDepartmentId(departmentId);
    }



    public List<Employee> search(String name) {
        return repo.searchByName(name);
    }

    public List<Employee> getAllEmployees() {
        return repo.getAllEmployees();
    }

    public Employee getEmployeeByEmail(String email) {
        return repo.getEmployeeByEmail(email);
    }

    public List<Employee> getEmployeesByDepartment(int departmentId) {
        return repo.getEmployeesByDepartment(departmentId);
    }
}