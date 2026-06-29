package com.example.repo;

import com.example.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IDepartmentRepo extends JpaRepository<Department, Integer> {

    Department findByName(String name);

    List<Department> findByNameContaining(String keyword);

    List<Department> findByNameStartingWith(String prefix);

    boolean existsByName(String name);


    @Query("SELECT d FROM Department d")
    List<Department> getAllDepartments();

}