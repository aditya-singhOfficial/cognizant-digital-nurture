package com.example.controller;

import com.example.entity.Department;
import com.example.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService service;



    @PostMapping
    public Department save(@RequestBody Department department) {
        return service.save(department);
    }

    @GetMapping
    public List<Department> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Department> getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Department update(@PathVariable int id,
                             @RequestBody Department department) {

        department.setId(id);
        return service.update(department);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "Department Deleted Successfully";
    }



    @GetMapping("/name/{name}")
    public Department getByName(@PathVariable String name) {
        return service.getByName(name);
    }

    @GetMapping("/search/{keyword}")
    public List<Department> search(@PathVariable String keyword) {
        return service.search(keyword);
    }

    @GetMapping("/all")
    public List<Department> allDepartments() {
        return service.getAllDepartments();
    }
}