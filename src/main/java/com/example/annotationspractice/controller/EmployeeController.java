package com.example.annotationspractice.controller;

import com.example.annotationspractice.entity.Employee;
import com.example.annotationspractice.service.EmployeeService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController   //@Controller + @ResponseBody . This annotation is used to write Rest APIs.
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

//    @RequestMapping(path = "/getEmployee", method = RequestMethod.GET)
    @GetMapping("/getEmployee")
    public String getEmployee(){
        return "employee";
    }

    @GetMapping("/getEmployeeById")
    public String getEmployeeById(@RequestParam Integer id){
        return "employee";
    }

    @GetMapping("/getEmployeeByPathId/{id}")
    public String getEmployeeByPathId(@PathVariable Integer id){
        return "employee";
    }

    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee employee){
        return "employee added";
    }

    @PutMapping("/updateEmployee")
    public String updateEmployee(){
        return "employee updated";
    }

    @DeleteMapping("/deleteEmployee")
    public String deleteEmployee(){
        return "employee deleted";
    }

}
