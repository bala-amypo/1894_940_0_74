package com.example.demo.controller;

import com.example.demo.service.StudentService;

@RestController
public class StudentController{
    @Autowired
    StudentService studentservice;

    @postMapping("/postdata")
    public Student postdata(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
}