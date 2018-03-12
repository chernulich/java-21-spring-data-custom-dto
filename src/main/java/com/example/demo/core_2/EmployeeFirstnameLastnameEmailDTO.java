package com.example.demo.core_2;

import lombok.AllArgsConstructor;
import lombok.Data;

//@AllArgsConstructor
@Data
public class EmployeeFirstnameLastnameEmailDTO {

    private String firstName;
    private String lastName;
    private String email;

    public EmployeeFirstnameLastnameEmailDTO(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
