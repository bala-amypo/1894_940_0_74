package com.example.demo.controller;
import StudentService from Service;

@RestController
public class StudentController{
    @Autowired
    StudentService studentservice;

    @postMapping("/postdata")
    public Student postdata(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    

}