package com.example.repo;

import com.example.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IDepartmentRepo extends JpaRepository<Department, Integer> {

    Department findByName(String name);

    List<Department> findByNameStartingWith(String prefix);

    boolean existsByName(String name);
}