package com.example.schoolapi.dto.request;

import com.example.schoolapi.domain.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class StudentRequest {

    private Long id;

    @NotBlank
    @Size(min = 11, max = 11)
    private String tc;

    @NotBlank
    @Size(min = 2, max = 15)
    private String firstname;

    @NotBlank
    @Size(min = 2, max = 15)
    private String lastname;

    @NotBlank
    @Email
    @Size(max = 50)
    private String mail;

    @NotBlank
    @Size(min = 6, max = 6)
    private String no;

    @NotNull
    private Date birthday;

    private Gender gender;

}
