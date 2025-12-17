package com.example.demo.ServiceImplementation;

import org.springframework.stereotype.Service;

import com.example.demo.Service.StudentService;

@Service
public class StudentServiceImp implements  StudentService{

    private final StudentRepository studentRepository;
    public StudentServiceImp(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    public Student SaveStudent(Student student){
        return studentRepository.save(student);
    }
} 

