package com.example.schoolapi.controller;

import com.example.schoolapi.domain.Student;
import com.example.schoolapi.service.StudentService;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student/")
public class StudentController {
    private final StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping({"", "/"})
    public List<Student> getAllUsers() {
      return studentService.getAllStudents() ;

    }
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);

    }
    @PostMapping({"","/"})
    public void saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);

    }
    @PutMapping("/{id}")
    public void updateStudentById(@RequestBody Student student, @PathVariable Long id){
        studentService.updateStudentById(id, student);
    }
    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable Long id){
        studentService.deleteStudentById(id);
    }
}
