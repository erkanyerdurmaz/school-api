package com.example.schoolapi.repository;

import com.example.schoolapi.domain.Student;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {


    Optional<Student> findById(Long id);

    Student save(Student student);

    void deleteById(Long id);
}
