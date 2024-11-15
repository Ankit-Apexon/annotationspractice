package com.example.annotationspractice.repository;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
    public String getEmployee(){
        return "employee";
    }
}
