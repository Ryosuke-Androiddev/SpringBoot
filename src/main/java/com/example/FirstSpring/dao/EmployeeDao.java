package com.example.FirstSpring.dao;

import com.example.FirstSpring.model.Employee;

import java.util.List;

public interface EmployeeDao {

    int save(Employee employee);

    int updates(Employee employee, int id);

    int delete(int id);

    List<Employee> getAll();

    Employee getById(int id);
}
