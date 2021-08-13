package com.example.FirstSpring.controller;

import com.example.FirstSpring.dao.EmployeeDao;
import com.example.FirstSpring.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao eDao;

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return eDao.getAll();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return eDao.getById(id);
    }
}
