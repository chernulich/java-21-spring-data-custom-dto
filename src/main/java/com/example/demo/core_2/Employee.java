package com.example.demo.core_2;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "EMPLOYEE")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;

    @CreationTimestamp
    private Date employeeFrom;
    private Boolean isActiveEmployee;
    private String city;
    private String street;
    private String houseNumber;
    private Integer floor;
    private String apartment;

    @Convert(converter = EmployeeStatusConverter.class)
    private EmployeeStatus employeeStatus;

}