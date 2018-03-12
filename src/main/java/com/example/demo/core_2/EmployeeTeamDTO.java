package com.example.demo.core_2;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class EmployeeTeamDTO {

    private Integer employeeId;
    private String firstName;
    private String lastName;
    private String teamName;
}
