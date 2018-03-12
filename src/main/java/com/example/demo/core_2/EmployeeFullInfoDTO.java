package com.example.demo.core_2;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class EmployeeFullInfoDTO {
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private Integer age;
}
