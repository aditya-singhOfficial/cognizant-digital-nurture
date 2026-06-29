package com.example.service;

import com.example.entity.Department;
import com.example.repo.IDepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private IDepartmentRepo repo;

    public Department save(Department department) {
        return repo.save(department);
    }

    public List<Department> getAll() {
        return repo.findAll();
    }

    public Optional<Department> getById(Integer id) {
        return repo.findById(id);
    }

    public Department update(Department department) {
        return repo.save(department);
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}