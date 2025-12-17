package com.example.demo.controller;

@RestController
public class StudentController{
    @Autowired
    StudentService Studentservice

    @postMapping("/postdata")
    public Student postdata(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    

}