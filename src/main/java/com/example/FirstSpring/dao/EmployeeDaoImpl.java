package com.example.FirstSpring.dao;

import com.example.FirstSpring.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int save(Employee employee) {
        return 0;
    }

    @Override
    public int update(Employee employee, int id) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public List<Employee> getAll() {
        return jdbcTemplate.query("SELECT * FROM tbl_employees",new BeanPropertyRowMapper<Employee>(Employee.class));
    }

    @Override
    public Employee getById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM tbl_employees WHERE id=?",new BeanPropertyRowMapper<Employee>(Employee.class),id);
    }
}
