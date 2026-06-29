package com.example.repo;

import com.example.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {

    List<Employee> findByName(String name);

    Employee findByEmail(String email);

    List<Employee> findByDepartmentId(int departmentId);

    List<Employee> findByNameContaining(String keyword);

    List<Employee> findByNameStartingWith(String prefix);

    List<Employee> findByNameEndingWith(String suffix);

    boolean existsByEmail(String email);

    long countByDepartmentId(int departmentId);


    @Query("SELECT e FROM Employee e")
    List<Employee> getAllEmployees();

    @Query("SELECT e FROM Employee e WHERE e.email=?1")
    Employee getEmployeeByEmail(String email);

    @Query("SELECT e FROM Employee e WHERE e.department.id=?1")
    List<Employee> getEmployeesByDepartment(int departmentId);

    @Query("SELECT e FROM Employee e WHERE e.name=:name")
    List<Employee> searchByName(@Param("name") String name);

}