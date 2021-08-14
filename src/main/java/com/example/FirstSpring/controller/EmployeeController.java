package com.example.FirstSpring.controller;

import com.example.FirstSpring.dao.EmployeeDao;
import com.example.FirstSpring.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/employees")
    public String saveEmployee(@RequestBody Employee employee){
        return eDao.save(employee)+"rows saved to the Database";
    }

    @PutMapping("/employees/{id}")
    public String updateEmployee(@RequestBody Employee employee, @PathVariable int id){
        return eDao.updates(employee,id)+"rows updated";
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployeeById(@PathVariable int id){
        return eDao.delete(id)+"rows deleted from database";
    }
}
