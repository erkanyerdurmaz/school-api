package com.example.schoolapi.domain;

import java.util.Date;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tc;
    private String firstname;
    private String lastname;
    private String mail;
    private String no;
    private Date birthday;

    @Enumerated(EnumType.STRING)
    private Gender gender;

}

