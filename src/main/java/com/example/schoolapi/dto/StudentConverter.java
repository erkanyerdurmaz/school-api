package com.example.schoolapi.dto;

import com.example.schoolapi.domain.Student;
import com.example.schoolapi.dto.request.StudentRequest;
import com.example.schoolapi.dto.response.StudentResponse;

import java.util.Date;

public class StudentConverter {

    public static Student convertToStudent(StudentRequest studentRequest) {

        return  Student.builder()
                .id(studentRequest.getId())
                .tc(studentRequest.getTc())
                .firstname(studentRequest.getFirstname())
                .lastname(studentRequest.getLastname())
                .mail(studentRequest.getMail())
                .no(studentRequest.getNo())
                .birthday(studentRequest.getBirthday())
                .gender(studentRequest.getGender())
                .build();

    }

    public static StudentResponse convertToStudentResponse(Student student) {

        return StudentResponse.builder()
                .id(student.getId())
                .name(student.getFirstname() + " " + student.getLastname())
                .mail(student.getMail())
                .no(student.getNo())
                .age(new Date().getYear() - student.getBirthday().getYear())
                .build();

    }

}
