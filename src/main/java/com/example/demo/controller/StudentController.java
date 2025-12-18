package com.example.demo.controller;

import com.example.demo.service.StudentService;

@RestController
public class StudentController{
    @Autowired
    StudentService studentService;

    @postMapping("/postdata")
    public Student postdata(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
}