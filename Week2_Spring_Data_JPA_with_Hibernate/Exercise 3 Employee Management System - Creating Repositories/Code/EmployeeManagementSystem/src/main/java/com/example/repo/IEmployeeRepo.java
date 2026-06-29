package com.example.repo;

import com.example.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IEmployeRepo extends JpaRepository<Employee,Integer> {
    List<Employee> findByName(String name);
    Employee findByEmail(String email);

    List<Employee> findByDepartmentId(int departmentId);

    List<Employee> findByNameContaining(String keyword);
    
    boolean existsByEmail(String email);
}
