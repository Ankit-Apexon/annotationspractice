package com.example.annotationspractice.service;

import com.example.annotationspractice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public String getEmployee(){
        return "employee";
    }
}
