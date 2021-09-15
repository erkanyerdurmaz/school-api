package com.example.schoolapi.service;

import com.example.schoolapi.domain.Student;
import com.example.schoolapi.repository.StudentRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.ObjectNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;

    }
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id){
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student does not found!"));
    }

    public Student saveStudent(Student student){
        return studentRepository.save(student);

    }

    public void updateStudentById(Long id, Student student) {
        Student existStudent = getStudentById(id);

        if (existStudent == null) {
            throw new RuntimeException("Student with id" + id + " does not found!");
        }

        existStudent.setFirstname(student.getFirstname());
        existStudent.setLastname(student.getLastname());
        existStudent.setMail(student.getMail());
        existStudent.setNo(student.getNo());

        studentRepository.save(existStudent);
    }

    public void deleteStudentById(Long id)
        {
        Student student = getStudentById(id);
        if (student == null) {
            throw new RuntimeException("Student does not found!");
        }
        studentRepository.deleteById(id);
    }
}
